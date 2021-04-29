/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import java.lang.String ;
import Edu.esprit.entities.Avis;
import Edu.esprit.entities.Reclamation;
import Edu.esprit.services.AvisService;
import Edu.esprit.services.ReclamationService;
//import static com.sun.tools.attach.VirtualMachine.list;
//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
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
import javafx.scene.control.ComboBox;
import java.lang.Object;
import static java.util.Collections.list;
import java.util.Random;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
import org.controlsfx.control.Rating ;
import javax.management.Notification;
import org.controlsfx.control.action.Action;
import java.net.URL;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import static java.util.Collections.list;
import javafx.collections.ListChangeListener;
import javafx.scene.input.MouseEvent;
//import static jdk.internal.org.jline.utils.Colors.s;
//import static jdk.javadoc.internal.doclets.toolkit.util.DocFile.list;
import org.controlsfx.control.CheckComboBox;

import javafx.collections.ObservableList;

/**
 * FXML Controller class
 *
 * @author Fayechi
 */
public class AjouterReclamationController implements Initializable {

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
    private ComboBox propos;
    @FXML
    private TextField commentaire;
    @FXML
    private ComboBox intensite;
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list = FXCollections.observableArrayList("Evenement","Formation","Cv","Promotion","Offre","Rendez-Vous");
        propos.setItems(list);
        ObservableList<String> list2 = FXCollections.observableArrayList("Grave","Moyenne","Legere");
        intensite.setItems(list2);
    }
    
    @FXML
    private void takeaff(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherAvis.fxml"));
            Parent root = loader.load();
            
          commentaire.getScene().setRoot(root);
            
            
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
        return (String) captchaStrBuffer.toString();
    }

    @FXML
    private void ajrec(ActionEvent event) {
         try {
             
             String n = commentaire.getText();
             String c2 = captchatxt.getText();
             String captcha = Enter.getText();
             
             
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
                 System.out.println("Test");
            String s = (String) propos.getSelectionModel().getSelectedItem().toString();
            String s2 = (String) intensite.getSelectionModel().getSelectedItem().toString(); 
            String s3 = (String) commentaire.getText();
            System.out.println("Test2");
             Reclamation p = new Reclamation(s,s2,s3);
            
            
            
            ReclamationService ps = new ReclamationService();
            ps.ajouterReclamation(p);
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Reclamation.fxml"));
            Parent root = loader.load();
            
            
            commentaire.getScene().setRoot(root);
            
            
            
            Notifications notificationBuilder = Notifications.create()
                    .title("Reclamation")
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

  

    @FXML
    private void Selecti(ActionEvent event) {
    }

    @FXML
    private void Selectii(ActionEvent event) {
    }

    @FXML
    private void ajrecon(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AjouterReclamation.fxml"));
            Parent root = loader.load();
            
            btnajout.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void affrecon(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("Reclamation.fxml"));
            Parent root = loader.load();
            
            btnajout.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void takeajt(ActionEvent event) {
         try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AjouterAvis.fxml"));
            Parent root = loader.load();
            
           btnajout.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    
}
