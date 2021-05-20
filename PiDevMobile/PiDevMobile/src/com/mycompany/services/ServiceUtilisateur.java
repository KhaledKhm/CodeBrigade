/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.MultipartRequest;
import com.codename1.io.NetworkManager;
import com.codename1.ui.*;
import com.codename1.ui.util.Resources;
import com.mycompany.gui.SessionManager;
import com.mycompany.utils.Statics;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Map;
import java.util.Vector;




/**
 *
 * @author SPIRIT
 */
public class ServiceUtilisateur {
    
    //singleton
    public static ServiceUtilisateur instance = null;
    
    public static boolean resultOk = true;
    
    //initialisation connection request
    private ConnectionRequest req;
    String json;
    
    int onlineId;
    String onlineEmail;
    String onlineRole;
    
    public static ServiceUtilisateur getInstance() {
        if (instance == null)
            instance = new ServiceUtilisateur();
        return instance;
    }
    
    public ServiceUtilisateur(){
    req = new ConnectionRequest();
    }
    
    
    //Signup
    public void signup(TextField email,TextField password,TextField confirmpassword,ComboBox<String> roles,Resources res){
        
    
        
        
        String url = Statics.BASE_URL+"/mobile/signup?email="+email.getText()+"&password="+password.getText().toString()+"&role="+roles.getSelectedItem().toString();
        
        req.setUrl(url);
        
        //Control de saisi
        if(email.getText().equals(" ") && password.getText().equals(" ")){
            Dialog.show("Erreur","Veiuller remplir les champs","OK",null);
            
            //execution d url
            req.addResponseListener((e)-> {
                
                byte[]data = (byte[]) e.getMetaData();
                String responseData = new String(data);
                
                System.out.println("data ===>"+responseData);
            }
            );
            
            //execution d request to wait for the server
            NetworkManager.getInstance().addToQueueAndWait(req);
        }
        
    }
    
    
    //login
    
    public void signin(TextField email,TextField password, Resources rs){
    
        String url= Statics.BASE_URL+"/mobile/signin?email="+email.getText().toString()+"&password="+password.getText().toString();
        req = new ConnectionRequest(url,false);
        req.setUrl(url);
        
        req.addResponseListener((e)->{
           
            JSONParser j = new JSONParser();
            
            String json = new String(req.getResponseData()) + "";
            
            try {
            if(json.equals("failed")){
                Dialog.show("Echec d'authentification","Login ou mot de passe eronne","OK",null);
            }
            else{
                System.out.println("data =="+json);
                
                Map<String,Object> user = j.parseJSON(new CharArrayReader(json.toCharArray()));
                
                
                //session
                
                 //Session  Service
                float id = Float.parseFloat(user.get("id").toString());
                SessionManager.setId((int)id);
                
                SessionManager.setEmail(user.get("email").toString());
                SessionManager.setPassowrd(user.get("password").toString());
                SessionManager.setRole(user.get("role").toString());
                
                System.out.println("current user ==>"+SessionManager.getEmail()+", "+SessionManager.getPassowrd()+", "+SessionManager.getRole());
                
                onlineId=parseInt(user.get("id").toString());
                onlineEmail=user.get("password").toString();
                onlineRole=user.get("role").toString();
              
                
                if(user.size() >0){ //user found
                    //ekteb lblasa eli 7achtek biha par exemple
                    if(onlineRole.equals("ROLE_Candidat")){
                    //new ListeReclamationForm(rs).show();
                    }else if(onlineRole.equals("ROLE_Formateur")){
                    //new ListeReclamationForm(rs).show();
                    }else if(onlineRole.equals("ROLE_Entreprise")){
                    //new ListeReclamationForm(rs).show();
                    }else if(onlineRole.equals("ROLE_Admin")){
                    //new ListeReclamationForm(rs).show();
                    }
                    
                }   
            
            }
            
            }catch(Exception ex){
                ex.printStackTrace();
            }
        });
        
        NetworkManager.getInstance().addToQueueAndWait(req);
    }
    
    
    //mdp oublie
    public String getPasswordByEmail(String email, Resources rs){
    
        String mp= " ";
        String url=Statics.BASE_URL+"/mobile/getPasswordByEmail?email="+email;
        req = new ConnectionRequest(url,false);
        req.setUrl(url);
        
        req.addResponseListener(e ->{
            JSONParser j = new JSONParser();
            
            json = new String(req.getResponseData()) + "";
            
            try{
            
                System.out.println("data =="+json);
                
                Map<String,Object> password = j.parseJSON(new CharArrayReader(json.toCharArray()));
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
        });
        
        NetworkManager.getInstance().addToQueueAndWait(req);
        
       return json;
    }
    
     
    public static void EditUser(String email, String password){
        
    String url = Statics.BASE_URL+"/mobile/editUser?email="+email+"password="+password;
                MultipartRequest req = new MultipartRequest();
                
                req.setUrl(url);
                req.setPost(true);
                req.addArgument("id", String.valueOf(SessionManager.getId()));
                req.addArgument("email", email);
                req.addArgument("password", password);
                
                System.out.println(url);
                System.out.println(email);
                req.addResponseListener((response)-> {
                    
                    byte[] data = (byte[]) response.getMetaData();
                    String s = new String(data);
                    System.out.println(s);
                    if (s.equals("success")) {
                    } else {
                        Dialog.show("Erreur", "Echec de modification", "Ok", null);
                    }                    
                });
                NetworkManager.getInstance().addToQueueAndWait(req);
    }
    
    
    
}
