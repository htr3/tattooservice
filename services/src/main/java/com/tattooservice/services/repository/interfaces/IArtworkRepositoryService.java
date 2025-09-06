package com.tattooservice.services.repository.interfaces;

import com.tattooservice.services.repository.dto.interfaces.IArtworksDTO;

import java.util.List;
import java.util.Optional;

public interface IArtworkRepositoryService {

    public List<IArtworksDTO> findArtworkById(String id);

    public List<IArtworksDTO> findAllArtwork();

     public IArtworksDTO findArtworkByArtworkId(String id);

}
