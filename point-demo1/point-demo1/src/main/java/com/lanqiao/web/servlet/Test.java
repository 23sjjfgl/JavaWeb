package com.lanqiao.web.servlet;

import com.lanqiao.pojo.Classroom;
import com.lanqiao.pojo.Student;
import com.lanqiao.pojo.User;
import com.lanqiao.service.PointService;
import com.lanqiao.service.UserService;
import com.lanqiao.service.impl.PointServiceImpl;
import com.lanqiao.service.impl.UserServiceImpl;

import java.util.List;


// 测试类
public class Test {

    private UserService userService = new UserServiceImpl();

    // 登录
    @org.junit.Test
    public void login(){
        String username = "DKYYDS";
        String password = "123";
        User user = userService.UserSelect(username, password);
        System.out.println(user);
    }

    private PointService pointService = new PointServiceImpl();

    // 1.查询班级列表
    @org.junit.Test
    public void selectClassRomm(){
        List<Classroom> selectClassRomm = pointService.selectClassRomm();
        System.out.println(selectClassRomm);
    }

    // 2.添加班级
    @org.junit.Test
    public void AddClassRomm(){
        Classroom classroom = new Classroom();
        classroom.setClassName("电子与计算机工程5班");
        classroom.setClassGrade("2023级");
        pointService.AddClassRomm(classroom);
    }

    // 3.修改
    @org.junit.Test
    public void update(){
        Classroom classroom = new Classroom();
        // 比如点的是电子与计算机工程5班 的id 是6 那么来模拟数据 就把大四改成大五
        classroom.setCid(7);
        classroom.setClassName("电子与计算机工程6班");
        classroom.setClassGrade("2029级");
       pointService.update(classroom);
    }


    // 4.删除班级



    // 学生管理
    // 1.查出学生列表
    @org.junit.Test
    public void cs(){
        Classroom cs = pointService.cs(1);
        System.out.println(cs);
    }

    // 2.添加学生
    @org.junit.Test
    public void AddStudent(){
        Student s = new Student("李青松","男",2,1);
        pointService.AddStudent(s);
    }

    // 3.修改学生
    @org.junit.Test
    public void updateStudent(){
        //Student s = new Student(5,"李青松","男",1,1);
        Student s = new Student();
        s.setSid(4);
        s.setScID(1);
        pointService.updateStudent(s);
    }

    // 4.删除学生

}
