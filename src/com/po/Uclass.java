package com.po;

public class Uclass {
   /* 班级信息PO类*/
    private Integer id;

    private String uclass;                     //班级

    private String teach;                      //任教老师

    private String headteacher;                //班主任

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUclass() {
        return uclass;
    }

    public void setUclass(String uclass) {
        this.uclass = uclass == null ? null : uclass.trim();
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach == null ? null : teach.trim();
    }

    public String getHeadteacher() {
        return headteacher;
    }

    public void setHeadteacher(String headteacher) {
        this.headteacher = headteacher == null ? null : headteacher.trim();
    }
}