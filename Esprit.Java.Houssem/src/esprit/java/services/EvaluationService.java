/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.services;

import esprit.java.entities.Evaluation;
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
    
    public void ajouterEvaluation(Evaluation e)
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
    
    public ObservableList<Evaluation> afficherEvaluation()//affichage dans le tableau
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
    
    public ObservableList<String> afficherID() //pour le combobox modif
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
    
    public ObservableList<String> afficherEntreprise() //pour le combobox modif
    {
        ObservableList<String> entreprises= FXCollections.observableArrayList();
        try {
            //String role="ROLE_Entreprise";
            String sql="select id from utilisateur where role='ROLE_Entreprise'";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {    
                entreprises.add(rs.getString("id"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return entreprises;
    }
    
    public void modifierEvaluation(Evaluation e,String id)
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
    
    public void supprimerEvaluation(String id)
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
    
    public Evaluation getEvaluation(String id)
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
    }
    
}
