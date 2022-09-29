package com.core.lms.controller;

import com.core.lms.dto.request.TypeDetailDto;
import com.core.lms.dto.request.TypeMasterDto;
import com.core.lms.exception.LMSException;
import com.core.lms.service.iservice.ITypeDetailService;
import com.core.lms.service.iservice.ITypeMasterService;
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
        }catch (LMSException e){
            return ResponseEntity.badRequest().body(e.getErrorMessage());
        }
        return ResponseEntity.ok("record inserted successfully");
    }
}
