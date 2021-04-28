/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.entities;

import static java.sql.Types.NULL;

/**
 *
 * @author OneEffect007
 */
public class Participation_Evenement {
    private int id_p,id_e;
     private String email;

    public Participation_Evenement() {
    }

    public Participation_Evenement(int id_p, int id_e) {
        this.id_p = id_p;
        this.id_e = id_e;
       
    }

    public Participation_Evenement(int id_p, int id_e, String email) {
        this.id_p = id_p;
        this.id_e = id_e;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public int getId_e() {
        return id_e;
    }

    public void setId_e(int id_e) {
        this.id_e = id_e;
    }

    @Override
    public String toString() {
        return "Participation_Evenement{" + "id_p=" + id_p + ", id_e=" + id_e + '}';
    }

}
