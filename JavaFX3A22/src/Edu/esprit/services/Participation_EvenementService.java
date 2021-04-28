/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.services;

import Edu.esprit.entities.Participation_Evenement;
import esprit.java.tools.MaConnexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author OneEffect007
 */

public class Participation_EvenementService {
    Connection cnx;
    PreparedStatement ste;
    Statement st;
    
    public Participation_EvenementService()
    {
        cnx=MaConnexion.getInstance().getCnx();
    }
    
    public void ajouterParticipation(Participation_Evenement p)//CRUD
    {
        String sql="insert into participation_evenement (id_p,id_e,email)"+"Values(?,?,?)";
        try {
            ste = cnx.prepareStatement(sql);
            ste.setInt(1,p.getId_p());
            ste.setInt(2,p.getId_e());
            ste.setString(3,p.getEmail());
            ste.executeUpdate();
            System.out.println("Participation Ajoutée ");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }   
    }
    
    public ObservableList<Participation_Evenement> afficherParticipation()//CRUD
    {
        ObservableList<Participation_Evenement> participations= FXCollections.observableArrayList();
        try {
            String sql="select * from participation_evenement";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {
                Participation_Evenement p = new Participation_Evenement();
               
                p.setId_p(rs.getInt("id_p"));
                p.setId_e(rs.getInt("id_e"));
                p.setEmail(rs.getString("email"));
             
                participations.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return participations;
    }
    
    public void supprimerParticipation(String id)//CRUD
    {
        String req ="delete from participation_evenement where id_e = "+id;
        try {
            st=cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Participation Supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public ObservableList<String> afficherIDEvenement()
    {
        ObservableList<String> ids= FXCollections.observableArrayList();
        try {
            String sql="select id from evenement";
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
    
    public ObservableList<String> afficherID()
    {
        ObservableList<String> ids= FXCollections.observableArrayList();
        try {
            String sql="select code from participation_evenement";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
               // ids.add(rs.getString("code"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ids;
    }
    
    public ObservableList<String> afficherParticipants()
    {
        ObservableList<String> candidats= FXCollections.observableArrayList();
        try {
            //String role="ROLE_Entreprise";
            String sql="select id from utilisateur where role='ROLE_Candidat'";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                candidats.add(rs.getString("id"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return candidats;
    }
    
    
    public int afficherIDEvenement2(String libelle) 
    {
        try {
            String sql="select id from evenement where libelle='"+libelle+"'";
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
    
    /**
     *
     * @return
     */
    public String getMail()//MAILING
    {
        try {
            String mail;
            String sql="select email from participation_evenement where id_p=29";
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
