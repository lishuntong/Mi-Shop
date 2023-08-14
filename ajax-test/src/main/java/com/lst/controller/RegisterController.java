package com.lst.controller;

import com.alibaba.fastjson2.JSON;
import com.lst.entity.Result;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Lishuntong
 * @Date 2023/8/13 14:40
 * @functon
 */
@WebServlet(name = "RegisterController",urlPatterns = "/register")
public class RegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String uname = req.getParameter("uname");
        String uname1="zhangsan";
        PrintWriter writer = resp.getWriter();
        if (!uname.equals(uname1)){
            writer.write(JSON.toJSONString(Result.success("用户名称合法", "http://localhost:8080/success.jsp")));
        }else{
            writer.write(JSON.toJSONString(Result.error("用户名称已经存在,请你换一个,要不就别用!", "http://localhost:8080/index.jsp")));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
