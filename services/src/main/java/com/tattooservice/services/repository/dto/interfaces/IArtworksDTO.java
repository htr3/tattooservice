package com.tattooservice.services.repository.dto.interfaces;

import java.time.Instant;

public interface IArtworksDTO {

    public String getId() ;

    public void setId(String id) ;


    public String getTitle() ;

    public void setTitle(String title) ;

    public String getArtistId() ;

    public void setArtistId(String artistId) ;

    public String getDescreption() ;

    public void setDescreption(String descreption) ;
    public String getImage() ;

    public void setImage(String image) ;

    public Instant getCreatedAt() ;

    public void setCreatedAt(Instant createdAt) ;
}
