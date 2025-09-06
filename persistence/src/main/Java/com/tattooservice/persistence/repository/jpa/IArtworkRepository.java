package com.tattooservice.persistence.repository.jpa;

import com.tattooservice.persistence.dto.ArtworksDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IArtworkRepository extends JpaRepository<ArtworksDTO, String> {
    List<ArtworksDTO> findByArtistId(String artistId);
}
