/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.utilisateur;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class EditerProfilController implements Initializable {

    @FXML
    private TableView<?> Tableau;
    @FXML
    private TableColumn<?, ?> email;
    @FXML
    private TableColumn<?, ?> Nom;
    @FXML
    private TableColumn<?, ?> Prenom;
    @FXML
    private TableColumn<?, ?> Dare_naissance;
    @FXML
    private TableColumn<?, ?> adresse;
    @FXML
    private TableColumn<?, ?> Role;
    @FXML
    private Button Bt_Ajouter;
    @FXML
    private Button Bt_Modifier;
    @FXML
    private Button Bt_Supprimer;
    @FXML
    private Text alertRechere;
    


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void searchUtilisateur(ActionEvent event) {
          
    }

    @FXML
    private void Ajouter(ActionEvent event) {
    }

    @FXML
    private void Modifier(ActionEvent event) {
    }

    @FXML
    private void Supprimer(ActionEvent event) {
    }

    
}
