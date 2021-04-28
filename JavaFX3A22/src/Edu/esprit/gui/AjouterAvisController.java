/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import Edu.esprit.entities.Avis;
import Edu.esprit.services.AvisService;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.lang.Object;
import java.util.Random;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
import org.controlsfx.control.Rating ;
import javax.management.Notification;
import org.controlsfx.control.action.Action;



/**
 * FXML Controller class
 *
 * @author Fayechi
 */
public class AjouterAvisController implements Initializable {

    @FXML
    private TextField txtnom;
    @FXML
    private Rating txtprenom;
    @FXML
    private Button btnajout;
    @FXML
    private Button takeaffich;
    @FXML
    private Button btncaptcha;
    @FXML
    private TextField captchatxt;
    @FXML
    private TextField Enter;
    @FXML
    private Button ajrec;
    @FXML
    private Button affrec;
    @FXML
    private Button pgajt;

    @FXML
    private void generate(ActionEvent event) {
        String c = createCaptchaValue();
            System.out.println(c);
        captchatxt.setText(c);
        
    }
    
    @FXML
    private void takeaff(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherAvis.fxml"));
            Parent root = loader.load();
            
            txtnom.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void ajrecon(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AjouterReclamation.fxml"));
            Parent root = loader.load();
            
            txtnom.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    @FXML
    private void addAvis(ActionEvent event) {
        try {
            
            String n = txtnom.getText();
            String c2 = captchatxt.getText();
            System.out.println(c2);
            String captcha = Enter.getText();
            System.out.println(captcha);
            if(n=="")
                    {Alert alert = new Alert(AlertType.WARNING);
                        alert.setTitle("Aucune Commentaire");
                        alert.setHeaderText(null);
                        alert.setContentText("Inserer une Commentaire");
                        alert.showAndWait();
                    }
            else
            {
                if("".equals(c2))
                {
                    Alert alert = new Alert(AlertType.WARNING);
                        alert.setTitle("Obligation de Captcha");
                        alert.setHeaderText(null);
                        alert.setContentText("Vérifier votre Humanité !");
                        alert.showAndWait();
                }
                else
                {
                
                
            if(c2.equals(captcha))
            {
                System.out.println("condition Verifié !!!");
                
            String nom = txtnom.getText();
            int prenom = (int) txtprenom.getRating();
            Avis p = new Avis(prenom,nom);
            
            
            
            AvisService ps = new AvisService();
            ps.ajouterAvis(p);
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherAvis.fxml"));
            Parent root = loader.load();
            AfficherAvisController ap = loader.getController();
            ap.setTxtafficher();
            txtnom.getScene().setRoot(root);
            
            
            
            Notifications notificationBuilder = Notifications.create()
                    .title("Avis")
                    .text("Ajout Reussit")
                    .graphic(null)
                    .hideAfter(Duration.seconds(5))
                    .position(Pos.CENTER_RIGHT)
                    .onAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){System.out.println("Notification");}
                    });
            notificationBuilder.showConfirm();
            
            
            
            }
            else
                    {
                        System.out.println("captcha 8aaaalta");
                        Alert alert = new Alert(AlertType.WARNING);
                        alert.setTitle("Validate Captcha");
                        alert.setHeaderText(null);
                        alert.setContentText("Verify Captcha");
                        alert.showAndWait();
                    }
                }
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static String createCaptchaValue(){
        Random random = new Random();
        int length = 7 + (Math.abs(random.nextInt())%3);
        StringBuffer captchaStrBuffer = new StringBuffer();
        for (int i=0;i<length;i++)
        {
            int baseCharacterNumber = Math.abs(random.nextInt()) % 62 ;
            int characterNumber = 0 ;
            if(baseCharacterNumber <26)
            {
                characterNumber = 97 + baseCharacterNumber;
            }
            else if(baseCharacterNumber <52)
            {
                characterNumber = 97+ (baseCharacterNumber -26);
            }
            else 
            {
                characterNumber = 97+ (baseCharacterNumber -52 );
            }
            captchaStrBuffer.append((char)characterNumber);
        }
        return captchaStrBuffer.toString();
    }

    @FXML
    private void addReclamation(ActionEvent event) {
        
         try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AjouterReclamation.fxml"));
            Parent root = loader.load();
            
            txtnom.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    @FXML
    private void affrecon(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("Reclamation.fxml"));
            Parent root = loader.load();
            
            txtnom.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void takeajt(ActionEvent event) {
    }
    
    

    
    
}
