/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import Edu.esprit.entities.Evaluation;
import Edu.esprit.entities.Participation_Evaluation;
import Edu.esprit.entities.Quiz;
import Edu.esprit.services.EvaluationService;
import Edu.esprit.services.Participation_EvaluationService;
import java.awt.Insets;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

/**
 * FXML Controller class
 *
 * @author OneEffect007
 */
public class EvaluationFController implements Initializable {

    //test
    String id="17";
    private TableView<Evaluation> table_eval;
    @FXML
    private Button btn_participerF;
    @FXML
    private ComboBox tf_evalF;
    @FXML
    private GridPane grid;
    @FXML
    private TextField tf_id_eval;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //grid
        int i,c=0,r=1;
        EvaluationService es=new EvaluationService();
        List<String> ids=es.afficherID();
        tf_evalF.setItems((ObservableList<String>)ids);    
        List<Evaluation> evaluation=es.afficherEvaluation();
        for (Evaluation e:evaluation)
        {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("SampleEvaluation.fxml"));
                AnchorPane anchorpane =loader.load();
                SampleEvaluationController sc = loader.getController();
                sc.setStuff(e.getLibelle(), e.getDescription(), e.getDateEvaluation(),String.valueOf(e.getId()));
                if (c==3)
                {
                    c=0;
                    r++;
                }
                grid.add(anchorpane, c++, r);
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                //grid.setMargin(anchorpane, new Insets(10));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }    


    @FXML
    private void click(ActionEvent event) {
        Stage Stage = new Stage();
        Stage.setTitle("Quiz");
      
        VBox vbox = new VBox();
        EvaluationService es=new EvaluationService();
        List<Quiz> questions=es.Questions(tf_id_eval.getText());
        ToggleGroup group1 = new ToggleGroup();
        ToggleGroup group2 = new ToggleGroup();
        ToggleGroup group3 = new ToggleGroup();
        ToggleGroup group4 = new ToggleGroup();
        List<ToggleGroup> tg = new ArrayList<>();
        tg.add(group1);
        tg.add(group2);
        tg.add(group3);
        tg.add(group4);
        int i=0;
        //components
        for (Quiz q:questions)
        {
        Label label = new Label();
        label.setText(q.getQuestion());
        
        RadioButton choix1 = new RadioButton(q.getChoix1());
        RadioButton choix2 = new RadioButton(q.getChoix2());
        RadioButton choix3 = new RadioButton(q.getChoix3());
        //ToggleGroup group = new ToggleGroup();
        choix1.setToggleGroup(tg.get(i));
        choix1.setSelected(true);
        choix2.setToggleGroup(tg.get(i));
        choix3.setToggleGroup(tg.get(i));

        vbox.getChildren().add(label);
        vbox.getChildren().add(choix1);
        vbox.getChildren().add(choix2);
        vbox.getChildren().add(choix3);
        i++;
        }
        Button envoyer = new Button("Envoyer");
        envoyer.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
            String reponse = null;
            int cmp=0;
            int j=0;
            for (Quiz q:questions)
            {
                if (q.getReponse()==1) reponse=q.getChoix1();
                if (q.getReponse()==2) reponse=q.getChoix2();
                if (q.getReponse()==3) reponse=q.getChoix3();
                
                RadioButton selectedRadioButton = (RadioButton) tg.get(j).getSelectedToggle();
                if (selectedRadioButton.getText().equals(reponse)) cmp++;
                j++;
            }
            //alerte d'ajout
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Quiz!");
            alert.setHeaderText(null);
            alert.setContentText(String.valueOf("Votre note est "+cmp+"/"+j--));
            alert.showAndWait();
            //notification
            TrayNotification tray = new TrayNotification();
            AnimationType type = AnimationType.POPUP;
            tray.setAnimationType(type);
            tray.setTitle("Quiz Passée");
            tray.setMessage("Votre note est "+cmp+"/"+j--);
            tray.setNotificationType(NotificationType.SUCCESS);
            tray.showAndDismiss(Duration.millis(3000));
            Participation_Evaluation p= new Participation_Evaluation(parseInt(id),parseInt((String) tf_id_eval.getText()),cmp);
            Participation_EvaluationService ps=new Participation_EvaluationService();
            ps.ajouterParticipation(p);
            Stage.close();
            }
        });
        vbox.getChildren().add(envoyer);
        //load
        Scene scene = new Scene(vbox, 400, 500);
        Stage.setScene(scene);
        Stage.show();
    }

    @FXML
    private void page_entretiens(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EntretienF.fxml"));
            Parent root = loader.load();
            EntretienFController pc = loader.getController();
            grid.getScene().setRoot(root);
        } catch (IOException ex) {
            Logger.getLogger(EvaluationFController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void change(ActionEvent event) {
        EvaluationService es=new EvaluationService();
        tf_id_eval.setText((es.getIdEval((String) tf_evalF.getSelectionModel().getSelectedItem())));
    }

    @FXML
    private void back(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Evaluation.fxml"));
            Parent root = loader.load();
            EvaluationController pc = loader.getController();
            grid.getScene().setRoot(root);
        } catch (IOException ex) {
            Logger.getLogger(EvaluationFController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
