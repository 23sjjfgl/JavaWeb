package com.lanqiao.web.servlet;

// 反射！！！
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 替换HttpSertvlet,根据请求的最后一段路径进行方法分发
public class PointServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.获取请求路径
        String uri = req.getRequestURI(); // 短的路径 brand-case/brand/selectAll
        // 2.获取最后一段路径，方法名
        int index = uri.lastIndexOf("/");
        String methodName = uri.substring(index + 1);


        // 2.执行方法
        // 2.1 获取BrandServlet / UserServlet 字节码对象class
        // 谁调用我（this 所在的方法），我（this）代表谁
        //System.out.println(this); BrandServlet UserServlet

        Class<? extends PointServlet> cls = this.getClass();


        // 2.2 获取方法 method对象

        try {
            Method method = cls.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            // 2.3 执行方法
            method.invoke(this,req,resp);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
