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
public class addForm extends Form {
     public addForm() {
    }

    public addForm(Form previous) {
        setTitle("Add Offre");
        setLayout(BoxLayout.y());
        
        TextField t1 = new TextField("","Libelle");
        TextField t2= new TextField("", "Salaire");
        TextField t3= new TextField("", "Description");
        
        //addAll(t1,t2,t3,t4,t5,t6);
        Button btnValide = new Button("Ajouter Offre");
        addAll(t1,t2,t3,btnValide);
        btnValide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
               Offre p=new Offre(t1.getText(),t2.getText(),t3.getText());
                Offreservices pr =new Offreservices();
                pr.addItem(p);
            }
           
        });
        getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());
    }

    

   
}
