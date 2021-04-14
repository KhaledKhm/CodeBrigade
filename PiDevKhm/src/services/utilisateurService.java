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
import java.util.logging.Level;
import java.util.logging.Logger;
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
                u.setPassword(rs.getString("password"));
                u.setEmail(rs.getString("email"));
                utilisateurs.add(u);
                
            
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     return utilisateurs;
   }
      
    public void supprimerUtilisateur(int id) {
        try {
            String sql = "DELETE FROM `utilisateur` WHERE id=" + id;

            ste = cnx.prepareStatement(sql);

            ste.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
      public void modifierUtilisateur(utilisateur u, int id) {
        try {
                    String req= "UPDATE utilisateur SET email=?,"
                    + "password=?,"
                    + "account_status=? where id=?";
                                ste = cnx.prepareStatement(req);

            ste.setString(1, u.getEmail());
            ste.setString(2, u.getPassword());
            ste.setString(3, u.getAccount_status());

            ste.setInt(4, id);
           System.out.println(ste);

            ste.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
