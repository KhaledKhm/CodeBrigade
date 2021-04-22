/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import services.utilisateurService;


/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class LoginController implements Initializable {

    @FXML
    private Button inscrire;
    
    @FXML
    private Button forgottonPass;
    
    public static String email;
    public static String motpass;
    
    public static boolean isValidEmailAddress(String email) {
       
        return true;
    }
    
    
    
 

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
        email = utilisateurEmail.getText();
        motpass = utilisateurPassword.getText();
        utilisateurService sc = new utilisateurService();
        if (sc.login(email, motpass)) {
            String role = sc.getRolebyId(sc.getIdbymail(email));

            switch (role) {
                case "ROLE_Formateur":
                    {
                        FXMLLoader loader = new FXMLLoader();
                        labelStatus.getScene().getWindow().hide();
                        Stage prStage = new Stage();
                        loader.setLocation(getClass().getResource("../views/ajouterBlog.fxml"));
                        Parent root = loader.load();
                        Scene scene = new Scene(root);
                        prStage.setScene(scene);
                        prStage.setResizable(false);
                        prStage.show();
                        break;
                    }
                case "ROLE_Candidat":
                    {
                        FXMLLoader loader = new FXMLLoader();
                        labelStatus.getScene().getWindow().hide();
                        Stage prStage = new Stage();
                        loader.setLocation(getClass().getResource("../views/ajouterBlog.fxml"));
                        Parent root = loader.load();
                        Scene scene = new Scene(root);
                        prStage.setScene(scene);
                        prStage.setResizable(false);
                        prStage.show();
                        break;
                    }
                case "ROLE_Entreprise":
                    {
                        FXMLLoader loader = new FXMLLoader();
                        labelStatus.getScene().getWindow().hide();
                        Stage prStage = new Stage();
                        loader.setLocation(getClass().getResource("../views/ajouterBlog.fxml"));
                        Parent root = loader.load();
                        Scene scene = new Scene(root);
                        prStage.setScene(scene);
                        prStage.setResizable(false);
                        prStage.show();
                        break;
                    }
                case "ROLE_Admin":
                    {
                        FXMLLoader loader = new FXMLLoader();
                        labelStatus.getScene().getWindow().hide();
                        Stage prStage = new Stage();
                        loader.setLocation(getClass().getResource("../views/Dashboard.fxml"));
                        Parent root = loader.load();
                        Scene scene = new Scene(root);
                        prStage.setScene(scene);
                        prStage.setResizable(false);
                        prStage.show();
                        break;
                    }
                default:
                    break;
            }
        }  else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alerte");
            alert.setHeaderText(null);
            alert.setContentText("Verifier votre Coordonnees!");
            alert.showAndWait();
        }
 
        
    }
    
    @FXML
    public void Inscrire(ActionEvent event) {
        try{
      // Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/inscriptionsChoice.fxml"));
        
        Parent root;
        root = loader.load();
        InscriptionsChoiceController icc = loader.getController();
        labelStatus.getScene().setRoot(root);
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void forgottonPass(ActionEvent event) {
    }
}
