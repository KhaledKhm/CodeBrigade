/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;

import com.codename1.components.SpanLabel;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.entities.Offre;
import com.services.Offreservices;

/**
 *
 * @author firas
 */
public class ListForm extends Form {
    private Resources theme;
    public ListForm(Form previous){
        
    setTitle("List des Offres");
 
    
    /*SpanLabel sp = new SpanLabel();
    sp.setText(Offreservices.getInstance().getAllTasks().toString());
    add(sp);
    */
      Toolbar tb=getToolbar();
       theme = UIManager.initFirstTheme("/theme");
         addGUIs();  
    
    
     getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());
    }
      private void addGUIs() {
        for (Offre p : Offreservices.getInstance().getAllTasks()) {
            add(addItem(p));
        }
    }

    public Container addItem(Offre P)  {
        Container eventContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        eventContainer.setUIID("articleContainer");

        Label titre = new Label("Titre: " + P.getLibelle());
        titre.setUIID("labelTitre");
        Label description = new Label("Déscription : " + P.getDescription());
        description.setUIID("labelContenu");
      
        Label prix = new Label("PRIX: " + P.getSalaire());
        prix.setUIID("labelCat");
       
     
           
        Label sep = new Label("------------------------------------------------------------------");
         eventContainer.add(titre);
         eventContainer.add(description);
       
           eventContainer.add(prix);
          
            eventContainer.add(sep);
     
        

        return eventContainer;
    }
    
}
