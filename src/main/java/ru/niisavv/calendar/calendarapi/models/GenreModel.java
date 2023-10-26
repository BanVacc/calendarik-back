package ru.niisavv.calendar.calendarapi.models;

import jakarta.persistence.*;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "genre")
public class GenreModel extends Versioned {

    @Id
    @Column(name = "genre_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Название жанра
     */
    @Column(name = "name")
    @NaturalId(mutable = true)
    private String name;

    /**
     * Конструктор для Hibernate
     */
    protected GenreModel() {
    }

    /**
     * Создает жанр с указанным именем
     *
     * @param genreName Имя жанра
     */
    public GenreModel(String genreName) {
        this.name = genreName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GenreModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
