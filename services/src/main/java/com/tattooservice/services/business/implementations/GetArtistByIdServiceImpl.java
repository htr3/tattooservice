package com.tattooservice.services.business.implementations;

import com.tattooservice.services.business.dao.implemantations.ArtworkServiceDao;
import com.tattooservice.services.business.dao.interfaces.IArtistServiceDao;
import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;
import com.tattooservice.services.business.interfaces.IGetArtistByIdServiceImpl;
import com.tattooservice.services.business.mappers.implementations.ArtistMapperService;
import com.tattooservice.services.business.mappers.interfaces.IArtistMapperService;
import com.tattooservice.services.business.mappers.interfaces.IArtworkMapper;
import com.tattooservice.services.models.interfaces.IContext;
import com.tattooservice.services.repository.dto.interfaces.IArtistDTO;
import com.tattooservice.services.repository.dto.interfaces.IArtworksDTO;
import com.tattooservice.services.repository.interfaces.IArtistRepositoryService;
import com.tattooservice.services.repository.interfaces.IArtworkRepositoryService;
import jakarta.inject.Inject;

import java.util.List;

public class GetArtistByIdServiceImpl implements IGetArtistByIdServiceImpl {

    @Inject
    public IArtistRepositoryService artistRepositoryService;

    @Inject
    private IArtistMapperService artistMapperService;

    @Inject
    private IArtworkMapper artworkMapper;

    @Inject
    public IArtworkRepositoryService artworkRepositoryService;

    public IArtistServiceDao getArtistByIdApplication(IContext context,  String artistId) {


        IArtistDTO artistDTO =  artistRepositoryService.getArtistById(artistId);

        List<IArtworksDTO> artworksDTOS = artworkRepositoryService.findArtworkById(artistId);

        List<IArtworkServiceDao> artworkServiceDaos = artworkMapper.map(artworksDTOS);


        IArtistServiceDao artistServiceDao = artistMapperService.map(artistDTO, artworkServiceDaos);

        return artistServiceDao;

    }

}
