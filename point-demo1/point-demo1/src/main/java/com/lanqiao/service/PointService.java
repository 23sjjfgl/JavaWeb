package com.lanqiao.service;

import com.lanqiao.pojo.Classroom;
import com.lanqiao.pojo.Student;


import java.util.List;

public interface PointService {



    // 1.查询班级列表
    List<Classroom> selectClassRomm();

    // 2.添加班级
    void AddClassRomm(Classroom classroom);

    // 3.修改
    void update(Classroom classroom);

    // 4.删除




    // 学生管理
    // 1.查出学生列表
    Classroom cs(Integer id);

    // 2.添加学生
    void AddStudent(Student student);

    // 3.修改学生
    void updateStudent(Student student);
}
