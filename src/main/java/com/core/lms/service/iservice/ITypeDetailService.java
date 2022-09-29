package com.core.lms.service.iservice;

import com.core.lms.dto.request.TypeDetailDto;
import com.core.lms.exception.LMSException;

public interface ITypeDetailService {
    void createTypeDetail(TypeDetailDto typeDetailDto) throws LMSException;
}
