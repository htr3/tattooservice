package com.tattooservice.resources.mappers.implemantations;

import com.tattooservice.model.Booking;
import com.tattooservice.resources.mappers.interfaces.IBookingDelegateMapper;
import com.tattooservice.services.business.dao.interfaces.IBookingServiceDao;
import jakarta.validation.constraints.NotNull;

import java.time.ZoneOffset;

public class BookingDelegateMapper implements IBookingDelegateMapper {

    public Booking map(IBookingServiceDao bookingServiceDao) {
        Booking booking = new Booking();
//        booking.setCreatedAt(bookingServiceDao.getCreatedAt());
//        booking.setCreatedAt(
//                bookingServiceDao.getCreatedAt().atOffset(ZoneOffset.UTC)
//        );

        booking.setName(bookingServiceDao.getName());
        booking.setPhone(bookingServiceDao.getPhone());
        booking.setMessage(bookingServiceDao.getMessage());

        return booking;
    }

}
