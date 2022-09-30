/*
package com.core.lms.employee.service.serviceimpl;

import com.core.lms.base.dto.request.LoginDto;
import com.core.lms.employee.dto.request.EmployeeDto;
import com.core.lms.employee.dto.response.LoginResDto;
import com.core.lms.employee.service.iservice.ILoginService;
import com.core.lms.employee.utils.JwtTokenUtil;
import com.core.lms.employee.utils.RequestVariable;
import com.core.lms.base.entity.TblEmployee;
import com.core.lms.base.exception.LmsException;
import com.core.lms.base.repository.ITblEmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class LoginService implements ILoginService {

    @Autowired
    ITblEmployeeRepository iTblEmployeeRepository;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    JwtTokenUtil jwtTokenUtil;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    RequestVariable requestVariable;

    @Override
    public String validateLoginRequest(LoginDto loginDto) throws LmsException {
        if (null == loginDto.getEmployeeCode() || null == loginDto.getPassword()) {
            log.error("mandatory fields are missing");
            throw new LmsException("Mandatory fields are missing");
        }
        authenticate(loginDto.getEmployeeCode(), loginDto.getPassword());
        TblEmployee tblEmployee = iTblEmployeeRepository.findByEmployeeCodeAndIsActive(loginDto.getEmployeeCode(), true);
        UserDetails userDetails = loadUserByUserName(tblEmployee);
        String token = jwtTokenUtil.generateToken(userDetails);

        EmployeeDto employeeDto = modelMapper.map(tblEmployee, EmployeeDto.class);
        LoginResDto loginRes = LoginResDto.builder()
                .token(token)
                .employee(employeeDto)
                .build();
        return null;
    }

    private void authenticate(String username, String password) throws LmsException {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new LmsException("User is inactive");
        } catch (BadCredentialsException e) {
            throw new LmsException("Invalid username or password");
        }
    }

    private UserDetails loadUserByUserName(TblEmployee tblEmployee) {
        List<String> userDetails = new ArrayList<>();
        userDetails.add(tblEmployee.getEmployeeCode());
        return new User(tblEmployee.getEmployeeCode(), tblEmployee.getPassword(), tblEmployee.getActive(), true, true,
                true, getGrantedAuthorities(userDetails));
    }

    private List<GrantedAuthority> getGrantedAuthorities(List<String> privileges) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String privilege : privileges) {
            authorities.add(new SimpleGrantedAuthority(privilege));
        }
        return authorities;
    }
}
*/
