/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import static javafx.scene.input.KeyCode.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import static javax.swing.text.html.HTML.Tag.*;
import Edu.esprit.services.blogService;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import java.util.List;



import static Edu.esprit.gui.LoginController.email;
import Edu.esprit.entities.blog;
import javafx.scene.control.Alert;
import javafx.util.Duration;
import Edu.esprit.services.utilisateurService;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class AfficherMyBlogController implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private VBox chosenFruitCard;
    @FXML
    private ComboBox<?> languageChange;
    @FXML
    private Button retourBlog;
    @FXML
    private Button home;
    @FXML
    private ScrollPane scroll;
    @FXML
    private Label labelTestImmatricule;
    @FXML
    private Label labelTestEmail;
    @FXML
    private TableView<blog> table_myblog;
    @FXML
    private TextField tf_modif_sujet;
    @FXML
    private Button btn_modif_blog;
    @FXML
    private TextArea tf_modif_contenu;
    @FXML
    private TableColumn col_sujet;
    @FXML
    private TableColumn col_contenu;
    @FXML
    private TextField searchtf;
    
    int idBlog;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        afficherMesBlogs();
    }    
    
    
    public void afficherMesBlogs(){
        utilisateurService sc = new utilisateurService();
        int idUser = sc.getIdbymail(email);
        blogService bg=new blogService();
        List<blog> Blogs=bg.afficherMyBlogs(idUser);

        col_sujet.setCellValueFactory(new PropertyValueFactory<>("titre"));
        col_contenu.setCellValueFactory(new PropertyValueFactory<>("contenu"));
        table_myblog.setItems((ObservableList<blog>) Blogs);

        //recherche
        ObservableList<blog> blogList=bg.afficherMyBlogs(idUser);
        FilteredList<blog> filteredData = new FilteredList<>( blogList, b -> true);
        searchtf.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(blog -> {
		
		if (newValue == null || newValue.isEmpty()) return true;
		String lowerCaseFilter = newValue.toLowerCase();
		if (String.valueOf(blog.getIdblog()).toLowerCase().contains(lowerCaseFilter) ) return true;
		else if (blog.getTitre().contains(lowerCaseFilter)) return true;
                else if (blog.getContenu().contains(lowerCaseFilter))return true;
                else if (String.valueOf(blog.getIdUtilisateur()).contains(lowerCaseFilter))return true;           
		else return false;
                                // Does not match.
			});
		});
		
	SortedList<blog> sortedData = new SortedList<>(filteredData);
	sortedData.comparatorProperty().bind( table_myblog.comparatorProperty());
	table_myblog.setItems(sortedData);
    }

    @FXML
    private void returnBlog(ActionEvent event) {
    }

    @FXML
    private void home(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Evaluation.fxml"));
        
          Parent root;
          root = loader.load();
          EvaluationController LCC = loader.getController();
          home.getScene().setRoot(root);
    }

    @FXML
    private void click(MouseEvent event) {
        blog e = table_myblog.getItems().get(table_myblog.getSelectionModel().getSelectedIndex());
        idBlog=e.getIdblog();
        System.out.println(idBlog);
        tf_modif_sujet.setText(e.getTitre());
        tf_modif_contenu.setText(e.getContenu());
    }

    @FXML
    private void modifierEvaluation(ActionEvent event) {
         String Titre = tf_modif_sujet.getText();
          String Contenu = tf_modif_contenu.getText();
         
          
          utilisateurService us = new utilisateurService();
          int id = us.getIdbymail(email);
          
          blog b;
          b=new blog(Titre,Contenu);
          blogService bs = new blogService();
          
         //cs
         boolean condition=true;
         if(tf_modif_sujet.getText().isEmpty() |tf_modif_contenu.getText().isEmpty()){
             Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Vérifiez vos Champs!");
            alert.showAndWait();
            condition=false;
         }
         if (condition==true){
       //      System.out.println(b.getIdblog());
             bs.modifierBlog(b, idBlog);
             
             //tray notif
             TrayNotification tray = new TrayNotification();
             AnimationType type = AnimationType.POPUP;
             tray.setAnimationType(type);
             tray.setTitle("Modification Blog");
             tray.setMessage("Blog Modifiée");
             tray.setNotificationType(NotificationType.SUCCESS);
             tray.showAndDismiss(Duration.millis(3000));
             afficherMesBlogs();         
         }
    }
    



  
    
}
