
package Edu.esprit.tools;

import Edu.esprit.entities.Avis;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MaConnexion {

   
   public String url ="jdbc:mysql://localhost:3306/Jobbook";
   public String user ="root";
   public String pwd = "";
   
   private Connection cnx;
   public static MaConnexion ct;

    private MaConnexion() {
       try {
           cnx = DriverManager.getConnection(url,user,pwd);
           System.out.println("Connexion etablie");
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
    }
    
    public static MaConnexion getInstance(){
        if (ct==null)
            ct = new MaConnexion();
        return ct;
    }

    public Connection getCnx() {
        return cnx;
    }
   /* 
    public static ObservableList<Avis> getAvis() {
    
        MaConnexion cnx;
       cnx = MaConnexion();
        ObservableList<Avis> list = FXCollections.observableArrayList();
        try{
            PreparedStatment ps = cnx.PreparedStatement("select * from Avis");
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
            list.add(new Avis(rs.getInt("id"),rs.getString("commentaire"),rs.getInt("etoiles")));
            }
            
        }catch(Exception e){}
        return list;
    }*/
    
    
   
   
    
}
