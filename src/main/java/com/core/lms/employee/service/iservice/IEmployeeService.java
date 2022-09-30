package com.core.lms.employee.service.iservice;

import com.core.lms.employee.dto.request.EmployeeDto;
import com.core.lms.base.exception.LmsException;

public interface IEmployeeService {
    String EMPLOYEE_ROLE_MASTER = "employeeRole";
    void createEmployee(EmployeeDto employeeDto) throws LmsException;
}
