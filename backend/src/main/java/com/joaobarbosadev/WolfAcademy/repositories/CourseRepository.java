package com.joaobarbosadev.WolfAcademy.repositories;

import com.joaobarbosadev.WolfAcademy.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
