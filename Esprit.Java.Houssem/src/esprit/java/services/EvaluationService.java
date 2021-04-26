/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.services;

import esprit.java.entities.Evaluation;
import esprit.java.entities.Quiz;
import esprit.java.tools.MaConnexion;
import static java.lang.Integer.parseInt;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;

/**
 *
 * @author OneEffect007
 */
public class EvaluationService {
    Connection cnx;
    PreparedStatement ste;
    Statement st;
    
    public EvaluationService()
    {
        cnx=MaConnexion.getInstance().getCnx();
    }
    
    public void ajouterEvaluation(Evaluation e)//CRUD
    {
        String sql="insert into evaluation(libelle,description,dateEvaluation,id_entreprise)"+"Values(?,?,?,?)";
        try {
            ste = cnx.prepareStatement(sql);
            ste.setString(1,e.getLibelle());
            ste.setString(2,e.getDescription());
            ste.setString(3,e.getDateEvaluation());
            ste.setInt(4,e.getId_entreprise());
            ste.executeUpdate();
            System.out.println("Evaluation Ajoutée ");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public ObservableList<Evaluation> afficherEvaluation()//CRUD
    {
        ObservableList<Evaluation> evaluations= FXCollections.observableArrayList();
        try {
            String sql="select * from evaluation";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {
                Evaluation e = new Evaluation();
                e.setId(rs.getInt("id"));
                e.setLibelle(rs.getString("libelle"));
                e.setDescription(rs.getString("description"));
                e.setDateEvaluation(rs.getString("DateEvaluation"));
                e.setId_entreprise(rs.getInt("id_entreprise"));
                evaluations.add(e);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return evaluations;
    }
    
    public ObservableList<String> afficherID() //front
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
    
    public ObservableList<String> afficherEntreprise()
    {
        ObservableList<String> entreprises= FXCollections.observableArrayList();
        try {
            //String role="ROLE_Entreprise";
            String sql="select libelle_entreprise from utilisateur where role='ROLE_Entreprise'";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                entreprises.add(rs.getString("libelle_entreprise"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return entreprises;
    }
    
    public int getIdEntreprise(String libelle)
    {
        try {  
            String sql="select id from utilisateur where libelle_entreprise='"+libelle+"'";
            st=cnx.createStatement();
            ResultSet rs=st.executeQuery(sql);
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
    
    public void modifierEvaluation(Evaluation e,String id)//CRUD
    {
        String sql="update evaluation set libelle='"+e.getLibelle()+"',description='"+e.getDescription()+"',dateEvaluation='"+e.getDateEvaluation()+"',id_entreprise='"+e.getId_entreprise()+"' where id="+id;
        try {
            st = cnx.createStatement();
            st.executeUpdate(sql);
            System.out.println("Evaluation Modifiée ");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void supprimerEvaluation(String id)//CRUD
    {
        String req ="delete from evaluation where id = "+id;
        try {
            st=cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Evaluation Supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    /*public Evaluation getEvaluation(String id)
    {
        Evaluation e = new Evaluation();
        try {  
            String sql="select * from evaluation where id="+id;
            st=cnx.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while (rs.next())
            {    
                e.setLibelle(rs.getString("libelle"));
                e.setDescription(rs.getString("description"));
                e.setDateEvaluation(rs.getString("DateEvaluation"));
                e.setId_entreprise(rs.getInt("id_entreprise"));
                return e;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return e;
    }*/
    
     /*public ObservableList<Evaluation> afficherEvaluationP(String id)//affichage dans le tableau
    {
        ObservableList<Evaluation> evaluations= FXCollections.observableArrayList();
        try {
            String sql="select * from evaluation e join participation_evaluation p on e.id=p.id_e where p.id_p="+id;
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {
                Evaluation e = new Evaluation();
                e.setId(rs.getInt("id"));
                e.setLibelle(rs.getString("libelle"));
                e.setDescription(rs.getString("description"));
                e.setDateEvaluation(rs.getString("DateEvaluation"));
                e.setId_entreprise(rs.getInt("id_entreprise"));
                evaluations.add(e);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return evaluations;
    }*/
     
    public ObservableList<Quiz> Questions(String id)//FRONT
    {
        ObservableList<Quiz> questions= FXCollections.observableArrayList();
        try {
            String sql="select * from quiz where id_evaluation="+id;
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {
                Quiz q = new Quiz();
                q.setQuestion(rs.getString("question"));
                q.setChoix1(rs.getString("choix1"));
                q.setChoix2(rs.getString("choix2"));
                q.setChoix3(rs.getString("choix3"));
                q.setReponse(rs.getInt("reponse"));
                questions.add(q);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return questions;
    }
    
    public String getIdEval(String libelle)
    {
        try {  
            String sql="select id from evaluation where libelle='"+libelle+"'";
            st=cnx.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while (rs.next())
            {    
                String id=String.valueOf(rs.getInt("id"));
                return id;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return "";
    }
    
    
}
