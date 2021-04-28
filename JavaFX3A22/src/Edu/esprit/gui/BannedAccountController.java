/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class BannedAccountController implements Initializable {

    @FXML
    private Button returnBanned;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void returnBanned(ActionEvent event) {
        try{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        
        Parent root;
        root = loader.load();
        LoginController LC = loader.getController();
        returnBanned.getScene().setRoot(root);
      //  scene.getStylesheets().add(getClass().getResource("../tools/css/login.css").toExternalForm());
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}