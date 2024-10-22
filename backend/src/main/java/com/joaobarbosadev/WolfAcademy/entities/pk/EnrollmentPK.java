package com.joaobarbosadev.WolfAcademy.entities.pk;

import com.joaobarbosadev.WolfAcademy.entities.Offer;
import com.joaobarbosadev.WolfAcademy.entities.User;
import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;


@Setter
@Getter
@Embeddable
public class EnrollmentPK implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // Muitas chaves para esse id de usuario
    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;



    public EnrollmentPK() {
    }

    public EnrollmentPK(User user, Offer offer) {
        super();
        this.user = user;
        this.offer = offer;

    }

    @Override
    public int hashCode() {
        return Objects.hash(user, offer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnrollmentPK that = (EnrollmentPK) o;
        return Objects.equals(user, that.user) && Objects.equals(offer, that.offer);
    }
}
