package com.core.lms.controller;

import com.core.lms.dto.request.TypeMasterDto;
import com.core.lms.exception.LMSException;
import com.core.lms.service.iservice.ITypeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/master")
public class TypeMasterController {
    @Autowired
    ITypeMasterService iTypeMasterService;

    @PostMapping("/type-master")
    public ResponseEntity<String> createTypeMaster(@RequestBody TypeMasterDto typeMasterDto) {
        try {
            iTypeMasterService.createTypeMaster(typeMasterDto);
        }catch (LMSException e){
            return ResponseEntity.badRequest().body(e.getErrorMessage());
        }
        return ResponseEntity.ok("record inserted successfully");
    }
}
