/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "CookieShopServlet", urlPatterns = {"/cookie-shop"})
public class CookieShopServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        
// deuxieme solution
// défini cookie à partir de url "style"
//        Cookie cookie = new Cookie("background", req.getParameter("style"));
//        cookie.setMaxAge(60*60*24*30);
//        resp.addCookie(cookie);
        
        
        // reccup css (theme) à appliquer
        String theme = req.getParameter("style");
        
        // theme soit jamaique soit cuba
        resp.addCookie(new Cookie("background", theme));
        
        resp.sendRedirect("_TEMPLATE.jsp");
        
    }
}
