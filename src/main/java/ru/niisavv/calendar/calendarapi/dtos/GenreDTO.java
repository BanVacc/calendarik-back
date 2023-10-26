package ru.niisavv.calendar.calendarapi.dtos;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

/**
 * Трансферный объект возвращаемый клиенту
 */
public class GenreDTO {

    @Size(min = 2, max = 256,
            message = "Название жанра должно содержать от 2 до 256 символов",
            groups = {New.class, Update.class})
    private String name;

    @Positive(message = "Значение идентификатора должно быть положительным"
            /*, groups = {New.class}*/)
    private long id;

    public GenreDTO(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public interface New {
    }

    public interface Update {
    }
}
