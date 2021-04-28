package Edu.esprit.services;

import Edu.esprit.entities.Avis;
import Edu.esprit.entities.Reclamation;
import Edu.esprit.tools.MaConnexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class ReclamationService {

    Connection cnx;
    PreparedStatement ste;

    public ReclamationService() {
        cnx = MaConnexion.getInstance().getCnx();
    }
    
   public void ajouterReclamation(Reclamation p)
   {
        try {
            String sql="insert into Reclamation(sujet,intensite,commentaire)"+"Values(?,?,?)";
            ste = cnx.prepareStatement(sql);
            ste.setString(1,p.getSujet());
           ste.setString(2,p.getIntensite());
           ste.setString(3,p.getCommentaire());
            ste.executeUpdate();
            System.out.println("Reclamation Ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
   }
    
   public void supprimerReclamation(Reclamation a){
        String requete = "DELETE FROM Reclamation WHERE id = ?";
        try {
           PreparedStatement st=cnx.prepareStatement(requete);
            st.setInt(1, a.getId());
            st.executeUpdate();
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
        System.out.println("Reclamation supprimée!");
        
        
        Notifications notificationBuilder = Notifications.create()
                    .title("Reclamation")
                    .text("Suppression Reussite")
                    .graphic(null)
                    .hideAfter(Duration.seconds(5))
                    .position(Pos.CENTER_RIGHT)
                    .onAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){System.out.println("Notification");}
                    });
            notificationBuilder.showConfirm();
        
    }
   
   
   public ObservableList<Reclamation> afficherReclamation(){  
       ObservableList<Reclamation> Reclamation= FXCollections.observableArrayList();
        try {
            
            String sql="select * from Reclamation";
            ste =cnx.prepareStatement(sql);
            ResultSet rs = ste.executeQuery();
            while (rs.next()) { 
                Reclamation p = new Reclamation(rs.getString(2),rs.getString(3),rs.getString(4));
                Reclamation.add(p);
                
            
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     return Reclamation;
   }
   
   public Reclamation readbyId(int id){
        Reclamation a=null;
        String req ="SELECT * FROM Reclamation WHERE id=?";
        try {
            PreparedStatement st=cnx.prepareStatement(req);
            st.setInt(1, id);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
           //     a=new Reclamation(rs.getInt(1), rs.getString(2), rs.getInt(3));

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return a;


    }
   
   
   public void modifier(int id,Reclamation f){
       System.out.println("testinside2222");
        String req ="UPDATE Reclamation SET sujet=?,intensite=?,commentaire=? WHERE id=?";

        try {
            PreparedStatement st=cnx.prepareStatement(req);
            st.setInt(1, id);
            st.setString(2, f.getSujet());
            st.setString(3,f.getIntensite());
            st.setString(4,f.getCommentaire());
            st.executeUpdate();
            System.out.println("Reclamation modifiee !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
   

}
