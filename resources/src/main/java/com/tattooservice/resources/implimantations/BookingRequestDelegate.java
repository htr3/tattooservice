package com.tattooservice.resources.implimantations;

import com.tattooservice.model.Booking;
import com.tattooservice.model.BookingRequest;
import com.tattooservice.ms.api.implementations.TattoArtistController;
import com.tattooservice.services.business.interfaces.IBookingRequestServiceImpl;
import com.tattooservice.services.factory.interfaces.IProductOrderModelFactory;
import com.tattooservice.services.models.interfaces.IContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import jakarta.inject.Inject;


@Component
public class BookingRequestDelegate implements TattoArtistController.IBookingRequestDelegate{

    @Inject
    private IBookingRequestServiceImpl bookingRequestService;

    @Inject
    private IProductOrderModelFactory productOrderModelFactory;

    private static final String BOOKING_REQUEST = "bookingRequest";

    @Override
    public ResponseEntity<Booking> execute(TattoArtistController.BookingParameters parameters) {
        // call to service
        IContext context = productOrderModelFactory.getContext();
        BookingRequest bookingRequest = parameters.getBookingRequest();
        context.setValue("mobile", bookingRequest.getPhone());
        context.setValue("message", bookingRequest.getMessage());
        context.setValue("name", bookingRequest.getName());

        bookingRequestService.bookingRequestServiceApp(context);

        return null;
    }
}
