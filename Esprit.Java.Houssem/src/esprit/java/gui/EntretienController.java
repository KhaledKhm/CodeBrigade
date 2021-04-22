/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.gui;

import com.pdfjet.*;
import esprit.java.entities.Entretien;
import esprit.java.services.EntretienService;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
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
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;


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
    private TextField tf_supp_id_entretien;
    @FXML
    private Button page_evaluations;
    @FXML
    private Button page_quiz;
    @FXML
    private Button page_participations;
    @FXML
    private Button btn_pdf_entretien;
    @FXML
    private TextField searchtf;

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
        List<String> evaluations=es.afficherIDEvaluation();
        tf_ajout_idEval_entretien.setItems((ObservableList<String>)evaluations);
        ObservableList<Entretien> entretienList=es.afficherEntretien();
        //ObservableList<User>usersList = FXCollections.observableArrayList();
        FilteredList<Entretien> filteredData = new FilteredList<>( entretienList, b -> true);
        searchtf.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(entretien -> {
		
		if (newValue == null || newValue.isEmpty()) return true;
		String lowerCaseFilter = newValue.toLowerCase();
		if (String.valueOf(entretien.getId()).toLowerCase().contains(lowerCaseFilter) ) return true;
		else if (entretien.getLibelle().contains(lowerCaseFilter)) return true;
                else if (entretien.getDescription().contains(lowerCaseFilter))return true;
                else if (entretien.getDateEntretien().contains(lowerCaseFilter))return true;
                else if (String.valueOf(entretien.getIdParticipant()).contains(lowerCaseFilter)) return true;
                else if (String.valueOf(entretien.getIdEvaluation()).contains(lowerCaseFilter)) return true;
		else return false;
                                // Does not match.
			});
		});
		
	SortedList<Entretien> sortedData = new SortedList<>(filteredData);
	sortedData.comparatorProperty().bind( table_entretien.comparatorProperty());
	table_entretien.setItems(sortedData);
    }

    @FXML
    private void ajouterEntretien(ActionEvent event) throws MessagingException {
         //ajout
        String libelle=tf_ajout_libelle_entretien.getText();
        String description=tf_ajout_description_entretien.getText();
        LocalDate date=tf_ajout_date_entretien.getValue();
        EntretienService es=new EntretienService();
        String idevaluation=(String) tf_ajout_idEval_entretien.getSelectionModel().getSelectedItem();
        int idevaluation2=es.afficherIDEvaluation2(idevaluation);
        String idparticipant=(String) tf_ajout_idParticipant_entretien.getSelectionModel().getSelectedItem();
        int idparticipant2=es.afficherIDParticipant2(idparticipant);
        Entretien e= new Entretien(idevaluation2,idparticipant2,libelle,description,String.valueOf(date));
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
        Properties properties = new Properties();

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
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(MyAccountEmail));
        message.setRecipient(Message.RecipientType.TO,new InternetAddress(es.getMail(String.valueOf(idparticipant2))));
        message.setSubject("Nouveau Entretien");
        message.setText("Monsieur/Madame,Nous sommes ravi de vous faire connaitre que vous etes affectué a un entretien "+libelle+", "+description+" le "+String.valueOf(date));

        Transport.send(message);

        //alerte d'ajout
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Entretien Ajoutée");
        alert.showAndWait();
        //notification
        TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Ajout Entretien");
        tray.setMessage("Entretien Ajoutée");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
        //refresh
        Rebelotte();
        }
    }

    @FXML
    private void modifierEntretien(ActionEvent event) {
        //ajout
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
        es.modifierEntretien(e,tf_supp_id_entretien.getText());
        //alerte de modification
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Evaluation Modifiée");
        alert.showAndWait();
        //notification
        TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Modification Entretien");
        tray.setMessage("Entretien Modifiée");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
        //refresh
        Rebelotte();
        }
    }

    @FXML
    private void supprimerEntretien(ActionEvent event) {
        //suppression
        String id= (String) tf_supp_id_entretien.getText();
        EntretienService es=new EntretienService();
        es.supprimerEntretien(id);
        //alerte de suppression
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Entretien Supprimée");
        alert.showAndWait();
        //notification
        TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Suppression Entretien");
        tray.setMessage("Entretien Supprimée");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
        //refresh
        Rebelotte();
    }


    @FXML
    private void cbb_eval_change(ActionEvent event) {
        String libelle= (String) tf_ajout_idEval_entretien.getSelectionModel().getSelectedItem();
        EntretienService es=new EntretienService();
        int id=es.afficherIDEvaluation2(libelle);
        List<String> participants=es.afficherParticipant(String.valueOf(id));
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

    @FXML
    private void creerPDF(ActionEvent event) throws Exception {
        File out=new File("Entretiens.pdf");
        try {
            //creation du pdf & page
            FileOutputStream fos=new FileOutputStream(out);
            PDF pdf = new PDF(fos);
            Page page = new Page(pdf,A4.PORTRAIT);
            //les fonts du tableau
            Font f1=new Font(pdf,CoreFont.HELVETICA_BOLD);
            Font f2=new Font(pdf,CoreFont.HELVETICA);
            //tableau
            Table table = new Table();
            List<List<Cell>> tableData=new ArrayList<List<Cell>>();
            //table row
            List<Cell> tableRow = new ArrayList<Cell>();
            //Ajout des elements
            Cell cell = new Cell(f1,col_id_ent.getText());
            tableRow.add(cell);
            cell = new Cell(f1,col_libelle_ent.getText());
            tableRow.add(cell);
            cell = new Cell(f1,col_description_ent.getText());
            tableRow.add(cell);
            cell = new Cell(f1,col_date_ent.getText());
            tableRow.add(cell);
            cell = new Cell(f1,col_idEval_ent.getText());
            tableRow.add(cell);
            cell = new Cell(f1,col_idParticipant_ent.getText());
            tableRow.add(cell);
            //add row to table
            tableData.add(tableRow);
            //ajout du data
            List<Entretien> items = table_entretien.getItems();
            for (Entretien e : items)
            {
                Cell id=new Cell(f2,String.valueOf(e.getId()));
                Cell libelle=new Cell(f2,e.getLibelle());
                Cell description=new Cell(f2,e.getDescription());
                Cell date=new Cell(f2,e.getDateEntretien());
                Cell idEvaluation=new Cell(f2,String.valueOf(e.getIdEvaluation()));
                Cell idParticipant=new Cell(f2,String.valueOf(e.getIdParticipant()));
                
                tableRow = new ArrayList<Cell>();
                tableRow.add(id);
                tableRow.add(libelle);
                tableRow.add(description);
                tableRow.add(date);
                tableRow.add(idEvaluation);
                tableRow.add(idParticipant);
                
                //add row to table
                tableData.add(tableRow);
            }
            
            table.setData(tableData);
            table.setColumnWidth(0, 100f);
            table.setColumnWidth(1, 100f);
            table.setColumnWidth(2, 100f);
            table.setColumnWidth(3, 100f);
            table.setColumnWidth(4, 100f);
            table.setColumnWidth(5, 100f);
                
            //création d'une nouveau page ou cas ou
            while(true)
                {
                    table.drawOn(page);
                            if(!table.hasMoreData())
                            {
                                table.resetRenderedPagesCount();
                                break;
                            }
                            page = new Page(pdf,A4.PORTRAIT);
                }    
            System.out.println("Saved To"+out.getAbsolutePath());
            table.setData(tableData);
            table.setPosition(70f,60f);
            pdf.close();
            fos.close();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("PDF crée!");
            alert.setHeaderText(null);
            alert.setContentText("PDF crée");
            alert.showAndWait();
            //notification
            TrayNotification tray = new TrayNotification();
            AnimationType type = AnimationType.POPUP;
            tray.setAnimationType(type);
            tray.setTitle("Création du PDF");
            tray.setMessage("PDF Crée");
            tray.setNotificationType(NotificationType.SUCCESS);
            tray.showAndDismiss(Duration.millis(3000));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void click(MouseEvent event) {
        Entretien e = table_entretien.getItems().get(table_entretien.getSelectionModel().getSelectedIndex());
        tf_modif_libelle_entretien.setText(e.getLibelle());
        tf_modif_description_entretien.setText(e.getDescription());
        tf_modif_date_entretien.setText(e.getDateEntretien());
        tf_modif_idParticipant_entretien.setText(String.valueOf(e.getIdParticipant()));
        tf_modif_idEval_entretien.setText(String.valueOf(e.getIdEvaluation()));
        tf_supp_id_entretien.setText(String.valueOf(e.getId()));
    }
    
}
