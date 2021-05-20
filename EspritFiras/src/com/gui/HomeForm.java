/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;

import com.codename1.ui.Button;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;

/**
 *
 * @author firas
 */
public class HomeForm extends Form {
    Form current;
    public HomeForm() {
        current=this;
    setTitle("Offre");
     setLayout(BoxLayout.y());
     
     add(new Label("choisir une option"));
     Button btnAddOffre = new Button("Ajouter une offre");
     Button btnListOffre = new Button("Listes des offres");
     Button b2=new Button("Update Offre");
        add(b2);
        Button b1=new Button("Delete Offre");
        add(b1);
     
     btnAddOffre.addActionListener(e-> new addForm(current).show());
     btnListOffre.addActionListener(e->new ListForm(current).show());
     b2.addActionListener(e->new EditForm(current).show() );
      b1.addActionListener(e->new DeleteForm(current).show() );
     addAll(btnAddOffre,btnListOffre);
    }
    
}
