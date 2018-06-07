package com.po;

public class Student {
    private Integer id;                 //ID

    private String name;               //学生姓名

    private String sex;                 //性别

    private String uclass;              //班级

    private String sn;                  //学号

    private Integer entranceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getUclass() {
        return uclass;
    }

    public void setUclass(String uclass) {
        this.uclass = uclass == null ? null : uclass.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Integer getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(Integer entranceId) {
        this.entranceId = entranceId;
    }
}