package ru.niisavv.calendar.calendarapi.models;

import jakarta.persistence.*;
import org.hibernate.annotations.NaturalId;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "artist")
public class ArtistModel extends Versioned {

    @Id
    @Column(name = "artist_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Имя исполнителя
     */
    @NaturalId
    @Column(name = "name", unique = true)
    private String name;

    /**
     * Ссылка на аватар исполнителя
     */
    @Column(name = "image")
    private String image;

    /**
     * Список песен исполнителя
     */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "artist_song",
            joinColumns = {@JoinColumn(name = "artist_id")},
            inverseJoinColumns = {@JoinColumn(name = "song_id")}
    )
    private Set<SongModel> songs = new HashSet<>();

    public Set<SongModel> getSongs() {
        return songs;
    }

    public void setSongs(Set<SongModel> songs) {
        this.songs = songs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
