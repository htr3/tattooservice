package com.tattooservice.resources.implimantations;

import com.tattooservice.model.Artwork;
import com.tattooservice.ms.api.implementations.TattoArtistController;
import com.tattooservice.services.business.dao.interfaces.IArtistServiceDao;
import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;
import com.tattooservice.services.business.interfaces.IGetArtWorkByIdServiceImpl;
import com.tattooservice.services.factory.interfaces.IProductOrderModelFactory;
import com.tattooservice.services.models.interfaces.IContext;
import com.tattooservice.services.repository.dto.interfaces.IArtworksDTO;
import jakarta.inject.Inject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class GetArtWorkByIdDelegate implements TattoArtistController.IGetArtWorkByIdDelegate {

    @Inject
    IProductOrderModelFactory productOrderModelFactory;

    @Inject
    IGetArtWorkByIdServiceImpl getArtWorkByIdService;

    @Override
    public ResponseEntity<Artwork> execute(TattoArtistController.GetArtWorkByIdParameters parameters) {

        IContext context = productOrderModelFactory.getContext();

        String artworkId = parameters.getId();
        IArtworkServiceDao artworkServiceDao =  getArtWorkByIdService.getArtWorkByIdApplication(context, artworkId);

        Artwork artwork = map(artworkServiceDao);
        return ResponseEntity.ok(artwork);
    }

    private Artwork map( IArtworkServiceDao artworkServiceDao ) {
        Artwork artwork = new Artwork();

        artwork.setId(artworkServiceDao.getId());
        artwork.setDescription(artworkServiceDao.getDescription());
        artwork.setTitle(artworkServiceDao.getTitle());
        artwork.setImageUrl(artworkServiceDao.getImageUrl());

        return artwork;
    }
}
