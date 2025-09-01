//package com.tattooservice.resources.mappers.implemantations;
//
//
//import com.tattooservice.model.BookingRequest;
//import com.tattooservice.resources.mappers.interfaces.IMapCreateUserDTO;
//import com.tattooservice.services.repository.dto.interfaces.IUserDTO;
//import jakarta.inject.Inject;
//import jakarta.inject.Provider;
//
//public class MapCreateUserDTO implements IMapCreateUserDTO {
//
//      @Inject
//      private Provider<IUserDTO> iUserDTOProvider;
//
//        @Override
//        public IUserDTO map(BookingRequest bookingRequest)   {
////             if(null == bookingRequest) {
////                 return null;
////             }
////
////             IUserDTO userDTO = iUserDTOProvider.get();
////
////             userDTO.setUserId(userRequest.getUserId());
////             userDTO.setName(userRequest.getName());
////             userDTO.setEmail(userRequest.getEmail());
////             userDTO.setPhone(userRequest.getPhone());
////             return userDTO;
//        }
//
//}
