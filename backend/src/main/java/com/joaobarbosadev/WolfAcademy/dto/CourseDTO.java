package com.joaobarbosadev.WolfAcademy.dto;

import com.joaobarbosadev.WolfAcademy.entities.Course;
import com.joaobarbosadev.WolfAcademy.entities.Offer;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class CourseDTO implements Serializable {

    private Long id;
    private String name;
    private String imgUri;
    private String imgGrayUri;
//    private List<OfferDTO> offers = new ArrayList<>();

    public CourseDTO() {
    }

    public CourseDTO(Long id, String name, String imgUri, String imgGrayUri) {
        this.id = id;
        this.name = name;
        this.imgUri = imgUri;
        this.imgGrayUri = imgGrayUri;
    }

    public CourseDTO(Course course) {
        id = course.getId();
        name = course.getName();
        imgUri = course.getImgUri();
        imgGrayUri = course.getImgUri();
    }

//    public CourseDTO(Course course, List<Offer> offers) {
//        this(course);
//
//        offers.forEach((offer) -> this.offers.add(new OfferDTO(offer)));
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CourseDTO courseDTO)) return false;
        return Objects.equals(id, courseDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
