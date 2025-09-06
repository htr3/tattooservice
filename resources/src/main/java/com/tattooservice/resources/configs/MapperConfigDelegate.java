package com.tattooservice.resources.configs;

import com.tattooservice.resources.mappers.implemantations.ArtistDelegateMapper;
import com.tattooservice.resources.mappers.implemantations.ArtworkDelegateMapper;
import com.tattooservice.resources.mappers.implemantations.BookingDelegateMapper;
import com.tattooservice.resources.mappers.interfaces.IArtistDelegateMapper;
import com.tattooservice.resources.mappers.interfaces.IArtworkDelegeteMapper;
import com.tattooservice.resources.mappers.interfaces.IBookingDelegateMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfigDelegate {

    @Bean
    public IArtworkDelegeteMapper artworkDelegeteMapper() {
        return new ArtworkDelegateMapper();
    }

    @Bean
    public IArtistDelegateMapper artistDelegateMapper() {
        return new ArtistDelegateMapper();
    }

    @Bean
    public IBookingDelegateMapper bookingDelegateMapper() {
        return new BookingDelegateMapper();
    }
}
