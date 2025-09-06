package com.tattooservice.services.repository.dto.interfaces;
import java.time.Instant;

public interface IArtistDTO {

    public String getId() ;

    public void setId(String id) ;

    public String getBio() ;

    public void setBio(String bio) ;

    public Instant getCreatedAt() ;

    public void setCreatedAt(Instant createdAt) ;

    public Instant getUpdatedAt() ;

    public void setUpdatedAt(Instant updatedAt);



    public String getName() ;

    public void setName(String name) ;

    public String getEmail() ;

    public void setEmail(String email) ;

    public String getPhone() ;

    public void setPhone(String phone) ;

    public String getImage() ;

    public void setImage(String image) ;
}
