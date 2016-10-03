package com.lifepaul.samples;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "WebServlet", urlPatterns = {"/w"})
public class WebServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("windows-1251");
            String title = request.getParameter("title");
            String owner = request.getParameter("owner");
            String price = request.getParameter("price");
            String imgRep = request.getParameter("imgRep");
            response.setContentType("text/html; charset=windows-1251");
            System.out.println(title+owner+price);
            PrintWriter out = response.getWriter();
//            out.println("<h3>Profile " + title + "</h3>");
//        c:/git/ServletLab/web/img/car1
// ./img
            out.println("<%--\n" +
                    "  Created by IntelliJ IDEA.\n" +
                    "  User: FlipBook TP300LD\n" +
                    "  Date: 19.09.2016\n" +
                    "  Time: 0:12\n" +
                    "  To change this template use File | Settings | File Templates.\n" +
                    "--%>\n" +
                    "<%@ page contentType=\"text/html;charset=windows-1251\" language=\"java\" %>\n" +
                    "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "    <title>Главная</title>\n" +
                    "    <link rel=\"stylesheet\" href=\"../css/styles.css\">\n" +
                    "\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<div id=\"wrapper\">\n" +
                    "    <header id=\"header\">\n" +
                    "        <div id=\"logo\"><a href=\"/\"><img src=\"./img/car.png\" alt=\"Logo\"></a></div>\n" +
                    "        <div id=\"nav-div\"><ul id=\"navigation-list\">\n" +
                    "            <li class=\"nav\"><a href=\"/\" >First</a></li>\n" +
                    "            <li class=\"nav\"><a href=\"/\" >Second</a></li>\n" +
                    "            <li class=\"nav\">\n" +
                    "                <a href=\"#\" class=\"dropbtn\">Dropdown</a>\n" +
                    "                <div class=\"dropdown-content\">\n" +
                    "                    <a href=\"#\">Link 1</a>\n" +
                    "                    <a href=\"#\">Link 2</a>\n" +
                    "                    <a href=\"#\">Link 3</a>\n" +
                    "                </div>\n" +
                    "            </li>\n" +
                    "        </ul></div>\n" +
                    "        <div id=\"search-row\"><form action=\"search\" method=\"GET\" accept-charset=\"windows-1251\"><input type=\"search\" placeholder=\"Введите название авто\" name=\"search-req\">\n" +
                    "            <button class=\"search-button\"><a href=\"/\"><img src=\"./img/search.png\" alt=\"search\"></a></button> </form>\n" +
                    "        </div>\n" +
                    "        <div id=\"languages\">\n" +
                    "            <ul id=\"language-panel\">\n" +
                    "                <li class=\"small-pic\"><a href=\"/\" ><img id=\"rus\" src=\"./img/rus.png\" alt=\"Russian\"></a></li>\n" +
                    "                <li class=\"small-pic\"><a href=\"/\" ><img id=\"eng\" src=\"./img/eng.png\" alt=\"English\"></a></li>\n" +
                    "                <li class=\"small-pic\"><a href=\"/\" ><img id=\"de\" src=\"./img/de.png\" alt=\"Deutsch\"></a></li>\n" +
                    "            </ul>\n" +
                    "        </div>\n" +
                    "    </header>\n" +
                    "    <div id=\"content\">\n" +
                    "        <div id=\"photo-div\">\n" +
                    "            <p id=\"large-text\">Фотографии</p>\n" +
                    "            <div class=\"dropdown-photo\">\n" +
                    "                <img src=\"./img/img_fjords.jpg\" alt=\"Trolltunga Norway\">\n" +
                    "                <div class=\"dropdown-photo-content\">\n" +
                    "                    <img src=\"./img/car1/1.jpg\" alt=\"Forward\">\n" +
                    "                    <div class=\"desc\">Beautiful Trolltunga, Norway</div>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "\n" +
                    "            <div class=\"dropdown-photo\">\n" +
                    "                <img src=\"./img/car1/2.jpg\" alt=\"Forward\">\n" +
                    "                <div class=\"dropdown-photo-content\">\n" +
                    "                    <img src=\"./img/car1/2.jpg\" alt=\"Forward\">\n" +
                    "                    <div class=\"desc\">Beautiful Trolltunga, Norway</div>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "\n" +
                    "            <div class=\"dropdown-photo\">\n" +
                    "                <img src=\"./img/car1/3.jpg\" alt=\"Forward\">\n" +
                    "                <div class=\"dropdown-photo-content\">\n" +
                    "                    <img src=\"./img/car1/3.jpg\" alt=\"Forward\">\n" +
                    "                    <div class=\"desc\">Beautiful Trolltunga, Norway</div>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "\n" +
                    "            <div class=\"dropdown-photo\">\n" +
                    "                <img src=\"./img/car1/4.jpg\" alt=\"Forward\">\n" +
                    "                <div class=\"dropdown-photo-content\">\n" +
                    "                    <img src=\"./img/car1/4.jpg\" alt=\"Forward\">\n" +
                    "                    <div class=\"desc\">Beautiful Trolltunga, Norway</div>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "\n" +
                    "\n" +
                    "        </div>\n" +
                    "\n" +
                    "        <div id=\"all-info\">\n" +
                    "            <div id=\"buy-block\">\n" +
                    "                <div id=\"car-title\"><h2>" + title +"</h2></div>\n" +
                    "                <div id=\"price\"><img src=\"./img/rouble.png\" alt=\"Rouble\"><p>"+ price + " рублей</p></div>\n" +
                    "                <div id=\"owner\"><img src=\"./img/owner.png\" alt=\"Owner\"><p>"+ owner +"</p></div>\n" +
                    "                <div id=\"buy-button\"><button class=\"buy\" name=\"buy-car\" type=\"submit\" value=\"carId\">Купить</button></div>\n" +
                    "            </div>\n" +
                    "            <div id=\"info-block\">\n" +
                    "\n" +
                    "            </div>\n" +
                    "\n" +
                    "        </div>\n" +
                    "\n" +
                    "    </div>\n" +
                    "</div>\n" +
                    "\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>\n");

            out.flush();
            out.close();
//        response.sendError(400);

    }
}
