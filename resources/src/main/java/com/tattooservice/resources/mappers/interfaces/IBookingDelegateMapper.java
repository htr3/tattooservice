package com.tattooservice.resources.mappers.interfaces;

import com.tattooservice.model.Booking;
import com.tattooservice.services.business.dao.interfaces.IBookingServiceDao;

public interface IBookingDelegateMapper {
    public Booking map(IBookingServiceDao bookingServiceDao);
}
