/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;

import com.codename1.ui.Button;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.entities.Offre;
import com.services.Offreservices;

/**
 *
 * @author firas
 */
public class EditForm extends Form {
        

    EditForm(Form previous) {
        setTitle("Edit Offre");
        setLayout(BoxLayout.y());
        TextField t0 = new TextField("","id");
        TextField t1 = new TextField("","Libelle");
        TextField t2 = new TextField("","Salaire");
        TextField t3= new TextField("", "Description");
       
        Button b=new Button("Edit Merch");
        addAll(t0,t1,t2,t3,b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
               Offre p=new Offre(t1.getText(),t2.getText(),t3.getText());
               Offreservices pr =new Offreservices();
               pr.editItem(Integer.parseInt(t0.getText()),p);
            }
         });
        getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());
        
    }
    
}
