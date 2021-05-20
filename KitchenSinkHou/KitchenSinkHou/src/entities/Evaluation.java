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
public class Evaluation {
    int id,idEntreprise;
    String Libelle,Description,Dateevaluation;

    public Evaluation() {
    }

    public Evaluation(int idEntreprise, String Libelle, String Description, String Dateevaluation) {
        this.idEntreprise = idEntreprise;
        this.Libelle = Libelle;
        this.Description = Description;
        this.Dateevaluation = Dateevaluation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEntreprise() {
        return idEntreprise;
    }

    public void setIdEntreprise(int idEntreprise) {
        this.idEntreprise = idEntreprise;
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

    public String getDateevaluation() {
        return Dateevaluation;
    }

    public void setDateevaluation(String Dateevaluation) {
        this.Dateevaluation = Dateevaluation;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "id=" + id + ", idEntreprise=" + idEntreprise + ", Libelle=" + Libelle + ", Description=" + Description + ", Dateevaluation=" + Dateevaluation + '}';
    }
    
    
    
}
