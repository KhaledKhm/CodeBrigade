/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import Edu.esprit.gui.LoginController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class InscriptionsChoiceController implements Initializable {

    @FXML
    private Button inscrireFormateur;
    @FXML
    private Button inscrireCandidat;
    @FXML
    private Button inscrireEntreprise;
    @FXML
    private Button retourLogin;
    @FXML
    private AnchorPane inscriptionsChoice;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private Label labelInscrireEtant;
    
    @FXML
    public void inscrireFormateur(ActionEvent event) {
        
            try{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/ajouterFormateur.fxml"));
        
        Parent root;
        root = loader.load();
        AjouterFormateurController AFC = loader.getController();
        labelInscrireEtant.getScene().setRoot(root);
      //  scene.getStylesheets().add(getClass().getResource("../tools/css/ajouterformateur.css").toExternalForm());
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
       
    }
    
    @FXML
    public void inscrireCandidat(ActionEvent event) {
         try{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/ajouterCandidat.fxml"));
        
        Parent root;
        root = loader.load();
        AjouterCandidatController ACC = loader.getController();
        labelInscrireEtant.getScene().setRoot(root);
      //  scene.getStylesheets().add(getClass().getResource("../tools/css/ajoutercandidat.css").toExternalForm());
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
       
    }
    
    @FXML
    public void inscrireEntreprise(ActionEvent event) {
        try{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/ajouterEntreprise.fxml"));
        
        Parent root;
        root = loader.load();
        AjouterEntrepriseController AEC = loader.getController();
        labelInscrireEtant.getScene().setRoot(root);
      //  scene.getStylesheets().add(getClass().getResource("../tools/css/ajouterentreprise.css").toExternalForm());
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
       
    }
    
    @FXML
    public void retourALogin(ActionEvent event) {
        try{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/Login.fxml"));
        
        Parent root;
        root = loader.load();
        LoginController LC = loader.getController();
        labelInscrireEtant.getScene().setRoot(root);
      //  scene.getStylesheets().add(getClass().getResource("../tools/css/login.css").toExternalForm());
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
       
    }
    
}
