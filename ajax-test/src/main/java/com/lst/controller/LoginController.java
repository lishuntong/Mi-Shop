package com.lst.controller;

import com.alibaba.fastjson2.JSON;
import com.lst.entity.Result;
import com.lst.entity.User;
import com.lst.service.ILoginService;
import com.lst.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Objects;

/**
 * @author Lishuntong
 * @Date 2023/8/12 9:29
 * @functon
 */
@WebServlet(name ="LoginController",urlPatterns = "/login")
public class LoginController extends HttpServlet {
    ILoginService iLoginService=new LoginServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String uname = req.getParameter("uname");
        String psw = req.getParameter("psw");

        PrintWriter writer = resp.getWriter();
        try {
            User user = iLoginService.login(uname, psw);
            if (user.getUname().equals(uname)&&user.getPsw().equals(psw)){
                writer.write(JSON.toJSONString(Result.success("成功了","http://localhost:8080/success.jsp")));
            }else {
                writer.write(JSON.toJSONString(Result.error("失败了")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
