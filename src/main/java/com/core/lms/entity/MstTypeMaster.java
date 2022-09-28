package com.core.lms.entity;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mstTypeMaster")
@ToString
public class MstTypeMaster extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeMasterID;
    private String typeMasterCode;
    private String typeMasterName;
    private Integer sequence;

    public Integer getTypeMasterID() {
        return typeMasterID;
    }

    public void setTypeMasterID(Integer typeMasterID) {
        this.typeMasterID = typeMasterID;
    }

    public String getTypeMasterCode() {
        return typeMasterCode;
    }

    public void setTypeMasterCode(String typeMasterCode) {
        this.typeMasterCode = typeMasterCode;
    }

    public String getTypeMasterName() {
        return typeMasterName;
    }

    public void setTypeMasterName(String typeMasterName) {
        this.typeMasterName = typeMasterName;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}
