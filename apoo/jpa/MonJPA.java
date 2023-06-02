/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apoo.jpa;

import entite.Etudiant;
import entite.Parcours;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Valère
 */
public class MonJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Etudiant e1 = new Etudiant(552295, "WOBLESSE", "Deo-Gratias", LocalDate.now(), new Parcours());
        EntityManager em;
        EntityManagerFactory emf;
        
        
        try {
            emf = Persistence.createEntityManagerFactory("JPA");
            em = emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            et.begin();
                //em.persist(e1);
                List<Etudiant> ets = em.createQuery("FROM Etudiant", Etudiant.class).getResultList();
                for(Etudiant e : ets){
                    e.afficher();
                }
            et.commit();
        } 
        catch (Exception e){
            
        }
        }
    
}
