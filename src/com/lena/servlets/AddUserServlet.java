package com.lena.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.HttpCookie;

/**
 * Created by dmitry on 25.10.17.
 */
public class AddUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/lena/adduser.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      String name = req.getParameter("nameKey");
//        Integer age = Integer.valueOf(req.getParameter("ageKey"));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index2.jsp");
        requestDispatcher.forward(req, resp);

    }

}

