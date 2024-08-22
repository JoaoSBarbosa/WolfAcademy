package com.joaobarbosadev.WolfAcademy.controllers;

import com.joaobarbosadev.WolfAcademy.dto.CourseDTO;
import com.joaobarbosadev.WolfAcademy.dto.OfferDTO;
import com.joaobarbosadev.WolfAcademy.services.CourseService;
import com.joaobarbosadev.WolfAcademy.services.OfferService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<Page<CourseDTO>> findAll(final Pageable pageable) {
        Page<CourseDTO> list = service.getAllCourses(pageable);
        return ResponseEntity.ok(list);
    }
}
