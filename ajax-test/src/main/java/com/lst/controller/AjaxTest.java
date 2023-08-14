package com.lst.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Lishuntong
 * @Date 2023/8/12 16:05
 * @functon
 */
@WebServlet(name="AjaxTest",urlPatterns = "/ajax")
public class AjaxTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("您好，" + name + "!欢迎使用我们的服务。");
    }
}


