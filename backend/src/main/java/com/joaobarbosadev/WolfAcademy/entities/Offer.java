package com.joaobarbosadev.WolfAcademy.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "tb_offer")
public class Offer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String edition;
    private Instant startMoment;
    private Instant endMoment;

    @ManyToOne // MUITAS OFERTAS PARA UM CURSO
    @JoinColumn(name = "course_id")
    @JsonBackReference
    private Course course;

    @OneToMany( mappedBy = "offer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference // Serializa este lado
    private List<Resource> resources;

    public Offer() {
    }

    public Offer(Long id, String edition, Instant startMoment, Instant endMoment) {
        this.id = id;
        this.edition = edition;
        this.startMoment = startMoment;
        this.endMoment = endMoment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return Objects.equals(id, offer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
