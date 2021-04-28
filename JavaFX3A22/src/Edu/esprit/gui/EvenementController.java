/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import Edu.esprit.entities.Evenement;
import Edu.esprit.entities.Participation_Evenement;
import Edu.esprit.services.ServiceEvenement;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;




/**
 * FXML Controller class
 *
 * @author 21652
 */
public class EvenementController implements Initializable {

    @FXML
    private TableView<Evenement> table_evenement;
    @FXML
    private TableColumn<Evenement, Integer> col_id_ent;
    @FXML
    private TableColumn<Evenement, String> col_libelle_ent;
    @FXML
    private TableColumn<Evenement, String> col_description_ent;
    @FXML
    private TableColumn<Evenement, Integer> col_prixinscription_ent;
    @FXML
    private TableColumn<Evenement, String> col_date_ent;
    @FXML
    private TableColumn<Evenement, String> col_datef_ent;
    @FXML
    private TextField tf_ajout_libelle_evenement;
    @FXML
    private TextField tf_ajout_description_evenement;
    @FXML
    private TextField tf_ajout_Prixinscription_evenement;
    @FXML
    private DatePicker tf_ajout_dated_evenement;
    @FXML
    private DatePicker tf_ajout_datef_evenement;
    @FXML
    private TextField tf_modif_libelle_evenement;
    @FXML
    private TextField tf_modif_description_evenement;
    @FXML
    private TextField tf_modif_Prixinscription_evenement;
    @FXML
    private TextField tf_modif_DateDebut_evenement;
    @FXML
    private TextField tf_modif_Datefin_evenement;
    @FXML
    private TextField tf_modif_id_evenement;
    @FXML
    private TextField filterField;

    ObservableList<Evenement> observableList;
     @FXML
    private Button page_promotions;
    @FXML
    private Button page_Participation_Evenement;
    private Button page_evenements;
    @FXML
    private AnchorPane SmallPane;
    @FXML
    private Button SupAction;
    @FXML
    private Button tn_modif_evenement;
    @FXML
    private Button btn_ajout_evenement;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Rebelotte();
        } catch (SQLException ex) {
            Logger.getLogger(EvenementController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    public void Rebelotte() throws SQLException {
        //affichage tableau
        ServiceEvenement es = new ServiceEvenement();
        List<Evenement> list = es.afficherEvenements();
   
        col_id_ent.setCellValueFactory(new PropertyValueFactory<Evenement, Integer>("id"));
        col_libelle_ent.setCellValueFactory(new PropertyValueFactory<Evenement, String>("libelle"));
        col_description_ent.setCellValueFactory(new PropertyValueFactory<Evenement, String>("description"));
        col_date_ent.setCellValueFactory(new PropertyValueFactory<Evenement, String>("datedebut"));
        col_datef_ent.setCellValueFactory(new PropertyValueFactory<Evenement, String>("datefin"));
        col_prixinscription_ent.setCellValueFactory(new PropertyValueFactory<Evenement, Integer>("PrixInscription"));

      
        observableList = FXCollections.observableArrayList(list);
        table_evenement.setItems(observableList);

      
    }

    @FXML
    private void ajouterEvenement (ActionEvent event) throws MessagingException, SQLException {
        //ajout
        String libelle = tf_ajout_libelle_evenement.getText();
        String description = tf_ajout_description_evenement.getText();
        String Prixinscription = tf_ajout_Prixinscription_evenement.getText();
        LocalDate date = tf_ajout_dated_evenement.getValue();
        LocalDate datee = tf_ajout_datef_evenement.getValue();

        Evenement e = new Evenement(libelle, description, parseInt(Prixinscription), String.valueOf(date), String.valueOf(datee));
        ServiceEvenement es = new ServiceEvenement();

        //controle de saisie
        if (tf_ajout_libelle_evenement.getText().length()==0 ) {
          tf_ajout_libelle_evenement.setStyle(" -fx-border-color: red ; -fx-border-width: 2px ;");
          new animatefx.animation.Shake(tf_ajout_libelle_evenement).play();  
        }
       else 
           tf_ajout_libelle_evenement.setStyle(null);
        
                   
        if (tf_ajout_description_evenement.getText().length()==0 ) {
          tf_ajout_description_evenement.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");
          new animatefx.animation.Shake(tf_ajout_description_evenement).play();
        }
        else 
           tf_ajout_description_evenement.setStyle(null);
        
         if (tf_ajout_Prixinscription_evenement.getText().toString().length()==0 ) {
          tf_ajout_Prixinscription_evenement.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");
          new animatefx.animation.Shake(tf_ajout_Prixinscription_evenement).play();
        }
         else 
           tf_ajout_Prixinscription_evenement.setStyle(null);
         
         
          //controle de saisie
        
        boolean cond = true;
        if (tf_ajout_libelle_evenement.getText().isEmpty() | tf_ajout_description_evenement.getText().isEmpty() | tf_ajout_Prixinscription_evenement.getText().toString().isEmpty()) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Vérifiez vos Champs!");
            alert.showAndWait();
            cond = false;
        }
        if (cond == true) {
            es.ajouterEvenement(e);

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Nouveau Mise a Jour dans la base de données!");
            alert.setHeaderText(null);
            alert.setContentText("Evenement Ajoutée");
            alert.showAndWait();
             //Notification
  TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Ajout Evenement");
        tray.setMessage("Evenement Ajoutée");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
            Rebelotte();
        }
    }

    @FXML
    private void modifierEvenement(ActionEvent event) throws SQLException {
        //ajout
        String id = (String) tf_modif_id_evenement.getText();
        String libelle = tf_modif_libelle_evenement.getText();
        String description = tf_modif_description_evenement.getText();
        String Prixinscription = tf_modif_Prixinscription_evenement.getText();
        String date = tf_modif_DateDebut_evenement.getText();
        String datee = tf_modif_Datefin_evenement.getText();

        Evenement e = new Evenement(parseInt(id), libelle, description, parseInt(Prixinscription), String.valueOf(date), String.valueOf(datee));
        ServiceEvenement es = new ServiceEvenement();

        //controle de saisie
        boolean cond = true;
        if (tf_modif_libelle_evenement.getText().isEmpty() | tf_modif_description_evenement.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Vérifiez vos Champs!");
            alert.showAndWait();
            cond = false;
        }
        if (cond == true) {
            es.modifierEvenement(e);
            //alerte de modification
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Nouveau Mise a Jour dans la base de données!");
            alert.setHeaderText(null);
            alert.setContentText("Evenement Modifiée");
            alert.showAndWait();
                      //Notification
  TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Modifier Evenement");
        tray.setMessage("Evenement Modifiée");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
            //refresh
            Rebelotte();
        }
    }

    @FXML
    private void supprimerEvenement(ActionEvent event) throws SQLException {
        //suppression

        ServiceEvenement tt = new ServiceEvenement();
        tt.supprimerEvenement(table_evenement.getSelectionModel().getSelectedItem().getId());
        //alerte de suppression
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Evenement Supprimée1");
        alert.showAndWait();
                 //Notification
  TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Supprimer Evenement");
        tray.setMessage("Evenement supprimeré");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
        //refresh
        Rebelotte();
    }

    @FXML
    private void mouseClicked(MouseEvent event) {
        Evenement selected = table_evenement.getSelectionModel().getSelectedItem();
        tf_modif_id_evenement.setText(selected.getId() + "");
        tf_modif_libelle_evenement.setText(selected.getLibelle());
        tf_modif_description_evenement.setText(selected.getDescription());
        tf_modif_Prixinscription_evenement.setText(selected.getPrixInscription() + "");
        tf_modif_DateDebut_evenement.setText(selected.getDatedebut());
        tf_modif_Datefin_evenement.setText(selected.getDatefin());
    }


    @FXML
    private void filterFieldAction(KeyEvent event) throws SQLException {
        ServiceEvenement SE = new ServiceEvenement();
        List<Evenement> evenements = SE.afficherEvenements();
        List<Evenement> filteredevenements = new ArrayList<>();
        if (!filterField.getText().isEmpty()) {
            filteredevenements = evenements.stream()
                    
                    .filter(e -> e.getLibelle().startsWith(filterField.getText())|| e.getDescription().startsWith(filterField.getText())||e.getDatedebut().startsWith(filterField.getText())||e.getDatefin().startsWith(filterField.getText())||e.getDatefin().startsWith(filterField.getText()))
                    .collect(Collectors.toList());
        } else {
            filteredevenements = evenements;
        }
        observableList.clear();

        col_id_ent.setCellValueFactory(new PropertyValueFactory<Evenement, Integer>("id"));
        col_libelle_ent.setCellValueFactory(new PropertyValueFactory<Evenement, String>("libelle"));
        col_description_ent.setCellValueFactory(new PropertyValueFactory<Evenement, String>("description"));
        col_date_ent.setCellValueFactory(new PropertyValueFactory<Evenement, String>("datedebut"));
        col_datef_ent.setCellValueFactory(new PropertyValueFactory<Evenement, String>("datefin"));
        col_prixinscription_ent.setCellValueFactory(new PropertyValueFactory<Evenement, Integer>("PrixInscription"));

        //col_idParticipant_ent.setCellValueFactory(new PropertyValueFactory<>("idParticipant"));
        observableList = FXCollections.observableArrayList(filteredevenements);
        table_evenement.setItems(observableList);

    }
    

    @FXML
    private void pagePromotions(ActionEvent event) {
          try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Promotion.fxml"));
            Parent root = loader.load();
            PromotionController ec = loader.getController();
            page_promotions.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
     @FXML
    private void pageParticipation_Evenement(ActionEvent event) {
          try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Participation_Evenement.fxml"));
            Parent root = loader.load();
            Participation_EvenementController ec = loader.getController();
            page_Participation_Evenement.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    
    private void AjouterEvent(ActionEvent event) {
           try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Event.fxml"));
            Parent root = loader.load();
            EvenementController ec = loader.getController();
            page_evenements.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
          
    }

    @FXML
    private void PrixInscriptionAction(MouseEvent event) {
    }






}