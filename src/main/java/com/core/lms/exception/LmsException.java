package com.core.lms.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LMSException extends Exception {
    private String errorMessage;
}
