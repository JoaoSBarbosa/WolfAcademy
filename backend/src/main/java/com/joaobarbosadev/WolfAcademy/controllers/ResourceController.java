package com.joaobarbosadev.WolfAcademy.controllers;

import com.joaobarbosadev.WolfAcademy.dto.ResourceDTO;
import com.joaobarbosadev.WolfAcademy.services.ResourceService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resources")
public class ResourceController {

    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }


    @GetMapping
    public ResponseEntity<Page<ResourceDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(resourceService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResourceDTO> findById(@PathVariable Long id) {
        ResourceDTO dto = resourceService.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<ResourceDTO> save(@RequestBody ResourceDTO dto) {
        dto = resourceService.save(dto);
        return ResponseEntity.ok().body(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResourceDTO> update(@RequestBody ResourceDTO dto, @PathVariable Long id) {
        dto = resourceService.updade(dto, id);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        resourceService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
