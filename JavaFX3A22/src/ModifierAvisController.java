/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Edu.esprit.entities.Avis;
import Edu.esprit.services.AvisService;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.lang.Object;
import javafx.scene.Scene;
import org.controlsfx.control.Rating ;



/**
 * FXML Controller class
 *
 * @author Fayechi
 */
public class ModifierAvisController implements Initializable {

    @FXML
    private TextField txtnom;
    @FXML
    private Rating txtprenom;
    @FXML
    private Button btnmodifier;
    @FXML
    private Button btncancel;
    @FXML
    private TextField txtid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void setdata(int id){
    
        AvisService a=new AvisService();
        Avis aa= new Avis(); 
        aa=a.readbyId(id);
        
        txtnom.setText(aa.getCommentaire());
        txtprenom.setRating(aa.getEtoiles());
        txtid.setText(Integer.toString(aa.getId()));
    }
    
  
    @FXML
    private void cancelon(ActionEvent event) {
        try { 
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherAvis.fxml"));
            Parent root = loader.load();
            
            btnmodifier.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    @FXML
    private void modifieron(ActionEvent event) {
        try {
            String nom = txtnom.getText();
            int prenom = (int) txtprenom.getRating();
            Avis p = new Avis(prenom,nom);
            AvisService ps = new AvisService();
            ps.modifier(Integer.parseInt(txtid.getText()),p);
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherAvis.fxml"));
            Parent root = loader.load();
            
            
            txtnom.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    
    
}
