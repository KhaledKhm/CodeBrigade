package Services;

import model.Formation;
import utils.DataSource;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class formationService {

    private Connection cnx= DataSource.getInstance().getCnx();






    public List<Formation> read(){
        List<Formation> list=new ArrayList();
        String req ="SELECT * FROM formation ";
        try {
            PreparedStatement st=cnx.prepareStatement(req);
            ResultSet rs=st.executeQuery();
            while(rs.next())
            {
                 list.add(new Formation(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getFloat(4),rs.getString(5), rs.getInt(6), rs.getDate(7).toLocalDate(), rs.getDate(8).toLocalDate(), rs.getString(9), rs.getInt(10)));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;


    }

    public Formation readbyId(int id){
        Formation f=null;
        String req ="SELECT * FROM formation WHERE id=?";
        try {
            PreparedStatement st=cnx.prepareStatement(req);
            st.setInt(1, id);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                f=new Formation(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getFloat(4),rs.getString(5), rs.getInt(6), rs.getDate(7).toLocalDate(), rs.getDate(8).toLocalDate(), rs.getString(9), rs.getInt(10));

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return f;


    }

    public void add(Formation f){
        String req ="INSERT INTO formation (libelle,description,prix,adresse,nbr_participant,date_debut,date_fin,photo,id_utili) VALUES (?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement st=cnx.prepareStatement(req);

            st.setString(1, f.getLibelle());
            st.setString(2,f.getDescription());
            st.setFloat(3,f.getPrix());
            st.setString(4,f.getAdresse());
            st.setInt(5,f.getNbr_participant());
            st.setDate  (6, java.sql.Date.valueOf(f.getDate_debut()));
            st.setDate(7, java.sql.Date.valueOf(f.getDate_fin()));
            st.setString(8,f.getPhoto());
            st.setInt(9,f.getId_utili());
            st.executeUpdate();
            System.out.println("Formation Ajoutee !");
        } catch (SQLException ex ) {
            System.out.println(ex.getMessage());
        }

    }
    public void supprimer(int id){
        String req ="DELETE FROM formation WHERE ID =?";
        try {
            PreparedStatement st=cnx.prepareStatement(req);
            st.setInt(1,id);
            st.executeUpdate();
            System.out.println("Formation Supprimee !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
