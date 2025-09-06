package com.tattooservice.services.business.dao.implemantations;
import com.tattooservice.services.business.dao.interfaces.IArtistServiceDao;
import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;

import java.util.List;

public class ArtistServiceDao implements IArtistServiceDao {
    private String id;

    private String name;

    private String bio;

    private List<IArtworkServiceDao> artworks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<IArtworkServiceDao> getArtworks() {
        return artworks;
    }

    public void setArtworks(List<IArtworkServiceDao> artworks) {
        this.artworks = artworks;
    }
}
