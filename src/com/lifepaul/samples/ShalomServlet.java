package com.lifepaul.samples;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**Создание первого сервлета
 *
 */
@WebServlet(name = "ShalomServlet", urlPatterns = {"/a/b/c", "/servlets/shalom"})
public class ShalomServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("charset=windows-1251");
        response.setContentType("text/html; charset=windows-1251");
        PrintWriter out = response.getWriter();
        PrintWriter out1 = response.getWriter();
        out1.println("hello");
        out.println("<h1>Shalom</h1>");
        out.flush();
//        response.sendError(400);
    }
}
