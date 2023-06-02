/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author Valère
 */
@Entity
@Table(name="etudiants")
public class Etudiant implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="numero_carte")
    private int numeroCarte;
            
    @Column(length=20)
    private String nom;
     
    @Column(length=20)
    private String prenom;
    
    @Column(name="date_de_naissance")
    private LocalDate dateDeNaissance; 
    
    @Transient
    private Object parcours;

    // Constructeur par défauts
    public Etudiant() {
    }

    public Etudiant(int numeroCarte, String nom, String prenom, LocalDate dateDeNaissance, Object parcours) {
        this.numeroCarte = numeroCarte;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.parcours = parcours;
    }
    
    

    // Les hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        //hash = 59 * hash + Object.hashCode(this.id);
        hash = 59 * hash + this.numeroCarte;
        hash = 59 * hash + Objects.hashCode(this.nom);
        hash = 59 * hash + Objects.hashCode(this.prenom);
        hash = 59 * hash + Objects.hashCode(this.dateDeNaissance);
        return hash;
    }
    
    // Les equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        if (this.numeroCarte != other.numeroCarte) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        return Objects.equals(this.dateDeNaissance, other.dateDeNaissance);
    }
    
    
    // La méthode toString
    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", numeroCarte=" + numeroCarte + ", nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance + '}';
    }
    
    public void afficher() {
        System.out.println(this.toString());
    }
    
    // Les accesseurs et les mutateurs
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(int numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public Object getParcours() {
        return parcours;
    }

    public void setParcours(Object parcours) {
        this.parcours = parcours;
    }

    
    
    
}
