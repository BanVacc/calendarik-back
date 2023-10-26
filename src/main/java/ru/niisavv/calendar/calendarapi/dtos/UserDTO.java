package ru.niisavv.calendar.calendarapi.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UserDTO {
    private Long id;

    @NotBlank(message = "Имя пользователя не должно быть пустым", groups = New.class)
    @Size(min = 3, max = 256, message = "Имя должно быть длиной от 3 до 256 символов", groups = New.class)
    private String username;

    private String name;

    @NotBlank(message = "Email не должен быть пустым", groups = New.class)
    @Email(message = "Невалидный email", groups = New.class)
    private String email;

    @NotBlank(message = "Пароль не должен быть пустым", groups = New.class)
    @Size(min = 6, max = 256, message = "Пароль должен содержать от 6 до 256 символов", groups = New.class)
    private String password;

    @Past
    private LocalDate birthday;
    private String image;

    private boolean isPublicProfile = true;

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", image='" + image + '\'' +
                ", isPublicProfile=" + isPublicProfile +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isPublicProfile() {
        return isPublicProfile;
    }

    public void setPublicProfile(boolean publicProfile) {
        isPublicProfile = publicProfile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * Интерфейс для группы параметров,
     * используемых для создания пользователя
     */
    public interface New {

    }
}


// https://habr.com/ru/articles/343960/