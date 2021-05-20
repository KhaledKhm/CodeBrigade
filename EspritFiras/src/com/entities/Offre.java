/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

/**
 *
 * @author firas
 */
public class Offre {
    private int id;
    private String Libelle;
    private String Description;
    private String Salaire;

    public Offre() {
    }

    public Offre(String Libelle, String Description, String Salaire) {
        this.id = id;
        this.Libelle = Libelle;
        this.Description = Description;
        this.Salaire = Salaire;
    }

    public String getDescription() {
        return Description;
    }

    public String getSalaire() {
        return Salaire;
    }

    

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setSalaire(String Salaire) {
        this.Salaire = Salaire;
    }

  

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    @Override
    public String toString() {
        return "Offre{" + "id=" + id + ", Libelle=" + Libelle + ", Description=" + Description + ", Salaire=" + Salaire + '}';
    }

   
   
    
    
}
