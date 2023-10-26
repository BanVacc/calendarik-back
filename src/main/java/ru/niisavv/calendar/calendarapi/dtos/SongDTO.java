package ru.niisavv.calendar.calendarapi.dtos;

import java.util.ArrayList;
import java.util.List;

public class SongDTO {
    private long id;
    private String name;
    private List<GenreDTO> genres = new ArrayList<>();
    private List<ArtistDTO> artists = new ArrayList<>();
    private String image;

    public SongDTO() {
    }

    @Override
    public String toString() {
        return "SongDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genres=" + genres +
                ", artists=" + artists +
                ", image='" + image + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GenreDTO> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreDTO> genres) {
        this.genres = genres;
    }

    public List<ArtistDTO> getArtists() {
        return artists;
    }

    public void setArtists(List<ArtistDTO> artists) {
        this.artists = artists;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
