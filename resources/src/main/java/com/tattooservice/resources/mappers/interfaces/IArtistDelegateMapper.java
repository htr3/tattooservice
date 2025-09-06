package com.tattooservice.resources.mappers.interfaces;

import com.tattooservice.model.Artist;
import com.tattooservice.services.business.dao.interfaces.IArtistServiceDao;

public interface IArtistDelegateMapper {
    public Artist map(IArtistServiceDao artistServiceDao);
}
