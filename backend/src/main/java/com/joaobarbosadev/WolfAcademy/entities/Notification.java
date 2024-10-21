package com.joaobarbosadev.WolfAcademy.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Data
@Entity
@Table(name = "tb_notification")
public class Notification implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private Instant moment;
    private boolean read;
    private String route;

    @ManyToOne
    @JoinColumn(name = "user_id")
//    @JsonIgnore
    @JsonBackReference
    private User user;

    public Notification() {
    }

    public Notification(Long id, String text, Instant moment, boolean read, String route) {
        this.id = id;
        this.text = text;
        this.moment = moment;
        this.read = read;
        this.route = route;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", moment=" + moment +
                ", read=" + read +
                ", route='" + route + '\'' +
                '}';
    }
}
