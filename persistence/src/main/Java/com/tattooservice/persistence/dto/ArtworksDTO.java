package com.tattooservice.persistence.dto;


import com.tattooservice.services.repository.dto.interfaces.IArtworksDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "artwork")
public class ArtworksDTO implements IArtworksDTO {

    @Id
    private String id;

    private String title;

    private String artistId;

    private String descreption;

    private String image;

    private Instant createdAt;


    public ArtworksDTO(String id, String title, String artistId, String descreption, String image, Instant createdAt) {
        this.id = id;
        this.title = title;
        this.artistId = artistId;
        this.descreption = descreption;
        this.image = image;
        this.createdAt = createdAt;
    }

    public ArtworksDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
