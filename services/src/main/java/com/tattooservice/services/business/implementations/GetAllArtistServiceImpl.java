package com.tattooservice.services.business.implementations;

import com.tattooservice.services.business.dao.implemantations.ArtistServiceDao;
import com.tattooservice.services.business.dao.implemantations.ArtworkServiceDao;
import com.tattooservice.services.business.dao.interfaces.IArtistServiceDao;
import com.tattooservice.services.business.dao.interfaces.IArtworkServiceDao;
import com.tattooservice.services.business.interfaces.IGetAllArtistServiceImpl;
import com.tattooservice.services.models.interfaces.IContext;
import com.tattooservice.services.repository.dto.interfaces.IArtistDTO;
import com.tattooservice.services.repository.dto.interfaces.IArtworksDTO;
import com.tattooservice.services.repository.interfaces.IArtistRepositoryService;
import com.tattooservice.services.repository.interfaces.IArtworkRepositoryService;
import com.tattooservice.services.repository.interfaces.IUserServiceRepository;
import jakarta.inject.Inject;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GetAllArtistServiceImpl implements IGetAllArtistServiceImpl {

    @Inject
    public IArtistRepositoryService artistRepositoryService;

    @Inject
    public IArtworkRepositoryService artworkRepositoryService;

    private List<IArtistDTO> artistDTO;

    private List<IArtworksDTO> artworksDTOS;

//    private List<IArtistServiceDao> artistServiceDaos;



    public  List<IArtistServiceDao> getAllArtistApplication(IContext context) {

        try {
            List<IArtistServiceDao> artistServiceDaos = new java.util.ArrayList<>(List.of());

            artistDTO = artistRepositoryService.getAllArtists();

            for(IArtistDTO artistDTO1: artistDTO) {
                artworksDTOS = artworkRepositoryService.findArtworkById(artistDTO1.getId());
                artistServiceDaos.add(map(artistDTO1, artworksDTOS));
            }

            context.setValue("artistDTO", artistServiceDaos);
            return artistServiceDaos;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    private IArtistServiceDao map(IArtistDTO artistDTO, List<IArtworksDTO> artworksDTOS) {
        List<IArtworkServiceDao> artworkServiceDao = new java.util.ArrayList<>(List.of());

        for(IArtworksDTO artworksDTO : artworksDTOS) {
            IArtworkServiceDao artworkServiceDao1 = new ArtworkServiceDao();
            artworkServiceDao1.setDescription(artworksDTO.getDescreption());
            artworkServiceDao1.setId(artworksDTO.getId());
            artworkServiceDao1.setArtistId(artworksDTO.getArtistId());
            artworkServiceDao1.setTitle(artworksDTO.getTitle());
            artworkServiceDao1.setImageUrl(artworksDTO.getImage());
            artworkServiceDao.add(artworkServiceDao1);
        }


        IArtistServiceDao artistServiceDao1 = new ArtistServiceDao();
        artistServiceDao1.setBio(artistDTO.getBio());
        artistServiceDao1.setName(artistDTO.getName());
        artistServiceDao1.setId(artistDTO.getId());
        artistServiceDao1.setArtworks(artworkServiceDao);

        return artistServiceDao1;

    }

}
