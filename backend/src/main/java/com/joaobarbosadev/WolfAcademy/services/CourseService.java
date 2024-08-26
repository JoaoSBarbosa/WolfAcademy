package com.joaobarbosadev.WolfAcademy.services;

import com.joaobarbosadev.WolfAcademy.entities.Course;
import com.joaobarbosadev.WolfAcademy.repositories.CourseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CourseService {

    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }
    @Transactional(readOnly = true)
    public Page<Course> getAllCourses(Pageable pageable) {
        return repository.findAll(pageable);
    }

//    @Transactional(readOnly = true)
//    public Page<CourseCustomDTO> getAllCourses(Pageable pageable) {
//        Page<Course> courses = repository.findAll(pageable);
//        return courses.map((c)-> new CourseCustomDTO(c, c.getOffers()) );
//
////        return courses.map(CourseDTO::new);
//    }
}
