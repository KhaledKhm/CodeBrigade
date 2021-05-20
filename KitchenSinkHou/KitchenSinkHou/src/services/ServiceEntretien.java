/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;
import entities.Entretien ; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import utils.Statics;
//import com.twilio.Twilio; 
/**
 *
 * @author OneEffect007
 */
public class ServiceEntretien {
    
    public ArrayList<Entretien> entre;
    
    public static ServiceEntretien instance=null;
    public boolean resultOK;
    private ConnectionRequest req;
    
    private ServiceEntretien() {
         req = new ConnectionRequest();
    }

    public static ServiceEntretien getInstance() {
        if (instance == null) {
            instance = new ServiceEntretien();
        }
        return instance;
    }
    
    public ArrayList<Entretien> parseEntretiens(String jsonText){
        try {
            entre=new ArrayList<>();
            JSONParser j = new JSONParser();

            Map<String,Object> tasksListJson = j.parseJSON(new CharArrayReader(jsonText.toCharArray()));

            List<Map<String,Object>> list = (List<Map<String,Object>>)tasksListJson.get("root");
            
                for(Map<String,Object> obj : list){
                Entretien t = new Entretien();
                float id = Float.parseFloat(obj.get("id").toString());
                float idParticipant = Float.parseFloat(obj.get("idParticipant").toString());
                float Idevaluation = Float.parseFloat(obj.get("Idevaluation").toString());
                t.setId((int) id);
                t.setLibelle(obj.get("Libelle").toString());
                t.setDescription(obj.get("Description").toString());
                t.setDateentretien(obj.get("Dateentretien").toString());
                t.setIdevaluation((int) Idevaluation);
                t.setIdParticipant((int) idParticipant);
                entre.add(t);
            }
        } catch (IOException ex) {
            
        }
        return entre;
    }
    
    public ArrayList<Entretien> getAllEntretiens(){
        String url = Statics.BASE_URL+"mobileEntretien/";
        req.setUrl(url);
        req.setPost(false);
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                entre = parseEntretiens(new String(req.getResponseData()));
                req.removeResponseListener(this);
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return entre;
    }
    
    public boolean addEntretien(Entretien t) {
        String url = Statics.BASE_URL + "mobileEntretienAdd/" + t.getLibelle() + "/" + t.getDescription()+ "/" + t.getDateentretien()+ "/" + t.getIdevaluation()+"/" + t.getIdParticipant() ; //création de l'URL
        req.setUrl(url);
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                resultOK = req.getResponseCode() == 200;
                req.removeResponseListener(this);
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return resultOK;
    }
    
     public boolean deleteEntretien(String id) {
        String url = Statics.BASE_URL + "mobileEntretienDelete/" + id;
        req.setUrl(url);
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                resultOK = req.getResponseCode() == 200;
                req.removeResponseListener(this);
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return resultOK;
    }
     
    public boolean updateEntretien(Entretien t,String id) {
        String url = Statics.BASE_URL + "mobileEntretienUpdate/" + id+ "/" + t.getLibelle() + "/" + t.getDescription()+ "/" + t.getDateentretien()+ "/" + t.getIdevaluation()+ "/" + t.getIdParticipant(); //création de l'URL
        req.setUrl(url);
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                resultOK = req.getResponseCode() == 200;
                req.removeResponseListener(this);
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return resultOK;
    }
}
