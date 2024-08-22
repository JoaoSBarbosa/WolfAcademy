package com.joaobarbosadev.WolfAcademy.services;

import com.joaobarbosadev.WolfAcademy.controllers.CourseController;
import com.joaobarbosadev.WolfAcademy.dto.CourseDTO;
import com.joaobarbosadev.WolfAcademy.dto.OfferDTO;
import com.joaobarbosadev.WolfAcademy.entities.Course;
import com.joaobarbosadev.WolfAcademy.entities.Offer;
import com.joaobarbosadev.WolfAcademy.repositories.CourseRepository;
import com.joaobarbosadev.WolfAcademy.repositories.OfferRepository;
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
    public Page<CourseDTO> getAllCourses(Pageable pageable) {
        Page<Course> courses = repository.findAll(pageable);
//        return courses.map((c)-> new CourseDTO(c, c.getOffers()) );

        return courses.map(CourseDTO::new);
    }
}
