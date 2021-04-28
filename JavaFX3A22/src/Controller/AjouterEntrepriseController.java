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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import services.entrepriseService;
import services.utilisateurService;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class AjouterEntrepriseController implements Initializable {

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
    private ComboBox<?> entrepriseSecteur;
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
    private void addEntreprise(ActionEvent event) throws IOException {
          String immatricule=entrepriseImmatricule.getText();
          String email = entrepriseEmail.getText();
          String password = entreprisePassword.getText();
          String libelle = entrepriseLibelle.getText();
          String adresse = entrepriseAdresse.getText();
          String site = entrepriseSite.getText();
          int telephone = Integer.parseInt(entrepriseTelephone.getText());
          String secteur = entrepriseSecteur.getTypeSelector();       
          utilisateur p;
          utilisateurService us = new utilisateurService();
          password=us.MD5(password);
          p=new utilisateur(email,password,immatricule,libelle,telephone,adresse,site,secteur,"ROLE_Entreprise","NULL");
          entrepriseService ps = new entrepriseService();
          ps.ajouterEntreprise(p);
          
          FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/inscriptionsChoice.fxml"));
        
          Parent root;
          root = loader.load();
          InscriptionsChoiceController LCC = loader.getController();
          entrepriseImmatricule.getScene().setRoot(root);
    }

    @FXML
    private void retourInscriptionChoice(ActionEvent event) {
    }
    
}
