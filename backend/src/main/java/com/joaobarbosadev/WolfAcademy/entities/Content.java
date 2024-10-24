package com.joaobarbosadev.WolfAcademy.entities;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "tb_content")
public class Content extends Lesson{

    private String textContent;
    private String videoUri;

    public Content() {
        super();
    }

    public Content(String textContent, String videoUri) {
        this.textContent = textContent;
        this.videoUri = videoUri;
    }

    public Content(
            Long id,
            String title,
            Integer position,
            Section section,
            String textContent,
            String videoUri
    ) {
        super(id, title, position, section);
        this.textContent = textContent;
        this.videoUri = videoUri;
    }


}
