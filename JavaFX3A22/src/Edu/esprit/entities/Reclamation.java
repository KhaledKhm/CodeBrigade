
package Edu.esprit.entities;

import java.util.List;

public class Reclamation {
    private int id;
    private String sujet;
    private String intensite;
    private String commentaire;

    public Reclamation() {
    }

    public Reclamation(int id,String sujet, String intensite, String commentaire) {
        this.id = id;
        this.sujet = sujet;
        this.intensite = intensite;
        this.commentaire = commentaire;
    }
    
    public Reclamation(String sujet, String intensite, String commentaire) {
        this.sujet = sujet;
        this.intensite = intensite;
        this.commentaire = commentaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getIntensite() {
        return intensite;
    }

    public void setIntensite(String intensite) {
        this.intensite = intensite;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    



    @Override
    public String toString() {
        return "Reclamation:" + "id=" + id + ", sujet=" + sujet + ",intensite=" + intensite + ",commentaire=" + commentaire + ' ';
    }

    public List<Reclamation> afficherReclamation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<String> afficherID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
