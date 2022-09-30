package com.core.lms.employee.service.iservice;

import com.core.lms.base.dto.request.LoginDto;
import com.core.lms.base.exception.LmsException;

public interface ILoginService {
    String validateLoginRequest(LoginDto loginDto) throws LmsException;
}
