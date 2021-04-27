/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.gui;

import esprit.java.entities.Evenement;
import esprit.java.entities.Participation_Evenement;
import esprit.java.services.Participation_EvenementService;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 * FXML Controller class
 *
 * @author OneEffect007
 */
public class Participation_EvenementController implements Initializable {

    @FXML
    private TableView<Participation_Evenement> table_participation;
    @FXML
    private TableColumn<?, ?> col_participant_participation;
    @FXML
    private TableColumn<?, ?> col_eval_participation;
    @FXML
    private TextField tf_supp_id_participation;
    @FXML
    private Button btn_supp_participation;
 ObservableList<Participation_Evenement> observableList;
    @FXML
    private Button page_evenements;
    @FXML
    private TableColumn<?, ?> tf_email_evenement;
  
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Rebelotte();
    }

    public void Rebelotte(){
        //affichage tableau
       
        
        Participation_EvenementService ps=new Participation_EvenementService();
        List<Participation_Evenement> participations=ps.afficherParticipation();
        
 
        col_participant_participation.setCellValueFactory(new PropertyValueFactory<>("id_p"));
        col_eval_participation.setCellValueFactory(new PropertyValueFactory<>("id_e"));
        tf_email_evenement.setCellValueFactory(new PropertyValueFactory<>("email"));
        
       observableList = FXCollections.observableArrayList(participations);
        table_participation.setItems(observableList);
 
    }    

    @FXML
    private void supprimerParticipation(ActionEvent event) {
            String id= (String) tf_supp_id_participation.getText();
        Participation_EvenementService es=new Participation_EvenementService();
        es.supprimerParticipation(id);
        //alerte de suppression
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Participation Supprimée");
        alert.showAndWait();
        //refresh
        Rebelotte();
    
    }
    
     @FXML
    private void pageEvenements(ActionEvent event) {
           try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Evenement.fxml"));
            Parent root = loader.load();
            EvenementController ec = loader.getController();
            page_evenements.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 
    }

    
    @FXML
    private void click(MouseEvent event) {
          Participation_Evenement selected = table_participation.getSelectionModel().getSelectedItem();
        tf_email_evenement.setText(selected.getEmail() + "");
    }

    @FXML
    private void Envoyeremail(ActionEvent event) throws AddressException, MessagingException {
            //mailing
        Properties properties = new Properties();

        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.starttls.port","587");

        String MyAccountEmail= "djo90210kladjo@gmail.com";
        String Password= "S90210kladjoa";

        Session session;
        session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(MyAccountEmail,Password);
            }
        });
        
 Participation_EvenementService es=new Participation_EvenementService();
 
          Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(MyAccountEmail));
      
        
      //message.setRecipient(Message.RecipientType.TO,new InternetAddress(es.getMail(mail)));
        message.setSubject("Nouveau Entretien");
        message.setText("Monsieur/Madame,Nous sommes ravi de vous faire connaitre que vous etes affectué a un entretien");

        Transport.send(message);
    }

    
}
