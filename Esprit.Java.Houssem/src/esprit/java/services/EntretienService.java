/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.services;

import esprit.java.entities.Entretien;
import esprit.java.entities.Evaluation;
import esprit.java.tools.MaConnexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author OneEffect007
 */
public class EntretienService {
    Connection cnx;
    PreparedStatement ste;
    Statement st;
    
    public EntretienService()
    {
        cnx=MaConnexion.getInstance().getCnx();
    }
    
    public void ajouterEntretien(Entretien e)
    {
        String sql="insert into entretien(libelle,description,dateEntretien,idevaluation,id_participant)"+"Values(?,?,?,?,?)";
        try {
            ste = cnx.prepareStatement(sql);
            ste.setString(1,e.getLibelle());
            ste.setString(2,e.getDescription());
            ste.setString(3,e.getDateEntretien());
            ste.setInt(4,e.getIdEvaluation());
            ste.setInt(5,e.getIdParticipant());
            ste.executeUpdate();
            System.out.println("Entretien Ajoutée ");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public ObservableList<Entretien> afficherEntretien()//affichage dans le tableau
    {
        ObservableList<Entretien> entretiens= FXCollections.observableArrayList();
        try {
            String sql="select * from entretien";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {
                Entretien e = new Entretien();
                e.setId(rs.getInt("id"));
                e.setLibelle(rs.getString("libelle"));
                e.setDescription(rs.getString("description"));
                e.setDateEntretien(rs.getString("DateEntretien"));
                e.setIdEvaluation(rs.getInt("idevaluation"));
                e.setIdParticipant(rs.getInt("id_participant"));
                entretiens.add(e);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return entretiens;
    }
    
    public void modifierEntretien(Entretien e,String id)
    {
        String sql="update entretien set libelle='"+e.getLibelle()+"',description='"+e.getDescription()+"',dateEntretien='"+e.getDateEntretien()+"',idevaluation='"+e.getIdEvaluation()+"',id_participant='"+e.getIdParticipant()+"' where id="+id;
        try {
            st = cnx.createStatement();
            st.executeUpdate(sql);
            System.out.println("Entretien Modifiée ");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void supprimerEntretien(String id)
    {
        String req ="delete from entretien where id = "+id;
        try {
            st=cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Entretien Supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public ObservableList<String> afficherID()
    {
        ObservableList<String> ids= FXCollections.observableArrayList();
        try {
            String sql="select id from entretien";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                ids.add(rs.getString("id"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ids;
    }
    
    public ObservableList<String> afficherIDEvaluation() 
    {
        ObservableList<String> ids= FXCollections.observableArrayList();
        try {
            String sql="select id from evaluation";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                ids.add(rs.getString("id"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ids;
    }
    
    public ObservableList<String> afficherParticipant(String id)
    {
        ObservableList<String> participants= FXCollections.observableArrayList();
        try {
            //String role="ROLE_Entreprise";
            String sql="select id_p from participation_evaluation where id_e="+id;
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                participants.add(rs.getString("id_p"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return participants;
    }
    
    public Entretien getEntretien(String id)
    {
        Entretien e = new Entretien();
        try {  
            String sql="select * from entretien where id="+id;
            st=cnx.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while (rs.next())
            {    
                e.setLibelle(rs.getString("libelle"));
                e.setDescription(rs.getString("description"));
                e.setDateEntretien(rs.getString("DateEntretien"));
                e.setIdEvaluation(rs.getInt("idevaluation"));
                e.setIdParticipant(rs.getInt("id_participant"));
                return e;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return e;
    }
}