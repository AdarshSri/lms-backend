package com.core.lms.employee.dto.response;

import com.core.lms.employee.dto.request.EmployeeDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResDto {
    private String token;
    private EmployeeDto employee;
}
