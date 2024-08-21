package com.joaobarbosadev.WolfAcademy.dto;

import com.joaobarbosadev.WolfAcademy.entities.Role;
import com.joaobarbosadev.WolfAcademy.entities.User;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String uriImage;

    private Set<RoleDTO> roles = new HashSet<>();

    public UserDTO() {}


    public UserDTO(Long id, String firstName, String lastName, String email, String password, String uriImage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.uriImage = uriImage;
    }

    public UserDTO(User user) {
        id = user.getId();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        email = user.getEmail();
        password = user.getPassword();
        uriImage = user.getUriImage();
    }

    public UserDTO(User user, Set<Role> roles) {
        this(user);

        roles.forEach((role) -> this.roles.add(new RoleDTO(role)));
    }
    }
