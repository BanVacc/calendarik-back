package ru.niisavv.calendar.calendarapi.models;

import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

/**
 * Класс для добавления служебных полей об версии записи
 */
@MappedSuperclass
public class Versioned {
    @CreationTimestamp
    private Instant createdOn;
    @UpdateTimestamp
    private Instant lastUpdatedOn;
}
