package com.tattooservice.resources.implimantations;

import com.tattooservice.model.Booking;
import com.tattooservice.ms.api.implementations.TattoArtistController;
import com.tattooservice.services.business.interfaces.IGetBookingAdminServiceImpl;
import com.tattooservice.services.factory.interfaces.IProductOrderModelFactory;
import com.tattooservice.services.models.interfaces.IContext;
import jakarta.inject.Inject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetBookingAdminDelegate implements TattoArtistController.IGetBookingAdminDelegate {

    @Inject
    IProductOrderModelFactory productOrderModelFactory;

    @Inject
    IGetBookingAdminServiceImpl getBookingAdminService;

    @Override
    public ResponseEntity<List<Booking>> execute(TattoArtistController.GetBookingAdminParameters parameters) {

        IContext context = productOrderModelFactory.getContext();

        getBookingAdminService.GetBookingAdminApplication(context);

        return null;
    }
}
