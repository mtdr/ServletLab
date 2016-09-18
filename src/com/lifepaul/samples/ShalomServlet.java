package com.lifepaul.samples;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by FlipBook TP300LD on 19.09.2016.
 */
@WebServlet(name = "ShalomServlet", urlPatterns = {"/a/b/c", "/servlets/shalom"})
public class ShalomServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        PrintWriter out1 = response.getWriter();
        out1.println("hello");
        out.println("<h1>Shalom</h1>");
        out.flush();
//        response.sendError(400);
    }
}
