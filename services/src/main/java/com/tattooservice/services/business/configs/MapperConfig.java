package com.tattooservice.services.business.configs;


import com.tattooservice.services.business.mappers.implementations.ArtistMapperService;
import com.tattooservice.services.business.mappers.implementations.ArtworkMapper;
import com.tattooservice.services.business.mappers.implementations.BookingMapperService;
import com.tattooservice.services.business.mappers.interfaces.IArtistMapperService;
import com.tattooservice.services.business.mappers.interfaces.IArtworkMapper;
import com.tattooservice.services.business.mappers.interfaces.IBookingMapperService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public IArtworkMapper artworkMapper() {
        return new ArtworkMapper();
    }

    @Bean
    public IArtistMapperService artistMapperService() {
        return new ArtistMapperService();
    }

    @Bean
    public IBookingMapperService bookingMapperService() {
        return new BookingMapperService();
    }
}
