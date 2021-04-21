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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class AjouterBlogController implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private VBox chosenFruitCard;
    @FXML
    private ComboBox<?> languageChange;
    @FXML
    private Button inscrireEntreprise;
    @FXML
    private Button retourEntreprise;
    @FXML
    private ScrollPane scroll;
    @FXML
    private Label labelImmatricule;
    @FXML
    private Label labelEmail;
    @FXML
    private Label labelPassword;
    @FXML
    private Label labelLibelle;
    @FXML
    private Label labelTelephone;
    @FXML
    private Label labelAdresse;
    @FXML
    private Label labelSite;
    @FXML
    private Label labelSecteur;
    @FXML
    private TextField entrepriseImmatricule;
    @FXML
    private TextField entrepriseEmail;
    @FXML
    private PasswordField entreprisePassword;
    @FXML
    private TextField entrepriseLibelle;
    @FXML
    private TextField entrepriseTelephone;
    @FXML
    private TextField entrepriseAdresse;
    @FXML
    private TextField entrepriseSite;
    @FXML
    private ChoiceBox<?> entrepriseSecteur;
    @FXML
    private Label labelTestImmatricule;
    @FXML
    private Label labelTestEmail;
    @FXML
    private Label labelTestPassword;
    @FXML
    private Label labelTestLabel;
    @FXML
    private Label labelTestTelephone;
    @FXML
    private Label labelTestAdresse;
    @FXML
    private Label labelTestSite;
    @FXML
    private Label labelTestSecteur;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addEntreprise(ActionEvent event) {
    }

    @FXML
    private void retourInscriptionChoice(ActionEvent event) {
    }
    
}
