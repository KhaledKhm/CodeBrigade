/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.gui;

import esprit.java.entities.Participation_Evaluation;
import esprit.java.services.Participation_EvaluationService;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.List;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author OneEffect007
 */
public class Participation_EvaluationController implements Initializable {

    @FXML
    private TableView<Participation_Evaluation> table_participation;
    @FXML
    private TableColumn<?, ?> col_id_participation;
    @FXML
    private TableColumn<?, ?> col_participant_participation;
    @FXML
    private TableColumn<?, ?> col_eval_participation;
    @FXML
    private TableColumn<?, ?> col_note_participation;
    @FXML
    private ComboBox tf_ajout_participant_participation;
    @FXML
    private ComboBox tf_ajout_evaluation_participation;
    @FXML
    private ComboBox tf_supp_id_participation;
    @FXML
    private Button btn_ajout_participation;
    @FXML
    private Button btn_supp_participation;
    @FXML
    private Button btin_page_evaluation;
    @FXML
    private Button btn_page_entretien;
    @FXML
    private Button btn_page_quiz;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Rebelotte();
    }

    public void Rebelotte(){
        //affichage tableau
        Participation_EvaluationService ps=new Participation_EvaluationService();
        List<Participation_Evaluation> participations=ps.afficherParticipation();
        col_id_participation.setCellValueFactory(new PropertyValueFactory<>("code"));
        col_participant_participation.setCellValueFactory(new PropertyValueFactory<>("id_p"));
        col_eval_participation.setCellValueFactory(new PropertyValueFactory<>("id_e"));
        col_note_participation.setCellValueFactory(new PropertyValueFactory<>("note"));
        table_participation.setItems((ObservableList<Participation_Evaluation>) participations);
        //combobox
        List<String> participants=ps.afficherParticipants();
        List<String> evaluations=ps.afficherIDEvaluation();
        List<String> ids=ps.afficherID();
        tf_supp_id_participation.setItems((ObservableList<String>)ids);
        tf_ajout_participant_participation.setItems((ObservableList<String>)participants);
        tf_ajout_evaluation_participation.setItems((ObservableList<String>)evaluations);
    }    

    @FXML
    private void AjouterParticipation(ActionEvent event) {
        //ajout
        String participant=(String) tf_ajout_participant_participation.getSelectionModel().getSelectedItem();
        String idEvaluation=(String) tf_ajout_evaluation_participation.getSelectionModel().getSelectedItem();
        Participation_Evaluation p= new Participation_Evaluation(parseInt(participant),parseInt(idEvaluation));
        Participation_EvaluationService ps=new Participation_EvaluationService();
        ps.ajouterParticipation(p);
        //alerte d'ajout
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Participation Ajoutée");
        alert.showAndWait();
        //refresh
        Rebelotte();
    }

    @FXML
    private void supprimerParticipation(ActionEvent event) {
        //suppression
        String id= (String) tf_supp_id_participation.getSelectionModel().getSelectedItem();
        Participation_EvaluationService es=new Participation_EvaluationService();
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
    private void pageEvaluation(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Evaluation.fxml"));
            Parent root = loader.load();
            EvaluationController ec = loader.getController();
            btn_ajout_participation.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void pageEntretien(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Entretien.fxml"));
            Parent root = loader.load();
            EntretienController ec = loader.getController();
            btn_ajout_participation.getScene().setRoot(root);
            
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
            btn_ajout_participation.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
