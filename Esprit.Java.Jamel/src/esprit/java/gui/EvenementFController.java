/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.gui;

import esprit.java.entities.Evenement;
import esprit.java.entities.Participation_Evenement;
import esprit.java.services.Participation_EvenementService;
import esprit.java.services.ServiceEvenement;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import java.awt.Insets;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

/**
 * FXML Controller class
 *
 * @author 21652
 */
public class EvenementFController implements Initializable {
    
 
    @FXML
    private AnchorPane rootPane;
    @FXML
    private VBox chosenFormationCard;
    @FXML
    private Label FormationNameLable;
    @FXML
    private Label FormationPriceLabel;
    @FXML
    private ImageView FormationImg;
    @FXML
    private Button participer;
    @FXML
    private Button gotoList;
    @FXML
    private Button GoTo;
    @FXML
    private ScrollPane scroll;
    @FXML
    private GridPane grid;
    
String id="17";
 @FXML
    private ComboBox tf_evalF;
    @FXML
    private TextField tf_email_evenement;
    /**
     * Initializes the controller class.
     */
      @Override                                                                      
      public void initialize(URL url, ResourceBundle rb) {
        //grid
        int i,c=0,r=1;
        
        ServiceEvenement es=new ServiceEvenement(); 
           List<String> ids=es.afficherID();
        tf_evalF.setItems((ObservableList<String>)ids);  
        List<Evenement> evenement=es.afficherIDP(id);
        for (Evenement e:evenement)
        {
            try {
                
                FXMLLoader loader = new FXMLLoader(getClass().getResource("k.fxml"));
                AnchorPane anchorpane =loader.load();
                KController sc = loader.getController();
                sc.setStuff(String.valueOf(e.getId()),e.getLibelle(), e.getDescription());
                if (c==3)
                {
                    c=0;
                    r++;
                }
                grid.add(anchorpane, c++, r);
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                //grid.setMargin(anchorpane, new Insets(10));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }    
 
       
      
    @FXML
    private void participer(ActionEvent event) {
        Participation_EvenementService t= new Participation_EvenementService();
         String idevent =(String) tf_evalF.getSelectionModel().getSelectedItem();
        int id = t.afficherIDEvenement2(idevent);
        
       String email = tf_email_evenement.getText();
        
        
          // l alert
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Participation a un Evenement Ajoutée");
        alert.showAndWait();
          Participation_Evenement p = new Participation_Evenement(id,15,email);
        t.ajouterParticipation(p);
                   //Notification
  TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Participation Evenement ");
        tray.setMessage("participation evenement ajouté avec succès");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
        
    }


    @FXML
    private void gotoListOn(ActionEvent event) {
    }

    @FXML
    private void GoToOn(ActionEvent event) {
    }

    @FXML
    private void change(ActionEvent event) {
    }
    
}
