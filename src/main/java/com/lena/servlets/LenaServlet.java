package com.lena.servlets;

//import org.apache.http.HttpResponse;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.message.BasicNameValuePair;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by dmitry on 11.10.17.
 */
public class LenaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String url = "http://localhost:8080/lena/getParams";
//
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpPost post = new HttpPost(url);

// add header
//        post.setHeader("User-Agent", USER_AGENT);

//        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
//        urlParameters.add(new BasicNameValuePair("sn", "C02G8416DRJM"));
//        urlParameters.add(new BasicNameValuePair("cn", ""));
//        urlParameters.add(new BasicNameValuePair("locale", ""));
//        urlParameters.add(new BasicNameValuePair("caller", ""));
//        urlParameters.add(new BasicNameValuePair("num", "12345"));
//
//        post.setEntity(new UrlEncodedFormEntity(urlParameters));
//
//        HttpResponse response = client.execute(post);
//        System.out.println("Response Code : "
//                + response.getStatusLine().getStatusCode());
//
//        BufferedReader rd = new BufferedReader(
//                new InputStreamReader(response.getEntity().getContent()));
//
//        StringBuffer result = new StringBuffer();
//        String line = "";
//        while ((line = rd.readLine()) != null) {
//            result.append(line);
//        }
//        String myCookie = req.getParameter("myCookie");
//        if (myCookie != null) {
//            Cookie cookie = new Cookie("myCoooookie", myCookie);
//            resp.addCookie(cookie);
//        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s = "dfd";
//        doPost(req, resp);
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.println("some jsp value");
//
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("IncludedJsp.jsp");
//        requestDispatcher.include(req, resp);
        HttpSession session = req.getSession();
        session.setAttribute("attr", "newAttrib");

    }
}
