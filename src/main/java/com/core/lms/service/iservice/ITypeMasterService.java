package com.core.lms.service.iservice;

import com.core.lms.dto.request.TypeMasterDto;
import com.core.lms.exception.LMSException;

public interface ITypeMasterService {
    void createTypeMaster(TypeMasterDto typeMasterDto) throws LMSException;
}
