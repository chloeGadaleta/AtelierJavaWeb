/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.dao;

import atos.shop.entity.Categorie;
import atos.shop.entity.Client;
import atos.shop.service.ClientService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrateur
 */
public class ClientDAO {

    public void ajouter(Client client) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
    
        em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();
    }
    
    public List<Client> lister() {
        // pas de transaction car pas d'écriture en base donc utilisation de query
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT c"
                + "                   FROM Client c ORDER BY c.nom");
        
        return query.getResultList();
    
    }

}
