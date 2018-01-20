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
import java.net.HttpCookie;

/**
 * Created by dmitry on 25.10.17.
 */
@WebServlet(value = "/addUserServlet")
public class AddUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idParam = request.getParameter("id");
        if (idParam != null) {
            Integer id = Integer.valueOf(idParam);
            request.setAttribute("editedUserId", id);
            request.setAttribute("editedUser", UsersHolder.getUserById(id));
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("adduser.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        Integer age = Integer.valueOf(req.getParameter("age"));
        String editedUserId = req.getParameter("editedUserId");
        if (editedUserId == null || editedUserId.isEmpty()) {
            User user = new User();
            user.setName(name);
            user.setAge(age);
            UsersHolder.addUser(user);
        } else {
            UsersHolder.editUser(Integer.valueOf(editedUserId), name, age);
        }

        req.setAttribute("usersList", UsersHolder.getUsers());
        RequestDispatcher dispatcher = req.getRequestDispatcher("usersList.jsp");
        dispatcher.forward(req, res);

    }
}

