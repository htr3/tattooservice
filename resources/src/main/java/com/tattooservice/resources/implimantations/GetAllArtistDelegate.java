package com.tattooservice.resources.implimantations;

import com.tattooservice.model.Artist;
import com.tattooservice.model.Artwork;
import com.tattooservice.model.BookingRequest;
import com.tattooservice.ms.api.implementations.TattoArtistController;
import com.tattooservice.services.business.interfaces.IGetAllArtistServiceImpl;
import com.tattooservice.services.factory.interfaces.IProductOrderModelFactory;
import com.tattooservice.services.models.interfaces.IContext;
import jakarta.inject.Inject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GetAllArtistDelegate implements TattoArtistController.IGetAllArtistDelegate {

    @Inject
    private IProductOrderModelFactory productOrderModelFactory;

    @Inject
    private IGetAllArtistServiceImpl getAllArtistService;

    private static final String BOKKING = "booking";

    @Override
    public ResponseEntity<List<Artist>> execute(TattoArtistController.GetAllArtistParameters parameters) {
        // call to service
        IContext context = productOrderModelFactory.getContext();

        getAllArtistService.getAllArtistApplication(context);

        return ResponseEntity.ok(dummydata());
    }

    private List<Artist> dummydata() {
        List<Artist> artists = new ArrayList<>();

        Artist artist1 = new Artist()
                .id("A001")
                .name("Vincent van Gogh")
                .bio("Dutch post-impressionist painter known for his expressive use of color.")
                .artworks(Arrays.asList(
                        new Artwork().id("ART001").title("Starry Night").description("1889"),
                        new Artwork().id("ART002").title("Sunflowers").description("1888")
                ));

        Artist artist2 = new Artist()
                .id("A002")
                .name("Pablo Picasso")
                .bio("Spanish painter, sculptor, and co-founder of the Cubist movement.")
                .artworks(Arrays.asList(
                        new Artwork().id("ART003").title("Les Demoiselles d'Avignon").description("1907"),
                        new Artwork().id("ART004").title("Guernica").description("1937")
                ));

        Artist artist3 = new Artist()
                .id("A003")
                .name("Frida Kahlo")
                .bio("Mexican painter known for self-portraits and works inspired by nature.")
                .artworks(Arrays.asList(
                        new Artwork().id("ART005").title("The Two Fridas").description("1939"),
                        new Artwork().id("ART006").title("Self-Portrait with Thorn Necklace and Hummingbird").description("1940")
                ));

        artists.add(artist1);
        artists.add(artist2);
        artists.add(artist3);

        return artists;
    }
}
