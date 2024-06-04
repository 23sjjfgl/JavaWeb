package com.lanqiao.pojo;


// 学生实体类
public class Student {
    private Integer sid; // 学生（主键）
    private String stuName; // 学生姓名
    private String stuGender;   // 学生性别
    private Integer scID;   // （学生与班级） 外键
    private Integer sGID;   // （学生与小组）外键


    public Student() {
    }

    public Student(String stuName, String stuGender, Integer scID, Integer sGID) {
        this.stuName = stuName;
        this.stuGender = stuGender;
        this.scID = scID;
        this.sGID = sGID;
    }

    public Student(Integer sid, String stuName, String stuGender, Integer scID, Integer sGID) {
        this.sid = sid;
        this.stuName = stuName;
        this.stuGender = stuGender;
        this.scID = scID;
        this.sGID = sGID;
    }

    /**
     * 获取
     * @return sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 获取
     * @return stuName
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * 设置
     * @param stuName
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    /**
     * 获取
     * @return stuGender
     */
    public String getStuGender() {
        return stuGender;
    }

    /**
     * 设置
     * @param stuGender
     */
    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    /**
     * 获取
     * @return scID
     */
    public Integer getScID() {
        return scID;
    }

    /**
     * 设置
     * @param scID
     */
    public void setScID(Integer scID) {
        this.scID = scID;
    }

    /**
     * 获取
     * @return sGID
     */
    public Integer getSGID() {
        return sGID;
    }

    /**
     * 设置
     * @param sGID
     */
    public void setSGID(Integer sGID) {
        this.sGID = sGID;
    }

    public String toString() {
        return "Student{sid = " + sid + ", stuName = " + stuName + ", stuGender = " + stuGender + ", scID = " + scID + ", sGID = " + sGID + "}";
    }
}
