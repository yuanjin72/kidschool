package com.po;

import java.util.Date;

public class Entrance {
    private Integer id;

    private Date enrolmenttime;                           //入学时间

    private Date birthtime;                               //出生日期

    private String address;                               //家庭住址

    private String parentname;                            //父母姓名

    private Integer entranceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEnrolmenttime() {
        return enrolmenttime;
    }

    public void setEnrolmenttime(Date enrolmenttime) {
        this.enrolmenttime = enrolmenttime;
    }

    public Date getBirthtime() {
        return birthtime;
    }

    public void setBirthtime(Date birthtime) {
        this.birthtime = birthtime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname == null ? null : parentname.trim();
    }

    public Integer getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(Integer entranceId) {
        this.entranceId = entranceId;
    }
}