package com.tattooservice.services.factory.implemantations;


import com.tattooservice.services.factory.interfaces.IProductOrderModelFactory;
import com.tattooservice.services.models.implementations.Context;
import com.tattooservice.services.models.interfaces.IContext;

public class ProductOrderModelFactory implements IProductOrderModelFactory {
    @Override
    public IContext getContext() {
        return new Context();
    }

}
