package com.lifepaul.samples;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by FlipBook TP300LD on 04.10.2016.
 */
@javax.servlet.annotation.WebServlet(name = "SearchServlet", urlPatterns = {"/search"})
public class SearchServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("windows-1251");
        String search = request.getParameter("search");
        System.out.println(search);

        PrintWriter out = response.getWriter();
        response.setContentType("text/html; charset=windows-1251");
        out.println("<h3>" + search + " Классный</h3");
        out.flush();
        out.close();
    }
}
