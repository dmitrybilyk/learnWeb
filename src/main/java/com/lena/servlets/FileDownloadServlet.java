package com.lena.servlets;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by dmitry on 25.10.17.
 */
@WebServlet("/downloadFile")
public class FileDownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileInputStream fis = null;
        ServletOutputStream servletOutputStream = null;
        try {
            fis = new FileInputStream(new File("/home/dmitry/dev/projects/lenaWeb/pom.xml"));
            servletOutputStream = resp.getOutputStream();
            resp.setContentType("text/xml");
            IOUtils.copy(fis, servletOutputStream);
        } catch (IOException ex) {
            System.out.println("error");
        } finally {
            fis.close();
            servletOutputStream.close();
        }

    }

}

