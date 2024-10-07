package com.joaobarbosadev.WolfAcademy.dto;

import com.joaobarbosadev.WolfAcademy.entities.Notification;
import com.joaobarbosadev.WolfAcademy.entities.User;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Data
public class NotificationDTO implements Serializable {

    private Long id;
    private String text;
    private Instant moment;
    private boolean read;
    private String route;
    private UserDTO user;

    public NotificationDTO() {}

    public NotificationDTO(Long id, String text, Instant moment, boolean read, String route, UserDTO user) {
        this.id = id;
        this.text = text;
        this.moment = moment;
        this.read = read;
        this.route = route;
        this.user = user;
    }

    public NotificationDTO(Notification entity) {
        id = entity.getId();
        text = entity.getText();
        moment = entity.getMoment();
        read = entity.isRead();
        route = entity.getRoute();
    }

    public NotificationDTO(Notification entity, User user) {
       this(entity);
       this.user = new UserDTO(user);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationDTO that = (NotificationDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
