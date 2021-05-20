/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author OneEffect007
 */
public class Entretien {
    int id,Idevaluation,idParticipant;
    String Libelle,Description,Dateentretien;


    public Entretien(int Idevaluation, int idParticipant, String Libelle, String Description, String Dateentretien) {
        this.Idevaluation = Idevaluation;
        this.idParticipant = idParticipant;
        this.Libelle = Libelle;
        this.Description = Description;
        this.Dateentretien = Dateentretien;
    }

    public Entretien() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdevaluation() {
        return Idevaluation;
    }

    public void setIdevaluation(int Idevaluation) {
        this.Idevaluation = Idevaluation;
    }

    public int getIdParticipant() {
        return idParticipant;
    }

    public void setIdParticipant(int idParticipant) {
        this.idParticipant = idParticipant;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getDateentretien() {
        return Dateentretien;
    }

    public void setDateentretien(String Dateentretien) {
        this.Dateentretien = Dateentretien;
    }

    @Override
    public String toString() {
        return "Entretien{" + "id=" + id + ", Idevaluation=" + Idevaluation + ", idParticipant=" + idParticipant + ", Libelle=" + Libelle + ", Description=" + Description + ", Dateentretien=" + Dateentretien + '}';
    }
    
    
}
