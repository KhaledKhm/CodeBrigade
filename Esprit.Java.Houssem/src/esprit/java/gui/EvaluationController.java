/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.gui;

import com.pdfjet.*;
import com.pdfjet.CoreFont;
import com.pdfjet.Font;
import com.pdfjet.PDF;
import com.pdfjet.Page;
import com.pdfjet.Table;
import esprit.java.entities.Evaluation;
import esprit.java.services.EvaluationService;
import esprit.java.tools.MaConnexion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
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
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;




/**
 * FXML Controller class
 *
 * @author OneEffect007
 */
public class EvaluationController implements Initializable {

    //ajout components
    @FXML
    private TextField tf_ajout_description_eval;
    @FXML
    private DatePicker tf_ajout_date_eval;
    @FXML
    private TextField tf_ajout_libelle_eval;
    @FXML
    private ComboBox tf_ajout_entreprise_eval;
    @FXML
    private Button btn_ajout_eval;
    //affichage components
    @FXML
    private TableView<Evaluation> table_eval;
    @FXML
    private TableColumn col_id_eval;
    @FXML
    private TableColumn col_libelle_eval;
    @FXML
    private TableColumn col_description_eval;
    @FXML
    private TableColumn col_date_eval;
    @FXML
    private TableColumn col_entreprise_eval;
    //modifier components
    @FXML
    private TextField tf_modif_description_eval;
    @FXML
    private TextField tf_modif_date_eval;
    @FXML
    private TextField tf_modif_libelle_eval;
    @FXML
    private TextField tf_modif_entreprise_eval;
    @FXML
    private Button btn_modif_eval;
    //supprimer Components
    @FXML
    private TextField tf_supp_id_eval;
    @FXML
    private Button btn_supp_eval;
    //redirection componenets
    @FXML
    private Button btn_page_quiz;
    @FXML
    private Button btn_page_participations;
    @FXML
    private Button btn_page_entretiens;
    @FXML
    private Button vbn_pdf_evaluation;
    @FXML
    private Button test;
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
        EvaluationService es=new EvaluationService();
        List<Evaluation> evaluations=es.afficherEvaluation();
        col_id_eval.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_libelle_eval.setCellValueFactory(new PropertyValueFactory<>("libelle"));
        col_description_eval.setCellValueFactory(new PropertyValueFactory<>("description"));
        col_date_eval.setCellValueFactory(new PropertyValueFactory<>("dateEvaluation"));
        col_entreprise_eval.setCellValueFactory(new PropertyValueFactory<>("id_entreprise"));
        table_eval.setItems((ObservableList<Evaluation>) evaluations);
        List<String> entreprises=es.afficherEntreprise();
        tf_ajout_entreprise_eval.setItems((ObservableList<String>)entreprises);
        //recherche
        ObservableList<Evaluation> evaluationList=es.afficherEvaluation();
        //ObservableList<User>usersList = FXCollections.observableArrayList();
        FilteredList<Evaluation> filteredData = new FilteredList<>( evaluationList, b -> true);
        searchtf.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(evaluation -> {
		
		if (newValue == null || newValue.isEmpty()) return true;
		String lowerCaseFilter = newValue.toLowerCase();
		if (String.valueOf(evaluation.getId()).toLowerCase().contains(lowerCaseFilter) ) return true;
		else if (evaluation.getLibelle().contains(lowerCaseFilter)) return true;
                else if (evaluation.getDescription().contains(lowerCaseFilter))return true;
                else if (evaluation.getDateEvaluation().contains(lowerCaseFilter))return true;
                else if (String.valueOf(evaluation.getId_entreprise()).contains(lowerCaseFilter)) return true;
		else return false;
                                // Does not match.
			});
		});
		
	SortedList<Evaluation> sortedData = new SortedList<>(filteredData);
	sortedData.comparatorProperty().bind( table_eval.comparatorProperty());
	table_eval.setItems(sortedData);
    }

    @FXML
    private void ajouterEvaluation(ActionEvent event) {
        //ajout
        String libelle=tf_ajout_libelle_eval.getText();
        String description=tf_ajout_description_eval.getText();
        LocalDate date=tf_ajout_date_eval.getValue();
        String id_entreprise=(String) tf_ajout_entreprise_eval.getSelectionModel().getSelectedItem();
        EvaluationService es=new EvaluationService();
        int id_entreprise2=es.getIdEntreprise(id_entreprise);
        Evaluation e= new Evaluation(id_entreprise2,libelle,description,String.valueOf(date));
        //controle de saisie
        boolean cond=true;
        if(tf_ajout_libelle_eval.getText().isEmpty() |tf_ajout_description_eval.getText().isEmpty()|tf_ajout_date_eval.getValue().toString().isEmpty())
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
        es.ajouterEvaluation(e);
        //alerte d'ajout
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Evaluation Ajoutée");
        alert.showAndWait();
        //notification
        TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Ajout Evaluation");
        tray.setMessage("Evaluation Ajoutée");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
        //refresh
        Rebelotte();
        }
    }

    @FXML
    private void modifierEvaluation(ActionEvent event) {
        //ajout
        String libelle=tf_modif_libelle_eval.getText();
        String description=tf_modif_description_eval.getText();
        String date=tf_modif_date_eval.getText();
        String id_entreprise=tf_modif_entreprise_eval.getText();
        EvaluationService es=new EvaluationService();
        Evaluation e= new Evaluation(parseInt(id_entreprise),libelle,description,date);
        //controle de saisie
         boolean cond=true;
        if(tf_modif_libelle_eval.getText().isEmpty() |tf_modif_description_eval.getText().isEmpty())
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
        es.modifierEvaluation(e,tf_supp_id_eval.getText());
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
        tray.setTitle("Modification Evaluation");
        tray.setMessage("Evaluation Modifiée");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
        //refresh
        Rebelotte();
        }
    }

    @FXML
    private void supprimerEvaluation(ActionEvent event) {
        //suppression
        String id= (String) tf_supp_id_eval.getText();
        EvaluationService es=new EvaluationService();
        es.supprimerEvaluation(id);
        //alerte de suppression
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Evaluation Supprimée");
        alert.showAndWait();
        //notification
        TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Suppression Evaluation");
        tray.setMessage("Evaluation Supprimée");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
        //refresh
        Rebelotte();
    }

    @FXML
    private void pageQuiz(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Quiz.fxml"));
            Parent root = loader.load();
            QuizController qc = loader.getController();
            btn_ajout_eval.getScene().setRoot(root);
            
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
            btn_ajout_eval.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void pageEntretiens(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Entretien.fxml"));
            Parent root = loader.load();
            EntretienController ec = loader.getController();
            btn_ajout_eval.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void creerPDF(ActionEvent event) throws Exception {
        File out=new File("evaluations.pdf");
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
            Cell cell = new Cell(f1,col_id_eval.getText());
            tableRow.add(cell);
            cell = new Cell(f1,col_libelle_eval.getText());
            tableRow.add(cell);
            cell = new Cell(f1,col_description_eval.getText());
            tableRow.add(cell);
            cell = new Cell(f1,col_date_eval.getText());
            tableRow.add(cell);
            cell = new Cell(f1,col_entreprise_eval.getText());
            tableRow.add(cell);
            //add row to table
            tableData.add(tableRow);
            //ajout du data
            List<Evaluation> items = table_eval.getItems();
            for (Evaluation e : items)
            {
                Cell id=new Cell(f2,String.valueOf(e.getId()));
                Cell libelle=new Cell(f2,e.getLibelle());
                Cell description=new Cell(f2,e.getDescription());
                Cell date=new Cell(f2,e.getDateEvaluation());
                Cell idEntreprise=new Cell(f2,String.valueOf(e.getId_entreprise()));
               
                
                tableRow = new ArrayList<Cell>();
                tableRow.add(id);
                tableRow.add(libelle);
                tableRow.add(description);
                tableRow.add(date);
                tableRow.add(idEntreprise);
                
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
            tray.setMessage("PDF crée");
            tray.setNotificationType(NotificationType.SUCCESS);
            tray.showAndDismiss(Duration.millis(3000));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void test(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EvaluationF.fxml"));
            Parent root = loader.load();
            EvaluationFController ec = loader.getController();
            btn_ajout_eval.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void click(MouseEvent event) {
        Evaluation e = table_eval.getItems().get(table_eval.getSelectionModel().getSelectedIndex());
        tf_modif_libelle_eval.setText(e.getLibelle());
        tf_modif_description_eval.setText(e.getDescription());
        tf_modif_date_eval.setText(e.getDateEvaluation());
        tf_modif_entreprise_eval.setText(String.valueOf(e.getId_entreprise()));
        tf_supp_id_eval.setText(String.valueOf(e.getId()));
    }
    

    
}