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
import entities.Evaluation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import utils.Statics;

/**
 *
 * @author OneEffect007
 */
public class ServiceEvaluation {
    public ArrayList<Evaluation> evaluations;
    
    public static ServiceEvaluation instance=null;
    public boolean resultOK;
    private ConnectionRequest req;
    
    private ServiceEvaluation() {
         req = new ConnectionRequest();
    }

    public static ServiceEvaluation getInstance() {
        if (instance == null) {
            instance = new ServiceEvaluation();
        }
        return instance;
    }
    
    public ArrayList<Evaluation> parseEvaluations(String jsonText){
        try {
            evaluations=new ArrayList<>();
            JSONParser j = new JSONParser();

            Map<String,Object> tasksListJson = j.parseJSON(new CharArrayReader(jsonText.toCharArray()));

            List<Map<String,Object>> list = (List<Map<String,Object>>)tasksListJson.get("root");
            
            for(Map<String,Object> obj : list){
                Evaluation t = new Evaluation();
                float id = Float.parseFloat(obj.get("id").toString());
                float idEntreprise = Float.parseFloat(obj.get("idEntreprise").toString());
                t.setId((int) id);
                t.setLibelle(obj.get("Libelle").toString());
                t.setDescription(obj.get("Description").toString());
                t.setDateevaluation(obj.get("Dateevaluation").toString());
                t.setIdEntreprise((int) idEntreprise);
                evaluations.add(t);
            }
        } catch (IOException ex) {
            
        }
        return evaluations;
    }
    
    public ArrayList<Evaluation> getAllEvaluations(){
        String url = Statics.BASE_URL+"mobileEvaluation/";
        req.setUrl(url);   
        req.setPost(false);
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                evaluations = parseEvaluations(new String(req.getResponseData()));
                req.removeResponseListener(this);
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return evaluations;
    }
    
    public boolean addEvaluation(Evaluation t) {
        String url = Statics.BASE_URL + "mobileEvaluationAdd/" + t.getLibelle() + "/" + t.getDescription()+ "/" + t.getDateevaluation()+ "/" + t.getIdEntreprise(); //création de l'URL
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
    
     public boolean deleteEvaluation(String id) {
        String url = Statics.BASE_URL + "mobileEvaluationDelete/" + id;
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
     
    public boolean updateEvaluation(Evaluation t,String id) {
        String url = Statics.BASE_URL + "mobileEvaluationUpdate/" + id+ "/" + t.getLibelle() + "/" + t.getDescription()+ "/" + t.getDateevaluation()+ "/" + t.getIdEntreprise(); //création de l'URL
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
