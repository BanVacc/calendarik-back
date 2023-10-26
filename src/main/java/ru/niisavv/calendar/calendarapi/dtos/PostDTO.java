package ru.niisavv.calendar.calendarapi.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;
import java.util.List;

/**
 * Трансферный объект поста в календаре
 */
public class PostDTO {
    /**
     * Идентификатор поста
     */
    @Null(groups = {Create.class})
    private Long id;

    /**
     * Владелец записи - пользователь добавивший запись
     */
    @Null(groups = {Create.class})
    private UserDTO user;

    /**
     * День за который был добавлен пост
     */
    @NotNull(groups = {Out.class, Create.class})
    @Past(groups = {Create.class})
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate date;

    /**
     * Описание поста, заметка
     */
    @Max(value = 1024, message = "Описание не должно превышать 1024 символа", groups = {Create.class})
    private String description;

    /**
     * Ссылка на трек поста
     */
    @NotNull(groups = {Create.class})
    @Null(groups = {Out.class})
    private String songUrl;

    /**
     * Список идентификаторов тегов поста
     */
    @Null(groups = {Out.class})
    private List<Long> tagIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }

    public List<Long> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Long> tagIds) {
        this.tagIds = tagIds;
    }

    /**
     * Интерфейс-маркер для группы валидаций, используемых в DTO,
     * предназначенных для создания новых объектов.
     */
    public interface Create {
    }

    public interface Out {
    }
}
