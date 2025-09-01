package com.tattooservice.services.models.implementations;


import com.tattooservice.services.models.interfaces.IContext;

import java.util.HashMap;
import java.util.Map;

public class Context implements IContext {

    private Map<String, Object> map = new HashMap<>();

    @Override
    public Map<String,Object> getMap() { return map; }

    @Override
    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public String getValue(String key) { return (String) map.get(key); }

    public void setValue(String key, Object value) { map.put(key, value); }


}
