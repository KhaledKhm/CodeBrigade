/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.services;

import Edu.esprit.entities.Participation_Evaluation;
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
public class Participation_EvaluationService {
    Connection cnx;
    PreparedStatement ste;
    Statement st;
    
    public Participation_EvaluationService()
    {
        cnx=MaConnexion.getInstance().getCnx();
    }
    
    public void ajouterParticipation(Participation_Evaluation p)//CRUD
    {
        String sql="insert into participation_evaluation (id_p,id_e,note)"+"Values(?,?,?)";
        try {
            ste = cnx.prepareStatement(sql);
            ste.setInt(1,p.getId_p());
            ste.setInt(2,p.getId_e());
            ste.setInt(3,p.getNote());
            ste.executeUpdate();
            System.out.println("Participation Ajoutée ");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }   
    }
    
    public ObservableList<Participation_Evaluation> afficherParticipation()//CRUD
    {
        ObservableList<Participation_Evaluation> participations= FXCollections.observableArrayList();
        try {
            String sql="select * from participation_evaluation";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {
                Participation_Evaluation p = new Participation_Evaluation();
                p.setCode(rs.getInt("code"));
                p.setId_p(rs.getInt("id_p"));
                p.setId_e(rs.getInt("id_e"));
                p.setNote(rs.getInt("note"));
                participations.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return participations;
    }
    
    public void supprimerParticipation(String id)//CRUD
    {
        String req ="delete from participation_evaluation where code = "+id;
        try {
            st=cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Participation Supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
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
    
    public ObservableList<String> afficherID()
    {
        ObservableList<String> ids= FXCollections.observableArrayList();
        try {
            String sql="select code from participation_evaluation";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                ids.add(rs.getString("code"));
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
}
