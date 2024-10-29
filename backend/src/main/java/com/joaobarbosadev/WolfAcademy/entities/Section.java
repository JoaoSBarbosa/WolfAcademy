package com.joaobarbosadev.WolfAcademy.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "tb_section")
public class Section {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;

    @ManyToOne
    @JoinColumn( name = "resource_id")
    @JsonBackReference
    private Resource resource;

    @ManyToOne
    @JoinColumn( name = "prerequisite_id")
    @JsonBackReference
    private Section prerequisites;

    @OneToMany( mappedBy = "section")
    @JsonBackReference
    private List<Lesson> lessons = new ArrayList<>();

}
