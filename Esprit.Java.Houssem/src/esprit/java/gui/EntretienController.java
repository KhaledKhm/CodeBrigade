/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.gui;

import esprit.java.entities.Entretien;
import esprit.java.services.EntretienService;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 * FXML Controller class
 *
 * @author OneEffect007
 */
public class EntretienController implements Initializable {

    @FXML
    private TableView<Entretien> table_entretien;
    @FXML
    private TextField tf_ajout_libelle_entretien;
    @FXML
    private TextField tf_ajout_description_entretien;
    @FXML
    private DatePicker tf_ajout_date_entretien;
    @FXML
    private ComboBox tf_ajout_idEval_entretien;
    @FXML
    private ComboBox tf_ajout_idParticipant_entretien;
    @FXML
    private Button btn_ajout_entretien;
    @FXML
    private ComboBox tf_modif_id_entretien;
    @FXML
    private TextField tf_modif_libelle_entretien;
    @FXML
    private TextField tf_modif_description_entretien;
    @FXML
    private TextField tf_modif_date_entretien;
    @FXML
    private TextField tf_modif_idEval_entretien;
    @FXML
    private TextField tf_modif_idParticipant_entretien;
    @FXML
    private Button btn_modif_entretien;
    @FXML
    private Button btn_supp_entretien;
    @FXML
    private TableColumn<?, ?> col_id_ent;
    @FXML
    private TableColumn<?, ?> col_libelle_ent;
    @FXML
    private TableColumn<?, ?> col_description_ent;
    @FXML
    private TableColumn<?, ?> col_date_ent;
    @FXML
    private TableColumn<?, ?> col_idEval_ent;
    @FXML
    private TableColumn<?, ?> col_idParticipant_ent;
    @FXML
    private ComboBox tf_supp_id_entretien;
    @FXML
    private Button page_evaluations;
    @FXML
    private Button page_quiz;
    @FXML
    private Button page_participations;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Rebelotte();
    }

    public void Rebelotte(){
        //affichage tableau
        EntretienService es=new EntretienService();
        List<Entretien> entretiens=es.afficherEntretien();
        col_id_ent.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_libelle_ent.setCellValueFactory(new PropertyValueFactory<>("libelle"));
        col_description_ent.setCellValueFactory(new PropertyValueFactory<>("description"));
        col_date_ent.setCellValueFactory(new PropertyValueFactory<>("dateEntretien"));
        col_idEval_ent.setCellValueFactory(new PropertyValueFactory<>("idEvaluation"));
        col_idParticipant_ent.setCellValueFactory(new PropertyValueFactory<>("idParticipant"));
        table_entretien.setItems((ObservableList<Entretien>) entretiens);
        //combobox modifier & supprimer
        List<String> ids=es.afficherID();
        tf_modif_id_entretien.setItems((ObservableList<String>)ids);
        tf_supp_id_entretien.setItems((ObservableList<String>)ids);
        //combobox entreprise
        //List<String> participants=es.afficherParticipant();
        List<String> evaluations=es.afficherIDEvaluation();
        //tf_ajout_idParticipant_entretien.setItems((ObservableList<String>)participants);
        tf_ajout_idEval_entretien.setItems((ObservableList<String>)evaluations);
    }

    @FXML
    private void ajouterEntretien(ActionEvent event) throws MessagingException {
         //ajout
        String libelle=tf_ajout_libelle_entretien.getText();
        String description=tf_ajout_description_entretien.getText();
        LocalDate date=tf_ajout_date_entretien.getValue();
        String idevaluation=(String) tf_ajout_idEval_entretien.getSelectionModel().getSelectedItem();
        String idparticipant=(String) tf_ajout_idParticipant_entretien.getSelectionModel().getSelectedItem();
        Entretien e= new Entretien(parseInt(idevaluation),parseInt(idparticipant),libelle,description,String.valueOf(date));
        EntretienService es=new EntretienService();
        //controle de saisie
        boolean cond=true;
        if(tf_ajout_libelle_entretien.getText().isEmpty() |tf_ajout_description_entretien.getText().isEmpty()|tf_ajout_date_entretien.getValue().toString().isEmpty())
        {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Vérifiez vos Champs!");
            alert.showAndWait();
            cond=false;
        }
        if (cond==true)
        {
        es.ajouterEntretien(e);
        //mailing
        /*Properties properties = new Properties();

        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.starttls.port","587");

        String MyAccountEmail= "houssem.ouerdiane@esprit.tn";
        String Password= "fallout3";

        Session session;
        session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(MyAccountEmail,Password);
            }
        }

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(MyAccountEmail));
        message.setRecipient(Message.RecipientType.TO,new InternetAddress("houssem.ouerdiane@esprit.tn"));
        message.setSubject("test");
        message.setText("test");

        Transport.send(message);*/

        //alerte d'ajout
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Entretien Ajoutée");
        alert.showAndWait();
        //refresh
        Rebelotte();
        }
    }

    @FXML
    private void modifierEntretien(ActionEvent event) {
        //ajout
        String id= (String) tf_modif_id_entretien.getSelectionModel().getSelectedItem();
        String libelle=tf_modif_libelle_entretien.getText();
        String description=tf_modif_description_entretien.getText();
        String date=tf_modif_date_entretien.getText();
        String idevaluation=tf_modif_idEval_entretien.getText();
        String idparticipant=tf_modif_idParticipant_entretien.getText();
        Entretien e= new Entretien(parseInt(idevaluation),parseInt(idparticipant),libelle,description,String.valueOf(date));
        EntretienService es=new EntretienService();
        //controle de saisie
         boolean cond=true;
        if(tf_modif_libelle_entretien.getText().isEmpty() |tf_modif_description_entretien.getText().isEmpty())
        {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Vérifiez vos Champs!");
            alert.showAndWait();
            cond=false;
        }
        if (cond==true)
        {
        es.modifierEntretien(e,id);
        //alerte de modification
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Evaluation Modifiée");
        alert.showAndWait();
        //refresh
        Rebelotte();
        }
    }

    @FXML
    private void supprimerEntretien(ActionEvent event) {
        //suppression
        String id= (String) tf_supp_id_entretien.getSelectionModel().getSelectedItem();
        EntretienService es=new EntretienService();
        es.supprimerEntretien(id);
        //alerte de suppression
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Entretien Supprimée");
        alert.showAndWait();
        //refresh
        Rebelotte();
    }

    @FXML
    private void cbb_modif_change(ActionEvent event) {
        String id= (String) tf_modif_id_entretien.getSelectionModel().getSelectedItem();
        EntretienService es=new EntretienService();
        Entretien e=es.getEntretien(id);
        tf_modif_libelle_entretien.setText(e.getLibelle());
        tf_modif_description_entretien.setText(e.getDescription());
        tf_modif_date_entretien.setText(e.getDateEntretien());
        tf_modif_idEval_entretien.setText(String.valueOf(e.getIdEvaluation()));
        tf_modif_idParticipant_entretien.setText(String.valueOf(e.getIdParticipant()));
        Rebelotte();
    }

    @FXML
    private void cbb_eval_change(ActionEvent event) {
        String id= (String) tf_ajout_idEval_entretien.getSelectionModel().getSelectedItem();
        EntretienService es=new EntretienService();
        List<String> participants=es.afficherParticipant(id);
        tf_ajout_idParticipant_entretien.setItems((ObservableList<String>)participants);
        Rebelotte();
    }

    @FXML
    private void pageEvaluations(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Evaluation.fxml"));
            Parent root = loader.load();
            EvaluationController ec = loader.getController();
            btn_ajout_entretien.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void pageQuiz(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Quiz.fxml"));
            Parent root = loader.load();
            QuizController qc = loader.getController();
            btn_ajout_entretien.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void pageParticipations(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Participation_Evaluation.fxml"));
            Parent root = loader.load();
            Participation_EvaluationController pc = loader.getController();
            btn_ajout_entretien.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    
}
