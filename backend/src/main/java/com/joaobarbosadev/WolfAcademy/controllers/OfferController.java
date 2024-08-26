package com.joaobarbosadev.WolfAcademy.controllers;

import com.joaobarbosadev.WolfAcademy.dto.OfferDTO;
import com.joaobarbosadev.WolfAcademy.entities.Offer;
import com.joaobarbosadev.WolfAcademy.services.OfferService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/offers")
public class OfferController {

    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping
    public ResponseEntity<Page<Offer>> findAll(final Pageable pageable) {
        System.out.println("CHEGOU NA API DE OFERTAS");
        Page<Offer> list = offerService.getOffers(pageable);
        return ResponseEntity.ok(list);
    }

//    @GetMapping
//    public ResponseEntity<Page<OfferDTO>> findAll(final Pageable pageable) {
//        System.out.println("CHEGOU NA API DE OFERTAS");
//        Page<OfferDTO> list = offerService.getOffers(pageable);
//        return ResponseEntity.ok(list);
//    }
}
