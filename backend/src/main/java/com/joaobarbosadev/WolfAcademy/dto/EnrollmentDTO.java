package com.joaobarbosadev.WolfAcademy.dto;
import com.joaobarbosadev.WolfAcademy.entities.Enrollment;
import com.joaobarbosadev.WolfAcademy.entities.Offer;
import com.joaobarbosadev.WolfAcademy.entities.User;
import com.joaobarbosadev.WolfAcademy.entities.pk.EnrollmentPK;
import lombok.Data;

import javax.persistence.EmbeddedId;
import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

@Data
public class EnrollmentDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private EnrollmentPK id = new EnrollmentPK();
    private Instant enrollMoment;
    private Instant refundMoment;
    private boolean available;
    private boolean onlyUpdate;

    public EnrollmentDTO() {}
    public EnrollmentDTO(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean available, boolean onlyUpdate) {
        id.setUser(user);
        id.setOffer(offer);
        this.enrollMoment = enrollMoment;
        this.refundMoment = refundMoment;
        this.available = available;
        this.onlyUpdate = onlyUpdate;
    }

    public EnrollmentDTO(Enrollment entity) {
        id.setUser(entity.getStudent());
        id.setOffer(entity.getOffer());
        enrollMoment = entity.getEnrollMoment();
        refundMoment = entity.getRefundMoment();
        available = entity.isAvailable();
        onlyUpdate = entity.isOnlyUpdate();
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
