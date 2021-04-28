package Edu.esprit.gui;
import Edu.esprit.entities.Evenement;
import Edu.esprit.entities.Participation_Evenement;
import Edu.esprit.services.ServiceEvenement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

//import utils.DataSource;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class StatFormationController implements Initializable {

@FXML
private BarChart<String,Number> Barchart;
@FXML
private CategoryAxis x;
@FXML
    private NumberAxis y;
    @FXML
    private AnchorPane rootPane;
    @FXML
    private VBox chosenFruitCard;
    @FXML
    private Button GoToPieChart;
    @FXML
    private Button GoTo1;
    @FXML
    private ScrollPane scroll;






    @FXML
    public void GoToOn(ActionEvent actionEvent) throws IOException {

        Parent TestPage = FXMLLoader.load(getClass().getResource("../views/formations.fxml"));
        Scene Test = new Scene(TestPage);
        Stage App = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        App.setScene(Test);
        App.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        int m1=0;
        int m2=0;
        int m3=0;
        int m4=0;
        int m5=0;
        int m6=0;
        int m7=0;
        int m8=0;
        int m9=0;
        int m10=0;
        int m11=0;
        int m12=0;

        
        
        List<Evenement> list=new ArrayList();
        ServiceEvenement fs=new ServiceEvenement();
        //list=fs.afficherEvenements();
        for(Evenement f :list)
        {

            switch(f.getDatedebut().toString()) {
                case "JANUARY":
                    m1++;
                    break;
                case "FEBRUARY":
                    m2++;
                    break;
                case "MARCH":
                    m3++;
                    break;
                case "APRIL":
                    m4++;
                    break;
                case "MAY":
                    m5++;
                    break;
                case "JUNE":
                    m6++;
                    break;
                case "JULY":
                    m7++;
                    break;
                case "AUGUST":
                    m8++;
                    break;
                case "SEPTEMBER":
                    m9++;
                    break;
                case "OCTOBER":
                    m10++;
                    break;
                case "NOVEMBER":
                    m11++;
                    break;
                case "DECEMBER":
                    m12++;
                    break;
            }
        }



        XYChart.Series series1 = new XYChart.Series();
        series1.setName("JANUARY");
        series1.getData().add(new XYChart.Data("Jan", m1));
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("FEBRUARY");
        series2.getData().add(new XYChart.Data("Feb", m2));
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("MARCH");
        series3.getData().add(new XYChart.Data("Mar", m3));
        XYChart.Series series4 = new XYChart.Series();
        series4.setName("APRIL");
        series4.getData().add(new XYChart.Data("Apr", m4));
        XYChart.Series series5 = new XYChart.Series();
        series5.setName("MAY");
        series5.getData().add(new XYChart.Data("May", m5));
        XYChart.Series series6 = new XYChart.Series();
        series6.setName("JUNE");
        series6.getData().add(new XYChart.Data("Jun", m6));
        XYChart.Series series7 = new XYChart.Series();
        series7.setName("JULY");
        series7.getData().add(new XYChart.Data("Jul", m7));
        XYChart.Series series8 = new XYChart.Series();
        series8.setName("AUGEST");
        series8.getData().add(new XYChart.Data("Aug", m8));
        XYChart.Series series9 = new XYChart.Series();
        series9.setName("SEPTEMBER");
        series9.getData().add(new XYChart.Data("Sep", m9));
        XYChart.Series series10 = new XYChart.Series();
        series10.setName("OCTOBER");
        series10.getData().add(new XYChart.Data("Oct", m10));
        XYChart.Series series11 = new XYChart.Series();
        series1.setName("NOVMBER");
        series11.getData().add(new XYChart.Data("Nov", m11));
        XYChart.Series series12 = new XYChart.Series();
        series12.setName("DECEMBER");
        series12.getData().add(new XYChart.Data("Dec", m12));


        Barchart.getData().addAll(series1,series2,series3,series4,series5,series6,series7,series8,series9,series10,series11,series12);

    }

    @FXML
    public void GoToPieChartOn(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/StatFormation2.fxml"));
        Parent root = loader.load();
        x.getScene().setRoot(root);
    }

}
