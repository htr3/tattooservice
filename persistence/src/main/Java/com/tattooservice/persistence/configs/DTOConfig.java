package com.tattooservice.persistence.configs;

import com.tattooservice.persistence.dto.ArtistDTO;
import com.tattooservice.persistence.dto.ArtworksDTO;
import com.tattooservice.persistence.dto.BookingsDTO;
import com.tattooservice.services.repository.dto.interfaces.IArtistDTO;
import com.tattooservice.services.repository.dto.interfaces.IArtworksDTO;
import com.tattooservice.services.repository.dto.interfaces.IBookingsDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DTOConfig {

    @Bean
    public IBookingsDTO bookingsDTO() {
        return new BookingsDTO();
    }

    @Bean
    public IArtistDTO artistDTO() {
        return new ArtistDTO();
    }

    @Bean
    public IArtworksDTO artWorksDTO() {
        return new ArtworksDTO();
    }

}
