/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import Edu.esprit.entities.Avis;
import javafx.collections.FXCollections;
import Edu.esprit.services.AvisService;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Duration;
//import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author Fayechi
 */
public class AfficherAvisController implements Initializable {

    @FXML
    private TableView<Avis> table;
    
    @FXML
    private TableColumn<Avis,Integer> id;
    
    @FXML
    private TableColumn<Avis,String> commentaire;
    
    @FXML
    private TableColumn<Avis,Integer> etoiles;
    
    @FXML
    private Button modifier ; 
    
    @FXML
    private Button pgajt ; 
    
    @FXML
    private Button supprimer ;
    @FXML
    private Button ajrec;
    @FXML
    private Button affrec;
    @FXML
    private Button takeaffich;

    /**
     * Initializes the controller class.
     */
            
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       setTxtafficher();
    }    

    public void setTxtafficher() {
        AvisService es=new AvisService();
        ObservableList<Avis> Avis= FXCollections.observableArrayList();
        Avis = es.afficherAvis();
        System.out.println(Avis.get(0).toString());
        commentaire.setCellValueFactory(new PropertyValueFactory<Avis,String>("commentaire"));
        etoiles.setCellValueFactory(new PropertyValueFactory<Avis,Integer>("etoiles"));
        
        table.setItems((ObservableList<Avis>) Avis);
    }
    
    
    @FXML
    private void takeajt(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AjouterAvis.fxml"));
            Parent root = loader.load();
            
            modifier.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    
    @FXML
    public void modifieron() throws IOException{
        Avis selectedItem = table.getSelectionModel().getSelectedItem();
        if(selectedItem!=null){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setContentText("Etes vous sure de modifier cette element ?");   
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("ModifierAvis.fxml"));
                    Parent root = loader.load();
                    ModifierAvisController ap = loader.getController();
            
                    ap.setdata(selectedItem.getId());
            
                    modifier.getScene().setRoot(root);
                    
                   
            
                    
                                    }
        
        }
        else {
        
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Veuillez sélectionner un element à modifier.");

        alert.showAndWait();
        }
        
      
    }
    
    
    @FXML
    public void supprimeron() throws IOException{
    Avis selectedItem = table.getSelectionModel().getSelectedItem();
        if(selectedItem!=null){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setContentText("Etes vous sure de supprimer cette element ?");   
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
        AvisService ps = new AvisService() ; 
        table.getItems().remove(selectedItem);
        ps.supprimerAvis(selectedItem);
        }
        
        }
        else {
        
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Veuillez sélectionner un element à supprimer.");

        alert.showAndWait();
        }
    }

    @FXML
    private void ajrecon(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AjouterReclamation.fxml"));
            Parent root = loader.load();
            
            modifier.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void affrecon(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("Reclamation.fxml"));
            Parent root = loader.load();
            
            modifier.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void takeaff(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherAvis.fxml"));
            Parent root = loader.load();
            
            modifier.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
