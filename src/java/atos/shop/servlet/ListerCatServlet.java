/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import atos.shop.dao.CategorieDAO;
import atos.shop.entity.Categorie;
import atos.shop.service.CategorieService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Administrateur
 */
@WebServlet(name = "ListerCategorie", urlPatterns = {"/lister-categories"})
public class ListerCatServlet extends HttpServlet {

    private CategorieService service = new CategorieService();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       
        // Reccup la liste des categorie en db
        List<Categorie> categories = service.lister();
        
        // Définir attribut requette avec list cat
        
        req.setAttribute("listeCat", categories);
        
        // Forwad vers ma vue
        
        req.getRequestDispatcher("lister-cat.jsp").forward(req, resp);
    }

    
}
