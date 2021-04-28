/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;


import Edu.esprit.entities.Avis;
import Edu.esprit.entities.Reclamation;
import Edu.esprit.services.AvisService;
import javafx.collections.FXCollections;
import Edu.esprit.services.ReclamationService;
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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Fayechi
 */
public class AfficherReclamationController implements Initializable {

    @FXML
    private TableView<Reclamation> table;
    
   
    @FXML
    private TableColumn<Reclamation,String> commentaire;
    
    
    private TextField txt;
    
    @FXML
    private Button modifier ; 
    
    @FXML
    private Button pgajt ; 
    
    @FXML
    private Button supprimer ;
    @FXML
    private TableColumn<Reclamation,String> Sujet;
    @FXML
    private TableColumn<Reclamation,String> intensite;
    @FXML
    private Button ajrec;
    @FXML
    private Button takeaffich;
    @FXML
    private Button affrec;

    /**
     * Initializes the controller class.
     */
            
    public void initialize(URL url, ResourceBundle rb) {
       setTxtafficher();
    }    

    public void setTxtafficher() {
        ReclamationService es=new ReclamationService();
        ObservableList<Reclamation> Reclamation= FXCollections.observableArrayList();
        Reclamation = es.afficherReclamation();
        System.out.println(Reclamation.get(0).toString());
      
        commentaire.setCellValueFactory(new PropertyValueFactory<Reclamation,String>("commentaire"));
        intensite.setCellValueFactory(new PropertyValueFactory<Reclamation,String>("intensite"));
        Sujet.setCellValueFactory(new PropertyValueFactory<Reclamation,String>("sujet"));
        
        table.setItems((ObservableList<Reclamation>) Reclamation);
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
        
        Reclamation selectedItem = table.getSelectionModel().getSelectedItem();
        if(selectedItem!=null){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setContentText("Etes vous sure de modifier cette element ?");   
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("ModifierReclamation.fxml"));
                    Parent root = loader.load();
                    ModifierReclamationController ap = loader.getController();
            
                    ap.setdata(selectedItem.getId());
            
                    modifier.getScene().setRoot(root);
                    System.out.println("teeeeeeeeest");
                    
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
    Reclamation selectedItem = table.getSelectionModel().getSelectedItem();
        if(selectedItem!=null){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setContentText("Etes vous sure de supprimer cette element ?");   
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
       ReclamationService ps = new ReclamationService() ; 
        table.getItems().remove(selectedItem);
        ps.supprimerReclamation(selectedItem);
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
    private void takeaff(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherAvis.fxml"));
            Parent root = loader.load();
            
            modifier.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

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
    private void addReclamation(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AjouterReclamation.fxml"));
            Parent root = loader.load();
            
            modifier.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
