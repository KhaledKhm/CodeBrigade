/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khmMain;

import entities.*;
import services.*;
import tools.MaConnexion;

/**
 *
 * @author SPIRIT
 */
public class khmMain {
    public static void main(String[] args) {
        MaConnexion mc;
        mc = MaConnexion.getInstance();
      /*  utilisateur u;
        u = new utilisateur("password","immatricule","libelle",24746877,"adresse","email","siteweb","secteur_entreprise","role","googleAuthenticatorSecret");
        entrepriseService us = new entrepriseService();
        us.ajouterEntreprise(u);*/
      blog b;
      b = new blog("Titre2","contenu treeeeeeeeeeeeeeeeeeeeeeeeeeeeeees long",1);
      blogService bs = new blogService();
      bs.ajouterBlog(b);
        
    }
}
