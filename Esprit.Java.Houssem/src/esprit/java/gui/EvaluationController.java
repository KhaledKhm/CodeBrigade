/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.gui;

import esprit.java.entities.Evaluation;
import esprit.java.services.EvaluationService;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;


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
    private ComboBox tf_modif_id_eval;
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
    private ComboBox tf_supp_id_eval;
    @FXML
    private Button btn_supp_eval;
    //redirection componenets
    @FXML
    private Button btn_page_quiz;
    @FXML
    private Button btn_page_participations;
    @FXML
    private Button btn_page_entretiens;

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
        //combobox modifier & supprimer
        List<String> ids=es.afficherID();
        tf_modif_id_eval.setItems((ObservableList<String>)ids);
        tf_supp_id_eval.setItems((ObservableList<String>)ids);
        //combobox entreprise
        List<String> entreprises=es.afficherEntreprise();
        tf_ajout_entreprise_eval.setItems((ObservableList<String>)entreprises);    
    }

    @FXML
    private void ajouterEvaluation(ActionEvent event) {
        //ajout
        String libelle=tf_ajout_libelle_eval.getText();
        String description=tf_ajout_description_eval.getText();
        LocalDate date=tf_ajout_date_eval.getValue();
        String id_entreprise=(String) tf_ajout_entreprise_eval.getSelectionModel().getSelectedItem();
        Evaluation e= new Evaluation(parseInt(id_entreprise),libelle,description,String.valueOf(date));
        EvaluationService es=new EvaluationService();
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
        //refresh
        Rebelotte();
        }
    }

    @FXML
    private void modifierEvaluation(ActionEvent event) {
        //ajout
        String id= (String) tf_modif_id_eval.getSelectionModel().getSelectedItem();
        String libelle=tf_modif_libelle_eval.getText();
        String description=tf_modif_description_eval.getText();
        String date=tf_modif_date_eval.getText();
        String id_entreprise=tf_modif_entreprise_eval.getText();
        Evaluation e= new Evaluation(parseInt(id_entreprise),libelle,description,date);
        EvaluationService es=new EvaluationService();
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
        es.modifierEvaluation(e,id);
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
    private void supprimerEvaluation(ActionEvent event) {
        //suppression
        String id= (String) tf_supp_id_eval.getSelectionModel().getSelectedItem();
        EvaluationService es=new EvaluationService();
        es.supprimerEvaluation(id);
        //alerte de suppression
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Evaluation Supprimée");
        alert.showAndWait();
        //refresh
        Rebelotte();
    }

    @FXML
    private void cbb_modif_change(ActionEvent event) {
        String id= (String) tf_modif_id_eval.getSelectionModel().getSelectedItem();
        EvaluationService es=new EvaluationService();
        Evaluation evaluation=es.getEvaluation(id);
        tf_modif_libelle_eval.setText(evaluation.getLibelle());
        tf_modif_description_eval.setText(evaluation.getDescription());
        tf_modif_date_eval.setText(evaluation.getDateEvaluation());
        tf_modif_entreprise_eval.setText(String.valueOf(evaluation.getId_entreprise()));
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

    
}