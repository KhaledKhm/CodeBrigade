package Controller;

import Services.cvService;
import Services.formationService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Cv;
import model.Formation;
import utils.DataSource;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.UUID;

public class ajouterCvController implements Initializable {

    @FXML
    private Button browser;
    @FXML
    private Button ajoutercv;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        browser.setOnAction(e->{
            try {
                chooseFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

    }
    private static void copyFileUsingFileStreams(File source, File dest)
            throws IOException {


        Files.copy(source.toPath(), dest.toPath());

    }
    File filesource=null;
    private void chooseFile() throws IOException {





            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
            filesource = fileChooser.showOpenDialog(browser.getScene().getWindow());















    }
    public void AjouterCv(ActionEvent actionEvent) throws IOException {


            DataSource db=DataSource.getInstance();
            int idutili=1;
            String uniquename= UUID.randomUUID().toString();
            String fich="/fich/"+uniquename+".pdf";
            Cv c=new Cv(fich,idutili);

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Ajout de Cv");
            alert.setHeaderText("Confirmation de Cv");
            alert.setContentText("Voulez-vous vous ajout Cv ?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {

                cvService fs = new cvService();

                fs.add(c);
                String currentDirectory = System.getProperty("user.dir");
                File filedest = new File(currentDirectory + "\\src\\fich\\" + uniquename + ".pdf");
                copyFileUsingFileStreams(filesource, filedest);


            }
    }

    public void GoToOn(ActionEvent actionEvent) throws IOException {
        Parent TestPage = FXMLLoader.load(getClass().getResource("../views/formations.fxml"));
        Scene Test = new Scene(TestPage);
        Stage App = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        App.setScene(Test);
        App.show();
        }
    }

