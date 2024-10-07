package com.joaobarbosadev.WolfAcademy.services;

import com.joaobarbosadev.WolfAcademy.dto.UserDTO;
import com.joaobarbosadev.WolfAcademy.entities.User;
import com.joaobarbosadev.WolfAcademy.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    public Page<UserDTO> findAll(Pageable pageable) {
        Page<User> users = userRepository.findAll(pageable);
        return users.map((u)-> new UserDTO(u, u.getRoles(), u.getNotifications()));
    }
}
