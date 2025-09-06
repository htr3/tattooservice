package com.tattooservice.persistence.repository;

import com.tattooservice.persistence.dto.ArtistDTO;
import com.tattooservice.persistence.dto.BookingsDTO;
import com.tattooservice.persistence.repository.jpa.IUserRepository;
import com.tattooservice.services.repository.dto.interfaces.IArtistDTO;
import com.tattooservice.services.repository.dto.interfaces.IBookingsDTO;
import com.tattooservice.services.repository.interfaces.IUserServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceRepository implements IUserServiceRepository {

    private static final String URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    private final IUserRepository userRepository;

    @Autowired
    public UserServiceRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }


    // create booking
    @Override
    public IBookingsDTO createUser(IBookingsDTO requestUserDTO) {

        try {
            requestUserDTO.setCreatedAt(Instant.now());
            requestUserDTO.setUpdatedAt(Instant.now());
            requestUserDTO.setId(UUID.randomUUID().toString());
            return userRepository.save((BookingsDTO) requestUserDTO);
        } catch (Exception e) {
            throw new RuntimeException("Failed to save user ", e);
        }
    }

    public List<IBookingsDTO> getAllBooking() {
        return userRepository.findAll()
                .stream()
                .map(IBookingsDTO.class::cast)
                .collect(Collectors.toList());
    }


}
