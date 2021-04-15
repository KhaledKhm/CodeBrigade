package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static final String CURRENCY = "TND";
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../views/formations.fxml"));
        primaryStage.setTitle("JobBook");
        primaryStage.getIcons().add(new Image("file:C:\\Users\\wisse\\IdeaProjects\\CrudV3\\CrudV3\\CrudV3\\src\\img\\JLogo.png"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
