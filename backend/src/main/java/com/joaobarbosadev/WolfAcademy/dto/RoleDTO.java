package com.joaobarbosadev.WolfAcademy.dto;

import com.joaobarbosadev.WolfAcademy.entities.Role;
import com.joaobarbosadev.WolfAcademy.entities.User;
import lombok.Data;
import java.util.HashSet;
import java.util.Set;

@Data
public class RoleDTO {

    private Long id;
    private String authority;

    private Set<UserDTO> users = new HashSet<>();

    public RoleDTO() {
    }

    public RoleDTO(Long id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public RoleDTO(Role role) {
        id = role.getId();
        authority = role.getAuthority();
    }

    public RoleDTO(Role role, Set<User> users) {
        this(role);

        users.forEach((user) -> this.users.add(new UserDTO(user)));
    }
}