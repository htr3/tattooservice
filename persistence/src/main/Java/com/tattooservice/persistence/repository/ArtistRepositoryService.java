package com.tattooservice.persistence.repository;

import com.tattooservice.persistence.dto.ArtistDTO;
import com.tattooservice.persistence.repository.jpa.IArtistRepository;
import com.tattooservice.services.repository.dto.interfaces.IArtistDTO;
import com.tattooservice.services.repository.interfaces.IArtistRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistRepositoryService implements IArtistRepositoryService {

    private final IArtistRepository artistRepository;

    @Autowired
    public ArtistRepositoryService(IArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }


    public List<IArtistDTO> getAllArtists() {
        return  artistRepository.findAll()
                .stream()
                .map(artist -> (IArtistDTO) artist) // or use a mapper
                .toList();
    }

    public IArtistDTO getArtistById(String artistId) {
        return artistRepository.findById(artistId)
                .map(artist -> (IArtistDTO) artist)
                .orElse(null);
    }

}
