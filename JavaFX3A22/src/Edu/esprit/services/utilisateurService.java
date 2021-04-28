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
import java.util.logging.Level;
import java.util.logging.Logger;
import Edu.esprit.tools.MaConnexion;

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
    
    
    public boolean login(String email, String password) {

        try {
            ste = cnx.prepareStatement("select * from utilisateur where email=? and password=?");
            ste.setString(1, email);
            ste.setString(2, password);
            ResultSet rs = ste.executeQuery();
            if (rs.isBeforeFirst()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(utilisateurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    public void setNewMotPass(int idUser ,String pass){
        try {
            String req = "UPDATE `utilisateur` SET `password` ='" + pass + "' WHERE `utilisateur`.`id` = "+idUser;
            ste = cnx.prepareStatement(req);
            ste.executeUpdate(req);
             System.out.println(req);
        } catch (SQLException ex) {
            Logger.getLogger(utilisateurService.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
    }
    
    public String getCodebyId(int id) {
        try {
            ste = cnx.prepareStatement("select * from utilisateur where id=?");
            ste.setInt(1, id);
            ResultSet rs = ste.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                return rs.getString("googleAuthenticatorSecret");
            }
        } catch (SQLException ex) {
            Logger.getLogger(utilisateurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
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
      
       public String getRolebyId(int id) {
        try {
            ste = cnx.prepareStatement("select * from utilisateur where id=?");
            ste.setInt(1, id);
            ResultSet rs = ste.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                return rs.getString("role");
            }
        } catch (SQLException ex) {
            Logger.getLogger(utilisateurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";

    }
       
          public int getIdbymail(String mail) {
        try {
            ste = cnx.prepareStatement("select * from utilisateur where email=?");
            ste.setString(1, mail);
            ResultSet rs = ste.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(utilisateurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }
          
            public String getPassbyId(int id) {
        try {
            ste = cnx.prepareStatement("select * from utilisateur where id=?");
            ste.setInt(1, id);
            ResultSet rs = ste.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                return rs.getString("password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(utilisateurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
            
            public String getStatusbyID(int id) {
        try {
            ste = cnx.prepareStatement("select * from utilisateur where id=?");
            ste.setInt(1, id);
            ResultSet rs = ste.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                return rs.getString("account_status");
            }
        } catch (SQLException ex) {
            Logger.getLogger(utilisateurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
     public String MD5(String md5) {
   try {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
        byte[] array = md.digest(md5.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
       }
        return sb.toString();
    } catch (java.security.NoSuchAlgorithmException e) {
    }
    return null;
}
    
}
