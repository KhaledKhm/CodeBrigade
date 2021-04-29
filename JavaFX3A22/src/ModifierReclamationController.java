/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Edu.esprit.entities.Reclamation;
import static Edu.esprit.gui.AjouterReclamationController.createCaptchaValue;
import Edu.esprit.services.ReclamationService;
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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import org.controlsfx.control.Rating ;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;


/**
 * FXML Controller class
 *
 * @author Fayechi
 */
public class ModifierReclamationController implements Initializable {

   
    @FXML
    private TextField txtid;
    private Button btnajout;
    @FXML
    private TextField captchatxt;
    @FXML
    private Button btncaptcha;
    @FXML
    private TextField Enter;
    @FXML
    private TextField commentaire;
    @FXML
    private ComboBox propos;
    @FXML
    private ComboBox intensite;
    @FXML
    private Button pgajt1;
    @FXML
    private Button takeaffich1;
    @FXML
    private Button ajrec1;
    @FXML
    private Button affrec1;
    @FXML
    private Button btncancel;
    @FXML
    private Button Modifier;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list = FXCollections.observableArrayList("Evenement","Formation","Cv","Promotion","Offre","Rendez-Vous");
        propos.setItems(list);
        ObservableList<String> list2 = FXCollections.observableArrayList("Grave","Moyenne","Legere");
        intensite.setItems(list2);
    }    

    public void setdata(int id){
    
        ReclamationService a=new ReclamationService();
        Reclamation aa= new Reclamation(); 
        aa=a.readbyId(id);
       // propos.set(aa.getSujet());  
       // intensite.setValue(aa.getIntensite());
       // commentaire.setText(aa.getCommentaire());
      // txtid.setText(Integer.toString(aa.getId()));
    }
    
  
    @FXML
    private void cancelon(ActionEvent event) {
        System.out.println("testcancel");
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("Reclamation.fxml"));
            Parent root = loader.load();
            
            Modifier.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    @FXML
    private void modifieron(ActionEvent event) {
        System.out.println("testinside");
         try {
             
             String n = commentaire.getText();
             String c2 = captchatxt.getText();
             String captcha = Enter.getText();
             
             
             if(n=="")
                    {Alert alert = new Alert(Alert.AlertType.WARNING);
                        alert.setTitle("Aucune Commentaire");
                        alert.setHeaderText(null);
                        alert.setContentText("Inserer une Commentaire");
                        alert.showAndWait();
                    }
            else
            {
                if("".equals(c2))
                {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
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
            System.out.println("Test3");
            ReclamationService ps = new ReclamationService();
            System.out.println("Test4");
            ps.modifier(1,p);
            System.out.println("Test5");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Reclamation.fxml"));
            Parent root = loader.load();
            
            
            propos.getScene().setRoot(root);
            
            
            
            Notifications notificationBuilder = Notifications.create()
                    .title("Reclamation")
                    .text("Modification Reussite")
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
                        Alert alert = new Alert(Alert.AlertType.WARNING);
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
    private void generate(ActionEvent event) {
         String c = createCaptchaValue();
        System.out.println(c);
         captchatxt.setText(c);
    }

    @FXML
    private void Selecti(ActionEvent event) {
    }

    @FXML
    private void Selectii(ActionEvent event) {
    }

    @FXML
    private void takeajt(ActionEvent event) {
         try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AjouterAvis.fxml"));
            Parent root = loader.load();
            
            Modifier.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void takeaff(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherAvis.fxml"));
            Parent root = loader.load();
            
           Modifier.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void ajrecon(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AjouterReclamation.fxml"));
            Parent root = loader.load();
            
            Modifier.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void affrecon(ActionEvent event) {
         try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("Reclamation.fxml"));
            Parent root = loader.load();
            
            Modifier.getScene().setRoot(root);
            
            
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
    
    
    
}
