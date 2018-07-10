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
@WebServlet(name = "CookieServlet", urlPatterns = {"/CookieServlet"})
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // set la durée de vie des cookie
        Cookie c = new  Cookie("mdpTopSecret", "1234");
        c.setMaxAge(100000);
        
        resp.addCookie(c);
        resp.addCookie(new Cookie("mdpsecret", "0000"));
        resp.addCookie(new  Cookie("categoriePreferee", "SF"));
        resp.addCookie(new Cookie("pseudo", "admin"));
    }
    
}
