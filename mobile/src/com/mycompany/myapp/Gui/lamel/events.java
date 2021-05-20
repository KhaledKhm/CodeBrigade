/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.Gui.lamel;

import com.codename1.components.ImageViewer;
import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.mycompany.myapp.Entities.Evenement;
import com.mycompany.myapp.Services.eventsService;
import java.io.IOException;

/**
 *
 * @author 21652
 */
public class events extends Form {
    private Resources theme;

    public events() {

        setTitle("list Evenements");
       

   //toolbar     
      Toolbar tb=getToolbar();
       theme = UIManager.initFirstTheme("/theme");
         addGUIs();  
     
      tb.addMaterialCommandToSideMenu("Accueil",FontImage.MATERIAL_HOME,e->{new events().show();});
      tb.addMaterialCommandToSideMenu("Accueil",FontImage.MATERIAL_HOME,e->{new offres().show();});
      //endtoolbar    
    }

    private void addGUIs() {
        for (Evenement p : eventsService.getInstance().events()) {
            add(addItem(p));
        }
    }

    public Container addItem(Evenement P)  {
        Container eventContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        eventContainer.setUIID("articleContainer");

        Label titre = new Label("Titre: " + P.getLibelle());
        titre.setUIID("labelTitre");
        Label description = new Label("Déscription : " + P.getDescription());
        description.setUIID("labelContenu");
        Label datedebut= new Label("Date de Début : " + P.getDatedebut());
        Label datefin = new Label("Date fin : " + P.getDatefin());
        datedebut.setUIID("labelCreatedAt");
         datefin.setUIID("labelCreatedAt");
        Label prix = new Label("PRIX: " + P.getPrixInscription());
        prix.setUIID("labelCat");
       Button bt= new Button("Participe");
       try{Image img = Image.createImage("/1.jpg");
        eventContainer.add(img);}
       catch (IOException ex) {}
           
        Label sep = new Label("------------------------------------------------------------------");
         eventContainer.add(titre);
         eventContainer.add(description);
         eventContainer.add(datedebut);
          eventContainer.add(datefin);
           eventContainer.add(prix);
            eventContainer.add(bt);
            eventContainer.add(sep);
     
        

        return eventContainer;
    }

   
}