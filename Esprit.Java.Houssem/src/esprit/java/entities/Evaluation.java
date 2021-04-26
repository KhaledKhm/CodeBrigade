/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.entities;

/**
 *
 * @author OneEffect007
 */
public class Evaluation {
    private int id,id_entreprise;
    private String libelle,description,dateEvaluation;

    public Evaluation() {
  
    }

    public Evaluation(int id_entreprise, String libelle, String description, String dateEvaluation) {
        this.id_entreprise = id_entreprise;
        this.libelle = libelle;
        this.description = description;
        this.dateEvaluation = dateEvaluation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_entreprise() {
        return id_entreprise;
    }

    public void setId_entreprise(int id_entreprise) {
        this.id_entreprise = id_entreprise;
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

    public String getDateEvaluation() {
        return dateEvaluation;
    }

    public void setDateEvaluation(String dateEvaluation) {
        this.dateEvaluation = dateEvaluation;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "id=" + id + ", id_entreprise=" + id_entreprise + ", libelle=" + libelle + ", description=" + description + ", dateEvaluation=" + dateEvaluation + '}';
    }
   
}
