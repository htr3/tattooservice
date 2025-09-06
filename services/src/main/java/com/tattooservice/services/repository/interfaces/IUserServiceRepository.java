package com.tattooservice.services.repository.interfaces;

import com.tattooservice.services.repository.dto.interfaces.IBookingsDTO;

import java.util.List;
import java.util.Optional;

public interface IUserServiceRepository{

    public IBookingsDTO createUser(IBookingsDTO  requestUserDTO);

    public List<IBookingsDTO> getAllBooking();

}
