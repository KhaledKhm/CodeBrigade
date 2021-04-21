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
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TextField txt;
    
    @FXML
    private Button modifier ; 
    
    @FXML
    private Button supprimer ;

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
        id.setCellValueFactory(new PropertyValueFactory<Avis,Integer>("id"));
        commentaire.setCellValueFactory(new PropertyValueFactory<Avis,String>("commentaire"));
        etoiles.setCellValueFactory(new PropertyValueFactory<Avis,Integer>("etoiles"));
        
        table.setItems((ObservableList<Avis>) Avis);
    }
    
    @FXML
    public void modifieron() throws IOException{
       FXMLLoader loader = new FXMLLoader(getClass().getResource("ModifierAvis.fxml"));
            Parent root = loader.load();
            ModifierAvisController ap = loader.getController();
            System.out.println("here");
            ap.setdata(Integer.parseInt(txt.getText()));
            System.out.println("there");
            modifier.getScene().setRoot(root);
    }
    
    
    public void supprimeron() throws IOException{
        AvisService as = new AvisService() ;
        
        as.supprimerAvis(Integer.parseInt(txt.getText()));
       FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherAvis.fxml"));
            Parent root = loader.load();
            supprimer.getScene().setRoot(root);
    }
    
}
