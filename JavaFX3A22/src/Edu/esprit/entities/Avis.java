
package Edu.esprit.entities;

import java.util.List;

public class Avis {
    private int id;
    private int etoiles;
    private String commentaire;

    public Avis() {
    }

    public Avis(int id, String commentaire, int etoiles) {
        this.id = id;
        this.commentaire = commentaire;
        this.etoiles = etoiles;
    }

    public Avis(int etoiles, String commentaire) {
        this.etoiles = etoiles;
        this.commentaire = commentaire;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEtoiles() {
        return etoiles;
    }

    public void setEtoiles(int etoiles) {
        this.etoiles = etoiles;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }



    @Override
    public String toString() {
        return "Avis:" + "id=" + id + ", commentaire=" + commentaire + ",etoiles=" + etoiles + ' ';
    }

    public List<Avis> afficherAvis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<String> afficherID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
