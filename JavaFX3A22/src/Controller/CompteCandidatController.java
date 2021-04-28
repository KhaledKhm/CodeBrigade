/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class CompteCandidatController implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private VBox chosenFruitCard;
    @FXML
    private Button modifierCompteCandidat;
    @FXML
    private Button retourPass;
    @FXML
    private ScrollPane scroll;
    @FXML
    private Label labelPassword;
    @FXML
    private TextField password;
    @FXML
    private Label labelConfirm;
    @FXML
    private TextField confirmpassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void modifierCompteCandidat(ActionEvent event) {
        
    }

    @FXML
    private void retourPass(ActionEvent event) {
    }
    
}
