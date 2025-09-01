package com.tattooservice.services.repository.interfaces;

import com.tattooservice.services.repository.dto.interfaces.IBookingsDTO;
import com.tattooservice.services.repository.dto.interfaces.IUserDTO;

import java.util.Optional;

public interface IUserServiceRepository{

    public IBookingsDTO createUser(IBookingsDTO  requestUserDTO);

    public Optional<IBookingsDTO> getUserPersistence(String id);

    public String deleteUserPersistence(String id);

    public IBookingsDTO updateUserPersistence(IBookingsDTO user);

    public void fatechAllartist();
}
