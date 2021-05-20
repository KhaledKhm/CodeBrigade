/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.Container;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.URLImage;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.entities.Offre;
import com.entities.Statics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author firas
 */
public class Offreservices {
    public static Offreservices instance=null;
    public boolean resultOK;
    private ConnectionRequest req;
    
    public ArrayList<Offre> offres;

    public Offreservices() {
         req = new ConnectionRequest();
    }
    public static Offreservices getInstance() 
    {
        if (instance == null) 
        {
            instance = new Offreservices();
        }
        return instance;
    }
    public boolean addItem(Offre p) {
        String url = Statics.BASE_URL + "/addOffreJSON?Libelle=" + p.getLibelle() + "&Salaire="
                + p.getSalaire() + "&Description=" + p.getDescription() ;
                ;
                 //création de l'URL
        req.setUrl(url);// Insertion de l'URL de notre demande de connexion
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                resultOK = req.getResponseCode() == 200; //Code HTTP 200 OK
                req.removeResponseListener(this); 
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return resultOK;
    }
     public boolean deleteItem(int id) {
        String url = Statics.BASE_URL + "/deleteOffreJSON/"+id;
                 //création de l'URL
        req.setUrl(url);// Insertion de l'URL de notre demande de connexion
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                resultOK = req.getResponseCode() == 200; //Code HTTP 200 OK
                req.removeResponseListener(this); 
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return resultOK;
    }
    public boolean editItem(int id,Offre p) {
        String url = Statics.BASE_URL + "/updateOffreJSON/"+id+"?Libelle="+p.getLibelle() + "&Salaire="
                + p.getSalaire() + "&Description=" + p.getDescription();
                 //création de l'URL
        req.setUrl(url);// Insertion de l'URL de notre demande de connexion
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                resultOK = req.getResponseCode() == 200; //Code HTTP 200 OK
                req.removeResponseListener(this); 
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return resultOK;
    }
     public ArrayList<Offre> parseTasks(String jsonText) 
    {
        try {
            offres=new ArrayList<>();
            JSONParser j = new JSONParser();
// Instanciation d'un objet JSONParser permettant le parsing du résultat json
            Map<String,Object> tasksListJson  =j.parseJSON(new CharArrayReader(jsonText.toCharArray()));
            System.out.println("mapsize=>"+tasksListJson.size());
            List<Map<String,Object>> list = (List<Map<String,Object>>)tasksListJson.get("root");
            for (Object keys : tasksListJson.values())
{
   System.out.println("values->"+keys);
}
            System.out.println(list.size());
            //Parcourir la liste des tâches Json
            for(Map<String,Object> obj : list)
            {
                Offre p = new Offre();
                float id = Float.parseFloat(obj.get("id").toString());
                p.setId((int)id);
                p.setSalaire(obj.get("Salaire").toString());
                p.setLibelle(obj.get("Libelle").toString());
                p.setDescription(obj.get("Description").toString());
              
                System.out.println("&^p^&=>"+p.toString());
                offres.add(p);
            }
        }
        catch (IOException ex) 
        {
            System.out.println("error");
        }
         /*
            A ce niveau on a pu récupérer une liste des tâches à partir
        de la base de données à travers un service web
        
        */
        return offres;
        
    }
     
      public ArrayList<Offre> getAllTasks(){
        String url = Statics.BASE_URL+"/afficheoffresMobile";
        req.setUrl(url);
        req.setPost(false);
      //  Form hi = new Form("Hi World", BoxLayout.y());
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                String response = new String(req.getResponseData());
                offres = parseTasks(response);
                req.removeResponseListener(this);
                System.out.println(response);
                     // req.removeResponseListener(this);
            }
        });
        
        System.out.println("offres=>"+offres);
        NetworkManager.getInstance().addToQueueAndWait(req);
       // return hi;
       return offres;
    }
    public Container addItemcontainer(Offre p) {

        Container cell = new Container(BoxLayout.y());
        //ImageViewer image = new ImageViewer(theme.getImage(p.getImage()));
        Container labelsCtn = new Container(BoxLayout.y());
        Label name = new Label(p.getLibelle());
        Label sal = new Label(p.getSalaire()+"$");
        Label price  = new Label(p.getDescription());
       
        //Button mailBtn = new Button(p.getMail());
        labelsCtn.addAll(name,price,sal);
        
       
      
       // cell.add(background);
        return cell;
    }
    
}
    

