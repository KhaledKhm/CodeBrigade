package Controller;

import Services.Validation;
import Services.formationService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Callback;
import model.Formation;
import utils.DataSource;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.UUID;

public class ModifierFormationController implements Initializable {


    @FXML
    private TextField libellefield;
    @FXML
    private TextArea descriptionfield;
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
    private TextField idfield;
    @FXML
    private TextField imagename;
    @FXML
    private Label labelerrorimage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        browser.setOnAction(e -> {
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
    String currentDirectory = System.getProperty("user.dir");
    File filesource =null;

    private void chooseFile() throws IOException {


        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        filesource = fileChooser.showOpenDialog(browser.getScene().getWindow());
        javafx.scene.image.Image image = new Image(filesource.toURI().toString());
        imagedisplay.setImage(image);


    }

    public void GoToOn(ActionEvent actionEvent) throws IOException {
        Parent TestPage = FXMLLoader.load(getClass().getResource("../views/formations.fxml"));
        Scene Test = new Scene(TestPage);
        Stage App = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        App.setScene(Test);
        App.show();
    }

    public void ModifierFormation(ActionEvent actionEvent) throws IOException {
        if(controleSaisie()) {
            DataSource db = DataSource.getInstance();
            int idutili = 1;
            String uniquename = UUID.randomUUID().toString();
            String photo = "/img/" + uniquename + ".png";
            Formation f = new Formation(libellefield.getText(), descriptionfield.getText(), Float.parseFloat(prixfield.getText()), adressefield.getText(), Integer.parseInt(nbrparfield.getText()), datedebfield.getValue(), datefinfield.getValue(), photo, idutili);


            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Modification de formation");
            alert.setHeaderText("Confirmation de l'modifie");
            alert.setContentText("Voulez-vous vous modifier la formation ?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {

                formationService fs = new formationService();

                fs.modifer(Integer.parseInt(idfield.getText()), f);
                String currentDirectory = System.getProperty("user.dir");
                File filedest = new File(currentDirectory + "\\src\\img\\" + uniquename + ".png");
                if (filesource == null) {
                    filesource = new File(currentDirectory + "\\src" + imagename.getText());
                    copyFileUsingFileStreams(filesource, filedest);
                    filesource.delete();
                } else {
                    File file = new File(currentDirectory + "\\src" + imagename.getText());
                    file.delete();
                    copyFileUsingFileStreams(filesource, filedest);
                }


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
    public void setData(int id){
        DataSource db=DataSource.getInstance();
        formationService fs=new formationService();


        Formation f=fs.readbyId(id);
        idfield.setText(Integer.toString(id));
        libellefield.setText(f.getLibelle());
        descriptionfield.setText(f.getDescription());
        prixfield.setText(Float.toString(f.getPrix()));
        adressefield.setText(f.getAdresse());
        nbrparfield.setText(Integer.toString(f.getNbr_participant()));
        datedebfield.setValue(f.getDate_debut());
        datefinfield.setValue(f.getDate_fin());
        imagename.setText(f.getPhoto());
        Image image = new Image("file:"+currentDirectory+"\\src"+f.getPhoto());
        imagedisplay.setImage(image);



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
