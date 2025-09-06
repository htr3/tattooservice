package com.tattooservice.services.business.interfaces;

import com.tattooservice.services.business.dao.interfaces.IBookingServiceDao;
import com.tattooservice.services.models.interfaces.IContext;

import java.util.List;

public interface IGetBookingAdminServiceImpl {
    public List<IBookingServiceDao> GetBookingAdminApplication(IContext context);
}
