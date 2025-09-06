package com.tattooservice.resources.implimantations;

import com.tattooservice.model.Booking;
import com.tattooservice.ms.api.implementations.TattoArtistController;
import com.tattooservice.resources.mappers.interfaces.IBookingDelegateMapper;
import com.tattooservice.services.business.dao.interfaces.IBookingServiceDao;
import com.tattooservice.services.business.interfaces.IGetBookingAdminServiceImpl;
import com.tattooservice.services.factory.interfaces.IProductOrderModelFactory;
import com.tattooservice.services.models.interfaces.IContext;
import jakarta.inject.Inject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetBookingAdminDelegate implements TattoArtistController.IGetBookingAdminDelegate {

    @Inject
    IProductOrderModelFactory productOrderModelFactory;

    @Inject
    IGetBookingAdminServiceImpl getBookingAdminService;

    @Inject
    IBookingDelegateMapper bookingDelegateMapper;

    @Override
    public ResponseEntity<List<Booking>> execute(TattoArtistController.GetBookingAdminParameters parameters) {

        List<Booking> bookings = new ArrayList<>();
        IContext context = productOrderModelFactory.getContext();

        List<IBookingServiceDao>  bookingServiceDaoList = getBookingAdminService.GetBookingAdminApplication(context);

        for (IBookingServiceDao bookingServiceDao : bookingServiceDaoList) {
            Booking booking = bookingDelegateMapper.map(bookingServiceDao);
            bookings.add(booking);
        }


        return ResponseEntity.ok(bookings);
    }
}
