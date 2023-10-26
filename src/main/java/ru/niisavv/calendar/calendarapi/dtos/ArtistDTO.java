package ru.niisavv.calendar.calendarapi.dtos;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class ArtistDTO {
    private long id;
    private String name;
    private String imageUrl;

    public ArtistDTO() {
    }

    @Override
    public String toString() {
        return "ArtistDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
