package com.tattooservice.services.repository.interfaces;

import com.tattooservice.services.repository.dto.interfaces.IArtistDTO;

import java.util.List;
import java.util.Optional;

public interface IArtistRepositoryService {
    public List<IArtistDTO> getAllArtists();

    public IArtistDTO getArtistById(String artistId);
}
