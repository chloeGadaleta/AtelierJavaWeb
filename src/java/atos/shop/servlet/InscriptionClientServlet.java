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
    
    private ClientService service = new ClientService();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
       // on reccup le nom du client ds une variable
       String nomCli= req.getParameter("nom");
       String prenomCli = req.getParameter("prenom");
       String adresseCli = req.getParameter("adresse");
       Integer numero = Integer.parseInt(req.getParameter("numero"));
       Integer codePostal = Integer.parseInt(req.getParameter("codePostal"));
       
       // création d'un nouveau client
        Client client = new Client();
        
       client.setNom(nomCli);
       client.setPrenom(prenomCli);
       client.setRue(adresseCli);
       client.setCodePostal(codePostal);
       client.setNumero(numero);
       
       service.ajouter(client);
       
       resp.sendRedirect("lister-clients");
    }

      // Demander au navigateur de faire une requette http get vers la route de listCatServlet

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("nomClient", req);
        req.getRequestDispatcher("ajouter-client.jsp").forward(req, resp);
    }

    

}
