package com.lena.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dmitry on 11.10.17.
 */
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String myCookie = req.getParameter("myCookie");
        if (myCookie != null) {
            Cookie cookie = new Cookie("myCoooookie", myCookie);
            resp.addCookie(cookie);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Enumeration e = req.getParameterNames();
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.println("<B>" + req.getParameter("nameKey"));
//        System.out.println("fdfdf");
        PrintWriter printWriter = resp.getWriter();
        if (req.getCookies() != null) {
            for (Cookie cookie : req.getCookies()) {
                printWriter.println("<B> my cookie value =  " + cookie.getValue());
            }
        } else {
            printWriter.println("<B> Cookie is null");
        }

    }
}
