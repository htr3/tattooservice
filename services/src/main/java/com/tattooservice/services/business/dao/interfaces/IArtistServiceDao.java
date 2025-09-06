package com.tattooservice.services.business.dao.interfaces;

import java.util.List;

public interface IArtistServiceDao {
    public String getId();

    public void setId(String id) ;

    public String getName() ;

    public void setName(String name);

    public String getBio() ;

    public void setBio(String bio);

    public List<IArtworkServiceDao> getArtworks();

    public void setArtworks(List<IArtworkServiceDao> artworks);
}
