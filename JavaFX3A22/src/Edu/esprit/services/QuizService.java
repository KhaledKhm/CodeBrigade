/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.services;

import Edu.esprit.entities.Quiz;
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
public class QuizService {
    Connection cnx;
    PreparedStatement ste;
    Statement st;
    
    public QuizService()
    {
        cnx=MaConnexion.getInstance().getCnx();
    }
    
    public void ajouterQuiz(Quiz q)//CRUD
    {
        String sql="insert into quiz (question,choix1,choix2,choix3,reponse,id_evaluation)"+"Values(?,?,?,?,?,?)";
        try {
            ste = cnx.prepareStatement(sql);
            ste.setString(1,q.getQuestion());
            ste.setString(2,q.getChoix1());
            ste.setString(3,q.getChoix2());
            ste.setString(4,q.getChoix3());
            ste.setInt(5,q.getReponse());
            ste.setInt(6,q.getIdEvaluation());
            ste.executeUpdate();
            System.out.println("Quiz Ajoutée ");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }   
    }
    
    public ObservableList<Quiz> afficherQuiz()//CRUD
    {
        ObservableList<Quiz> quizs= FXCollections.observableArrayList();
        try {
            String sql="select * from quiz";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {
                Quiz q = new Quiz();
                q.setId(rs.getInt("id"));
                q.setQuestion(rs.getString("question"));
                q.setChoix1(rs.getString("choix1"));
                q.setChoix2(rs.getString("choix2"));
                q.setChoix3(rs.getString("choix3"));
                q.setReponse(rs.getInt("reponse"));
                q.setIdEvaluation(rs.getInt("id_evaluation"));
                quizs.add(q);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return quizs;
    }
    
    public void supprimerQuiz(String id)//CRUD
    {
        String req ="delete from quiz where id = "+id;
        try {
            st=cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Quiz Supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public ObservableList<String> afficherEvaluation()
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
     
    /* public ObservableList<String> afficherID()
    {
        ObservableList<String> ids= FXCollections.observableArrayList();
        try {
            String sql="select id from quiz";
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
    }*/
     
     public ObservableList<String> afficherReponse()//CRUD
    {
        ObservableList<String> reponses= FXCollections.observableArrayList();
        reponses.add("1");
        reponses.add("2");
        reponses.add("3");
        return reponses;
    }
}
