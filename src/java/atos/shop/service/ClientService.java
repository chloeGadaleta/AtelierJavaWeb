/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.service;

import atos.shop.dao.ClientDAO;
import atos.shop.entity.Client;
import java.util.List;

/**
 *
 * @author Administrateur
 */


public class ClientService {
    
    private ClientDAO dao = new ClientDAO();
    
    public void ajouter(Client client) {
        dao.ajouter(client);
    }
    
    public List<Client> lister() {
        return dao.lister();
    }
    /**
     * 
     * cette fonction renvoie le client en db 
     * @param pseudo
     * @param mdp
     * @return 
     */
    public Client connexion(String pseudo, String mdp){
        return dao.findByLoginAndMdp(pseudo, mdp);
    }
}
