/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.blog;
import java.sql.*;
import java.util.*;
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
      
      
         public List<blog> afficherBlogs(){
       List<blog> blogs = new ArrayList<>();
        try {
            
            String sql="select * from blog";
            ste =cnx.prepareStatement(sql);
            ResultSet rs = ste.executeQuery();
            while (rs.next()) { 
                blog b = new blog();
                b.setTitre(rs.getString("titre"));
                b.setContenu(rs.getString(2));
                blogs.add(b);
                
            
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     return blogs;
   }
}
