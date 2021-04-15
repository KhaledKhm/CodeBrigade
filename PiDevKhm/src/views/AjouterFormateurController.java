/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

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
    private Button retourFormateur;
    @FXML
    private Button inscrireFormateur;

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
     
    @FXML
      private void addFormateur(ActionEvent event) throws Exception{
          int cin=Integer.parseInt(formateurCIN.getText());
          String email = formateurEmail.getText();
          String password = formateurPassword.getText();
          String nom = formateurNom.getText();
          String prenom = formateurPrenom.getText();
          String sexe = formateurSexe.getTypeSelector();
          //  Date date = formateurDate.getText().toString();
          String etat = formateurEtat.getTypeSelector();
          int telephone = Integer.parseInt(formateurTelephone.getText());
          String adresse = formateurAdresse.getText();
          String domaine = formateurDomaine.getTypeSelector();
          utilisateur p;
          p=new utilisateur(password,cin,nom,prenom,sexe,etat,telephone,adresse,email,domaine,"ROLE_Formateur");
          formateurService ps = new formateurService();
          ps.ajouterFormateur(p);
          
          /*   FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherPersonne.fxml"));
          Parent root = loader.load();
          AfficherPersonneController ap = loader.getController();
          ap.setTxtafficher(ps.afficherPersonne().toString());
          txtnom.getScene().setRoot(root);*/
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
    
}
