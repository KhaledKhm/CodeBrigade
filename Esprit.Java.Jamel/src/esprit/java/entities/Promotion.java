/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.entities;

import java.sql.Date;

/**
 *
 * @author 21652
 */
public class Promotion {
          private Integer id ;
              private int id_evenement ;
    private String libelle;
    private int PoucentageReduction;
    

    public Promotion(Integer id, Integer id_evenement, String libelle, int PoucentageReduction) {
        this.id = id;
        this.id_evenement = id_evenement;
        this.libelle = libelle;
        this.PoucentageReduction = PoucentageReduction;
    }
    
       public Promotion(Integer id,String libelle, int PoucentageReduction ,Integer id_evenement ) {
        this.id = id;
        this.id_evenement = id_evenement;
        this.libelle = libelle;
        this.PoucentageReduction = PoucentageReduction;
    }

    public Promotion( String libelle, int PoucentageReduction , int id_evenement) {
        this.id_evenement = id_evenement;
        this.libelle = libelle;
        this.PoucentageReduction = PoucentageReduction;
    }
       
       

    public Promotion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId_evenement() {
        return id_evenement;
    }

    public void setId_evenement(Integer id_evenement) {
        this.id_evenement = id_evenement;
    }

    public Integer getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getPoucentageReduction() {
        return PoucentageReduction;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPoucentageReduction(int PoucentageReduction) {
        this.PoucentageReduction = PoucentageReduction;
    }

    @Override
    public String toString() {
        return "Promotion{" + "id=" + id + ", id_evenement=" + id_evenement + ", libelle=" + libelle + ", PoucentageReduction=" + PoucentageReduction + '}';
    }

 
  
    
}
