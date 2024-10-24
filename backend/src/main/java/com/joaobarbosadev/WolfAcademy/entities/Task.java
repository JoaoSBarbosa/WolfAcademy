package com.joaobarbosadev.WolfAcademy.entities;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Data
@Entity
@Table( name = "tb_task")
public class Task extends Lesson{

    private String description;
    private Integer questionCount;
    private Integer approvalCount;
    private Double weight;
    @Column( columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private Instant dueDate;

    public Task(){
        super();
    }

    public Task(
            String description,
            Integer questionCount,
            Integer approvalCount,
            Double weight,
            Instant dueDate) {
        this.description = description;
        this.questionCount = questionCount;
        this.approvalCount = approvalCount;
        this.weight = weight;
        this.dueDate = dueDate;
    }

    public Task(
            Long id,
            String title,
            Integer position,
            Section section,
            String description,
            Integer questionCount,
            Integer approvalCount,
            Double weight,
            Instant dueDate
    ) {
        super(id, title, position, section);
        this.description = description;
        this.questionCount = questionCount;
        this.approvalCount = approvalCount;
        this.weight = weight;
        this.dueDate = dueDate;
    }
}

