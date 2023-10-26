package ru.niisavv.calendar.calendarapi.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

/**
 * Трансферный объект для создания нового тега к записи
 */
public class TagDTO {

    /**
     * Идентификатор
     */
    @Null(groups = {Create.class})
    Long id;

    /**
     * Название (имя тега)
     */
    @NotNull(groups = {Create.class})
    private String name;

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

    public interface Create {

    }
}
