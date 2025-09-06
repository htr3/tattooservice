package com.tattooservice.services.business.interfaces;

import com.tattooservice.services.business.dao.interfaces.IArtistServiceDao;
import com.tattooservice.services.models.interfaces.IContext;

import java.util.List;

public interface IGetAllArtistServiceImpl {
    public List<IArtistServiceDao> getAllArtistApplication(IContext context);
}
