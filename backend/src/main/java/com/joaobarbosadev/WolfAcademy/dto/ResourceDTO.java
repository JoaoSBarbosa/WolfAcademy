package com.joaobarbosadev.WolfAcademy.dto;

import com.joaobarbosadev.WolfAcademy.entities.Offer;
import com.joaobarbosadev.WolfAcademy.entities.Resource;
import com.joaobarbosadev.WolfAcademy.entities.enums.ResourceType;
import lombok.Data;

@Data
public class ResourceDTO {

    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;
    private ResourceType type;
    private String externalLink;
    private Offer offer;
    public ResourceDTO() {}

    public ResourceDTO(Offer offer,Long id, String title, String description, Integer position, String imgUri, ResourceType type, String externalLink) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.position = position;
        this.imgUri = imgUri;
        this.type = type;
        this.externalLink = externalLink;
        this.offer = offer;
    }

    public ResourceDTO(Resource entity){
        id = entity.getId();
        title = entity.getTitle();
        description = entity.getDescription();
        position = entity.getPosition();
        imgUri = entity.getImgUri();
        type = entity.getType();
        externalLink = entity.getExternalLink();
        offer = entity.getOffer();
    }
}
