/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.dao;

import atos.shop.entity.Categorie;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.text.html.HTML;

/**
 *
 * @author Administrateur
 */
public class CategorieDAO {
    
    public  void ajouter(Categorie cat){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(cat);
        em.getTransaction().commit();
        
    }

    public List<Categorie> lister() {
        
        // pas de transaction car pas d'écriture en base donc utilisation de query
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT c"
                + "                   FROM Categorie c ORDER BY c.nom ");
                
        return query.getResultList();
                
    }

    public void supprimer(Long idCategorieSuppr) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        // on recherche à partir de l'id dc on utilise find sinon em.createQuery -> faire requete
        // em.createQuery("DELETE FROM Categorie c WHERE c.id=:idDelaCat").setParameter("idDelaCat,id).executeUpdate()
        em.remove(em.find(Categorie.class, idCategorieSuppr));
        em.getTransaction().commit();
    
    }
}
