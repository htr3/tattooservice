package com.tattooservice.services.business.configs;

import com.tattooservice.services.business.implementations.*;
import com.tattooservice.services.business.interfaces.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigs {

    @Bean
    public IBookingRequestServiceImpl bookingRequestService() {
        return new BookingRequestServiceImpl();
    }

    @Bean
    public IGetAllArtistServiceImpl getAllArtistService() {
        return new GetAllArtistServiceImpl();
    }

    @Bean
    public IGetAllArtWorkServiceImpl getAllArtWorkService() {
        return new GetAllArtWorkServiceImpl();
    }

    @Bean
    public IGetArtistByIdServiceImpl getArtistByIdService() {
        return new GetArtistByIdServiceImpl();
    }

    @Bean
    public IGetArtWorkByIdServiceImpl getArtWorkByIdService() {
        return new GetArtWorkByIdServiceImpl();
    }

    @Bean
    public IGetBookingAdminServiceImpl getBookingAdminService() {
        return new GetBookingAdminServiceImpl();
    }

}
