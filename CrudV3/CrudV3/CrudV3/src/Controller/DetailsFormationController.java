package Controller;

import Services.formationService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Formation;
import utils.DataSource;

import java.io.IOException;

public class DetailsFormationController {

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
    private ImageView imagedisplay;


    public void setData(int id){
        DataSource db=DataSource.getInstance();
        formationService fs=new formationService();


         Formation f=fs.readbyId(id);

        libellefield.setText(f.getLibelle());
        descriptionfield.setText(f.getDescription());
        prixfield.setText(Float.toString(f.getPrix()));
        adressefield.setText(f.getAdresse());
        nbrparfield.setText(Integer.toString(f.getNbr_participant()));
        datedebfield.setValue(f.getDate_debut());
        datefinfield.setValue(f.getDate_fin());
        String currentDirectory = System.getProperty("user.dir");
       Image image = new Image("file:"+currentDirectory+"\\src"+f.getPhoto());
        imagedisplay.setImage(image);


    }


    public void GoToOn(ActionEvent actionEvent) throws IOException {

        Parent TestPage = FXMLLoader.load(getClass().getResource("../views/formations.fxml"));
        Scene Test = new Scene(TestPage);
        Stage App = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        App.setScene(Test);
        App.show();
    }
}
