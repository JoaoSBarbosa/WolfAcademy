package com.joaobarbosadev.WolfAcademy.dto;

import com.joaobarbosadev.WolfAcademy.entities.Course;
import com.joaobarbosadev.WolfAcademy.entities.Offer;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
public class OfferDTO implements Serializable {

    private Long id;
    private String edition;
    private Instant startMoment;
    private Instant endMoment;
    private Course course;

    public OfferDTO() {
    }

    public OfferDTO(Long id, String edition, Instant startMoment, Instant endMoment, Course course) {
        this.id = id;
        this.edition = edition;
        this.startMoment = startMoment;
        this.endMoment = endMoment;
        this.course = course;
    }

    public OfferDTO(Offer entity) {
        id = entity.getId();
        edition = entity.getEdition();
        startMoment = entity.getStartMoment();
        endMoment = entity.getEndMoment();
        course = entity.getCourse();
    }

    public OfferDTO(Offer entity, Course course) {

        this(entity);
        this.course = course;
    }
}
