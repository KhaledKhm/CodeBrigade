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
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class LoginController implements Initializable {

    @FXML
    private Button inscrire;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private Label labelStatus;
    @FXML
    private TextField utilisateurEmail;
    @FXML
    private TextField utilisateurPassword;
    
    @FXML
    public void Login(ActionEvent event) throws Exception{
 
    }
    
    @FXML
    public void Inscrire(ActionEvent event) {
        try{
      // Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("inscriptionsChoice.fxml"));
        
        Parent root;
        root = loader.load();
        InscriptionsChoiceController icc = loader.getController();
        labelStatus.getScene().setRoot(root);
      //  scene.getStylesheets().add(getClass().getResource("../tools/css/inscriptionchoice.css").toExternalForm());
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
