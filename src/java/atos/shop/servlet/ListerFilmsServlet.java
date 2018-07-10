/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */

//urlPatterns : correspond à l'attribut href

// @WebServlet indique à TOMCAT que notre class est bien une serlvet
@WebServlet(name = "ListerFilmsServlet", urlPatterns = {"/lister-films"})
public class ListerFilmsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       // Définir un attribut de requette avec le titre de la page
       // je set un name et je lui donne une valeur"
       req.setAttribute("titrePage", "Liste des films");
       //renvoyer vers vue (jsp)
       req.getRequestDispatcher("lister-films.jsp").forward(req, resp);
             
    }
}
