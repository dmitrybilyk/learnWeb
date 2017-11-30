package com.lena.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dmitry on 20.11.17.
 */
public class ChangeQueryStringServlet extends HtmlServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendError(406);
//        String params = req.getQueryString();
//        if (params != null) {
//            params += "&another=AnotherValue";
//        } else {
//            params = "another=AnotherValue";
//        }
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/viewParams.jsp?" + params);
//        requestDispatcher.forward(req, resp);

    }
}
