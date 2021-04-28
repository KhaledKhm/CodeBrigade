/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.services;

import Edu.esprit.entities.utilisateur;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Edu.esprit.tools.MaConnexion;

/**
 *
 * @author SPIRIT
 */
public class entrepriseService {
    Connection cnx;
    PreparedStatement ste;

    public entrepriseService() {
        cnx = MaConnexion.getInstance().getCnx();
    }
    
      public void ajouterEntreprise(utilisateur p)
   {
        try {
            String sql="insert into utilisateur(email,password,immatricule_entreprise,libelle_entreprise,telephone,adresse,siteweb,secteur_entreprise,role,googleAuthenticatorSecret)"+"Values(?,?,?,?,?,?,?,?,?,?)";
            ste = cnx.prepareStatement(sql);
            ste.setString(1,p.getEmail());
            ste.setString(2,p.getPassword());
            ste.setString(3, p.getImmatricule_entreprise());
            ste.setString(4, p.getLibelle_entreprise());
            ste.setInt(5, p.getTelephone());
            ste.setString(6, p.getAdresse());
            ste.setString(7, p.getSiteweb());
            ste.setString(8, p.getSecteur_entreprise());
            ste.setString(9, p.getRole());
            ste.setString(10, p.getGoogleAuthenticatorSecret());
            ste.executeUpdate();
            System.out.println("Entreprise Ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
   }
      
      public List<utilisateur> afficherEntreprise(){
       List<utilisateur> entreprises = new ArrayList<>();
        try {
            
            String sql="select * from utilisateur";
            ste =cnx.prepareStatement(sql);
            ResultSet rs = ste.executeQuery();
            while (rs.next()) { 
                utilisateur u = new utilisateur();
                u.setId(rs.getInt("id"));
                u.setNom_personne(rs.getString(2));
                u.setPrenom_personne(rs.getString("prenom"));
                entreprises.add(u);
                
            
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     return entreprises;
   }
    
}
