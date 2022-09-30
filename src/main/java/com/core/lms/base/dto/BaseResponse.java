package com.core.lms.base.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseResponse<T> {
    private String responseCode;
    private String responseMsg;
    private String errorStack;
    private long timestamp = System.currentTimeMillis();
    private String appVersion;
    private T responseObj;
}
