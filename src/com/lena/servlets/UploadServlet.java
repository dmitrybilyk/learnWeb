//package com.lena.servlets;
//
//import com.oreilly.servlet.MultipartRequest;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.MultipartConfig;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.Part;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.PrintWriter;
//import java.nio.file.Paths;
//import java.util.Enumeration;
//
///**
// * Created by dmitry on 20.11.17.
// */
//@MultipartConfig
//public class UploadServlet extends HtmlServlet{
//    private String webTempPath;
//
//    @Override
//    public void init() throws ServletException {
//        webTempPath = getServletContext().getRealPath("/") + "included";
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        MultipartRequest mpr = new MultipartRequest(req, webTempPath, 5 * 1024 * 1024);
//        Enumeration enumm = mpr.getFileNames();
//        resp.setContentType("text/html");
//
//        PrintWriter printWriter = resp.getWriter();
//
//        for (int i = 1; enumm.hasMoreElements(); i++) {
//            printWriter.println("The name of uploaded file " + i + " is: " +
//                    mpr.getFilesystemName((String)enumm.nextElement()) +
//                    "<br><br>");
//        }
//    }
//}
