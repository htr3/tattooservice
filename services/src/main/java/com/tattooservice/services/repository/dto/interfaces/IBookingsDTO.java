package com.tattooservice.services.repository.dto.interfaces;

import java.io.Serializable;
import java.time.Instant;

public interface  IBookingsDTO extends Serializable {


    public String getName() ;

    public void setName(String name) ;

    public String getPhone() ;

    public void setPhone(String phone);

    public Instant getUpdatedAt() ;

    public void setUpdatedAt(Instant updatedAt) ;

    public Instant getCreatedAt() ;

    public void setCreatedAt(Instant createdAt) ;

    public void setId(Long id) ;

    public String getMessage() ;

    public void setMessage(String message) ;

}
