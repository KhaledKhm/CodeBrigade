/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import Edu.esprit.entities.Entretien;
import Edu.esprit.services.EntretienService;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;

/**
 * FXML Controller class
 *
 * @author OneEffect007
 */
public class EntretienFController implements Initializable {

    @FXML
    private GridPane grid;
    //test
    String id="17";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //grid
        int i,c=0,r=1;
        EntretienService es=new EntretienService();    
        List<Entretien> entretien=es.afficherIDP(id);
        for (Entretien e:entretien)
        {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("SampleEntretien.fxml"));
                AnchorPane anchorpane =loader.load();
                SampleEntretienController sc = loader.getController();
                sc.setStuff(e.getLibelle(), e.getDescription(), e.getDateEntretien());
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
    private void page_evaluations(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EvaluationF.fxml"));
            Parent root = loader.load();
            EvaluationFController pc = loader.getController();
            grid.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
