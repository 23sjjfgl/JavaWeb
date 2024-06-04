package com.lanqiao.web.servlet;

import com.lanqiao.service.PointService;
import com.lanqiao.service.impl.PointServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Point/*")
public class PointServletDemo extends PointServlet{

private PointService pointService = new PointServiceImpl();

    // 1.查询班级列表
    public void selectClassRomm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }


}
