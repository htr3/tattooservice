package com.tattooservice.services.business.configs;

import com.tattooservice.services.factory.implemantations.ProductOrderModelFactory;
import com.tattooservice.services.factory.interfaces.IProductOrderModelFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryConfig {

    @Bean
    public IProductOrderModelFactory productOrderModelFactory() {
        return new ProductOrderModelFactory();
    }

}
