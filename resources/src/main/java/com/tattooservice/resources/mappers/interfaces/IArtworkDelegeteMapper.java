package com.tattooservice.resources.mappers.interfaces;

import com.tattooservice.model.Artwork;
import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;

import java.util.List;

public interface IArtworkDelegeteMapper {

    public List<Artwork> map(List<IArtworkServiceDao> artworkServiceDaos);

}
