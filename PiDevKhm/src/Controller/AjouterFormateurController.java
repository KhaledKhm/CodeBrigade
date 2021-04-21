/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.utilisateur;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import services.*;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class AjouterFormateurController implements Initializable {

    @FXML
    private PasswordField formateurPassword;
    @FXML
    private AnchorPane rootPane;
    @FXML
    private VBox chosenFruitCard;
    @FXML
    private ComboBox<?> languageChange;
    @FXML
    private ScrollPane scroll;
    @FXML
    private Label labelEmail;
    @FXML
    private Label labelPassword;
    @FXML
    private Label labelTelephone;
    @FXML
    private Label labelAdresse;
    @FXML
    private Label labelTestEmail;
    @FXML
    private Label labelTestPassword;
    @FXML
    private Label labelTestTelephone;
    @FXML
    private Label labelTestAdresse;
    @FXML
    private Button inscrireFormateur;
    @FXML
    private Button retourFormateur;
    @FXML
    private Label labelCIN;
    @FXML
    private Label labelNom;
    @FXML
    private Label labelPrenom;
    @FXML
    private Label labelDate;
    @FXML
    private Label labelSexe;
    @FXML
    private Label labelEtat;
    @FXML
    private Label labelDomaine;
    @FXML
    private Label labelTestCIN;
    @FXML
    private Label labelTestNom;
    @FXML
    private Label labelTestPrenom;
    @FXML
    private Label labelTestDate;
    @FXML
    private Label labelTestSexe;
    @FXML
    private Label labelTestEtat;
    @FXML
    private Label labelTestDomaine;

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
     private ChoiceBox<?> formateurEtat;
    @FXML
     private TextField formateurTelephone;
    @FXML
     private TextField formateurAdresse;
    @FXML
     private ChoiceBox<?> formateurDomaine;
     
    @FXML
      private void addFormateur(ActionEvent event) throws Exception{
          int cin=Integer.parseInt(formateurCIN.getText());
          String email = formateurEmail.getText();
          String password = formateurPassword.getText();
          String nom = formateurNom.getText();
          String prenom = formateurPrenom.getText();
          String sexe = formateurSexe.getTypeSelector();
          Date date = Date.valueOf(formateurDate.getValue());
          String etat = formateurEtat.getTypeSelector();
          int telephone = Integer.parseInt(formateurTelephone.getText());
          String adresse = formateurAdresse.getText();
          String domaine = formateurDomaine.getTypeSelector();
          utilisateur p;
          p=new utilisateur(email,password,cin,nom,prenom,sexe,date,etat,telephone,adresse,domaine,"ROLE_Formateur","NULL");
          formateurService ps = new formateurService();
          ps.ajouterFormateur(p);
          
          FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/inscriptionsChoice.fxml"));
        
          Parent root;
          root = loader.load();
          InscriptionsChoiceController LCC = loader.getController();
          formateurCIN.getScene().setRoot(root);
          
          
    }
      
    @FXML
    public void retourInscriptionChoice(ActionEvent event) {
        try{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/inscriptionsChoice.fxml"));
        
        Parent root;
        root = loader.load();
        InscriptionsChoiceController LCC = loader.getController();
        formateurCIN.getScene().setRoot(root);
      //  scene.getStylesheets().add(getClass().getResource("../tools/css/inscriptionschoice.css").toExternalForm());
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
       
    }


    
}
