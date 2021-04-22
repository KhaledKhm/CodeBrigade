/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.gui;

import esprit.java.entities.Quiz;
import esprit.java.services.QuizService;
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
import javafx.scene.control.Label;
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
public class QuizController implements Initializable {

    @FXML
    private TableView<Quiz> table_quiz;
    @FXML
    private TableColumn<?, ?> col_id_quiz;
    @FXML
    private TableColumn<?, ?> col_question_quiz;
    @FXML
    private TableColumn<?, ?> col_choix1_quiz;
    @FXML
    private TableColumn<?, ?> col_choix2_quiz;
    @FXML
    private TableColumn<?, ?> col_choix3_quiz;
    @FXML
    private TableColumn<?, ?> col_reponse_quiz;
    @FXML
    private TableColumn<?, ?> col_ideval_quiz;
    @FXML
    private TextField tf_ajout_question_quiz;
    @FXML
    private TextField tf_ajout_choix1_quiz;
    @FXML
    private TextField tf_ajout_choix2_quiz;
    @FXML
    private TextField tf_ajout_choix3_quiz;
    @FXML
    private ComboBox tf_ajout_reponse_quiz;
    @FXML
    private ComboBox tf_ajout_ideval_quiz;
    @FXML
    private TextField tf_supp_id_quiz;
    @FXML
    private Button btn_ajout_quiz;
    @FXML
    private Button btn_supp_quiz;
    @FXML
    private Button btn_page_evaluations;
    @FXML
    private Button btn_page_entretien;
    @FXML
    private Button btn_page_participations;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Rebelotte();
    }

public void Rebelotte(){
        //affichage tableau
        QuizService es=new QuizService();
        List<Quiz> quizs=es.afficherQuiz();
        col_id_quiz.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_question_quiz.setCellValueFactory(new PropertyValueFactory<>("question"));
        col_choix1_quiz.setCellValueFactory(new PropertyValueFactory<>("choix1"));
        col_choix2_quiz.setCellValueFactory(new PropertyValueFactory<>("choix2"));
        col_choix3_quiz.setCellValueFactory(new PropertyValueFactory<>("choix3"));
        col_reponse_quiz.setCellValueFactory(new PropertyValueFactory<>("reponse"));
        col_ideval_quiz.setCellValueFactory(new PropertyValueFactory<>("idEvaluation"));
        table_quiz.setItems((ObservableList<Quiz>) quizs);
        //combobox
        List<String> idEs=es.afficherEvaluation();
        //List<String> ids=es.afficherID();
        List<String> reponses=es.afficherReponse();
        tf_ajout_ideval_quiz.setItems((ObservableList<String>)idEs);
        //tf_supp_id_quiz.setItems((ObservableList<String>)ids);
        tf_ajout_reponse_quiz.setItems((ObservableList<String>)reponses);
    }    

    @FXML
    private void ajouterQuiz(ActionEvent event) {
        //ajout
        String question=tf_ajout_question_quiz.getText();
        String choix1=tf_ajout_choix1_quiz.getText();
        String choix2=tf_ajout_choix2_quiz.getText();
        String choix3=tf_ajout_choix3_quiz.getText();
        String reponse=(String) tf_ajout_reponse_quiz.getSelectionModel().getSelectedItem();
        QuizService qs=new QuizService();
        String idEvaluation=(String) tf_ajout_ideval_quiz.getSelectionModel().getSelectedItem();
        int idEvaluation2=qs.afficherIDEvaluation2(idEvaluation);
        Quiz q= new Quiz(idEvaluation2,parseInt(reponse),question,choix1,choix2,choix3);
        //controle de saisie
        boolean cond=true;
        if(tf_ajout_question_quiz.getText().isEmpty() |tf_ajout_choix1_quiz.getText().isEmpty()|tf_ajout_choix2_quiz.getText().isEmpty()|tf_ajout_choix3_quiz.getText().isEmpty())
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
        qs.ajouterQuiz(q);
        //alerte d'ajout
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Quiz Ajoutée");
        alert.showAndWait();
        //notification
        TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Ajout Quiz");
        tray.setMessage("Quiz Ajoutée");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
        //refresh
        Rebelotte();
        }
    }

    @FXML
    private void supprimerQuiz(ActionEvent event) {
        //suppression
        String id= (String) tf_supp_id_quiz.getText();
        QuizService es=new QuizService();
        es.supprimerQuiz(id);
        //alerte de suppression
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nouveau Mise a Jour dans la base de données!");
        alert.setHeaderText(null);
        alert.setContentText("Quiz Supprimée");
        alert.showAndWait();
        //notification
        TrayNotification tray = new TrayNotification();
        AnimationType type = AnimationType.POPUP;
        tray.setAnimationType(type);
        tray.setTitle("Suppression Quiz");
        tray.setMessage("Quiz Supprimée");
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndDismiss(Duration.millis(3000));
        //refresh
        Rebelotte();
    }

    @FXML
    private void pageEvaluations(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Evaluation.fxml"));
            Parent root = loader.load();
            EvaluationController ec = loader.getController();
            btn_ajout_quiz.getScene().setRoot(root);
            
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
            btn_ajout_quiz.getScene().setRoot(root);
            
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
            btn_ajout_quiz.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void click(MouseEvent event) {
        Quiz q = table_quiz.getItems().get(table_quiz.getSelectionModel().getSelectedIndex());
        tf_supp_id_quiz.setText(String.valueOf(q.getId()));
    }

    
}
