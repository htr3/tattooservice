package com.tattooservice.ms.api.implementations;

import com.tattooservice.api.ApiApi;
import com.tattooservice.model.Artist;
import com.tattooservice.model.Artwork;
import com.tattooservice.model.Booking;
import com.tattooservice.model.BookingRequest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Scope(value = "prototype")
public class TattoArtistController implements ApiApi, ApplicationContextAware {

    private ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    // get all artist 
    public static class GetAllArtistParameters {
    }

    @Configuration
    public class GetAllArtistParametersConfig {
        @Bean
        @Scope(value = "prototype")
        public TattoArtistController.GetAllArtistParameters getAllArtistParameters() {
            return new TattoArtistController.GetAllArtistParameters();
        }
    }

    public interface IGetAllArtistDelegate {
        ResponseEntity<List<Artist>> execute(GetAllArtistParameters parameters);
    }

    @Override
    public ResponseEntity<List<Artist>> apiArtistsGet() {
        TattoArtistController.GetAllArtistParameters parameters = this.applicationContext.getBean(TattoArtistController.GetAllArtistParameters.class);
        TattoArtistController.IGetAllArtistDelegate getAllArtistDelegate = this.applicationContext.getBean(TattoArtistController.IGetAllArtistDelegate.class); 
        return getAllArtistDelegate.execute(parameters);
    }
    
//  get Artist by Id
    public static class GetArtistByIdParameters {
        private String id;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    @Configuration
    public class GetArtistByIdParametersConfig {
        @Bean
        @Scope(value = "prototype")
        public TattoArtistController.GetArtistByIdParameters getBeanGeneratedOp_1756490037432Parameters() {
            return new TattoArtistController.GetArtistByIdParameters();
        }
    }

    public interface IGetArtistByIdDelegate {
        ResponseEntity<Artist> execute(TattoArtistController.GetArtistByIdParameters parameters);
    }

    @Override
    public ResponseEntity<Artist> apiArtistsIdGet(String id) {
        TattoArtistController.GetArtistByIdParameters parameters = this.applicationContext.getBean(TattoArtistController.GetArtistByIdParameters.class);
        TattoArtistController.IGetArtistByIdDelegate getArtistByIdDelegate = this.applicationContext.getBean(TattoArtistController.IGetArtistByIdDelegate.class);
        parameters.setId(id);
        return getArtistByIdDelegate.execute(parameters);
    }
    
    // get all artwork 
    
    public static class GetAllArtWorkParameters {
    }

    @Configuration
    public class GetAllArtWorkParametersConfig {
        @Bean
        @Scope(value = "prototype")
        public TattoArtistController.GetAllArtWorkParameters getAllArtWorkParameters() {
            return new TattoArtistController.GetAllArtWorkParameters();
        }
    }

    public interface IGetAllArtWorkDelegate {
        ResponseEntity<List<Artwork>> execute(GetAllArtWorkParameters parameters);
    }

    @Override
    public ResponseEntity<List<Artwork>> apiArtworksGet() {
        TattoArtistController.GetAllArtWorkParameters parameters = this.applicationContext.getBean(TattoArtistController.GetAllArtWorkParameters.class);
        TattoArtistController.IGetAllArtWorkDelegate getAllArtWorkDelegate = this.applicationContext.getBean(TattoArtistController.IGetAllArtWorkDelegate.class); 
        return getAllArtWorkDelegate.execute(parameters);
    }
    
    // get artwork by id 
    
    public static class GetArtWorkByIdParameters {
        private String id;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }


    @Configuration
    public class GetArtWorkByIdParametersConfig {
        @Bean
        @Scope(value = "prototype")
        public TattoArtistController.GetArtWorkByIdParameters getBeanGetArtWorkByIdParameters() {
            return new TattoArtistController.GetArtWorkByIdParameters();
        }
    }

    public interface IGetArtWorkByIdDelegate {
        ResponseEntity<Artwork> execute(GetArtWorkByIdParameters parameters);
    }

    @Override
    public ResponseEntity<Artwork> apiArtworksIdGet(String id) {
        TattoArtistController.GetArtWorkByIdParameters parameters = this.applicationContext.getBean(TattoArtistController.GetArtWorkByIdParameters.class);
        TattoArtistController.IGetArtWorkByIdDelegate getArtWorkByIdDelegate = this.applicationContext.getBean(TattoArtistController.IGetArtWorkByIdDelegate.class); 
        parameters.setId(id);
        return getArtWorkByIdDelegate.execute(parameters);
    }
    
    // Booking tattoo
    
    public static class BookingParameters {
        BookingRequest bookingRequest;
        
        public BookingRequest getBookingRequest() {
            return bookingRequest;
        }

        public void setBookingRequest(BookingRequest bookingRequest) {
            this.bookingRequest = bookingRequest;
        }
        
    }

    @Configuration
    public class BookingParametersConfig {
        @Bean
        @Scope(value = "prototype")
        public TattoArtistController.BookingParameters getBeanBookingParameters() {
            return new TattoArtistController.BookingParameters();
        }
    }

    public interface IBookingRequestDelegate {
        ResponseEntity<Booking> execute(BookingParameters parameters);
    }

    @Override
    public ResponseEntity<Booking> apiBookingsPost(BookingRequest bookingRequest) {
        TattoArtistController.BookingParameters parameters = this.applicationContext.getBean(TattoArtistController.BookingParameters.class);
        TattoArtistController.IBookingRequestDelegate bookingDelegate = this.applicationContext.getBean(TattoArtistController.IBookingRequestDelegate.class);
        parameters.setBookingRequest(bookingRequest);
        return bookingDelegate.execute(parameters);
    }

    // get booking
    public static class GetBookingAdminParameters {
    }

    @Configuration
    public class GetBookingAdminParametersConfig {
        @Bean
        @Scope(value = "prototype")
        public TattoArtistController.GetBookingAdminParameters getBeanGetBookingAdminParameters() {
            return new TattoArtistController.GetBookingAdminParameters();
        }
    }

    public interface IGetBookingAdminDelegate {
        ResponseEntity<List<Booking>> execute(GetBookingAdminParameters parameters);
    }

    @Override
    public ResponseEntity<List<Booking>> apiBookingsGet() {
        TattoArtistController.GetBookingAdminParameters parameters = this.applicationContext.getBean(TattoArtistController.GetBookingAdminParameters.class);
        TattoArtistController.IGetBookingAdminDelegate getBookingAdminDelegate = this.applicationContext.getBean(TattoArtistController.IGetBookingAdminDelegate.class);

        return getBookingAdminDelegate.execute(parameters);
    }
}
