/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class InscriptionsChoiceController implements Initializable {

    @FXML
    private Button inscrireFormateur;
    @FXML
    private Button inscrireCandidat;
    @FXML
    private Button inscrireEntreprise;
    @FXML
    private Button retourLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private Label labelInscrireEtant;
    
    @FXML
    public void inscrireFormateur(ActionEvent event) {
        
            try{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ajouterFormateur.fxml"));
        
        Parent root;
        root = loader.load();
        AjouterFormateurController AFC = loader.getController();
        labelInscrireEtant.getScene().setRoot(root);
      //  scene.getStylesheets().add(getClass().getResource("../tools/css/ajouterformateur.css").toExternalForm());
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
       
    }
    
    @FXML
    public void inscrireCandidat(ActionEvent event) throws Exception{
       Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("ajouterCandidat.fxml"));
        
        Scene scene = new Scene(root, 600, 400);
        scene.getStylesheets().add(getClass().getResource("../tools/css/ajoutercandidat.css").toExternalForm());
        primaryStage.setTitle("Inscription d'un candidat");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    @FXML
    public void inscrireEntreprise(ActionEvent event) throws Exception{
       Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("ajouterEntreprise.fxml"));
        
        Scene scene = new Scene(root, 600, 400);
        scene.getStylesheets().add(getClass().getResource("../tools/css/ajouterentreprise.css").toExternalForm());
        primaryStage.setTitle("Inscription d'une entreprise");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    @FXML
    public void retourALogin(ActionEvent event) throws Exception{
       Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene scene = new Scene(root, 600, 400);
        scene.getStylesheets().add(getClass().getResource("../tools/css/login.css").toExternalForm());
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
