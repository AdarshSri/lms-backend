package com.core.lms.base.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeDetailDto {
    private String typeMasterCode;
    private String typeDetailCode;
    private String typeDetailName;
    private Integer sequence;

}