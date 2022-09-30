package com.core.lms.employee.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDto {
    private String employeeCode;
    private String firstName;
    private String lastName;
    private String emailID;
    private Long mobileNo;
    private Date dob;
    private Date doj;
    private String password;
    private String employeeRoleCode;
}

