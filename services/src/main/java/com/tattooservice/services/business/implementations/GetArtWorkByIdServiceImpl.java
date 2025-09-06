package com.tattooservice.services.business.implementations;

import com.tattooservice.services.business.dao.implemantations.ArtworkServiceDao;
import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;
import com.tattooservice.services.business.interfaces.IGetArtWorkByIdServiceImpl;
import com.tattooservice.services.models.interfaces.IContext;
import com.tattooservice.services.repository.dto.interfaces.IArtworksDTO;
import com.tattooservice.services.repository.interfaces.IArtworkRepositoryService;
import jakarta.inject.Inject;

public class GetArtWorkByIdServiceImpl implements IGetArtWorkByIdServiceImpl {

    @Inject
    public IArtworkRepositoryService artworkRepositoryService;

    public IArtworkServiceDao getArtWorkByIdApplication(IContext context, String artworkId) {

        IArtworksDTO artworksDTO = artworkRepositoryService.findArtworkByArtworkId(artworkId);
        IArtworkServiceDao artworkServiceDao = map(artworksDTO);
        return artworkServiceDao;
    }


    private IArtworkServiceDao map(IArtworksDTO artworksDTO) {

        IArtworkServiceDao artworkServiceDao = new ArtworkServiceDao();

        artworkServiceDao.setArtistId(artworksDTO.getArtistId());
        artworkServiceDao.setTitle(artworksDTO.getTitle());
        artworkServiceDao.setImageUrl(artworksDTO.getImage());
        artworkServiceDao.setDescription(artworksDTO.getDescreption());
        artworkServiceDao.setId(artworksDTO.getId());

        return artworkServiceDao;
    }
}
