/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logout(ActionEvent event) {
    }

    @FXML
    private void languageChange(ActionEvent event) {
    }
    
}