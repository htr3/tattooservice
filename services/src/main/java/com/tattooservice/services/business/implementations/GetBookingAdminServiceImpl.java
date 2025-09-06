package com.tattooservice.services.business.implementations;

import com.tattooservice.services.business.dao.implemantations.BookingServiceDao;
import com.tattooservice.services.business.dao.interfaces.IBookingServiceDao;
import com.tattooservice.services.business.interfaces.IGetBookingAdminServiceImpl;
import com.tattooservice.services.business.mappers.interfaces.IBookingMapperService;
import com.tattooservice.services.models.interfaces.IContext;
import com.tattooservice.services.repository.dto.interfaces.IBookingsDTO;
import com.tattooservice.services.repository.interfaces.IUserServiceRepository;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GetBookingAdminServiceImpl implements IGetBookingAdminServiceImpl {

    @Inject
    IUserServiceRepository userServiceRepository;

    @Inject
    IBookingMapperService bookingMapperService;

    public  List<IBookingServiceDao>  GetBookingAdminApplication(IContext context) {

        List<IBookingsDTO> bookingsDTOList = userServiceRepository.getAllBooking();

        List<IBookingServiceDao> bookingServiceDaos = new ArrayList<>();

            for(IBookingsDTO bookingsDTO : bookingsDTOList) {
                IBookingServiceDao bookingServiceDao = bookingMapperService.map(bookingsDTO);
                bookingServiceDaos.add(bookingServiceDao);
            }
           return bookingServiceDaos;
    }

}
