package Controller;

import Services.formationService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.stage.Stage;
import model.Formation;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StatFormation2Controller implements Initializable {

@FXML
private  PieChart piechart;







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

        List<Formation> list=new ArrayList();
        formationService fs=new formationService();
        list=fs.read();
        for(Formation f :list)
        {

            switch(f.getDate_debut().getMonth().toString()) {
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



        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("JANUARY", m1),
                        new PieChart.Data("FEBRUARY", m2),
                        new PieChart.Data("MARCH", m3),
                        new PieChart.Data("APRIL", m4),
                        new PieChart.Data("MAY", m5),
                        new PieChart.Data("JUNE", m6),
                        new PieChart.Data("JULY", m7),
                        new PieChart.Data("AUGEST", m8),
                        new PieChart.Data("SEPTEMBER", m9),
                        new PieChart.Data("OCTOBER", m10),
                        new PieChart.Data("NOVEMBER", m11),
                        new PieChart.Data("DECEMBER", m12)

                );


        piechart.setData(pieChartData);
    }

    public void GoToBarChartOn(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/StatFormation.fxml"));
        Parent root = loader.load();
        piechart.getScene().setRoot(root);
    }
}
