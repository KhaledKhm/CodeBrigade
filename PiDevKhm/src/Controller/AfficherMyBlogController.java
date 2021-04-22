/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import static javafx.scene.input.KeyCode.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import static javax.swing.text.html.HTML.Tag.*;

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
