package com.core.lms.base.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tblOrderDetail")
public class TblOrderDetail extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderDetailID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderID", referencedColumnName = "orderID")
    private TblOrder orderID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookID", referencedColumnName = "bookID")
    private TblBook bookID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderTypeTypeDetailId", referencedColumnName = "typeDetailID")
    private MstTypeDetail orderTypeTypeDetailId;
    private Double orderAmount;

    public Integer getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(Integer orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public TblOrder getOrderID() {
        return orderID;
    }

    public void setOrderID(TblOrder orderID) {
        this.orderID = orderID;
    }

    public TblBook getBookID() {
        return bookID;
    }

    public void setBookID(TblBook bookID) {
        this.bookID = bookID;
    }

    public MstTypeDetail getOrderTypeTypeDetailId() {
        return orderTypeTypeDetailId;
    }

    public void setOrderTypeTypeDetailId(MstTypeDetail orderTypeTypeDetailId) {
        this.orderTypeTypeDetailId = orderTypeTypeDetailId;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }
}
