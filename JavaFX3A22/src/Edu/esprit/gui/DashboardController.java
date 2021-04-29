/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

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
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class DashboardController implements Initializable {

    @FXML
    private Button BtDashboard1;
    @FXML
    private Button BtUtilisateurs1;
    @FXML
    private Button logout;
    @FXML
    private ComboBox<?> languageChange;
    
    
    Stage primaryStage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gotoUtilisateurs(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("afficherAllUsers.fxml"));
        
        Parent root;
        root = loader.load();
        AfficherAllUsersController DUC = loader.getController();
        BtUtilisateurs1.getScene().setRoot(root);
    }

    @FXML
    private void logout(ActionEvent event) throws IOException {
       FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        
          Parent root;
          root = loader.load();
          LoginController LCC = loader.getController();
          BtDashboard1.getScene().setRoot(root);
    }

    @FXML
    private void languageChange(ActionEvent event) {
    }
    
}
