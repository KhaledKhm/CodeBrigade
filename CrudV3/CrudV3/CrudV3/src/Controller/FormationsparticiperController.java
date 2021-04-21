package Controller;

import Services.formationService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.Main;
import main.MyListener;
import model.Formation;
import utils.DataSource;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FormationsparticiperController implements Initializable {
    @FXML
    private VBox chosenFormationCard;

    @FXML
    private Label FormationNameLable;

    @FXML
    private Label FormationPriceLabel;

    @FXML
    private ImageView FormationImg;

    @FXML
    private ScrollPane scroll;

    @FXML
    private GridPane grid;
    @FXML
    private Button gotoList;


    private List<Formation> formations = new ArrayList<>();
    private Image image;
    private MyListener myListener;
    private int tmpf;

    private List<Formation> getData() {
        List<Formation> formations = new ArrayList<>();
        DataSource db=DataSource.getInstance();

        formationService fs= new formationService();


        formations=fs.read();


        return formations;
    }

    private void setChosenFormation(Formation formation) {


        FormationNameLable.setText(formation.getLibelle());
        FormationPriceLabel.setText( formation.getPrix()+Main.CURRENCY);

        String currentDirectory = System.getProperty("user.dir");



        image = new Image("file:"+currentDirectory+"\\src"+formation.getPhoto());
        FormationImg.setImage(image);

        chosenFormationCard.setStyle("-fx-background-color: #878787"+";\n" +
                "    -fx-background-radius: 30;");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        formations.addAll(getData());

        if (formations.size() > 0) {


            setChosenFormation(formations.get(0));
            tmpf=formations.get(0).getId();

            myListener = new MyListener() {
                @Override

                public void onClickListener(Formation formation) {
                    setChosenFormation(formation);
                    tmpf=formation.getId();
                }
            };

        }
        int column = 0;
        int row = 1;
        try {
            for (int i = 0; i < formations.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();

                fxmlLoader.setLocation(getClass().getResource("../views/formation.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                formationController formationController = fxmlLoader.getController();
                formationController.setData(formations.get(i),myListener);


                if (column == 3) {
                    column = 0;
                    row++;
                }

                grid.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane, new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




    public void gotoListOn(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/list_formation_utili.fxml"));
        Parent root = loader.load();
        gotoList.getScene().setRoot(root);
    }

    public void participer(ActionEvent actionEvent) throws IOException {
        DataSource db=DataSource.getInstance();
        formationService fs= new formationService();
        if(fs.checkparticipation(1,tmpf)==false)
        {
            fs.participer(1,tmpf);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/list_formation_utili.fxml"));
            Parent root = loader.load();
            gotoList.getScene().setRoot(root);
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("JobBook");
            alert.setHeaderText("Erreur Participation");
            alert.setContentText("Vous Etes Deja Participee A Cette Formation");
            alert.showAndWait();
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
