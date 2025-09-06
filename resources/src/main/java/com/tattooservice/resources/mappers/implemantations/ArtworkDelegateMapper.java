package com.tattooservice.resources.mappers.implemantations;

import com.tattooservice.model.Artwork;
import com.tattooservice.resources.mappers.interfaces.IArtworkDelegeteMapper;
import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;

import java.util.ArrayList;
import java.util.List;

public class ArtworkDelegateMapper implements IArtworkDelegeteMapper {

    public List<Artwork> map(List<IArtworkServiceDao> artworkServiceDaos) {

        List<Artwork> artworks = new ArrayList<>();
        Artwork artwork = new Artwork();

        for(IArtworkServiceDao artworkServiceDao : artworkServiceDaos) {
            artwork.setArtistId(artworkServiceDao.getArtistId());
            artwork.setDescription(artworkServiceDao.getDescription());
            artwork.setTitle(artworkServiceDao.getTitle());
            artwork.setImageUrl(artworkServiceDao.getImageUrl());
            artworks.add(artwork);
        }
        return artworks;
    }

}
