package ru.niisavv.calendar.calendarapi.models;

import jakarta.persistence.*;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "tag")
public class TagModel extends Versioned {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private Long id;

    /**
     * Название тэга
     */
    @Column(name = "title")
    @NaturalId
    private String title;

    public TagModel(String title) {
        this.title = title;
    }

    /**
     * Конструктор для Hibernate
     */
    protected TagModel() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
