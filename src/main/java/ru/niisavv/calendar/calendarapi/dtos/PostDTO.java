package ru.niisavv.calendar.calendarapi.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;
import java.util.List;

public class PostDTO {
    @Null(groups = {Create.class})
    private Long id;

    @Null(groups = {Create.class})
    private UserDTO user;

    @NotNull(groups = {Out.class, Create.class})
    @Past(groups = {Create.class})
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate date;

    @Max(value = 1024, message = "Описание не должно превышать 1024 символа", groups = {Create.class})
    private String description;

    @NotNull(groups = {Create.class})
    @Null(groups = {Out.class})
    private String songUrl;
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

    public interface Create {
    }

    public interface Out {
    }
}
