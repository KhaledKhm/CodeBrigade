/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import Edu.esprit.services.formateurService;
import Edu.esprit.services.utilisateurService;
import Edu.esprit.entities.utilisateur;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

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
        Rebelotte();
    }    
    
    
   public void Rebelotte(){
         //combobox
         utilisateurService us = new utilisateurService();
    
        
        List<String> reponses=us.afficherSexe();
        List<String> reponses2=us.afficherEtat();
        List<String> reponses3=us.afficherDomaine();

        formateurSexe.setItems((ObservableList) reponses);
        
      

        formateurEtat.setItems((ObservableList) reponses2);
        
        

        formateurDomaine.setItems((ObservableList) reponses3);
        
        
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
     private ComboBox<?> formateurSexe;
    @FXML
     private DatePicker formateurDate;
    @FXML
     private ComboBox<?> formateurEtat;
    @FXML
     private TextField formateurTelephone;
    @FXML
     private TextField formateurAdresse;
    @FXML
     private ComboBox<?> formateurDomaine;
     
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
          utilisateurService us = new utilisateurService();
          password=us.MD5(password);
          p=new utilisateur(email,password,cin,nom,prenom,sexe,date,etat,telephone,adresse,domaine,"ROLE_Formateur","NULL");
          formateurService ps = new formateurService();
          ps.ajouterFormateur(p);
          
          FXMLLoader loader = new FXMLLoader(getClass().getResource("inscriptionsChoice.fxml"));
        
          Parent root;
          root = loader.load();
          InscriptionsChoiceController LCC = loader.getController();
          formateurCIN.getScene().setRoot(root);
          
          
    }
      
    @FXML
    public void retourInscriptionChoice(ActionEvent event) {
        try{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("inscriptionsChoice.fxml"));
        
        Parent root;
        root = loader.load();
        InscriptionsChoiceController LCC = loader.getController();
        formateurCIN.getScene().setRoot(root);
      //  scene.getStylesheets().add(getClass().getResource("../tools/css/inscriptionschoice.css").toExternalForm());
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
       
    }

    @FXML
    private void formateurSexe(ActionEvent event) {
    }

    @FXML
    private void formateurEtat(ActionEvent event) {
    }

    @FXML
    private void formateurDomaine(ActionEvent event) {
    }


    
}
