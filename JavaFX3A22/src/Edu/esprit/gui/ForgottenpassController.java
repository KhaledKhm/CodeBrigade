/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import Edu.esprit.services.utilisateurService;
import static Edu.esprit.gui.LoginController.email;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class ForgottenpassController implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private VBox chosenFruitCard;
    @FXML
    private ScrollPane scroll;
    @FXML
    private Button confirmer;
    @FXML
    private Button retourPass;
    @FXML
    private Label labelPassword;
    @FXML
    private TextField password;
    @FXML
    private Label labelConfirm;
    @FXML
    private TextField confirmpassword;
    
    public static String mail="a";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmerPass(ActionEvent event) throws IOException {
         if(password.getText().isEmpty())
        {  Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alerte");
            alert.setHeaderText(null);
            alert.setContentText("!!! Champs vide !!!");
            alert.showAndWait();
        }
        else
        { String newPass = password.getText();
        utilisateurService sc = new utilisateurService();
        newPass = sc.MD5(newPass);
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Login.fxml"));
        LoginController ircc = loader.getController();
        mail=ircc.email;
        int id = sc.getIdbymail(ircc.email);
       
        sc.setNewMotPass(id, newPass);
        FXMLLoader loaderr = new FXMLLoader();
        password.getScene().getWindow().hide();
        Stage prStage = new Stage();
        loaderr.setLocation(getClass().getResource("Login.fxml"));
        Parent root = loaderr.load();
        Scene scene = new Scene(root);
        prStage.setScene(scene);
        prStage.setResizable(false);

        prStage.show();
        }
    }

    @FXML
    private void retourPass(ActionEvent event) {
    }
    }

  
    

