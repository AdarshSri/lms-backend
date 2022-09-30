package com.core.lms.base.service.iservice;

import com.core.lms.base.dto.request.TypeDetailDto;
import com.core.lms.base.exception.LmsException;

public interface ITypeDetailService {
    void createTypeDetail(TypeDetailDto typeDetailDto) throws LmsException;
}
