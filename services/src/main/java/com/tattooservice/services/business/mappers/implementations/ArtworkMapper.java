package com.tattooservice.services.business.mappers.implementations;

import com.tattooservice.services.business.dao.implemantations.ArtworkServiceDao;
import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;
import com.tattooservice.services.business.mappers.interfaces.IArtworkMapper;
import com.tattooservice.services.repository.dto.interfaces.IArtworksDTO;

import java.util.List;

public class ArtworkMapper implements IArtworkMapper {


    public List<IArtworkServiceDao> map(List<IArtworksDTO> artworksDTOS) {

        List<IArtworkServiceDao> artworkServiceDao = new java.util.ArrayList<>(List.of());

        for(IArtworksDTO artworksDTO : artworksDTOS) {
            IArtworkServiceDao artworkServiceDao1 = new ArtworkServiceDao();
            artworkServiceDao1.setDescription(artworksDTO.getDescreption());
            artworkServiceDao1.setId(artworksDTO.getId());
            artworkServiceDao1.setArtistId(artworksDTO.getArtistId());
            artworkServiceDao1.setTitle(artworksDTO.getTitle());
            artworkServiceDao1.setImageUrl(artworksDTO.getImage());
            artworkServiceDao.add(artworkServiceDao1);
        }
        return artworkServiceDao;
    }


}