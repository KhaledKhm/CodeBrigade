/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.tests;

import Edu.esprit.entities.Avis;
import Edu.esprit.services.AvisService;
import Edu.esprit.tools.MaConnexion;

/**
 *
 * @author Fayechi
 */
public class Test {

    public static void main(String[] args) {
        MaConnexion mc = MaConnexion.getInstance();
        Avis p = new Avis(33, "1st comment",5);
        AvisService ps = new AvisService();
        ps.ajouterAvis(p);
    }
    
}
