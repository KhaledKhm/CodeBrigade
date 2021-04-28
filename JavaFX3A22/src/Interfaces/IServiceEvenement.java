/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Edu.esprit.entities.Evenement;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author 21652
 */
public interface IServiceEvenement {
    public void ajouterEvenement(Evenement e) throws SQLException;
    public void supprimerEvenement(int id) throws SQLException;
    public void modifierEvenement(Evenement e) throws SQLException;
    public List<Evenement> afficherEvenements() throws SQLException;
    public Evenement getEvenementById(int id) throws SQLException; 

}
