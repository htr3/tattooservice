package com.tattooservice.services.business.interfaces;

import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;
import com.tattooservice.services.models.interfaces.IContext;

public interface IGetArtWorkByIdServiceImpl {
    public IArtworkServiceDao getArtWorkByIdApplication(IContext context, String artworkId);
}
