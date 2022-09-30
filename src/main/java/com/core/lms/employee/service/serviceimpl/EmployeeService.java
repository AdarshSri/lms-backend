package com.core.lms.employee.service.serviceimpl;

import com.core.lms.employee.dto.request.EmployeeDto;
import com.core.lms.employee.service.iservice.IEmployeeService;
import com.core.lms.base.entity.MstTypeDetail;
import com.core.lms.base.entity.MstTypeMaster;
import com.core.lms.base.entity.TblEmployee;
import com.core.lms.base.exception.LmsException;
import com.core.lms.base.repository.IMstTypeDetailRepository;
import com.core.lms.base.repository.IMstTypeMasterRepository;
import com.core.lms.base.repository.ITblEmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class EmployeeService implements IEmployeeService {

    @Autowired
    ITblEmployeeRepository iTblEmployeeRepository;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    IMstTypeDetailRepository iMstTypeDetailRepository;
    @Autowired
    IMstTypeMasterRepository iMstTypeMasterRepository;

    @Override
    public void createEmployee(EmployeeDto employeeDto) throws LmsException {
        log.info("start createEmployee - {}", employeeDto);
        String employeeCode = employeeDto.getEmployeeCode();
        String firstName = employeeDto.getFirstName();
        String lastName = employeeDto.getLastName();
        String employeeRoleCode = employeeDto.getEmployeeRoleCode();
        if (null == employeeCode || null == firstName || null == lastName || null == employeeRoleCode) {
            log.error("mandatory fields are missing");
            throw new LmsException("Mandatory fields are missing");
        }

        TblEmployee existingTblEmployee = iTblEmployeeRepository.findByEmployeeCodeAndIsActive(employeeCode, true);
        if (null != existingTblEmployee) {
            log.error("employee code already exists");
            throw new LmsException("Employee code already exists");
        }

        MstTypeDetail employeeRoleTypeDetail = findTypeDetail(EMPLOYEE_ROLE_MASTER, employeeRoleCode);
        if (null == employeeRoleTypeDetail) {
            log.error("Could not find given role in typeDetail");
            throw new LmsException("Could not find given role in typeDetail");
        }
        TblEmployee tblEmployee = modelMapper.map(employeeDto, TblEmployee.class);
        tblEmployee.setActive(true);
        tblEmployee.setCreatedOn(new Date());
        tblEmployee.setCreatedBy(1);
        tblEmployee.setEmployeeRoleTypeDetailID(employeeRoleTypeDetail);
        iTblEmployeeRepository.save(tblEmployee);
    }

    private MstTypeDetail findTypeDetail(String typeMasterCode, String typeDetailCode) throws LmsException {
        MstTypeMaster mstTypeMaster = iMstTypeMasterRepository.findByTypeMasterCode(typeMasterCode);
        if (null == mstTypeMaster) {
            throw new LmsException("Could not find employeeRole in mstTypeMaster");
        }

        return iMstTypeDetailRepository.findByTypeMasterIDAndTypeDetailCode(mstTypeMaster, typeDetailCode);
    }
}
