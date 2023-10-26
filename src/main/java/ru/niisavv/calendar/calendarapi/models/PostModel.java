package ru.niisavv.calendar.calendarapi.models;

import jakarta.persistence.*;
import org.hibernate.annotations.NaturalId;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "post")
public class PostModel extends Versioned {

    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private Long id;

    /**
     * Пользователь, оставивший запись в календаре
     */
    @NaturalId
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;

    /**
     * Песня дня
     */
    @ManyToOne
    @JoinColumn(name = "song_id")
    private SongModel song;

    /**
     * Описание поста
     */
    @Column(name = "description")
    private String description;

    /**
     * Когда была оставлена заметка
     */
    @NaturalId
    @Column(name = "date")
    private LocalDate date;

    /**
     * С помощью какого url`а была добавленная песня.
     */
    @Column(name = "song_url", nullable = false)
    private String url;

    /**
     * Теги, оставленные к записи в календаре
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "post_tag",
            joinColumns = {@JoinColumn(name = "tag_id")},
            inverseJoinColumns = {@JoinColumn(name = "post_id")}
    )
    private Set<TagModel> tags = new HashSet<>();

    // Геттеры и сеттеры

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public SongModel getSong() {
        return song;
    }

    public void setSong(SongModel song) {
        this.song = song;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Set<TagModel> getTags() {
        return tags;
    }

    public void setTags(Set<TagModel> tags) {
        this.tags = tags;
    }
}
