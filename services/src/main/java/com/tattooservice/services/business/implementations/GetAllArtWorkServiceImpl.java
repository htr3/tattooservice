package com.tattooservice.services.business.implementations;

import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;
import com.tattooservice.services.business.interfaces.IGetAllArtWorkServiceImpl;
import com.tattooservice.services.business.mappers.interfaces.IArtworkMapper;
import com.tattooservice.services.models.interfaces.IContext;
import com.tattooservice.services.repository.dto.interfaces.IArtworksDTO;
import com.tattooservice.services.repository.interfaces.IArtworkRepositoryService;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

public class GetAllArtWorkServiceImpl implements IGetAllArtWorkServiceImpl {

    @Inject
    public IArtworkRepositoryService artworkRepositoryService;

    @Inject
    public IArtworkMapper artworkMapper;

    public List<IArtworkServiceDao> getAllArtWorkApplication(IContext context) {

        List<IArtworksDTO> artworksDTOS = new ArrayList<>();

        artworksDTOS = artworkRepositoryService.findAllArtwork();

        List<IArtworkServiceDao> artworkServiceDaos = artworkMapper.map(artworksDTOS);

        return artworkServiceDaos;
    }

}
