package com.core.lms.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mstTypeDetail")
public class MstTypeDetail extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeDetailID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typeMasterID", referencedColumnName = "typeMasterID")
    private MstTypeMaster typeMasterID;
    private String typeDetailCode;
    private String typeDetailName;
    private Integer sequence;

    public Integer getTypeDetailID() {
        return typeDetailID;
    }

    public void setTypeDetailID(Integer typeDetailID) {
        this.typeDetailID = typeDetailID;
    }

    public MstTypeMaster getTypeMasterID() {
        return typeMasterID;
    }

    public void setTypeMasterID(MstTypeMaster typeMasterID) {
        this.typeMasterID = typeMasterID;
    }

    public String getTypeDetailCode() {
        return typeDetailCode;
    }

    public void setTypeDetailCode(String typeDetailCode) {
        this.typeDetailCode = typeDetailCode;
    }

    public String getTypeDetailName() {
        return typeDetailName;
    }

    public void setTypeDetailName(String typeDetailName) {
        this.typeDetailName = typeDetailName;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}
