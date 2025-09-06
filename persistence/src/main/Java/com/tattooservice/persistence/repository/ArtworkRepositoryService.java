package com.tattooservice.persistence.repository;

import com.tattooservice.persistence.dto.ArtworksDTO;
import com.tattooservice.persistence.repository.jpa.IArtworkRepository;
import com.tattooservice.services.repository.dto.interfaces.IArtworksDTO;
import com.tattooservice.services.repository.interfaces.IArtworkRepositoryService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Component
public class ArtworkRepositoryService implements IArtworkRepositoryService {

    private final IArtworkRepository artworkRepository;

    @Autowired
    public ArtworkRepositoryService(IArtworkRepository artworkRepository) {
        this.artworkRepository = artworkRepository;
    }

    @Override
    public List<IArtworksDTO> findArtworkById(String artistId) {
        return new ArrayList<>(artworkRepository.findByArtistId(artistId));
    }

    public IArtworksDTO findArtworkByArtworkId(String id) {
        return artworkRepository.findById(id)
                .map(IArtworksDTO.class::cast)
                .orElseThrow(() -> new EntityNotFoundException("Artwork not found with id: " + id));
    }

    public List<IArtworksDTO> findAllArtwork() {
        return new ArrayList<>(artworkRepository.findAll());
    }

}
