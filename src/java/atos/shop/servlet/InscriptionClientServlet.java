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
@WebServlet(name = "InscriptionClientServlet", urlPatterns = {"/inscription-client"})
public class InscriptionClientServlet extends HttpServlet {
    
    // On appelle notre service
    private ClientService service = new ClientService();
    
    @Override
    // qd je clic sur btn envoyer sur form ça envoie ds doPost
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
       // on reccup le nom du client ds une variable
       String pseudo = req.getParameter("login");
       String mail = req.getParameter("mail");
       String mdp = req.getParameter("mdp");
       
      
       // création d'un nouveau client
       // si on doit seulement le reccupérer on le prend ds une variable, on ne fait pas de new.
        Client client = new Client();
        
      // ou pour etre sur de reccuperer les bons parametre
//        client.setLogin(req.getParameter("pseudo"));
//        client.setMdp(req.getParameter("mdp"));
//        client.setMail(req.getParameter("mail");
        
        client.setLogin(pseudo);
        client.setMdp(mdp);
        client.setMail(mail);
        
      
       service.ajouter(client);
       
       // redirige vers la home une fois que le formulaire est envoyé
       resp.sendRedirect("home-page");
    }

    @Override
    // on utilise doget car on clic sur lien
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // cela nous redirige sur la page du formulaire d'inscription après qu'on est cliqué sur le lien inscription
        // en passant par cette page ( la servlet)
        req.getRequestDispatcher("ajouter-client.jsp").forward(req, resp);
    }
    
}
