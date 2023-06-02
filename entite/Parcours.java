/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

import java.util.Objects;

/**
 *
 * @author Valère
 */
public class Parcours {
    private String id;
    private String libelle;
    
    // Le constructeur

    public Parcours() {
    }
    
    // La méthode toString
    @Override
    public String toString() {
        return "Parcours{" + "id=" + id + ", libelle=" + libelle + '}';
    }
    
    // Les hashCodes 
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.libelle);
        return hash;
    }
    
    // les equals
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
        final Parcours other = (Parcours) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.libelle, other.libelle);
    }
    
    // Les accesseurs et les mutateurs

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
}
