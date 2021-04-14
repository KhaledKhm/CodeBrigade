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
      
        //************************des test sur table utilisateur ***********************//
        /*  utilisateur u; //test pour ajouter un utilisateur
        u = new utilisateur("password","immatricule","libelle",24746877,"adresse","email","siteweb","secteur_entreprise","role","googleAuthenticatorSecret"); 
        entrepriseService us = new entrepriseService();
        us.ajouterEntreprise(u);*/
      
      /*utilisateurService u = new utilisateurService(); //test pour supprimer un utilisateur
    u.supprimerUtilisateur(41);*/
      
     /* utilisateur u; //test pour modifier un utilisateur
        u = new utilisateur("newPassword","Banned","newEmail"); 
        utilisateurService us = new utilisateurService();
        us.modifierUtilisateur(u, 36);*/
     
    /* utilisateurService u = new utilisateurService(); //test pour afficher les utilisateurs
        System.out.println(u.afficherUtilisateurs().toString());*/
     
     
      
     //*************************** des test sur table blog ****************************//
     
    /*  blog b; //test pour ajouter un blog
      b = new blog("Titre2","contenu treeeeeeeeeeeeeeeeeeeeeeeeeeeeeees long",1);
      blogService bs = new blogService();
      bs.ajouterBlog(b);*/
    
    /*blogService bg = new blogService(); //test pour afficher les utilisateurs
        System.out.println(bg.afficherBlogs().toString());*/
    
    /*  blog b; //test pour modifier un blog
      b = new blog("TitreModifier","modifiee contenu treeeeeeeeeeeeeeeeeeeeeeeeeeeeeees long");
      blogService bs = new blogService();
      bs.modifierBlog(b,1);*/
      
      
     /* blogService b = new blogService(); //test pour supprimer un blog
    b.supprimerBlog(1);*/
      
    

    
    }
}
