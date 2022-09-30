package com.core.lms.employee.controller;

import com.core.lms.base.controller.BaseController;
import com.core.lms.base.dto.BaseResponse;
import com.core.lms.base.dto.request.LoginDto;
import com.core.lms.base.exception.LmsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/auth")
public class LoginController extends BaseController {

    @PostMapping("/")
    public ResponseEntity<BaseResponse<String>> createAuthenticationToken(@RequestBody @Valid LoginDto loginDto, HttpServletRequest request)
        throws LmsException{
        String status = "success";

        return ResponseEntity.ok(new BaseResponse<>());
    }
}
