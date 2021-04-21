package Services;

import model.Cv;
import model.Formation;
import utils.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class cvService {

    private Connection cnx= DataSource.getInstance().getCnx();
    public void add(Cv c){
        String req ="INSERT INTO cv (cv,idutili) VALUES (?,?)";
        try {

            PreparedStatement st=cnx.prepareStatement(req);

            st.setString(1, c.getCv());
            st.setInt(2,c.getIdutili());
            st.executeUpdate();
            System.out.println("CV Ajoutee !");
        } catch (SQLException ex ) {
            System.out.println(ex.getMessage());
        }

    }
}
