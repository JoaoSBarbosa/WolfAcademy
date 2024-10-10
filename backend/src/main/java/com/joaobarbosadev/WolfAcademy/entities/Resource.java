package com.joaobarbosadev.WolfAcademy.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.joaobarbosadev.WolfAcademy.entities.enums.ResourceType;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "tb_resource")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;
    private ResourceType type;
    private String externalLink;

    @ManyToOne
    @JoinColumn( name = "offer_id")
    @JsonBackReference // Ignora ao serializar o lado inverso
    private Offer offer;

    @OneToMany(mappedBy = "resource")
    private List<Section> sections = new ArrayList<>();

    public Resource() {}

    public Resource(Long id, String title, String description, Integer position, String imgUri, ResourceType type, String externalLink, Offer offer) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.position = position;
        this.imgUri = imgUri;
        this.type = type;
        this.externalLink = externalLink;
        this.offer = offer;
    }
}
