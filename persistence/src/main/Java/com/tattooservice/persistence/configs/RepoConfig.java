package com.tattooservice.persistence.configs;

import com.tattooservice.persistence.dto.UserDTO;
import com.tattooservice.services.repository.dto.interfaces.IUserDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoConfig {

//    @Bean
//    public IUserRepository userRepository() {
//        return new UserRepository();
//    }

    @Bean
    public IUserDTO userDTO() {
        return new UserDTO();
    }


}
