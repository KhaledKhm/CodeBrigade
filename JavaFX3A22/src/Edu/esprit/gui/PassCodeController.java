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
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import Edu.esprit.services.utilisateurService;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class PassCodeController implements Initializable {

    @FXML
    private Button confirmCode;
    @FXML
    private TextField codePass;
    
    public int code;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmCode(ActionEvent event) throws IOException {
        FXMLLoader loader1 = new FXMLLoader();
          
            LoginController ircc = loader1.getController();

            code = ircc.codem;
          int codex = Integer.parseInt(codePass.getText());
        utilisateurService sc = new utilisateurService();
      //  String x="x";
        if (codePass.getText().isEmpty())
        {Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alerte");
            alert.setHeaderText(null);
            alert.setContentText("!!!Veuillez taper le code de Verification !!!");
            alert.showAndWait();
        }
        
        else if (code == codex) {
            
                FXMLLoader loader = new FXMLLoader(getClass().getResource("forgottenpass.fxml"));
        
        Parent root;
        root = loader.load();
        ForgottenpassController LC = loader.getController();
        confirmCode.getScene().setRoot(root);
            
          /*  FXMLLoader loader = new FXMLLoader();
            codePass.getScene().getWindow().hide();
            Stage prStage = new Stage();
            loader.setLocation(getClass().getResource("../views/forgottenpass.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            prStage.setScene(scene);
            prStage.setResizable(false);
            prStage.show();*/
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alerte");
            alert.setHeaderText(null);
            alert.setContentText("!!! Code incorrecte !!!");
            alert.showAndWait();
    }
    }
    
}
