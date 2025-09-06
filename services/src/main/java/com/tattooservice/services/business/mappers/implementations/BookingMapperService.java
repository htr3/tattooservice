package com.tattooservice.services.business.mappers.implementations;

import com.tattooservice.services.business.dao.implemantations.BookingServiceDao;
import com.tattooservice.services.business.dao.interfaces.IBookingServiceDao;
import com.tattooservice.services.business.mappers.interfaces.IBookingMapperService;
import com.tattooservice.services.repository.dto.interfaces.IBookingsDTO;

public class BookingMapperService implements IBookingMapperService {

    public IBookingServiceDao map(IBookingsDTO bookingsDTO) {
        IBookingServiceDao bookingServiceDao = new BookingServiceDao();
        bookingServiceDao.setMessage(bookingsDTO.getMessage());
        bookingServiceDao.setName(bookingsDTO.getName());
        bookingServiceDao.setPhone(bookingsDTO.getPhone());
//                bookingServiceDao.setCreatedAt(bookingsDTO.setCreatedAt());
        bookingServiceDao.setUpdatedAt(bookingsDTO.getUpdatedAt());

        return bookingServiceDao;
    }
}
