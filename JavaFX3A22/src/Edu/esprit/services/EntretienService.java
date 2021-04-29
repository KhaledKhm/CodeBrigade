/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.services;

import Edu.esprit.entities.Entretien;
import Edu.esprit.entities.Evaluation;
import Edu.esprit.tools.MaConnexion;
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
    
    public void ajouterEntretien(Entretien e) //CRUD
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
    
    public ObservableList<Entretien> afficherEntretien()//CRUD
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
    
    public void modifierEntretien(Entretien e,String id)//CRUD
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
    
    public void supprimerEntretien(String id)//CRUD
    {
        String req ="delete from entretien where id ="+id;
        try {
            st=cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Entretien Supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public ObservableList<Entretien> afficherIDP(String id)//front
    {
        ObservableList<Entretien> entretiens= FXCollections.observableArrayList();
        try {
            String sql="select * from entretien where id_participant="+id;
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
    
    public ObservableList<String> afficherIDEvaluation() 
    {
        ObservableList<String> ids= FXCollections.observableArrayList();
        try {
            String sql="select libelle from evaluation";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                ids.add(rs.getString("libelle"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ids;
    }
    
    public int afficherIDEvaluation2(String libelle) 
    {
        try {
            String sql="select id from evaluation where libelle='"+libelle+"'";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                int id=rs.getInt("id");
                return id;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    
    public ObservableList<String> afficherParticipant(String id)
    {
        ObservableList<String> participants= FXCollections.observableArrayList();
        try {
            //String role="ROLE_Entreprise";
            String sql="select prenom_personne from participation_evaluation p join utilisateur u on u.id=p.id_p where p.id_e="+id;
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                participants.add(rs.getString("prenom_personne"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return participants;
    }
    
    public int afficherIDParticipant2(String nomp) 
    {
        try {
            String sql="select id from utilisateur where prenom_personne='"+nomp+"'";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                int id=rs.getInt("id");
                return id;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    
    /*public Entretien getEntretien(String id)
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
    }*/
    
     public String getMail(String id)//MAILING
    {
        try {
            String mail;
            String sql="select email from utilisateur where id="+id;
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                mail=rs.getString("email");
                return mail;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
     
}