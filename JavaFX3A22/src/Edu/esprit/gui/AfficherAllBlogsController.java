/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import Edu.esprit.entities.blog;
import static Edu.esprit.gui.LoginController.email;
import Edu.esprit.services.blogService;
import Edu.esprit.services.utilisateurService;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SPIRIT
 */
public class AfficherAllBlogsController implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private VBox chosenFruitCard;
    @FXML
    private ComboBox<?> languageChange;
    @FXML
    private Button home;
    @FXML
    private ScrollPane scroll;
    @FXML
    private Label labelTestImmatricule;
    @FXML
    private Label labelTestEmail;
    private TableView<?> table_myblog;
    @FXML
    private TableColumn<?, ?> col_sujet;
    @FXML
    private TableColumn<?, ?> col_contenu;
    @FXML
    private TextField tf_modif_sujet;
    @FXML
    private TextArea tf_modif_contenu;
    @FXML
    private TextField searchtf;
    @FXML
    private TableView<blog> table_allblogs;
    @FXML
    private TableColumn<?, ?> col_email;
    @FXML
    private Button myBlog;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        afficherAllBlogs();
    }  
    
     public void afficherAllBlogs(){
        utilisateurService sc = new utilisateurService();
        int idUser = sc.getIdbymail(email);
        blogService bg=new blogService();
        blog blogs=new blog();
        List<blog> Blogs=bg.afficherAllBlogs();
        String email2 = sc.getEmailbyId(blogs.getIdUtilisateur());

        col_sujet.setCellValueFactory(new PropertyValueFactory<>("titre"));
        col_contenu.setCellValueFactory(new PropertyValueFactory<>("contenu"));
        col_email.setCellValueFactory(new PropertyValueFactory<>("idUtilisateur"));
       
        
    
        table_allblogs.setItems((ObservableList<blog>) Blogs);

        //recherche
        ObservableList<blog> blogList=bg.afficherAllBlogs();
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
	sortedData.comparatorProperty().bind( table_allblogs.comparatorProperty());
	table_allblogs.setItems(sortedData);
    }

    @FXML
    private void home(ActionEvent event) throws IOException {
      
    }


    @FXML
    private void click(MouseEvent event) {
        blog e = table_allblogs.getItems().get(table_allblogs.getSelectionModel().getSelectedIndex());
        tf_modif_sujet.setText(e.getTitre());
        tf_modif_contenu.setText(e.getContenu());
    }

    @FXML
    private void myBlog(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("afficherMyBlog.fxml"));
        
          Parent root;
          root = loader.load();
          AfficherMyBlogController LCC = loader.getController();
          home.getScene().setRoot(root);
    }
    
}
