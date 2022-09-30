package com.core.lms.employee.utils;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
@Data
public class RequestVariable {
    private String empIp;
    private String empId;
    private String empCode;

}
