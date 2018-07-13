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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "homePageServlet", urlPatterns = {"/home-page"})
public class homePageServlet extends HttpServlet {

    @Override
    // qd je fais un redirect vers une page j'utilise tjs doGet
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // ici redirection vers la home
        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }
    
   
}
