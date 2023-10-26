package ru.niisavv.calendar.calendarapi.dtos;

import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

/**
 * Трансферный объект жанра возвращаемый клиенту
 */
public class GenreDTO {

    @Size(min = 2, max = 256,
            message = "Название жанра должно содержать от 2 до 256 символов",
            groups = {New.class, Update.class})
    private String name;

    @Positive(message = "Значение идентификатора должно быть положительным")
    @Null(groups = {New.class}, message = "При создании объекта не должен быть указан идентификатор")
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

    /**
     * Интерфейс-маркер для группы валидаций, используемых в DTO,
     * предназначенных для создания новых объектов.
     */
    public interface New {
    }

    /**
     * Интерфейс-маркер для группы валидаций, используемых в DTO,
     * предназначенных для обновления существующих объектов.
     */
    public interface Update {
    }
}
