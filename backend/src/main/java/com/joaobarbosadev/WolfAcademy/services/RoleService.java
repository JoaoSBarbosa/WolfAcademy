package com.joaobarbosadev.WolfAcademy.services;

import com.joaobarbosadev.WolfAcademy.dto.RoleDTO;
import com.joaobarbosadev.WolfAcademy.entities.Role;
import com.joaobarbosadev.WolfAcademy.repositories.RoleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Transactional(readOnly = true)
    public Page<RoleDTO> getAllRoles(Pageable pageable) {
        Page<Role> roles = roleRepository.findAll(pageable);
        return roles.map(role -> new RoleDTO(role, role.getUser()));
    }
}
