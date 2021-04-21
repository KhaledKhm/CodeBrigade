package model;

public class Cv {
    private int id;
    private String cv;
    private int idutili;

    public int getId() {
        return id;
    }

    public int getIdutili() {
        return idutili;
    }

    public void setIdutili(int idutili) {
        this.idutili = idutili;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public Cv(int id, String cv,int idutili) {
        this.id = id;
        this.cv = cv;
        this.idutili=idutili;
    }

    public Cv(String cv,int idutili) {
        this.cv = cv;
        this.idutili=idutili;
    }

    public Cv() {
    }
}
