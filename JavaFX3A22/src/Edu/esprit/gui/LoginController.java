/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import com.sun.istack.internal.Nullable;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import Edu.esprit.services.utilisateurService;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

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
    public static int codem;
    
    public static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
        
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
        motpass = sc.MD5(motpass);
                   String status;
if(sc.getRolebyId(sc.getIdbymail(email)).toString() == "NULL")
{
    status = "Banned";
}
else
{
    status = "";
}
        //System.out.println(status);
      //  System.out.println(motpass);
        if (sc.login(email, motpass)) {
            String role = sc.getRolebyId(sc.getIdbymail(email));
         
            //String status = sc.getStatusbyID(sc.getIdbymail(email));
            
 
            
          /*  if (status.equals("Banned")){
                  /* try{
    
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/bannedAccount.fxml"));
        
        Parent root;
        root = loader.load();
        BannedAccountController bac = loader.getController();
        labelStatus.getScene().setRoot(root);
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }*/
              /*    Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("BANNED");
            alert.setHeaderText(null);
            alert.setContentText("!!! Your account is banned! !!!");
            alert.showAndWait();
            }*/

            if(role.equals("ROLE_Formateur"))
                    { if (status.equals("Banned")){
                     Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("BANNED");
            alert.setHeaderText(null);
            alert.setContentText("!!! Your account is banned! !!!");
            alert.showAndWait();
            
                    }else if (status.isEmpty()){
                        FXMLLoader loader = new FXMLLoader();
                        labelStatus.getScene().getWindow().hide();
                        Stage prStage = new Stage();
                        loader.setLocation(getClass().getResource("ajouterBlog.fxml"));
                        Parent root = loader.load();
                        Scene scene = new Scene(root);
                        prStage.setScene(scene);
                        prStage.setResizable(false);
                        prStage.show();
                        
                        TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Login effectue");
        tray.setMessage("Bonjour Formateur");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
                    } 
                    } 
            else if(role.equals("ROLE_Candidat"))
                    { 
                         if (status.equals("Banned")){
                     Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("BANNED");
            alert.setHeaderText(null);
            alert.setContentText("!!! Your account is banned! !!!");
            alert.showAndWait();
            
                    }else if (status.isEmpty()){
                        FXMLLoader loader = new FXMLLoader();
                        labelStatus.getScene().getWindow().hide();
                        Stage prStage = new Stage();
                        loader.setLocation(getClass().getResource("ajouterBlog.fxml"));
                        Parent root = loader.load();
                        Scene scene = new Scene(root);
                        prStage.setScene(scene);
                        prStage.setResizable(false);
                        prStage.show();
                        
                          TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Login effectue");
        tray.setMessage("Bonjour Candidat");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
                    }  
                    }
               else if(role.equals("ROLE_Entreprise"))
                    { if (status.equals("Banned")){
                     Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("BANNED");
            alert.setHeaderText(null);
            alert.setContentText("!!! Your account is banned! !!!");
            alert.showAndWait();
            
                    }else if (status.isEmpty()){
                        FXMLLoader loader = new FXMLLoader();
                        labelStatus.getScene().getWindow().hide();
                        Stage prStage = new Stage();
                        loader.setLocation(getClass().getResource("ajouterBlog.fxml"));
                        Parent root = loader.load();
                        Scene scene = new Scene(root);
                        prStage.setScene(scene);
                        prStage.setResizable(false);
                        prStage.show();
                        
                          TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Login effectue");
        tray.setMessage("Bonjour Entreprise");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
                    }   
                    }
               else if(role.equals("ROLE_Admin"))
                    { if (status.equals("Banned")){
                     Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("BANNED");
            alert.setHeaderText(null);
            alert.setContentText("!!! Your account is banned! !!!");
            alert.showAndWait();
            
                    }else if (status.isEmpty()){
                        FXMLLoader loader = new FXMLLoader();
                        labelStatus.getScene().getWindow().hide();
                        Stage prStage = new Stage();
                        loader.setLocation(getClass().getResource("Dashboard.fxml"));
                        Parent root = loader.load();
                        Scene scene = new Scene(root);
                        prStage.setScene(scene);
                        prStage.setResizable(false);
                        prStage.show();
                        
                          TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Login effectue");
        tray.setMessage("Bonjour Admin");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
                    }   
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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("inscriptionsChoice.fxml"));
        
        Parent root;
        root = loader.load();
        InscriptionsChoiceController icc = loader.getController();
        labelStatus.getScene().setRoot(root);
  
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void forgottonPass(ActionEvent event) throws MessagingException, IOException{
         email = utilisateurEmail.getText();
        utilisateurService sc = new utilisateurService();
   		
        Random r = new Random ();
      codem =r.nextInt(9999-1000+1);
 
                System.out.println(codem);
                //sc.setCodepass(sc.getIdbymail(t1.getText()), codem);

        //System.out.println(sc.getPassbyId(sc.getIdbymail(t1.getText())));
        if(isValidEmailAddress(utilisateurEmail.getText())){
   //     SendMail.send(t1.getText(), sc.getPassbyId(sc.getIdbymail(t1.getText())));
   
    Properties properties = new Properties();

        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.port","587");

        String MyAccountEmail= "houssem.ouerdiane@esprit.tn"; 
        String Password= "fallout3";

        Session session;
        session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(MyAccountEmail,Password);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(MyAccountEmail));
        message.setRecipient(Message.RecipientType.TO,new InternetAddress("khmthe@gmail.com")); // to be changed aa ey 
        message.setSubject("new password");
        message.setText("Monsieur/Madame, Votre code est "+codem); //to be changed 

        Transport.send(message);
   
   
 
          FXMLLoader loader = new FXMLLoader(getClass().getResource("passCode.fxml"));
        
        Parent root;
        root = loader.load();
        PassCodeController pcc = loader.getController();
        labelStatus.getScene().setRoot(root);}
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alerte");
            alert.setHeaderText(null);
            alert.setContentText("!!! Adresse Email Non Valide !!!");
            alert.showAndWait();
        }
    }
}
