/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
import services.blogService;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import java.util.List;



import static Controller.LoginController.email;
import entities.blog;
import services.utilisateurService;

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
    private TableColumn<?, ?> col_id_eval;
    private TableColumn<?, ?> col_libelle_eval;
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
    
    
    utilisateurService sc = new utilisateurService();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    public void afficherMesBlogs(){
        int idUser = sc.getIdbymail(email);
        blogService bg=new blogService();
        List<blog> Blogs=bg.afficherMyBlogs(idUser);
        //col_id_eval.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_sujet.setCellValueFactory(new PropertyValueFactory<>("sujet"));
        col_contenu.setCellValueFactory(new PropertyValueFactory<>("contenu"));
        table_myblog.setItems((ObservableList<blog>) Blogs);
     //   List<String> entreprises=bg.afficherEntreprise();
       // tf_ajout_entreprise_eval.setItems((ObservableList<String>)entreprises);
        //recherche
        ObservableList<blog> blogList=bg.afficherMyBlogs(idUser);
        //ObservableList<User>usersList = FXCollections.observableArrayList();
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
    private void home(ActionEvent event) {
    }

    @FXML
    private void click(MouseEvent event) {
    }

    @FXML
    private void modifierEvaluation(ActionEvent event) {
    }
    }

    @FXML
    private void returnBlog(ActionEvent event) {
    }

    @FXML
    private void home(ActionEvent event) {
    }

    @FXML
    private void click(MouseEvent event) {
blog e = table_blog.getItems().get(table_blog.getSelectionModel().getSelectedIndex());
        tf_modif_libelle_eval.setText(e.getLibelle());
        tf_modif_description_eval.setText(e.getDescription());
        tf_modif_date_eval.setText(e.getDateEvaluation());
        tf_modif_entreprise_eval.setText(String.valueOf(e.getId_entreprise()));
        tf_supp_id_eval.setText(String.valueOf(e.getId()));
    }

  
    
}
