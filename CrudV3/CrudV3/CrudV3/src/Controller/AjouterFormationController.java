package Controller;

import Services.formationService;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.stage.FileChooser;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Formation;
import utils.DataSource;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class AjouterFormationController  implements Initializable {
    @FXML
    private TextField libellefield ;
    @FXML
    private TextArea descriptionfield ;
    @FXML
    private TextField nbrparfield;
    @FXML
    private TextField prixfield;
    @FXML
    private TextField adressefield;
    @FXML
    private DatePicker datedebfield;
    @FXML
    private DatePicker datefinfield;
    @FXML
    private Button browser;
    @FXML
    private ImageView imagedisplay;
    @FXML
    private Button ajouterformation;


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
        javafx.scene.image.Image image = new Image(filesource.toURI().toString());
        imagedisplay.setImage(image);












    }

    public void AjouterFormation(ActionEvent actionEvent) throws IOException, InterruptedException {

        DataSource db=DataSource.getInstance();
        int idutili=1;
        String photo="/img/"+idutili+libellefield.getText()+".png";
        Formation f=new Formation(libellefield.getText(),descriptionfield.getText(),Float.parseFloat(prixfield.getText()),adressefield.getText(),Integer.parseInt(nbrparfield.getText()),datedebfield.getValue(),datefinfield.getValue(),photo,idutili);


        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Ajout de formation");
        alert.setHeaderText("Confirmation de l'ajout");
        alert.setContentText("Voulez-vous vous ajout la formation ?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {

            formationService fs= new formationService();

            fs.add(f);
            String currentDirectory = System.getProperty("user.dir");
            File filedest=new File(currentDirectory+"\\src\\img\\"+idutili+libellefield.getText()+".png");
            copyFileUsingFileStreams(filesource,filedest);

            Parent TestPage = FXMLLoader.load(getClass().getResource("../views/formations.fxml"));
            Scene Test = new Scene(TestPage);
            Stage App = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            App.setScene(Test);
            App.show();




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
