package com.core.lms.base.service.serviceimpl;

import com.core.lms.base.dto.request.TypeMasterDto;
import com.core.lms.base.entity.MstTypeMaster;
import com.core.lms.base.exception.LmsException;
import com.core.lms.base.repository.IMstTypeMasterRepository;
import com.core.lms.base.service.iservice.ITypeMasterService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class TypeMasterService implements ITypeMasterService {

    @Autowired
    IMstTypeMasterRepository iMstTypeMasterRepository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public void createTypeMaster(TypeMasterDto typeMasterDto) throws LmsException {
        log.info("start createTypeMaster - {}", typeMasterDto);
        if (null == typeMasterDto.getTypeMasterCode() || null == typeMasterDto.getTypeMasterName()) {
            log.error("createTypeMaster - mandatory fields are missing - {}", typeMasterDto);
            throw new LmsException("Mandatory fields are missing");
        }

        MstTypeMaster existingMstTypeMaster = iMstTypeMasterRepository.findByTypeMasterCode(typeMasterDto.getTypeMasterCode());
        if (null != existingMstTypeMaster) {
            log.error("createTypeMaster - mstMasterCode should be unique - {}", existingMstTypeMaster.getTypeMasterCode());
            throw new LmsException("mstMasterCode should be unique");
        }

        MstTypeMaster mstTypeMaster = modelMapper.map(typeMasterDto, MstTypeMaster.class);
        mstTypeMaster.setCreatedBy(1);
        mstTypeMaster.setCreatedOn(new Date());
        mstTypeMaster.setActive(true);
        mstTypeMaster.setLastModifiedBy(1);
        mstTypeMaster.setLastModifiedOn(new Date());
        log.info("createTypeMaster - converted dto to entity - {}", mstTypeMaster);
        iMstTypeMasterRepository.save(mstTypeMaster);
        log.info("end createTypeMaster - ");
    }
}
