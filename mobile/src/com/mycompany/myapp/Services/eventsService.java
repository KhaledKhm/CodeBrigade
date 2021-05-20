/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.Services;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;
import com.mycompany.myapp.Entities.Evenement;
import com.mycompany.myapp.Utils.Statics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 21652
 */
public class eventsService {
    public static  eventsService instance=null;
    public boolean resultOK;
    public ArrayList<Evenement> events;
    private ConnectionRequest req;
    
    
    private eventsService() {
         req = new ConnectionRequest();
    }
    
    public static  eventsService getInstance() {
        if (instance == null) {
            instance = new  eventsService();
        }
        return instance;
    }
   

        
      public ArrayList<Evenement> events(){
        String url = Statics.BASE_URL+"afficheeventsMobile/";
        req.setUrl(url);
        req.setPost(false);
        req.addResponseListener(new ActionListener<NetworkEvent>(){
            @Override
            public void actionPerformed(NetworkEvent evt) {
                   events =parseevents(new String(req.getResponseData()));
                req.removeResponseListener(this);
            }
        });
         NetworkManager.getInstance().addToQueueAndWait(req);
          System.out.println(events);
        return events;
    }
      
      
    public ArrayList<Evenement> parseevents(String jsonText){
        try {
           this.events=new ArrayList<>();
            JSONParser j = new JSONParser();// Instanciation d'un objet JSONParser permettant le parsing du résultat json

            Map<String,Object> tasksListJson = j.parseJSON(new CharArrayReader(jsonText.toCharArray()));

            List<Map<String,Object>> list = (List<Map<String,Object>>)tasksListJson.get("root");
            
            //Parcourir la liste des tâches Json
            for(Map<String,Object> obj : list){
                //Création des tâches et récupération de leurs données
                Evenement s = new Evenement();
                s.setId((int) Float.parseFloat(obj.get("id").toString()));
                s.setLibelle(obj.get("libelle").toString());
                s.setDescription(obj.get("description").toString());  
                s.setDatedebut(obj.get("DateDebut").toString());
                 s.setDatefin(obj.get("DateFin").toString());
            
         
               events.add(s);
            }
            
            
        } catch (IOException ex) {}
        System.out.println(events);
        return events;
    }
}
