package com.lanqiao.mapper;

import com.lanqiao.pojo.Classroom;
import com.lanqiao.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PointMapper {


    // 1.查询班级列表
    @Select("select * from classes")
    @ResultMap("PointResultMap")
    List<Classroom> selectClassRomm();


    // 2.添加班级
    @Insert("insert into classes values (null,#{className},#{classGrade})")
    void AddClassRomm(Classroom classroom);


    // 3.修改
    void update(Classroom classroom);

    // 4.删除，应该做单个删除和批量删除



    // 学生管理
    //1. 查询学生列表
    Classroom cs(int id);

    //2.添加学生
    @Insert("insert into students values (null,#{stuName},#{stuGender},#{scID},#{sGID})")
    void AddStudent(Student student);

    //3.修改学生
    void updateStudent(Student student);

    //4.删除学生
}
