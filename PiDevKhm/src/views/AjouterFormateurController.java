/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class AjouterFormateurController implements Initializable {

    @FXML
    private PasswordField formateurPassword;
    @FXML
    private Button retourFormateur;
    @FXML
    private Button inscrureFormateur;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    private TextField formateurCIN;
     @FXML
     private TextField formateurEmail;
     @FXML
     private TextField formateurNom;
     @FXML
     private TextField formateurPrenom;
     @FXML
     private ChoiceBox<?> formateurSexe;
     @FXML
     private DatePicker formateurDate;
     @FXML
     private ComboBox formateurEtat;
     @FXML
     private TextField formateurTelephone;
     @FXML
     private TextField formateurAdresse;
     @FXML
     private ChoiceBox<?> formateurDomaine;
     
     
    
}
