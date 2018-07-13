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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "ConnexionServlet", urlPatterns = {"/connexion"})
public class ConnexionServlet extends HttpServlet {

    private ClientService service = new ClientService();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //1.connexion
        //reccupérer l'id 
        String pseudo = req.getParameter("login");
        String mdp = req.getParameter("mdp");
        Client cli = service.connexion(pseudo, mdp);
        //si mon client n'existe pas 
        if( cli == null) {
            // Renvoie vers la page de login car pas trouvé
            
            // Je vais déclancher une exception : throw
            throw new RuntimeException("erreur de connexion !");
            
            
        }else{ // ou bien si le login est trouvé
            
            // enregistre le client en session
            //setAttribute communiquer du servlet vers jsp via un mot ""
            //getParameter permet de communiquer de la jsp vers la servlet via un mot""
            req.getSession().setAttribute("clientConnecte", cli);
            resp.sendRedirect("lister-categories");
        }
        
        //2.Redirect
        
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       // le doget : click sur lien login qui va appeler servlet qui va renvoyer formulaire qui se trouve ds page "login-client.jsp"    
       req.getRequestDispatcher("login-client.jsp").forward(req, resp);    
    }
}
