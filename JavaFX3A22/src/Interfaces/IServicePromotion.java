/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Edu.esprit.entities.Promotion;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author 21652
 */
public interface IServicePromotion {
    public void ajouterPromotion(Promotion p) throws SQLException;
    public void supprimerPromotion(int id) throws SQLException;
    public void modifierPromotion(Promotion p) throws SQLException;
    public List<Promotion> afficherPromotions() throws SQLException;
    public Promotion getPromotionById(int id) throws SQLException; 

}
