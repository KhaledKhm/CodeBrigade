/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author SPIRIT
 */
public class LoginMain extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
      
     /*   Button btn = new Button();
        btn.setText("Hello world");
        btn.setOnAction(new EventHandler<ActionEvent>(){
           @Override 
            public void handle(ActionEvent event){
                System.out.println("Hello world");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);*/
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene scene = new Scene(root, 1000, 800);
        scene.getStylesheets().add(getClass().getResource("../tools/css/Login.css").toExternalForm());
        primaryStage.setTitle("Login page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
