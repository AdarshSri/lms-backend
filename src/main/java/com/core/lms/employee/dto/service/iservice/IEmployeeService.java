package com.core.lms.employee.dto.service.iservice;

import com.core.lms.employee.dto.EmployeeDto;
import com.core.lms.exception.LMSException;

public interface IEmployeeService {
    void createEmployee(EmployeeDto employeeDto) throws LMSException;
}
