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
import com.codename1.ui.TextArea;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.mycompany.myapp.services.ServiceAvis;


import java.io.IOException;




/**
 *
 * @author wisse
 */
public class ListAvis extends Form {
       String str="";
        
     public ListAvis(Form previous)  {
         
        
        
        
        setTitle("List Avis");
       
        SpanLabel sp = new SpanLabel();
        
        sp.setText(ServiceAvis.getInstance().getAllAviss().toString());
      
        
        add(sp);
        
        TextField num1 = new TextField("", "1234", 4, TextArea.NUMERIC);
        
    
        Button btnDeleteAvis = new Button("Delete Avis");
        add(num1);
        add(btnDeleteAvis);
        
       
        btnDeleteAvis.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent evt) {
                 ServiceAvis.getInstance().DeleteAvis(Integer.parseInt(num1.getText()));
                 Message m = new Message("TEST");
                Display.getInstance().sendMessage(new String[] {"wissem.lahbib@esprit.tn"}, "TEST", m);
                 previous.showBack();
                
             }
         });
        getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());
    }
    
}
