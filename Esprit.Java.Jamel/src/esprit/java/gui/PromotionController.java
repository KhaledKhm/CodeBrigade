/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.gui;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import esprit.java.entities.Evenement;
import esprit.java.services.ServiceEvenement;
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
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import esprit.java.entities.Evenement;
import esprit.java.entities.Promotion;
import esprit.java.services.ServicePromotion;
import esprit.java.services.ServiceEvenement;
import java.net.URL;
import java.sql.SQLException;
import static java.util.Collections.list;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author 21652
 */
public class PromotionController implements Initializable {

    @FXML
    private TableView<Promotion> table_promotion;
    @FXML
    private TableColumn<Promotion, Integer> col_id_entt;
    @FXML
    private TableColumn<Promotion, String> col_libelle_entt;
    @FXML
    private TableColumn<Promotion, Integer> col_PoucentageReduction_ent;
    @FXML
    private TableColumn<Promotion, Integer> col_id_evenement_ent;
    @FXML
    private TextField filterField;
    @FXML
    private TextField tf_ajout_libelle_promotion;
    @FXML
    private TextField tf_ajout_PoucentageReduction_promotion;
    @FXML
    private TextField tf_ajout_id_evenement_promotion;
    @FXML
    private TextField tf_modif_libelle_promotion;
    @FXML
    private TextField tf_modif_PoucentageReduction_promotion;
    @FXML
    private TextField tf_modif_id_evenement_promotion;
    @FXML
    private TextField tf_modif_id_promotion;

    /**
     * Initializes the controller class.
     */
    ObservableList<Promotion> observableList;
    @FXML
    private Button page_evenements;
    @FXML
    private Button btn_modif_promotion;
    @FXML
    private AnchorPane SmallPane;
    @FXML
    private Button btn_supp_promotion;
    @FXML
    private Button btn_ajout_promotion;

    
      @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Rebelottee();
        } catch (SQLException ex) {
            Logger.getLogger(PromotionController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     public void Rebelottee() throws SQLException {
        //affichage tableau
        ServicePromotion es = new ServicePromotion();
        List<Promotion> list = es.afficherPromotions();

        col_id_entt.setCellValueFactory(new PropertyValueFactory<Promotion, Integer>("id"));
        col_libelle_entt.setCellValueFactory(new PropertyValueFactory<Promotion, String>("libelle"));
        col_PoucentageReduction_ent.setCellValueFactory(new PropertyValueFactory<Promotion, Integer>("PoucentageReduction"));
        col_id_evenement_ent.setCellValueFactory(new PropertyValueFactory<Promotion, Integer>("id_evenement"));
        
   
        ObservableList<Promotion> observableList = FXCollections.observableArrayList(list);
       table_promotion.setItems(observableList);

    }

    @FXML
    private void ajouterPromotion(ActionEvent event) throws MessagingException, SQLException {
        //ajout
        String libelle = tf_ajout_libelle_promotion.getText();
        String PoucentageReduction = tf_ajout_PoucentageReduction_promotion.getText();
        String id_evenement = tf_ajout_id_evenement_promotion.getText();
       

        Promotion p = new Promotion(libelle, parseInt(PoucentageReduction), parseInt(id_evenement));
        ServicePromotion es = new ServicePromotion();

        //controle de saisie
        if (tf_ajout_libelle_promotion.getText().length()==0 ) {
          tf_ajout_libelle_promotion.setStyle(" -fx-border-color: red ; -fx-border-width: 2px ;");
          new animatefx.animation.Shake(tf_ajout_libelle_promotion).play();  
        }
       else 
           tf_ajout_libelle_promotion.setStyle(null);
        
                   
        if (tf_ajout_PoucentageReduction_promotion.getText().toString().length()==0 ) {
          tf_ajout_PoucentageReduction_promotion.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");
          new animatefx.animation.Shake(tf_ajout_PoucentageReduction_promotion).play();
        }
        else 
           tf_ajout_PoucentageReduction_promotion.setStyle(null);
        
          //controle de saisie
        boolean cond = true;
        if (tf_ajout_libelle_promotion.getText().isEmpty() | tf_ajout_PoucentageReduction_promotion.getText().toString().isEmpty() ) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Vérifiez vos Champs!");
            alert.showAndWait();
            cond = false;
        }
        if (cond == true) {
            es.ajouterPromotion(p);

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Nouveau Mise a Jour dans la base de données!");
            alert.setHeaderText(null);
            alert.setContentText("Promotion Ajoutée");
            alert.showAndWait();
            //refresh
            Rebelottee();
        }
    }

    @FXML
    private void modifierPromotion(ActionEvent event) throws SQLException {
   //ajout
        String id = (String) tf_modif_id_promotion.getText();
        String libelle = tf_modif_libelle_promotion.getText();
        String PoucentageReduction = tf_modif_PoucentageReduction_promotion.getText();
        String id_evenement = tf_modif_id_evenement_promotion.getText();
      

        Promotion p = new Promotion(parseInt(id), libelle,  parseInt(PoucentageReduction), parseInt(id_evenement));
        ServicePromotion es = new ServicePromotion();

        //controle de saisie
        boolean cond = true;
        if (tf_modif_libelle_promotion.getText().isEmpty() | tf_modif_PoucentageReduction_promotion.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Vérifiez vos Champs!");
            alert.showAndWait();
            cond = false;
        }
        if (cond == true) {
            es.modifierPromotion(p);
            //alerte de modification
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Nouveau Mise a Jour dans la base de données!");
            alert.setHeaderText(null);
            alert.setContentText("Promotion Modifiée");
            alert.showAndWait();
            //refresh
            Rebelottee();
        }
    }

    
    @FXML
    private void supprimerPromotion(ActionEvent event) throws SQLException {
        //suppression

        ServicePromotion tt = new ServicePromotion();
        tt.supprimerPromotion(table_promotion.getSelectionModel().getSelectedItem().getId());
        //alerte de suppression
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Promotion Supprimée");
        alert.showAndWait();
        //refresh
        Rebelottee();
    }
    
    
    @FXML
    private void mouseClickedd(MouseEvent event) {
    Promotion selected = table_promotion.getSelectionModel().getSelectedItem();
     tf_modif_id_promotion.setText(selected.getId() + "");
    tf_modif_libelle_promotion.setText(selected.getLibelle());
    tf_modif_PoucentageReduction_promotion.setText(selected.getPoucentageReduction()+ "");
    tf_modif_id_evenement_promotion.setText(selected.getId_evenement() + "");
    
    }
    
    
    @FXML
    private void filterFieldActionn(KeyEvent event) throws SQLException {
        
        ServicePromotion SE = new ServicePromotion();
        List<Promotion> promotions = SE.afficherPromotions();
        List<Promotion> filteredpromotions = new ArrayList<>();
        if (!filterField.getText().isEmpty()) {
            filteredpromotions = promotions.stream()
                    
                    .filter(p -> p.getLibelle().startsWith(filterField.getText()))
                
                    .collect(Collectors.toList());
        } else {
            filteredpromotions = promotions;
        }
       observableList.clear();

        col_id_entt.setCellValueFactory(new PropertyValueFactory<Promotion, Integer>("id"));
        col_libelle_entt.setCellValueFactory(new PropertyValueFactory<Promotion, String>("libelle"));
        col_PoucentageReduction_ent.setCellValueFactory(new PropertyValueFactory<Promotion, Integer>("PoucentageReduction"));
        col_id_evenement_ent.setCellValueFactory(new PropertyValueFactory<Promotion, Integer>("id_evenement"));
      
       observableList = FXCollections.observableArrayList(filteredpromotions);
       table_promotion.setItems(observableList);

    }

    @FXML
    private void pageEvenements(ActionEvent event) {
           try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Evenement.fxml"));
            Parent root = loader.load();
            EvenementController ec = loader.getController();
            page_evenements.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

   
}
