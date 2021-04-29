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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author OneEffect007
 */
public class SampleEntretienController implements Initializable {

    @FXML
    private ImageView sample_img;
    @FXML
    private Label sample_label;
    @FXML
    private Label sample_description;
    @FXML
    private Label sample_date;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        InputStream stream = null;
        try {
            stream = new FileInputStream("C:\\Users\\OneEffect007\\Desktop\\PI\\JavaFX3A22\\entretien.png");
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
        
        public void setStuff(String label,String description,String date)
        {
            sample_label.setText(label);
            sample_description.setText(description);
            sample_date.setText(date);
            //sample_id.setText(id);
        }
        
    
}
