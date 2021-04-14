/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import tools.MaConnexion;

/**
 *
 * @author SPIRIT
 */
public class utilisateurService {
    Connection cnx;
    PreparedStatement ste;

    public utilisateurService() {
        cnx = MaConnexion.getInstance().getCnx();
    }
    
       public void ajouterUtilisateur(utilisateur p)
   {
        try {
            String sql="insert into utilisateur(id,password)"+"Values(?,?)";
            ste = cnx.prepareStatement(sql);
            ste.setString(1,p.getPassword());
            ste.setString(2, p.getAccount_status());
            ste.executeUpdate();
            System.out.println("Utilisateur Ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
   }
       
       
      public List<utilisateur> afficherUtilisateurs(){
       List<utilisateur> utilisateurs = new ArrayList<>();
        try {
            
            String sql="select * from utilisateur";
            ste =cnx.prepareStatement(sql);
            ResultSet rs = ste.executeQuery();
            while (rs.next()) { 
                utilisateur u = new utilisateur();
                u.setId(rs.getInt("id"));
                u.setNom_personne(rs.getString(2));
                u.setPrenom_personne(rs.getString("prenom"));
                utilisateurs.add(u);
                
            
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     return utilisateurs;
   }
    
}
