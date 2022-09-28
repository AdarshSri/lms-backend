package com.core.lms.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tblEmployee")
public class TblEmployee extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeID;
    private String employeeCode;
    private String firstName;
    private String lastName;
    private Long mobileNo;
    private String emailID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employeeRoleTypeDetailID", referencedColumnName = "typeDetailID")
    private MstTypeDetail employeeRoleTypeDetailID;
    private Date dob;
    private Date doj;
    private String password;

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public MstTypeDetail getEmployeeRoleTypeDetailID() {
        return employeeRoleTypeDetailID;
    }

    public void setEmployeeRoleTypeDetailID(MstTypeDetail employeeRoleTypeDetailID) {
        this.employeeRoleTypeDetailID = employeeRoleTypeDetailID;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
