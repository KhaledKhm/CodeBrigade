package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import main.Main;
import main.MyListener;
import model.Formation;
import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;

public class formationController {
    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLable;

    @FXML
    private ImageView img;

    @FXML
    private void click(MouseEvent mouseEvent) throws FileNotFoundException {
        myListener.onClickListener(formation);
    }

    private Formation formation;
    private MyListener myListener;

    public void setData( Formation formation, MyListener myListener) {
        this.formation = formation;
        this.myListener = myListener;
        nameLabel.setText(formation.getLibelle());
        priceLable.setText(formation.getPrix()+Main.CURRENCY);

        String currentDirectory = System.getProperty("user.dir");



        Image image = new Image("file:"+currentDirectory+"\\src"+formation.getPhoto());
        img.setImage(image);
    }
}
