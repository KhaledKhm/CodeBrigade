package Controller;

import Services.Validation;
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
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.stage.FileChooser;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;
import model.Formation;
import utils.DataSource;

import java.awt.*;
import javafx.scene.control.Label;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.UUID;
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
    @FXML
    private Label labelerrorimage;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        browser.setOnAction(e->{
            try {
                chooseFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        DatePicker tmp=new DatePicker(LocalDate.now());
        Callback<DatePicker, DateCell> datemin=Validation.selectdatemin(tmp);
        datedebfield.setDayCellFactory(datemin);
        DatePicker tmp1=new DatePicker(tmp.getValue().plusDays(1));
        Callback<DatePicker, DateCell> datemin1=Validation.selectdatemin(tmp1);
        datefinfield.setDayCellFactory(datemin1);

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
        if(controleSaisie()){
        DataSource db=DataSource.getInstance();
        int idutili=1;
        String uniquename=UUID.randomUUID().toString();
        String photo="/img/"+uniquename+".png";
        Formation f=new Formation(libellefield.getText(),descriptionfield.getText(),Float.parseFloat(prixfield.getText()),adressefield.getText(),Integer.parseInt(nbrparfield.getText()),datedebfield.getValue(),datefinfield.getValue(),photo,idutili);


        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Ajout de formation");
        alert.setHeaderText("Confirmation de l'ajout");
        alert.setContentText("Voulez-vous vous ajout la formation ?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {

            formationService fs = new formationService();

            fs.add(f);
            String currentDirectory = System.getProperty("user.dir");
            File filedest = new File(currentDirectory + "\\src\\img\\" + uniquename + ".png");
            copyFileUsingFileStreams(filesource, filedest);

            Parent TestPage = FXMLLoader.load(getClass().getResource("../views/formations.fxml"));
            Scene Test = new Scene(TestPage);
            Stage App = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            App.setScene(Test);
            App.show();

        }


        }











    }

    public boolean controleSaisie() {
        boolean saisie = true;


        if (!Validation.textalphabet(libellefield,"Invalid")) {
            saisie = false;
            libellefield.setText("");

        if (!Validation.textEmpty(descriptionfield, "Invalid")) {
            saisie = false;
            descriptionfield.setText("");
        }
        if (!Validation.texNum(prixfield,  "Invalid")) {
            saisie = false;
            prixfield.setText("");
        }
        if (!Validation.textEmpty(adressefield, "Invalid")) {
            saisie = false;
            adressefield.setText("");
        }
        if (!Validation.texNum(nbrparfield,  "Invalid")) {
            saisie = false;
            nbrparfield.setText("");
        }
        if (!Validation.imageEmpty(imagedisplay,labelerrorimage, "Invalid")) {
            saisie = false;
        }
        else
        {   labelerrorimage.setVisible(false);
        }
        }
        if (datedebfield.getValue() == null) {
            datedebfield.setPromptText("Invalide");
            saisie = false;

        }
        if (datefinfield.getValue() == null) {
            datefinfield.setPromptText("Invalide");
            saisie = false;
        }

        return saisie;
    }
    public void GoToOn(ActionEvent actionEvent) throws IOException {
        Parent TestPage = FXMLLoader.load(getClass().getResource("../views/formations.fxml"));
        Scene Test = new Scene(TestPage);
        Stage App = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        App.setScene(Test);
        App.show();

    }

    public void OnDateDebChanged(ActionEvent actionEvent) {
        Callback<DatePicker, DateCell> datemin=Validation.selectdatemin(datedebfield);
datefinfield.setDayCellFactory(datemin);
    }

    public void OnDateFinChanged(ActionEvent actionEvent) {
        DatePicker tmp=new DatePicker(LocalDate.now());
        Callback<DatePicker, DateCell> datebetween=Validation.selectdatebetween(datefinfield,tmp);
        datedebfield.setDayCellFactory(datebetween);
    }



}
