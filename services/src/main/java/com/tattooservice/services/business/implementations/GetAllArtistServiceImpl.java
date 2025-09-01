package com.tattooservice.services.business.implementations;

import com.tattooservice.services.business.interfaces.IGetAllArtistServiceImpl;
import com.tattooservice.services.models.interfaces.IContext;
import com.tattooservice.services.repository.interfaces.IUserServiceRepository;
import jakarta.inject.Inject;
import org.springframework.stereotype.Service;


@Service
public class GetAllArtistServiceImpl implements IGetAllArtistServiceImpl {

    @Inject
    IUserServiceRepository userServiceRepository;

    public void getAllArtistApplication(IContext context) {

        getAllArtistApplication();


    }

}
