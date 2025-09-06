package com.tattooservice.resources.mappers.implemantations;

import com.tattooservice.model.Artist;
import com.tattooservice.model.Artwork;
import com.tattooservice.resources.mappers.interfaces.IArtistDelegateMapper;
import com.tattooservice.services.business.dao.interfaces.IArtistServiceDao;
import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;

import java.util.ArrayList;
import java.util.List;

public class ArtistDelegateMapper implements IArtistDelegateMapper {

    public Artist map(IArtistServiceDao artistServiceDao) {
        Artist artist = new Artist();
        List<Artwork> artworkList = new ArrayList<>();

        artist.setName(artistServiceDao.getName());
        artist.setId(artistServiceDao.getId());
        artist.setBio(artistServiceDao.getBio());

        List<IArtworkServiceDao> artworkServiceDaos = artistServiceDao.getArtworks();
        for(IArtworkServiceDao artworkServiceDao : artworkServiceDaos) {
            Artwork artwork = new Artwork();
            artwork.setImageUrl(artworkServiceDao.getImageUrl());
            artwork.setArtistId(artworkServiceDao.getArtistId());
            artwork.setTitle(artworkServiceDao.getTitle());
            artwork.setDescription(artworkServiceDao.getDescription());
            artwork.setId(artistServiceDao.getId());
            artworkList.add(artwork);
        }
        artist.artworks(artworkList);

        return artist;
    }

}
