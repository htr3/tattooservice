package com.tattooservice.services.business.mappers.interfaces;

import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;
import com.tattooservice.services.repository.dto.interfaces.IArtworksDTO;

import java.util.List;

public interface IArtworkMapper {
    public List<IArtworkServiceDao> map(List<IArtworksDTO> artworksDTOS);
}
