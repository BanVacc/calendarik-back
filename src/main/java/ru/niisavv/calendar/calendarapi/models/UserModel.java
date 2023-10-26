package ru.niisavv.calendar.calendarapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.NaturalId;

import java.time.LocalDate;

@Entity
@Table(name = "`user`")
public class UserModel extends Versioned {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    /**
     * Имя пользователя в системе
     */
    @NaturalId(mutable = true)
    @Column(name = "username")
    private String username;

    /**
     * Имя пользователя
     */
    @Column(name = "name")
    private String name;

    /**
     * Адрес электронной почты
     */
    @Column(name = "email", unique = true)
    @Email
    @NotEmpty(message = "Email should not be empty")
    private String email;

    /**
     * Хэшированный пароль
     */
    @Column(name = "hashed_password", nullable = false)
    private String hashedPassword;

    /**
     * Дата рождения пользователя
     */
    @Column(name = "birthday")
    private LocalDate birthday;

    /**
     * Ссылка на аватар пользователя
     */
    @Column(name = "image")
    private String image;

    /**
     * Флаг приватности профиля
     */
    @Column(name = "is_public_profile")
    @ColumnDefault(value = "TRUE")
    private boolean isPublicProfile;

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

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
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
}
