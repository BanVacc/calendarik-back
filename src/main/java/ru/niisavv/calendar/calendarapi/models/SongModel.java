package ru.niisavv.calendar.calendarapi.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Indexed;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "song")
@Indexed
public class SongModel extends Versioned {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private Long id;

    /**
     * Название песни
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * Жанры песни
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "song_genre",
            joinColumns = {@JoinColumn(name = "song_id")},
            inverseJoinColumns = {@JoinColumn(name = "genre_id")}
    )
    private Set<GenreModel> genres = new HashSet<>();

    /**
     * Исполнители песни
     */
    @ManyToMany(mappedBy = "songs", fetch = FetchType.EAGER)
    private Set<ArtistModel> artists = new HashSet<>();

    /**
     * Ссылка на обложку трека
     */
    @Column(name = "image")
    private String image;

    // Геттеры и сеттеры

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

    public Set<GenreModel> getGenres() {
        return genres;
    }

    public void setGenres(Set<GenreModel> genres) {
        this.genres = genres;
    }

    public Set<ArtistModel> getArtists() {
        return artists;
    }

    public void setArtists(Set<ArtistModel> artists) {
        this.artists = artists;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
