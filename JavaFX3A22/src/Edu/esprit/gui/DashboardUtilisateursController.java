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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class DashboardUtilisateursController implements Initializable {

    @FXML
    private Button BtDashboard1;
    @FXML
    private Button BtUtilisateurs1;
    @FXML
    private Button logout;
    @FXML
    private ComboBox<?> languageChange;
    @FXML
    private TableColumn<?, ?> emailEnterprise;
    @FXML
    private TableColumn<?, ?> secteurEntreprise;
    @FXML
    private TableColumn<?, ?> roleUtilisateur;
    @FXML
    private TableView<?> listeEntreprises;
    @FXML
    private TableView<?> listeUtilisateurs;
    @FXML
    private TableColumn<?, ?> emailUtilisateur;
    
    Stage primaryStage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logout(ActionEvent event) throws IOException {
        
           FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/Login.fxml"));
        
          Parent root;
          root = loader.load();
          LoginController LCC = loader.getController();
          BtDashboard1.getScene().setRoot(root);
    }

    @FXML
    private void languageChange(ActionEvent event) {
    }

    @FXML
    private void gotoDashboard(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/Dashboard.fxml"));
        
          Parent root;
          root = loader.load();
          DashboardController LCC = loader.getController();
          BtDashboard1.getScene().setRoot(root);
    }
    
}
