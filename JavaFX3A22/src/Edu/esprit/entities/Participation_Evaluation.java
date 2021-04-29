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
public class Participation_Evaluation {
    private int code,id_p,id_e,note;

    public Participation_Evaluation() {
    }

    public Participation_Evaluation(int id_p, int id_e,int note) {
        this.id_p = id_p;
        this.id_e = id_e;
        this.note = note;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Participation_Evaluation{" + "code=" + code + ", id_p=" + id_p + ", id_e=" + id_e + ", note=" + note + '}';
    }
    
    
    
    
    
}
