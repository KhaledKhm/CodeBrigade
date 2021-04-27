/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.services;

import Interfaces.IServicePromotion;
import esprit.java.entities.Evenement;
import esprit.java.entities.Promotion;
import java.sql.SQLException;
import java.util.List;

import java.sql.Connection;
import java.sql.Date;
import esprit.java.tools.MaConnexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 *
 * @author 21652
 */
public class ServicePromotion implements IServicePromotion{

    Connection cnx;
    
    public ServicePromotion(){
        cnx = MaConnexion.getInstance().getCnx();
    }
    

    @Override
    public void ajouterPromotion(Promotion p) throws SQLException {
        try {
            String requete = "INSERT INTO Promotion (id,libelle,poucentage_reduction,id_evenement) VALUES (NULL,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setString(1, p.getLibelle());
            pst.setInt(2, p.getPoucentageReduction());
            pst.setInt(3, p.getId_evenement());
            pst.executeUpdate();
            System.out.println("Promotion ajouté !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }
   
    @Override
    public void supprimerPromotion(int id) throws SQLException {
        try {
            String requete = "DELETE FROM promotion WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Promotion supprimé !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void modifierPromotion(Promotion p) throws SQLException {
        try {
        String requete = "UPDATE promotion SET libelle=?, poucentage_reduction=? ,id_evenement=? WHERE id=?";
        PreparedStatement pst = cnx.prepareStatement(requete);
        pst.setString(1, p.getLibelle());
       pst.setInt(2, p.getPoucentageReduction());
        pst.setInt(3, p.getId_evenement());
         pst.setInt(4, p.getId());
  
        pst.executeUpdate();
        System.out.println("promotion modifié !");

        } catch (SQLException ex) {
        System.err.println(ex.getMessage());
        }
               
    }
    
    @Override
    public List<Promotion> afficherPromotions() throws SQLException {
      
         ObservableList<Promotion> list= FXCollections.observableArrayList();


        try {
            String requete = "SELECT * FROM promotion";
            PreparedStatement pst = cnx.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                list.add(new Promotion(
                        rs.getInt("id"),
                        rs.getString("libelle"),
                        rs.getInt("poucentage_reduction"),
                        rs.getInt("id_evenement"))
                );
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return list; 
    }
  
    @Override
    public Promotion getPromotionById(int id) throws SQLException {
        Promotion promotion = new Promotion();

        try {
            String requete = "SELECT * FROM promotion WHERE id="+id;
            PreparedStatement pst = cnx.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                promotion = new Promotion(
                        rs.getInt("id"),
                        
                        rs.getInt("poucentage_reduction"),
                         rs.getString("libelle"),
                        rs.getInt("id_evenement")
                );
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return promotion;        
    }
    
 
}
