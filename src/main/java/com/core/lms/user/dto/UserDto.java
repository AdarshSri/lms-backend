package com.core.lms.user.dto;

import com.core.lms.base.enums.Gender;
import lombok.Data;

@Data
public class UserDto {
    private String userName;
    private String firstName;
    private String lastName;
    private String mailID;
    private Long mobileNo;
    private Gender gender;
//    private
}
