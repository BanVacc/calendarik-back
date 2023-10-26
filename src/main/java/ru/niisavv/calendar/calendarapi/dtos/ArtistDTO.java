package ru.niisavv.calendar.calendarapi.dtos;

/**
 * Трансферный объект исполнителя
 */
public class ArtistDTO {
    /**
     * Идентификатор исполнителя
     */
    private long id;

    /**
     * Имя исполнителя
     */
    private String name;

    /**
     * Ссылка на аватар исполнителя
     */
    private String imageUrl;

    public ArtistDTO() {
        // Пустой конструктор для мапперов
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
