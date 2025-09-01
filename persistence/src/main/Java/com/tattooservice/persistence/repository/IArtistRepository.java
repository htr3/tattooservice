package com.tattooservice.persistence.repository;


import com.tattooservice.persistence.dto.ArtistDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IArtistRepository extends JpaRepository<ArtistDTO, String> {

}