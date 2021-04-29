/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import Edu.esprit.entities.*;
import static Edu.esprit.gui.LoginController.email;
import Edu.esprit.services.blogService;
import Edu.esprit.services.utilisateurService;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class AfficherAllUsersController implements Initializable {

    @FXML
    private Button logout;
    @FXML
    private Label labelTestImmatricule;
    @FXML
    private Label labelTestEmail;
    @FXML
    private TableView<utilisateur> table_allusers;
    @FXML
    private TableColumn<?, ?> col_user_id;
    @FXML
    private TableColumn<?, ?> col_user_email;
    @FXML
    private TableColumn<?, ?> col_user_role;
    @FXML
    private TableColumn<?, ?> col_user_status;
    @FXML
    private TextField searchtfusers;
    @FXML
    private Button home;
    @FXML
    private Button ban;
    @FXML
    private Button unban;
    @FXML
    private Button supprimerUser;
    @FXML
    private TextField suppemail;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        afficherAllUsers();
    }    

     public void afficherAllUsers(){
        /*utilisateurService sc = new utilisateurService();
        int idUser = sc.getIdbymail(email);*/
        utilisateurService bg=new utilisateurService();
        utilisateur utilisateurs=new utilisateur();
        List<utilisateur> utilisateurss = bg.afficherAllUtilisateurs();

        col_user_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_user_email.setCellValueFactory(new PropertyValueFactory<>("email"));
        col_user_role.setCellValueFactory(new PropertyValueFactory<>("role"));
        col_user_status.setCellValueFactory(new PropertyValueFactory<>("account_status"));
       
        
    
        table_allusers.setItems((ObservableList<utilisateur>) utilisateurss);

        //recherche
         ObservableList<utilisateur> utilisateurList=bg.afficherAllUtilisateurs();
        FilteredList<utilisateur> filteredData = new FilteredList<>( utilisateurList, b -> true);
        searchtfusers.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(utilisateur -> {
		
		if (newValue == null || newValue.isEmpty()) return true;
		String lowerCaseFilter = newValue.toLowerCase();
		if (String.valueOf(utilisateur.getId()).toLowerCase().contains(lowerCaseFilter) ) return true;
		else if (utilisateur.getEmail().contains(lowerCaseFilter)) return true;
                else if (utilisateur.getRole().contains(lowerCaseFilter))return true;
                else if (utilisateur.getAccount_status().contains(lowerCaseFilter))return true;           
		else return false;
                                // Does not match.
			});
		});
		
	SortedList<utilisateur> sortedData = new SortedList<>(filteredData);
	sortedData.comparatorProperty().bind( table_allusers.comparatorProperty());
	table_allusers.setItems(sortedData);
    }
    
    
    @FXML
    private void logout(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        
          Parent root;
          root = loader.load();
          LoginController LCC = loader.getController();
          suppemail.getScene().setRoot(root);
    }

    @FXML
    private void click(MouseEvent event) {
        utilisateur e = table_allusers.getItems().get(table_allusers.getSelectionModel().getSelectedIndex());
        suppemail.setText(e.getEmail());     
    }


    @FXML
    private void home(ActionEvent event) {
    }

    @FXML
    private void ban(ActionEvent event) {
    }

    @FXML
    private void unban(ActionEvent event) {
    }

    @FXML
    private void supprimerUser(ActionEvent event) {
        String emailsup= (String) suppemail.getText();
        utilisateurService es=new utilisateurService();
        int idUtilisateur=es.getIdbymail(emailsup);
        es.supprimerUtilisateur(idUtilisateur);
        //alerte de suppression
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Gestion des utilisateur");
        alert.setHeaderText(null);
        alert.setContentText("Utilisateur Supprimé");
        alert.showAndWait();
        //notification
        TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Suppression Evaluation");
        tray.setMessage("Evaluation Supprimée");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
        afficherAllUsers(); 
    }
    
}
