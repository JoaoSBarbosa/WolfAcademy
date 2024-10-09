package com.joaobarbosadev.WolfAcademy.services;

import com.joaobarbosadev.WolfAcademy.dto.ResourceDTO;
import com.joaobarbosadev.WolfAcademy.entities.Resource;
import com.joaobarbosadev.WolfAcademy.repositories.ResourceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
public class ResourceService {

    private final ResourceRepository resourceRepository;

    public ResourceService(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }


    @Transactional(readOnly = true)
    public Page<ResourceDTO> findAll(Pageable pageable) {
        Page<Resource> resources = resourceRepository.findAll(pageable);
        return resources.map(ResourceDTO::new);
    }

    @Transactional(readOnly = true)
    public ResourceDTO findById(Long id) {
        Resource resource = resourceRepository.findById(id).orElseThrow(() -> new RuntimeException("Não localizado recurso com o id informado"));
        return new ResourceDTO(resource);
    }

    @Transactional
    public ResourceDTO save(ResourceDTO resourceDTO) {
        Resource entity = new Resource();
        copyDTOToResource(resourceDTO, entity);
        entity = resourceRepository.save(entity);
        return new ResourceDTO(entity);
    }

    @Transactional
    public ResourceDTO updade(ResourceDTO resourceDTO, Long id) {

        try {
            Resource actual = resourceRepository.getOne(id);

            copyDTOToResource(resourceDTO, actual);
            actual = resourceRepository.save(actual);
            return new ResourceDTO(actual);
        } catch (EntityNotFoundException e) {
            throw new RuntimeException("Não existe registro de Recurso com o id passado: " + id);
        }

    }

    @Transactional
    public void delete(Long id) {
        Resource actual = resourceRepository.findById(id).orElseThrow(() -> new RuntimeException("Não existe registro de Recurso com o id passado: " + id));
        resourceRepository.delete(actual);
    }

    private void copyDTOToResource(ResourceDTO resourceDTO, Resource resource) {
        if (resourceDTO.getId() != null) resource.setId(resourceDTO.getId());
        if (resourceDTO.getTitle() != null) resource.setTitle(resourceDTO.getTitle());
        if (resourceDTO.getDescription() != null) resource.setDescription(resourceDTO.getDescription());
        if (resourceDTO.getImgUri() != null) resource.setImgUri(resourceDTO.getImgUri());
        if (resourceDTO.getOffer() != null) resource.setOffer(resourceDTO.getOffer());
        if (resourceDTO.getPosition() != null) resource.setPosition(resourceDTO.getPosition());
        if (resourceDTO.getExternalLink() != null) resource.setExternalLink(resourceDTO.getExternalLink());
    }


}
