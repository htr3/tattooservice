package com.tattooservice.services.business.implementations;

import com.tattooservice.services.business.interfaces.IBookingRequestServiceImpl;
import com.tattooservice.services.models.interfaces.IContext;
import com.tattooservice.services.repository.dto.interfaces.IBookingsDTO;
import com.tattooservice.services.repository.interfaces.IUserServiceRepository;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class BookingRequestServiceImpl implements IBookingRequestServiceImpl {

    @Inject
    IUserServiceRepository userServiceRepository;

    @Autowired
    private IBookingsDTO bookingsDTO;

    @Override
    public void bookingRequestServiceApp(IContext context) {

        bookingsDTO.setName(context.getValue("name"));
        bookingsDTO.setPhone(context.getValue("mobile"));
        bookingsDTO.setMessage(context.getValue("message"));

        // 1. if user present or not
        if (userServiceRepository.getUserPersistence(context.getValue("mobile")).isPresent()) {
            userServiceRepository.updateUserPersistence(bookingsDTO);
        } else {
            IBookingsDTO userDTO1 = userServiceRepository.createUser(bookingsDTO);
        }
    }

}
