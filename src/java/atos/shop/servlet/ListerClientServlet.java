/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import atos.shop.entity.Client;
import atos.shop.service.ClientService;
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
@WebServlet(name = "ListerClient", urlPatterns = {"/lister-clients"})
public class ListerClientServlet extends HttpServlet {

    private ClientService service = new ClientService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        // Reccup la liste des clients en db
        
        List<Client> clients = service.lister();
        
        // Définir attribut requette avec list client
        
        req.setAttribute("listeClient", clients);
        
        //Forwad vers ma vue
        req.getRequestDispatcher("lister-clients.jsp").forward(req, resp);
    }
    
    

}
