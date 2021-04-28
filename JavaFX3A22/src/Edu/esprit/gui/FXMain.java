/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

/**
 *
 * @author OneEffect007
 */
public class FXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            /*Button btn = new Button();
            btn.setText("Say 'Hello World'");
            btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
            System.out.println("Hello World!");
            }
            });*/
            
            /*StackPane root = new StackPane();
            root.getChildren().add(btn);*/
            
            
            Parent root = FXMLLoader.load(getClass().getResource("Evaluation.fxml"));
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("Evaluations");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
