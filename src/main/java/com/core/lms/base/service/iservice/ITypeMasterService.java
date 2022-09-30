package com.core.lms.base.service.iservice;

import com.core.lms.base.dto.request.TypeMasterDto;
import com.core.lms.base.exception.LmsException;

public interface ITypeMasterService {
    void createTypeMaster(TypeMasterDto typeMasterDto) throws LmsException;
}
