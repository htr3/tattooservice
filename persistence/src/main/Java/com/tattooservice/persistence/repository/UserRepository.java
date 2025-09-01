package com.tattooservice.persistence.repository;

import com.tattooservice.persistence.dto.BookingsDTO;
import com.tattooservice.services.repository.dto.interfaces.IBookingsDTO;
import com.tattooservice.services.repository.interfaces.IUserServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class UserRepository implements IUserServiceRepository {

    private final IUserRepository userRepository;

    @Autowired
    public UserRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public IBookingsDTO createUser(IBookingsDTO requestUserDTO) {

        try {
            requestUserDTO.setCreatedAt(Instant.now());
            requestUserDTO.setUpdatedAt(Instant.now());

            return userRepository.save((BookingsDTO) requestUserDTO);
        } catch (Exception e) {
            throw new RuntimeException("Failed to save user ", e);
        }
    }

    public void fatechAllartist() {
        try {
            userRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch all artists", e);
        }
    }


    @Override
    public Optional<IBookingsDTO> getUserPersistence(String id) {
        return Optional.empty();
    }

    @Override
    public String deleteUserPersistence(String id) {
        return "";
    }

    @Override
    public IBookingsDTO updateUserPersistence(IBookingsDTO user) {
        return null;
    }
}
