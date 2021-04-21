package model;

import java.io.File;
import java.time.LocalDate;
import java.util.Date;

public class Formation {
    private int id;
    private String libelle;
    private String description;
    private float prix;
    private String adresse;
    private int nbr_participant;
    private LocalDate date_debut;
    private LocalDate date_fin;
    private String photo;
    private int id_utili;

    public Formation() {

    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbr_participant() {
        return nbr_participant;
    }

    public void setNbr_participant(int nbr_participant) {
        this.nbr_participant = nbr_participant;
    }

    public LocalDate getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(LocalDate date_debut) {
        this.date_debut = date_debut;
    }

    public LocalDate getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(LocalDate date_fin) {
        this.date_fin = date_fin;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getId_utili() {
        return id_utili;
    }

    public void setId_utili(int id_utili) {
        this.id_utili = id_utili;
    }

    public Formation(String libelle, String description, float prix, String adresse, int nbr_participant, LocalDate date_debut, LocalDate date_fin, String photo, int id_utili) {
        this.libelle = libelle;
        this.description = description;
        this.prix = prix;
        this.adresse = adresse;
        this.nbr_participant = nbr_participant;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.photo = photo;
        this.id_utili = id_utili;
    }

    public Formation(int id, String libelle, String description, float prix, String adresse, int nbr_participant, LocalDate date_debut, LocalDate date_fin, String photo, int id_utili) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.prix = prix;
        this.adresse = adresse;
        this.nbr_participant = nbr_participant;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.photo = photo;
        this.id_utili = id_utili;
    }

    @Override
    public String toString() {
        return "Formation{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", adresse='" + adresse + '\'' +
                ", nbr_participant=" + nbr_participant +
                ", date_debut=" + date_debut +
                ", date_fin=" + date_fin +
                ", photo='" + photo + '\'' +
                ", id_utili=" + id_utili +
                '}';
    }
}
