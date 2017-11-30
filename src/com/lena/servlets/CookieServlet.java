package com.lena.servlets;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by dmitry on 11.10.17.
 */
@WebServlet("/cookieTest")
public class CookieServlet extends HttpServlet {

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie cookieToRemove = null;
//        for (Cookie cookie : req.getCookies()) {
//            if (cookie.getName().equals("myName")) {
//                cookieToRemove = cookie;
//            }
//        }
//        req.getCookies()

        HttpSession session = req.getSession(false);
        if (session != null) {
            session.setAttribute("sesAttr", "Lena");
        }
        Cookie cookie = new Cookie("cafeClass", "Black Prince");
//        cookie.setMaxAge(0);
//        cookie.setPath(req.getContextPath() + req.getServletPath());
        resp.sendRedirect(resp.encodeRedirectURL("/lena/FromLena.jsp"));
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher(encodedUrl);
//        requestDispatcher.forward(req, resp);
    }
}
