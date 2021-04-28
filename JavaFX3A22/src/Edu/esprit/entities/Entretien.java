/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.entities;

/**
 *
 * @author OneEffect007
 */
public class Entretien {
    private int id,idEvaluation,idParticipant;
    private String libelle,description,dateEntretien;

    public Entretien() {
    }

    public Entretien(int idEvaluation, int idParticipant, String libelle, String description, String dateEntretien) {
        this.idEvaluation = idEvaluation;
        this.idParticipant = idParticipant;
        this.libelle = libelle;
        this.description = description;
        this.dateEntretien = dateEntretien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public int getIdParticipant() {
        return idParticipant;
    }

    public void setIdParticipant(int idParticipant) {
        this.idParticipant = idParticipant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateEntretien() {
        return dateEntretien;
    }

    public void setDateEntretien(String dateEntretien) {
        this.dateEntretien = dateEntretien;
    }

    @Override
    public String toString() {
        return "Entretien{" + "id=" + id + ", idEvaluation=" + idEvaluation + ", idParticipant=" + idParticipant + ", libelle=" + libelle + ", description=" + description + ", dateEntretien=" + dateEntretien + '}';
    }
    
    
    
}
