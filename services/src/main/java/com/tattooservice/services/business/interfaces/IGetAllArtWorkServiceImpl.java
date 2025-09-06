package com.tattooservice.services.business.interfaces;

import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;
import com.tattooservice.services.models.interfaces.IContext;

import java.util.List;

public interface IGetAllArtWorkServiceImpl {
    public List<IArtworkServiceDao> getAllArtWorkApplication(IContext context);
}
