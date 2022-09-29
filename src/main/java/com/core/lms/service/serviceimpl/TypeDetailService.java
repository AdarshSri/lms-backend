package com.core.lms.service.serviceimpl;

import com.core.lms.dto.request.TypeDetailDto;
import com.core.lms.entity.MstTypeDetail;
import com.core.lms.entity.MstTypeMaster;
import com.core.lms.exception.LMSException;
import com.core.lms.repository.IMstTypeDetailRepository;
import com.core.lms.repository.IMstTypeMasterRepository;
import com.core.lms.service.iservice.ITypeDetailService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class TypeDetailService implements ITypeDetailService {
    @Autowired
    IMstTypeMasterRepository iMstTypeMasterRepository;
    @Autowired
    IMstTypeDetailRepository iMstTypeDetailRepository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public void createTypeDetail(TypeDetailDto typeDetailDto) throws LMSException {
        log.info("start createTypeDetail - {}", typeDetailDto);
        String typeMasterCode = typeDetailDto.getTypeMasterCode();
        String typeDetailCode = typeDetailDto.getTypeDetailCode();
        String typeDetailName = typeDetailDto.getTypeDetailName();
        if (null == typeDetailCode || null == typeMasterCode || null == typeDetailName) {
            log.error("Mandatory fields are missing");
            throw new LMSException("Mandatory fields are missing");
        }

        MstTypeMaster mstTypeMaster = iMstTypeMasterRepository.findByTypeMasterCode(typeMasterCode);
        if (null == mstTypeMaster) {
            log.error("could not find type master fom given code - {}", typeMasterCode);
            throw new LMSException("Could not find mstTypeMaster from given typeMasterCode");
        }

        MstTypeDetail existingMstTypeDetail = iMstTypeDetailRepository.findByTypeMasterIDAndTypeDetailCode(mstTypeMaster, typeDetailCode);
        if (null != existingMstTypeDetail) {
            log.error("typeDetailCode is already exist for given typeMasterCode");
            throw new LMSException("typeDetailCode is already exist for given typeMasterCode");
        }

        MstTypeDetail mstTypeDetail = modelMapper.map(typeDetailDto, MstTypeDetail.class);
        mstTypeDetail.setTypeMasterID(mstTypeMaster);
        mstTypeDetail.setActive(true);
        mstTypeDetail.setCreatedOn(new Date());
        mstTypeDetail.setCreatedBy(1);
        iMstTypeDetailRepository.save(mstTypeDetail);
        log.info("end createTypeDetail");
    }
}
