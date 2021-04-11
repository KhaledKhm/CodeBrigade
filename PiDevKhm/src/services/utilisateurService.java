/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.*;
import tools.MaConnexion;

/**
 *
 * @author SPIRIT
 */
public class utilisateurService {
    Connection cnx;
    PreparedStatement ste;

    public utilisateurService() {
        cnx = MaConnexion.getInstance().getCnx();
    }
    
    
}
