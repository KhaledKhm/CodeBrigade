/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.LoginController.email;
import entities.blog;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import static javafx.scene.input.KeyCode.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import static javax.swing.text.html.HTML.Tag.*;
import services.blogService;
import services.utilisateurService;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class AjouterBlogController implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private VBox chosenFruitCard;
    @FXML
    private ComboBox<?> languageChange;
    @FXML
    private ScrollPane scroll;
    @FXML
    private Label labelTestImmatricule;
    @FXML
    private Label labelTestEmail;
    @FXML
    private Button retourBlog;
    private TextField blogTitre;
    private TextArea blogContenu;
    @FXML
    private Button home;
    @FXML
    private TableColumn<?, ?> nombre;
    @FXML
    private TableColumn<?, ?> sujet;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void addBlog(ActionEvent event) throws IOException {        
          String Titre = blogTitre.getText();
          String Contenu = blogContenu.getText();
         
          
          utilisateurService us = new utilisateurService();
          int id = us.getIdbymail(email);
          
          blog b;
          b=new blog(Titre,Contenu,id);
          blogService bs = new blogService();
          bs.ajouterBlog(b);
          
          FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/inscriptionsChoice.fxml"));
        
          Parent root;
          root = loader.load();
          InscriptionsChoiceController LCC = loader.getController();
          blogTitre.getScene().setRoot(root);
    }

    @FXML
    private void returnBlog(ActionEvent event) {
    }

    @FXML
    private void home(ActionEvent event) {
    }

    @FXML
    private void sujetCommut(TableColumn.CellEditEvent<S, T> event) {
        
    }
    
}
