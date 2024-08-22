package com.joaobarbosadev.WolfAcademy.repositories;

import com.joaobarbosadev.WolfAcademy.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
}
