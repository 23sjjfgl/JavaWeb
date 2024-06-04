package com.lanqiao.pojo;


import java.util.ArrayList;

// 班级实体类
public class Classroom {
    private Integer cid; // 班级（主键）
    private String className;   // 班级名字
    private String classGrade;  // 年级第几届
    private ArrayList<Student> students = new ArrayList<Student>(); // 存储班级下学生的信息


    public Classroom() {
    }

    public Classroom(Integer cid, String className, String classGrade, ArrayList<Student> students) {
        this.cid = cid;
        this.className = className;
        this.classGrade = classGrade;
        this.students = students;
    }

    /**
     * 获取
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取
     * @return className
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取
     * @return classGrade
     */
    public String getClassGrade() {
        return classGrade;
    }

    /**
     * 设置
     * @param classGrade
     */
    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    /**
     * 获取
     * @return students
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * 设置
     * @param students
     */
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String toString() {
        return "Classroom{cid = " + cid + ", className = " + className + ", classGrade = " + classGrade + ", students = " + students + "}";
    }
}
