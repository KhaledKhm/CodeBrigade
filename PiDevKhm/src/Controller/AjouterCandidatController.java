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
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import services.candidatService;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class AjouterCandidatController implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private VBox chosenFruitCard;
    @FXML
    private ScrollPane scroll;
    @FXML
    private Label labelCIN;
    @FXML
    private Label labelEmail;
    @FXML
    private Label labelTestCIN;
    @FXML
    private Label labelTestEmail;
    @FXML
    private Label labelTestPassword;
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
    private Label labelTestTelephone;
    @FXML
    private Label labelTestAdresse;
    @FXML
    private Label labelTestDomaine;
    @FXML
    private TextField candidatCIN;
    private TextField candidatTelephone;
    private DatePicker candidatDate;
    private TextField candidatPrenom;
    @FXML
    private TextField candidatEmail;
    private PasswordField candidatPassword;
    private TextField candidatNom;
    private TextField candidatAdresse;
    private ChoiceBox<?> candidatSexe;
    private ChoiceBox<?> candidatEtat;
    private ChoiceBox<?> candidatDomaine;
    @FXML
    private Button inscrireCandidat;
    @FXML
    private Button retourCandidat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
   

    @FXML
    private void addCandidat(ActionEvent event) throws IOException {
           int cin=Integer.parseInt(candidatCIN.getText());
          String email = candidatEmail.getText();
          String password = candidatPassword.getText();
          String nom = candidatNom.getText();
          String prenom = candidatPrenom.getText();
          String sexe = candidatSexe.getTypeSelector();
          Date date = Date.valueOf(candidatDate.getValue());
          String etat = candidatEtat.getTypeSelector();
          int telephone = Integer.parseInt(candidatTelephone.getText());
          String adresse = candidatAdresse.getText();
          String domaine = candidatDomaine.getTypeSelector();
          utilisateur u;
          u=new utilisateur(email,password,cin,nom,prenom,sexe,date,etat,telephone,adresse,domaine,"ROLE_Candidat","NULL");
          candidatService ps = new candidatService();
          ps.ajouterCandidat(u);
          
             FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/inscriptionsChoice.fxml"));
        
        Parent root;
        root = loader.load();
        InscriptionsChoiceController LCC = loader.getController();
        candidatCIN.getScene().setRoot(root);
          
          /*  FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherPersonne.fxml"));
          Parent root = loader.load();
          AfficherPersonneController ap = loader.getController();
          ap.setTxtafficher(ps.afficherPersonne().toString());
          txtnom.getScene().setRoot(root);*/
    }

    @FXML
    private void retourInscriptionChoice(ActionEvent event) {
           try{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/inscriptionsChoice.fxml"));
        
        Parent root;
        root = loader.load();
        InscriptionsChoiceController LCC = loader.getController();
        candidatCIN.getScene().setRoot(root);
      //  scene.getStylesheets().add(getClass().getResource("../tools/css/inscriptionschoice.css").toExternalForm());
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
    }
    }
      
   
    
}
