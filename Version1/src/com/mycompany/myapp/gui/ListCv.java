/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.gui;

import com.codename1.components.ImageViewer;
import com.codename1.components.SpanLabel;
import com.codename1.io.FileSystemStorage;
import com.codename1.io.Util;
import com.codename1.messaging.Message;
import com.codename1.ui.Button;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.mycompany.myapp.services.ServiceCv;

import java.io.IOException;




/**
 *
 * @author wisse
 */
public class ListCv extends Form {
       String str="";
        
     public ListCv(Form previous)  {
         
         String path= "File: C:/wamp64/www/BackDraft/public/uploads" ;
        
         int id=62;
         ImageViewer img=null;
        setTitle("List Cv");
       
        SpanLabel sp = new SpanLabel();
        if(ServiceCv.getInstance().getCv(id)==null)
        {
           previous.showBack(); 
        }
        sp.setText(ServiceCv.getInstance().getCv(id));
       str =ServiceCv.getInstance().getCv(id);
        str = str.substring(1, str.length() - 1);
        str = str.substring(7, str.length());
        str="/fich"+str;
        
  
        

FileSystemStorage fss = FileSystemStorage.getInstance();
String fileName ="http://localhost/BackDraft/public/uploads"+str+".png";
System.out.println(fileName);
if (!fss.exists(fileName)) {
    System.out.println("Erreur LOad");
}
Display.getInstance().execute(fileName);


       
       
        add(sp);
         System.out.println(path+str+".png");
        
        
    /*    try {
             img = new ImageViewer(Image.createImage("/"+str+".png"));
         } catch (IOException ex) {
             previous.showBack();
         }*/
        Button btnDeleteCv = new Button("Delete Cv");
      add(btnDeleteCv);
        //add(img);
       
        btnDeleteCv.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent evt) {
                 ServiceCv.getInstance().DeleteCv(id);
                 Message m = new Message("TEST");
                Display.getInstance().sendMessage(new String[] {"wissem.lahbib@esprit.tn"}, "TEST", m);
                 previous.showBack();
                
             }
         });
        getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());
    }
    
}
