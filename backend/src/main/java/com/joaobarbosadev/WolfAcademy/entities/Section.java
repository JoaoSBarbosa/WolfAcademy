package com.joaobarbosadev.WolfAcademy.entities;

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
    private Resource resource;

    @ManyToOne
    @JoinColumn( name = "prerequisite_id")
    private Section prerequisites;

    @OneToMany( mappedBy = "section")
    private List<Lesson> lessons = new ArrayList<>();

}
