package com.lanqiao.web.servlet;


import com.lanqiao.service.UserService;
import com.lanqiao.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/User/*")
public class UserServlet extends PointServlet{

    private UserService userService = new UserServiceImpl();

    // 1.登录
    public void UserSelect(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受情求
    }
}
