package com.lena.servlets;

import com.lena.holders.UsersHolder;
import com.lena.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by dmitry on 29.12.17.
 */
@WebServlet(value = "/firstAS")
public class FirstAnnotServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = "SSSS";
//        List<User> users = new ArrayList<>();
//        users.add(new User(1, "Dima", 36));
//        users.add(new User(2, "Ruslan", 40));
//        UsersHolder.addUsers(users);

        request.setAttribute("usersList", UsersHolder.getUsers());
        RequestDispatcher dispatcher = request.getRequestDispatcher("usersList.jsp");
        dispatcher.forward(request, response);
    }
}
