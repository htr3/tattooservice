package com.tattooservice.services.business.interfaces;

import com.tattooservice.services.business.dao.interfaces.IArtistServiceDao;
import com.tattooservice.services.models.interfaces.IContext;

public interface IGetArtistByIdServiceImpl {

    public IArtistServiceDao getArtistByIdApplication(IContext context, String artistId);
}
