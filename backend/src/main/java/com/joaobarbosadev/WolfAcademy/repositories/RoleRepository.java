package com.joaobarbosadev.WolfAcademy.repositories;

import com.joaobarbosadev.WolfAcademy.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
