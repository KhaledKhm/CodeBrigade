/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

//import java.sql.*;

/**
 *
 * @author SPIRIT
 */
public class utilisateur {
    private int id;
    private String password;
    private String account_status;
    private int cin_personne;
    private String immatricule_entreprise;
    private String nom_personne;
    private String prenom_personne;
    private String libelle_entreprise;
    private String sexe_personne;
 //   private Date date_nais_personne;
    private String etat_sociale_personne;
    private int telephone;
    private String adresse;
    private String email;
    private String siteweb;
    private String domaine_personne;
    private String secteur_entreprise;
    private String role;
    private String googleAuthenticatorSecret;

    public utilisateur() {
    }

    
    //constructor global
    public utilisateur(int id, String password, String account_status, int cin_personne, String immatricule_entreprise, String nom_personne, String prenom_personne, String libelle_entreprise, String sexe_personne/*, Date date_nais_personne*/, String etat_sociale_personne, int telephone, String adresse, String email, String siteweb, String domaine_personne, String secteur_entreprise, String role, String googleAuthenticatorSecret) {
        this.id = id;
        this.password = password;
        this.account_status = account_status;
        this.cin_personne = cin_personne;
        this.immatricule_entreprise = immatricule_entreprise;
        this.nom_personne = nom_personne;
        this.prenom_personne = prenom_personne;
        this.libelle_entreprise = libelle_entreprise;
        this.sexe_personne = sexe_personne;
      //  this.date_nais_personne = date_nais_personne;
        this.etat_sociale_personne = etat_sociale_personne;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.siteweb = siteweb;
        this.domaine_personne = domaine_personne;
        this.secteur_entreprise = secteur_entreprise;
        this.role = role;
        this.googleAuthenticatorSecret = googleAuthenticatorSecret;
    }

    //constructor pour formateur et candidat
   /* public utilisateur(String password, int cin_personne, String nom_personne, String prenom_personne, String sexe_personne, Date date_nais_personne, String etat_sociale_personne, int telephone, String adresse, String email, String domaine_personne, String role, String googleAuthenticatorSecret) {
        this.password = password;
        this.cin_personne = cin_personne;
        this.nom_personne = nom_personne;
        this.prenom_personne = prenom_personne;
        this.sexe_personne = sexe_personne;
        this.date_nais_personne = date_nais_personne;
        this.etat_sociale_personne = etat_sociale_personne;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.domaine_personne = domaine_personne;
        this.role = role;
        this.googleAuthenticatorSecret = googleAuthenticatorSecret;
    }
  */

    //constructor pour entreprise
    public utilisateur(String email, String password, String immatricule_entreprise, String libelle_entreprise, int telephone, String adresse, String siteweb, String secteur_entreprise, String role, String googleAuthenticatorSecret) {
        this.password = password;
        this.immatricule_entreprise = immatricule_entreprise;
        this.libelle_entreprise = libelle_entreprise;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.siteweb = siteweb;
        this.secteur_entreprise = secteur_entreprise;
        this.role = role;
        this.googleAuthenticatorSecret = googleAuthenticatorSecret;
    }
  
    

    public utilisateur(String password, String account_status) { //pour tester
        this.password = password;
        this.account_status = account_status;
    }

 

    public utilisateur(int id, String password) { // pour tester
        this.id = id;
        this.password = password;
    }

    public utilisateur(String password, String account_status, String email) {
        this.password = password;
        this.account_status = account_status;
        this.email = email;
    }

    public utilisateur(String password, int cin_personne, String nom_personne, String prenom_personne, String sexe_personne, int telephone, String adresse, String email, String domaine_personne, String role) {
        this.password = password;
        this.cin_personne = cin_personne;
        this.nom_personne = nom_personne;
        this.prenom_personne = prenom_personne;
        this.sexe_personne = sexe_personne;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.domaine_personne = domaine_personne;
        this.role = role;
    }

  /*  public utilisateur(String password, int cin_personne, String nom_personne, String prenom_personne, String sexe_personne, Date date_nais_personne, String etat_sociale_personne, int telephone, String adresse, String email, String domaine_personne, String role) {
        this.password = password;
        this.cin_personne = cin_personne;
        this.nom_personne = nom_personne;
        this.prenom_personne = prenom_personne;
        this.sexe_personne = sexe_personne;
        this.date_nais_personne = date_nais_personne;
        this.etat_sociale_personne = etat_sociale_personne;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.domaine_personne = domaine_personne;
        this.role = role;
    }*/

    public utilisateur(String password, int cin_personne, String nom_personne, String prenom_personne, String sexe_personne, String etat_sociale_personne, int telephone, String adresse, String email, String domaine_personne, String role) {
        this.password = password;
        this.cin_personne = cin_personne;
        this.nom_personne = nom_personne;
        this.prenom_personne = prenom_personne;
        this.sexe_personne = sexe_personne;
        this.etat_sociale_personne = etat_sociale_personne;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.domaine_personne = domaine_personne;
        this.role = role;
    }

  /*  public utilisateur(String email, String password, int cin_personne, String nom_personne, String prenom_personne, String sexe_personne, Date date_nais_personne, String etat_sociale_personne, int telephone, String adresse, String domaine_personne, String role, String googleAuthenticatorSecret) {
        this.password = password;
        this.cin_personne = cin_personne;
        this.nom_personne = nom_personne;
        this.prenom_personne = prenom_personne;
        this.sexe_personne = sexe_personne;
        this.date_nais_personne = date_nais_personne;
        this.etat_sociale_personne = etat_sociale_personne;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.domaine_personne = domaine_personne;
        this.role = role;
        this.googleAuthenticatorSecret = googleAuthenticatorSecret;
    }*/

    public utilisateur(int cin_personne, String email, String password, String nom_personne, String prenom_personne, int telephone, String adresse) {
        
        
    }

  
    

  
    

   


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   /*          public String MD5(String md5) {
   try {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
        byte[] array = md.digest(md5.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
       }
        return sb.toString();
    } catch (java.security.NoSuchAlgorithmException e) {
    }
    return null;
}*/
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount_status() {
        return account_status;
    }

    public void setAccount_status(String account_status) {
        this.account_status = account_status;
    }

    public int getCin_personne() {
        return cin_personne;
    }

    public void setCin_personne(int cin_personne) {
        this.cin_personne = cin_personne;
    }

    public String getImmatricule_entreprise() {
        return immatricule_entreprise;
    }

    public void setImmatricule_entreprise(String immatricule_entreprise) {
        this.immatricule_entreprise = immatricule_entreprise;
    }

    public String getNom_personne() {
        return nom_personne;
    }

    public void setNom_personne(String nom_personne) {
        this.nom_personne = nom_personne;
    }

    public String getPrenom_personne() {
        return prenom_personne;
    }

    public void setPrenom_personne(String prenom_personne) {
        this.prenom_personne = prenom_personne;
    }

    public String getLibelle_entreprise() {
        return libelle_entreprise;
    }

    public void setLibelle_entreprise(String libelle_entreprise) {
        this.libelle_entreprise = libelle_entreprise;
    }

    public String getSexe_personne() {
        return sexe_personne;
    }

    public void setSexe_personne(String sexe_personne) {
        this.sexe_personne = sexe_personne;
    }

  /*  public Date getDate_nais_personne() {
        return date_nais_personne;
    }

    public void setDate_nais_personne(Date date_nais_personne) {
        this.date_nais_personne = date_nais_personne;
    }*/

    public String getEtat_sociale_personne() {
        return etat_sociale_personne;
    }

    public void setEtat_sociale_personne(String etat_sociale_personne) {
        this.etat_sociale_personne = etat_sociale_personne;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSiteweb() {
        return siteweb;
    }

    public void setSiteweb(String siteweb) {
        this.siteweb = siteweb;
    }

    public String getDomaine_personne() {
        return domaine_personne;
    }

    public void setDomaine_personne(String domaine_personne) {
        this.domaine_personne = domaine_personne;
    }

    public String getSecteur_entreprise() {
        return secteur_entreprise;
    }

    public void setSecteur_entreprise(String secteur_entreprise) {
        this.secteur_entreprise = secteur_entreprise;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
       public String getGoogleAuthenticatorSecret() {
        return googleAuthenticatorSecret;
    }

    public void setGoogleAuthenticatorSecret(String googleAuthenticatorSecret) {
        this.googleAuthenticatorSecret = googleAuthenticatorSecret;
    }

    @Override
    public String toString() {
        return "utilisateur{" + "id=" + id + ", password=" + password + ", account_status=" + account_status + ", cin_personne=" + cin_personne + ", immatricule_entreprise=" + immatricule_entreprise + ", nom_personne=" + nom_personne + ", prenom_personne=" + prenom_personne + ", libelle_entreprise=" + libelle_entreprise + ", sexe_personne=" + sexe_personne + /*", date_nais_personne=" + date_nais_personne +*/ ", etat_sociale_personne=" + etat_sociale_personne + ", telephone=" + telephone + ", adresse=" + adresse + ", email=" + email + ", siteweb=" + siteweb + ", domaine_personne=" + domaine_personne + ", secteur_entreprise=" + secteur_entreprise + ", role=" + role + '}';
    }

    
}
