/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.services;

import Interfaces.IServiceEvenement;
import esprit.java.entities.Evenement;
import java.sql.SQLException;
import java.util.List;

import java.sql.Connection;
import java.sql.Date;
import esprit.java.tools.MaConnexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 *
 * @author 21652
 */

    
public class ServiceEvenement implements IServiceEvenement{

    Connection cnx;
     PreparedStatement ste;
    Statement st;
    
    public ServiceEvenement(){
        cnx = MaConnexion.getInstance().getCnx();
    }
    

    @Override
    public void ajouterEvenement(Evenement e) throws SQLException {
        try {
            String requete = "INSERT INTO evenement (id,libelle,description, date_debut,date_fin,prix_inscription) VALUES (NULL,?,?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setString(1, e.getLibelle());
            pst.setString(2, e.getDescription());
            pst.setString(3, e.getDatedebut());
            pst.setString(4, e.getDatefin());
            pst.setInt(5, e.getPrixInscription());
            pst.executeUpdate();
            System.out.println("evenement ajouté !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }
    @Override
    public void supprimerEvenement(int id) throws SQLException {
        try {
            String requete = "DELETE FROM evenement WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("evenement supprimé !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
 
    @Override
    public void modifierEvenement(Evenement e) throws SQLException {
        //System.out.println("inside modifier evenement"); 
        try {
        String requete = "UPDATE evenement SET  libelle=?, description=?,date_debut=?,date_fin=?, prix_inscription=? WHERE id=?";
        PreparedStatement pst = cnx.prepareStatement(requete);
        pst.setString(1, e.getLibelle());
        pst.setString(2, e.getDescription());
        pst.setString(3, e.getDatedebut());
        pst.setString(4, e.getDatefin());
        pst.setInt(5, e.getPrixInscription());
        pst.setInt(6, e.getId());
        
        pst.executeUpdate();
        System.out.println("evenement modifié !");

        } catch (SQLException ex) {
        System.err.println(ex.getMessage());
        }
    }
    
    

    @Override
    public List<Evenement> afficherEvenements() throws SQLException {
        
        ObservableList<Evenement> list= FXCollections.observableArrayList();

        try {
            String requete = "SELECT * FROM evenement";
            PreparedStatement pst = cnx.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                list.add(new Evenement(
                        rs.getInt("id"),
                        rs.getString("libelle"), 
                        rs.getString("description"),
                        rs.getString("date_debut"), 
                        rs.getString("date_fin"),
                  rs.getInt("prix_inscription"))
                );
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return list; 
        
    }

    @Override
    public Evenement getEvenementById(int id) throws SQLException {
        Evenement evenement = new Evenement();
        try {
            String requete = "SELECT * FROM evenement WHERE id="+id;
            PreparedStatement pst = cnx.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                evenement = new Evenement(
                        rs.getInt("id"),
                        rs.getString("libelle"), 
                        rs.getString("description"),
                        rs.getInt("PrixInscription"), 
                        rs.getString("datefin"), 
                        rs.getString("datedebut")
                );
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return evenement;        
    }
    
    
       public ObservableList<Evenement> afficherIDP(String id)//front
    {
        ObservableList<Evenement> evenements= FXCollections.observableArrayList();
        try {
            String sql="select * from evenement";
            ste=cnx.prepareStatement(sql);
            ResultSet rs=ste.executeQuery();
            while (rs.next())
            {
               Evenement e = new Evenement();
               e.setId(rs.getInt("id"));
               e.setLibelle(rs.getString("libelle"));
               e.setDescription(rs.getString("description"));
           
               evenements.add(e);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return evenements;
    }
       
          public ObservableList<String> afficherID() //front
    {
        ObservableList<String> ids= FXCollections.observableArrayList();
        try {
            String sql="select libelle from evenement";
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

}
