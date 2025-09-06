package com.tattooservice.services.business.mappers.interfaces;

import com.tattooservice.services.business.dao.interfaces.IBookingServiceDao;
import com.tattooservice.services.repository.dto.interfaces.IBookingsDTO;

public interface IBookingMapperService {
    public IBookingServiceDao map(IBookingsDTO bookingsDTO);
}
