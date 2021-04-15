/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author wisse
 */
public class DataSource {
    
    private static DataSource instance;
    private Connection cnx;
    
    private final String USERNAME="root";
    private final String PASSWORD="";
    private final String URL="jdbc:mysql://localhost:3308/javadb";
    
    private  DataSource(){
        try {
            cnx = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Connected to javadb db !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static DataSource getInstance(){
    
        if(instance==null)
            instance= new DataSource();
        return instance;
    
    }

    public Connection getCnx() {
        return cnx;
    }
    
    
    
}
