package com.joaobarbosadev.WolfAcademy.repositories;

import com.joaobarbosadev.WolfAcademy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
