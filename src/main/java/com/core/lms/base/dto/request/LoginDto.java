package com.core.lms.base.dto.request;

import lombok.Data;

@Data
public class LoginDto {
    private String employeeCode;
    private String password;
}
