/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.gui;

import com.codename1.ui.Button;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;

/**
 *
 * @author bhk
 */
public class HomeCv extends Form  {

    Form current;
    /*Garder traçe de la Form en cours pour la passer en paramètres 
    aux interfaces suivantes pour pouvoir y revenir plus tard en utilisant
    la méthode showBack*/
    
    public HomeCv() {
        current = this; //Récupération de l'interface(Form) en cours
        setTitle("Home");
        setLayout(BoxLayout.y());

        
        Button btnGoCv = new Button("Go Cv");
        Button btnGoAvis = new Button("Go Avis");
        

        btnGoAvis.addActionListener(e -> new ListAvis(current).show());

        btnGoCv.addActionListener(e -> new ListCv(current).show());
        
        
        addAll(btnGoCv,btnGoAvis);

    }

}
