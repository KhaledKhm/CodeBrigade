/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.entities;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author 21652
 */
public class Evenement {
       private Integer id ;
    private String libelle ;
    private String description;
    private int PrixInscription;
    private String datefin;
    private String datedebut;

    public Evenement() {
    }

    public Evenement(Integer id, String libelle, String description) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
    }

    public Evenement(String libelle, String description, int PrixInscription, String datefin, String datedebut) {
        this.libelle = libelle;
        this.description = description;
        this.PrixInscription = PrixInscription;
        this.datefin = datefin;
        this.datedebut = datedebut;
    }
     public Evenement(Integer id,String libelle, String description,String datedebut, String datefin, int PrixInscription) {
        this.id = id;
         this.libelle = libelle;
        this.description = description;
        this.PrixInscription = PrixInscription;
        this.datefin = datefin;
        this.datedebut = datedebut;
    }

    public Evenement(Integer id, String libelle, String description, int PrixInscription, String datefin, String datedebut) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.PrixInscription = PrixInscription;
        this.datefin = datefin;
        this.datedebut = datedebut;
    }

  

    public Integer getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getDescription() {
        return description;
    }

    public int getPrixInscription() {
        return PrixInscription;
    }

    public String getDatefin() {
        return datefin;
    }

    public String getDatedebut() {
        return datedebut;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrixInscription(int PrixInscription) {
        this.PrixInscription = PrixInscription;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public void setDatedebut(String datedebut) {
        this.datedebut = datedebut;
    }

    @Override
    public String toString() {
        return "Evenement{" + "id=" + id + ", libelle=" + libelle + ", description=" + description + ", PrixInscription=" + PrixInscription + ", datefin=" + datefin + ", datedebut=" + datedebut + '}';
    }
    
}
    




