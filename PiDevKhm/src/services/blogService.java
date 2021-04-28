/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.blog;
import java.sql.*;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import tools.MaConnexion;

/**
 *
 * @author SPIRIT
 */
public class blogService {
    
    Connection cnx;
    PreparedStatement ste;

    public blogService() {
        cnx = MaConnexion.getInstance().getCnx();
    }
    
      public void ajouterBlog(blog p)
   {
        try {
            String sql="insert into blog(titre,contenu,idUtilisateur)"+"Values(?,?,?)";
            ste = cnx.prepareStatement(sql);
            ste.setString(1,p.getTitre());
            ste.setString(2,p.getContenu());
            ste.setInt(3,p.getIdUtilisateur());
            ste.executeUpdate();
            System.out.println("Blog Ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
   }
      
      
         public ObservableList<blog> afficherMyBlogs(int idUtilisateur){ // user
       ObservableList<blog> blogs =FXCollections.observableArrayList();
       
        try {
            
            String sql="select * from blog where idUtilisateur="+idUtilisateur;
            ste =cnx.prepareStatement(sql);
            ResultSet rs = ste.executeQuery();
            while (rs.next()) { 
                blog b = new blog();
                b.setTitre(rs.getString("titre"));
                b.setContenu(rs.getString("contenu"));
                blogs.add(b);
                
            
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     return blogs;
   }
         
         public ObservableList<String> afficherBlogID() 
    {
        ObservableList<String> ids= FXCollections.observableArrayList();
        try {
            String sql="select titre from blog";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                ids.add(rs.getString("titre"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ids;
    } 
         
         
         public void supprimerBlog(int idblog) {
        try {
            String sql = "DELETE FROM `blog` WHERE idblog=" + idblog;

            ste = cnx.prepareStatement(sql);

            ste.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
      public void modifierBlog(blog b, int id) {
        try {
                    String req= "UPDATE blog SET titre=?,"
                    + "contenu=? where idblog=?";
                                ste = cnx.prepareStatement(req);

            ste.setString(1, b.getTitre());
            ste.setString(2, b.getContenu());

            ste.setInt(3, id);
           System.out.println(ste);

            ste.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
