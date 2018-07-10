/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import atos.shop.entity.Categorie;
import atos.shop.service.CategorieService;
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
@WebServlet(name = "AjouterCatServlet", urlPatterns = {"/ajouter-cat"})
public class AjouterCatServlet extends HttpServlet {
    
    private CategorieService service = new CategorieService();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
       // on reccup le nom dans une variable
       String nom = req.getParameter("nom");
       
       // creation d'une nouvelle categorie
       Categorie cat = new Categorie();
       
       cat.setNom(nom);
       // j'appelle mon service d'ajout qui va ensuite appeler le dao
       service.ajouter(cat);
       
       resp.sendRedirect("lister-categories");
       
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.setAttribute("nomCategorie", req);
        
        req.getRequestDispatcher("ajouter-cat.jsp").forward(req, resp);
    }
    
    
}
