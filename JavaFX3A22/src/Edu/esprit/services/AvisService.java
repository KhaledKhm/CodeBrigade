package Edu.esprit.services;

import Edu.esprit.entities.Avis;
import Edu.esprit.tools.MaConnexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AvisService {

    Connection cnx;
    PreparedStatement ste;

    public AvisService() {
        cnx = MaConnexion.getInstance().getCnx();
    }
    
   public void ajouterAvis(Avis p)
   {
        try {
            String sql="insert into avis(commentaire,etoiles)"+"Values(?,?)";
            ste = cnx.prepareStatement(sql);
            ste.setString(1,p.getCommentaire());
            ste.setInt(2, p.getEtoiles());
            ste.executeUpdate();
            System.out.println("Avis Ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
   }
    
   public void supprimerAvis(int id)
   {
         String req ="DELETE FROM Avis WHERE ID =?";
        try {
            PreparedStatement st=cnx.prepareStatement(req);
            st.setInt(1,id);
            st.executeUpdate();
            System.out.println("Avis Supprimee !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
   }
   
   
   public ObservableList<Avis> afficherAvis(){  
       ObservableList<Avis> Avis= FXCollections.observableArrayList();
        try {
            
            String sql="select * from Avis";
            ste =cnx.prepareStatement(sql);
            ResultSet rs = ste.executeQuery();
            while (rs.next()) { 
                Avis p = new Avis(rs.getInt(1),rs.getString(2),rs.getInt(3));
                Avis.add(p);
                
            
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     return Avis;
   }
   
   public Avis readbyId(int id){
        Avis a=null;
        String req ="SELECT * FROM Avis WHERE id=?";
        try {
            PreparedStatement st=cnx.prepareStatement(req);
            st.setInt(1, id);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                a=new Avis(rs.getInt(1), rs.getString(2), rs.getInt(3));

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return a;


    }
   
   
   public void modifier(int id,Avis f){
        String req ="UPDATE Avis SET etoiles=?,commentaire=? WHERE id=?";

        try {
            PreparedStatement st=cnx.prepareStatement(req);
            st.setInt(1, f.getEtoiles());
            st.setString(2,f.getCommentaire());
            st.setInt(3,id);
            st.executeUpdate();
            System.out.println("Avis modifiee !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
   

}
