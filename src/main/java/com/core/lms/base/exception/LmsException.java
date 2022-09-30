package com.core.lms.base.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LmsException extends Exception {
    private String errorMessage;
}
