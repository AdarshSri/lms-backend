package com.core.lms.base.entity;

import com.core.lms.base.enums.Gender;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tblUser")
public class TblUser extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;
    private String userName;
    private String firstName;
    private String lastName;
    private Long mobileNo;
    private String emailID;
    private Gender gender;
    private Date dob;
    private String address1;
    private String address2;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cityTypeDetailID", referencedColumnName = "typeDetailID")
    private MstTypeDetail cityTypeDetailID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stateTypeDetailID", referencedColumnName = "typeDetailID")
    private MstTypeDetail stateTypeDetailID;
    private Integer pincode;
    private Date registrationDate;
    private Date getRegistrationExpiryDate;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public MstTypeDetail getCityTypeDetailID() {
        return cityTypeDetailID;
    }

    public void setCityTypeDetailID(MstTypeDetail cityTypeDetailID) {
        this.cityTypeDetailID = cityTypeDetailID;
    }

    public MstTypeDetail getStateTypeDetailID() {
        return stateTypeDetailID;
    }

    public void setStateTypeDetailID(MstTypeDetail stateTypeDetailID) {
        this.stateTypeDetailID = stateTypeDetailID;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getGetRegistrationExpiryDate() {
        return getRegistrationExpiryDate;
    }

    public void setGetRegistrationExpiryDate(Date getRegistrationExpiryDate) {
        this.getRegistrationExpiryDate = getRegistrationExpiryDate;
    }
}
