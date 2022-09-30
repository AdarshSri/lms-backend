package com.core.lms.employee.controller;

import com.core.lms.employee.dto.request.EmployeeDto;
import com.core.lms.employee.service.iservice.IEmployeeService;
import com.core.lms.base.exception.LmsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;

    @PostMapping("/create")
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeDto employeeDto){
        try {
            iEmployeeService.createEmployee(employeeDto);
        }catch (LmsException e){
            return ResponseEntity.badRequest().body(e.getErrorMessage());
        }
        return ResponseEntity.ok("record inserted successfully");
    }
}
