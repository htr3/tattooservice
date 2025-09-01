package com.tattooservice.resources.implimantations;

import com.tattooservice.model.Artist;
import com.tattooservice.ms.api.implementations.TattoArtistController;
import com.tattooservice.services.business.interfaces.IGetArtistByIdServiceImpl;
import com.tattooservice.services.factory.interfaces.IProductOrderModelFactory;
import com.tattooservice.services.models.interfaces.IContext;
import jakarta.inject.Inject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class GetArtistByIdDelegate implements TattoArtistController.IGetArtistByIdDelegate {

    @Inject
    IProductOrderModelFactory productOrderModelFactory;

    @Inject
    IGetArtistByIdServiceImpl getArtistByIdService;

    @Override
    public ResponseEntity<Artist> execute(TattoArtistController.GetArtistByIdParameters parameters) {

        IContext context = productOrderModelFactory.getContext();

        getArtistByIdService.getArtistByIdApplication(context);
        return null;
    }
}
