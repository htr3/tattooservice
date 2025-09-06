package com.tattooservice.services.business.mappers.interfaces;

import com.tattooservice.services.business.dao.interfaces.IArtistServiceDao;
import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;
import com.tattooservice.services.repository.dto.interfaces.IArtistDTO;

import java.util.List;

public interface IArtistMapperService {
    public IArtistServiceDao map(IArtistDTO artistDTO, List<IArtworkServiceDao> artworkServiceDaos );
}
