/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author OneEffect007
 */
public class SampleEvaluationController implements Initializable {

    @FXML
    private ImageView sample_img;
    @FXML
    private Label sample_label;
    @FXML
    private Label sample_description;
    @FXML
    private Label sample_date;
    @FXML
    private Label sample_id;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         InputStream stream = null;
        try {
            stream = new FileInputStream("C:\\Users\\OneEffect007\\Desktop\\PI\\JavaFX3A22\\evaluation.png");
            Image image = new Image(stream);
            sample_img.setImage(image);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                stream.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void setStuff(String label,String description,String date,String id)
    {
        sample_label.setText(label);
        sample_description.setText(description);
        sample_date.setText(date);
        sample_id.setText(id);
    }

    @FXML
    private void click(MouseEvent event) {
    }
    
    
}
