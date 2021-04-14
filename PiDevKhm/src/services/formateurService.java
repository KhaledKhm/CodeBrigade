/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.utilisateur;
import java.sql.*;
import tools.MaConnexion;

/**
 *
 * @author SPIRIT
 */
public class formateurService {
     Connection cnx;
    PreparedStatement ste;

    public formateurService() {
        cnx = MaConnexion.getInstance().getCnx();
    }
    
      public void ajouterFormateur(utilisateur p)
   {
        try {
            String sql="insert into utilisateur(email,password,cin_personne,nom_personne,prenom_personne,sexe_personne,date_nais_personne,etat_sociale_personne,telephone,adresse,siteweb,domaine_personne,role,googleAuthenticatorSecret)"+"Values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ste = cnx.prepareStatement(sql);
            ste.setString(1,p.getEmail());
            ste.setString(2,p.getPassword());
            ste.setInt(3,p.getCin_personne());
            ste.setString(4, p.getNom_personne());
            ste.setString(5, p.getPrenom_personne());
            ste.setString(6, p.getSexe_personne());
            ste.setDate(7, p.getDate_nais_personne());
            ste.setString(8, p.getEtat_sociale_personne());
            ste.setInt(9, p.getTelephone());
            ste.setString(10, p.getAdresse());
            ste.setString(11, p.getDomaine_personne());
            ste.setString(12, p.getRole());
            ste.setString(13, p.getGoogleAuthenticatorSecret());
            ste.executeUpdate();
            System.out.println("Candidat Ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
   }
    
}
