package com.joaobarbosadev.WolfAcademy.services;

import com.joaobarbosadev.WolfAcademy.dto.OfferDTO;
import com.joaobarbosadev.WolfAcademy.entities.Offer;
import com.joaobarbosadev.WolfAcademy.repositories.OfferRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OfferService {

    private final OfferRepository offerRepository;

    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }


    @Transactional(readOnly = true)
    public Page<OfferDTO> getOffers(Pageable pageable) {
        Page<Offer> offers = offerRepository.findAll(pageable);
        return offers.map(OfferDTO::new);
    }
}
