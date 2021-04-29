/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import Edu.esprit.entities.utilisateur;
import Edu.esprit.services.utilisateurService;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import static Edu.esprit.gui.LoginController.email;
import java.sql.Date;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class EditerProfilController implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private VBox chosenFruitCard;
    @FXML
    private Button inscrireCandidat;
    @FXML
    private Button retourCandidat;
    @FXML
    private ScrollPane scroll;
    @FXML
    private Label labelCIN;
    @FXML
    private TextField candidatCIN;
    @FXML
    private Label labelEmail;
    @FXML
    private Label labelSexe;
    @FXML
    private Label labelEtat;
    @FXML
    private Label labelDomaine;
    @FXML
    private TextField candidatTelephone;
    @FXML
    private Label labelPrenom;
    @FXML
    private TextField candidatPrenom;
    @FXML
    private Label labelAdresse;
    @FXML
    private TextField candidatEmail;
    @FXML
    private Label labelPassword;
    @FXML
    private PasswordField candidatPassword;
    @FXML
    private Label labelNom;
    @FXML
    private TextField candidatNom;
    @FXML
    private Label labelTelephone;
    @FXML
    private TextField candidatAdresse;
    @FXML
    private ComboBox<?> candidatSexe;
    @FXML
    private ComboBox<?> candidatEtat;
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
    private ComboBox<?> candidatDomaine;
    


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
        utilisateurService su = new utilisateurService();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        
            Parent root = loader.load();
             LoginController irc = loader.getController();
             
             candidatCIN.setText(String.valueOf(su.getCINbyId(su.getIdbymail(email))));
             candidatEmail.setText(email);
             candidatPassword.setText(su.getPassbyId(su.getIdbymail(email)));
             candidatNom.setText(su.getNombyId(su.getIdbymail(email)));
             candidatPrenom.setText(su.getPrenombyId(su.getIdbymail(email)));
             candidatTelephone.setText(String.valueOf(su.getTelephonebyId(su.getIdbymail(email))));
             candidatAdresse.setText(su.getAdressebyId(su.getIdbymail(email)));
            
             
             
             
        } catch (IOException ex) {
            Logger.getLogger(EditerProfilController.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }    

    public void afficher(){
    }

    @FXML
    private void addCandidat(ActionEvent event) throws IOException {
         int cin=Integer.parseInt(candidatCIN.getText());
          String emailUser = candidatEmail.getText();
          String password = candidatPassword.getText();
          String nom = candidatNom.getText();
          String prenom = candidatPrenom.getText();
          int telephone = Integer.parseInt(candidatTelephone.getText());
          String adresse = candidatAdresse.getText();
          utilisateurService us = new utilisateurService();
          int idUser = us.getIdbymail(email);
          utilisateur u;
          u=new utilisateur(cin,emailUser,password,nom,prenom,telephone,adresse);
          us.modifierMyCompte(u, idUser);
          
            TrayNotification tray = new TrayNotification();
             AnimationType type = AnimationType.POPUP;
             tray.setAnimationType(type);
             tray.setTitle("Modification User");
             tray.setMessage("User Modifiée");
             tray.setNotificationType(NotificationType.SUCCESS);
             tray.showAndDismiss(Duration.millis(3000));
             
             FXMLLoader loader = new FXMLLoader(getClass().getResource("inscriptionsChoice.fxml"));
        
        Parent root;
        root = loader.load();
        InscriptionsChoiceController LCC = loader.getController();
        candidatCIN.getScene().setRoot(root);
                      
    }

    @FXML
    private void retourInscriptionChoice(ActionEvent event) {
    }

    @FXML
    private void candidatSexe(ActionEvent event) {
        
    }

    @FXML
    private void candidatEtat(ActionEvent event) {
    }

    @FXML
    private void candidatDomaine(ActionEvent event) {
    }

    
}
