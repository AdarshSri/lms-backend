package com.core.lms.base.controller;

import com.core.lms.base.dto.request.TypeDetailDto;
import com.core.lms.base.exception.LmsException;
import com.core.lms.base.service.iservice.ITypeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/master")
public class TypeDetailController {
    @Autowired
    ITypeDetailService iTypeDetailService;

    @PostMapping("/type-detail")
    public ResponseEntity<String> createTypeDetail(@RequestBody TypeDetailDto typeDetailDto) {
        try {
            iTypeDetailService.createTypeDetail(typeDetailDto);
        }catch (LmsException e){
            return ResponseEntity.badRequest().body(e.getErrorMessage());
        }
        return ResponseEntity.ok("record inserted successfully");
    }
}
