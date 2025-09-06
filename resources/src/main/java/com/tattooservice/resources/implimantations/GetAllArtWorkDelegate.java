package com.tattooservice.resources.implimantations;

import com.tattooservice.model.Artwork;
import com.tattooservice.ms.api.implementations.TattoArtistController;
import com.tattooservice.resources.mappers.interfaces.IArtworkDelegeteMapper;
import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;
import com.tattooservice.services.business.interfaces.IGetAllArtWorkServiceImpl;
import com.tattooservice.services.factory.interfaces.IProductOrderModelFactory;
import com.tattooservice.services.models.interfaces.IContext;
import jakarta.inject.Inject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllArtWorkDelegate implements TattoArtistController.IGetAllArtWorkDelegate {

    @Inject
    private IProductOrderModelFactory productOrderModelFactory;

    @Inject
    private IGetAllArtWorkServiceImpl getAllArtWorkService;

    @Inject
    private IArtworkDelegeteMapper artworkMapper;

    private static final String ALL_ARTWORK = "allArtwork";

    @Override
    public ResponseEntity<List<Artwork>> execute(TattoArtistController.GetAllArtWorkParameters parameters) {

        IContext context = productOrderModelFactory.getContext();

        List<IArtworkServiceDao> artworkServiceDaos = getAllArtWorkService.getAllArtWorkApplication(context);

        List<Artwork> artworks = artworkMapper.map(artworkServiceDaos);

        return ResponseEntity.ok(artworks);
    }
}
