package com.tattooservice.persistence.dto;

import com.tattooservice.services.repository.dto.interfaces.IBookingsDTO;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "booking", uniqueConstraints = {
        @UniqueConstraint(columnNames = "phone")
})
public class BookingsDTO implements IBookingsDTO {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;

    private String name;

    private String message;

    private String phone;

    private Instant createdAt;

    private Instant updatedAt;


    public BookingsDTO(String id, String name, String message, String phone, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public BookingsDTO() {

    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
