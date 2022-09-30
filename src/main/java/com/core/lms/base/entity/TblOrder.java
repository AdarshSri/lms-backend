package com.core.lms.base.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tblOrder")
public class TblOrder extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderID;
    private String orderNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    private TblUser userID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issuedByUserID", referencedColumnName = "employeeID")
    private TblEmployee issuedByUserID;
    private Date orderCreatedOn;
    private Double totalAmount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paymentStatusTypeDetailID", referencedColumnName = "typeDetailID")
    private MstTypeDetail paymentStatusTypeDetailID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modOfPaymentTypeDetailID", referencedColumnName = "typeDetailID")
    private MstTypeDetail modOfPaymentTypeDetailID;
    private String transactionID;

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public TblUser getUserID() {
        return userID;
    }

    public void setUserID(TblUser userID) {
        this.userID = userID;
    }

    public TblEmployee getIssuedByUserID() {
        return issuedByUserID;
    }

    public void setIssuedByUserID(TblEmployee issuedByUserID) {
        this.issuedByUserID = issuedByUserID;
    }

    public Date getOrderCreatedOn() {
        return orderCreatedOn;
    }

    public void setOrderCreatedOn(Date orderCreatedOn) {
        this.orderCreatedOn = orderCreatedOn;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public MstTypeDetail getPaymentStatusTypeDetailID() {
        return paymentStatusTypeDetailID;
    }

    public void setPaymentStatusTypeDetailID(MstTypeDetail paymentStatusTypeDetailID) {
        this.paymentStatusTypeDetailID = paymentStatusTypeDetailID;
    }

    public MstTypeDetail getModOfPaymentTypeDetailID() {
        return modOfPaymentTypeDetailID;
    }

    public void setModOfPaymentTypeDetailID(MstTypeDetail modOfPaymentTypeDetailID) {
        this.modOfPaymentTypeDetailID = modOfPaymentTypeDetailID;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }
}
