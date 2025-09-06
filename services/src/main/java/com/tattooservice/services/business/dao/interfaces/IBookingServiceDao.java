package com.tattooservice.services.business.dao.interfaces;

import java.time.Instant;

public interface IBookingServiceDao {
    public String getName() ;

    public void setName(String name) ;

    public String getPhone() ;

    public void setPhone(String phone);

    public Instant getUpdatedAt() ;

    public void setUpdatedAt(Instant updatedAt) ;

    public Instant getCreatedAt() ;

    public void setCreatedAt(Instant createdAt) ;

    public void setId(String id) ;

    public String getMessage() ;

    public void setMessage(String message) ;
}
