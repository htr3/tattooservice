package com.tattooservice.services.business.mappers.implementations;

import com.tattooservice.services.business.dao.implemantations.ArtistServiceDao;
import com.tattooservice.services.business.dao.implemantations.ArtworkServiceDao;
import com.tattooservice.services.business.dao.interfaces.IArtistServiceDao;
import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;
import com.tattooservice.services.business.mappers.interfaces.IArtistMapperService;
import com.tattooservice.services.repository.dto.interfaces.IArtistDTO;

import java.util.ArrayList;
import java.util.List;

public class ArtistMapperService implements IArtistMapperService {

    public IArtistServiceDao map(IArtistDTO artistDTO, List<IArtworkServiceDao> artworkServiceDaos) {

        IArtistServiceDao artistServiceDao = new ArtistServiceDao();

        artistServiceDao.setId(artistDTO.getId());
        artistServiceDao.setBio(artistDTO.getBio());
        artistServiceDao.setName(artistDTO.getName());
        artistServiceDao.setArtworks(artworkServiceDaos);

        return artistServiceDao;
    }
}
