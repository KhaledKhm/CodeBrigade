/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.entities;



/**
 *
 * @author SPIRIT
 */
public class blog {
    private int idblog;
    private String titre;
    private String contenu;
    protected int idUtilisateur;

    public blog() {
    }

    public blog(String titre, String contenu, int idUtilisateur) {
        this.titre = titre;
        this.contenu = contenu;
        this.idUtilisateur = idUtilisateur;
    }

    public blog(String titre, String contenu) { //to edit title and contenu only
        this.titre = titre;
        this.contenu = contenu;
    }
    
    

    public blog(int idblog, String titre, String contenu, int idUtilisateur) {
        this.idblog = idblog;
        this.titre = titre;
        this.contenu = contenu;
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdblog() {
        return idblog;
    }

    public void setIdblog(int idblog) {
        this.idblog = idblog;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    @Override
    public String toString() {
        return "blog{" + "idblog=" + idblog + ", titre=" + titre + ", contenu=" + contenu + ", idUtilisateur=" + idUtilisateur + '}';
    }
    
    
    
    
}
