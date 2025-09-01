package com.tattooservice.services.models.interfaces;

import java.io.Serializable;
import java.util.Map;

public interface IContext extends Serializable {


    public Map<String,Object> getMap() ;


    public void setMap(Map<String, Object> map) ;

    public String getValue(String key) ;

    public void setValue(String key, Object value) ;
}
