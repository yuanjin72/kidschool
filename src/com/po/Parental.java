package com.po;

public class Parental {
    private Integer id;

    private String pName;                        //父母姓名

    private String relation;                     //关系

    private String employ;                       //工作单位

    private String phone;                        //电话

    private Integer studentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getEmploy() {
        return employ;
    }

    public void setEmploy(String employ) {
        this.employ = employ == null ? null : employ.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}