package ru.niisavv.calendar.calendarapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "token")
public class TokenModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    /**
     * Рефреш токен пользователя (пока что без сессий)
     */
    @Column(name = "refresh_token")
    private String refreshToken;

    @OneToOne
    @JoinColumn()
    private UserModel user;
}
