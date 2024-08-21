package com.joaobarbosadev.WolfAcademy.controllers;

import com.joaobarbosadev.WolfAcademy.dto.RoleDTO;
import com.joaobarbosadev.WolfAcademy.services.RoleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<Page<RoleDTO>> findAll(Pageable pageable) {
        Page<RoleDTO> roleDTOS = roleService.getAllRoles(pageable);
        return ResponseEntity.ok(roleDTOS);
    }
}
