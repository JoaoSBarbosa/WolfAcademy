package com.joaobarbosadev.WolfAcademy.entities;
import com.joaobarbosadev.WolfAcademy.entities.pk.EnrollmentPK;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_enrollment")
public class Enrollment implements Serializable {


    @EmbeddedId
    private EnrollmentPK id = new EnrollmentPK();
    @Column( columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollMoment;
    @Column( columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;
    private boolean available;
    private boolean onlyUpdate;

    public Enrollment() {}
    public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean available, boolean onlyUpdate) {
        id.setUser(user);
        id.setOffer(offer);
        this.enrollMoment = enrollMoment;
        this.refundMoment = refundMoment;
        this.available = available;
        this.onlyUpdate = onlyUpdate;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + id +
                ", Momento=" + enrollMoment +
                ", Momento reembolso=" + refundMoment +
                ", avaliação=" + available +
                ", É atualização=" + onlyUpdate +
                '}';
    }

    public User getStudent(){
        return id.getUser();
    }

    public void setStudent(User user){
        id.setUser(user);
    }

    public Offer getOffer(){
        return id.getOffer();
    }

    public void setOffer(Offer offer){
        id.setOffer(offer);
    }
}
