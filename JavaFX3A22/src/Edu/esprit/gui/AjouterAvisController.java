/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import Edu.esprit.entities.Avis;
import Edu.esprit.services.AvisService;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.lang.Object;
import org.controlsfx.control.Rating ;



/**
 * FXML Controller class
 *
 * @author Fayechi
 */
public class AjouterAvisController implements Initializable {

    @FXML
    private TextField txtnom;
    @FXML
    private Rating txtprenom;
    @FXML
    private Button btnajout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addAvis(ActionEvent event) {
        try {
            String nom = txtnom.getText();
            int prenom = (int) txtprenom.getRating();
            Avis p = new Avis(33,nom,prenom);
            AvisService ps = new AvisService();
            ps.ajouterAvis(p);
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherAvis.fxml"));
            Parent root = loader.load();
            AfficherAvisController ap = loader.getController();
            
            txtnom.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    
    
}
