/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.codename1.capture.Capture;
import com.codename1.components.ToastBar;
import com.codename1.ui.Button;
import static com.codename1.ui.CN.SOUTH;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.TextArea;
import com.codename1.ui.TextComponent;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.TextModeLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.ui.validation.LengthConstraint;
import com.codename1.ui.validation.RegexConstraint;
import com.codename1.ui.validation.Validator;
import entities.Evaluation ; 
import services.ServiceEvaluation ; 
import com.codename1.io.Log;
import com.codename1.messaging.Message;
import static com.codename1.ui.CN.isTablet;
import static com.codename1.ui.CN.openGallery;
import static com.codename1.ui.CN1Constants.GALLERY_IMAGE;
import com.codename1.ui.Command;
import com.codename1.ui.Component;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.Label;

import com.codename1.ui.animations.CommonTransitions;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.LayeredLayout;
import java.io.IOException;


/**
 *
 * @author IBM
 */
public class AddEvaluation extends Demo {

   private Resources res;

    public String getDisplayName() {
        return "Add Evaluation";
    }

    public Image getDemoIcon() {
        return getResources().getImage("input.png");
    }

    public Container createDemo(Form parent) {
        res = UIManager.initFirstTheme("/theme");
        TextComponent Libelle = new TextComponent().labelAndHint("Libelle");
        FontImage.setMaterialIcon(Libelle.getField().getHintLabel(), FontImage.MATERIAL_LABEL);
        
        TextComponent Description = new TextComponent().labelAndHint("Description");
        FontImage.setMaterialIcon(Description.getField().getHintLabel(), FontImage.MATERIAL_DESCRIPTION);  

        //test
        TextComponent Dateevaluation = new TextComponent().labelAndHint("Date Evaluation");
        FontImage.setMaterialIcon(Dateevaluation.getField().getHintLabel() , FontImage.MATERIAL_CALENDAR_TODAY);
        
        //end test
        TextComponent IdEntreprise = new TextComponent().labelAndHint("Id Entreprise"); 
        FontImage.setMaterialIcon(IdEntreprise.getField().getHintLabel(), FontImage.MATERIAL_COMPUTER);

        Validator val = new Validator();
        val.setValidationFailureHighlightMode(Validator.HighlightMode.UIID);
        val.addConstraint(Libelle, new LengthConstraint(2, "Libelle must have at least 2 characters")).
            addConstraint(Description, new LengthConstraint (5, "Description must have at least 5 characters")).
            addConstraint(Dateevaluation, new LengthConstraint(1, "Dateevaluation must have at least 1 characters"));

        TextModeLayout tl = new TextModeLayout(5 , 1);
        Container comps = new Container(tl);
        

        comps.add(tl.createConstraint().widthPercentage(70), Libelle);
        comps.add(tl.createConstraint().widthPercentage(70), Description);
        comps.add(tl.createConstraint().widthPercentage(70), Dateevaluation);
        comps.add(tl.createConstraint().widthPercentage(70), IdEntreprise);
        
        comps.setScrollableY(true);
        comps.setUIID("PaddedContainer");

        Container conten = BorderLayout.center(comps);

        Button save = new Button("Add");
        save.setUIID("InputAvatarImage");
        conten.add(SOUTH, save);

        save.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent evt) {
                if ((Libelle.getText().length() == 0) || (Description.getText().length() == 0) || (IdEntreprise.getText().length() == 0)) {
                    Dialog.show("Alert", "Please fill all the fields", new Command("OK"));
                } else {
                    try {

                        Evaluation u;
                         
                            u = new Evaluation(Integer.parseInt(IdEntreprise.getText()) ,  Libelle.getText(), Description.getText(), Dateevaluation.getText());
                        if (ServiceEvaluation.getInstance().addEvaluation(u)) {
                            ToastBar.showMessage("adding...", FontImage.MATERIAL_INFO, 3);

                            Dialog.show("Success", "Evaluation Added", new Command("OK"));
                            //Mailing
                            
                            Message m = new Message("Une Nouvelle Evaluation a été crée!");

                            Display.getInstance().sendMessage(new String[] {"houssem.ouerdiane@esprit.tn"}, "Nouvelle Evaluation", m);
                            //end Mailing
                           new KitchenSink().showMainUI();

                        } else {
                            Dialog.show("ERROR", "Server error", new Command("OK"));
                        }
                    } catch (NumberFormatException e) {
                        Dialog.show("ERROR", "Please Enter a Valid Number", new Command("OK"));
                    }

                }

            }

//            @Override
//            public void actionPerformed(ActionEvent evt) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
        });

        conten.setUIID("InputContainerForeground");

        Button avatar = new Button("");
        avatar.setUIID("InputAvatar");
        Image defaultAvatar = FontImage.createMaterial(FontImage.MATERIAL_CAMERA, "InputAvatarImage", 8);
        Image circleMaskImage = getResources().getImage("circle.png");
        defaultAvatar = defaultAvatar.scaled(circleMaskImage.getWidth(), circleMaskImage.getHeight());
        defaultAvatar = ((FontImage) defaultAvatar).toEncodedImage();
        Object circleMask = circleMaskImage.createMask();
        defaultAvatar = defaultAvatar.applyMask(circleMask);
        avatar.setIcon(defaultAvatar);

        avatar.addActionListener(e -> {
            if (Dialog.show("Camera or Gallery", "Would you like to use the camera or the gallery for the picture?", "Camera", "Gallery")) {
                String pic = Capture.capturePhoto();
                if (pic != null) {
                    try {
                        Image img = Image.createImage(pic).fill(circleMaskImage.getWidth(), circleMaskImage.getHeight());
                        avatar.setIcon(img.applyMask(circleMask));
                    } catch (IOException err) {
                        ToastBar.showErrorMessage("An error occured while loading the image: " + err);
                        Log.e(err);
                    }
                }
            } else {
                openGallery(ee -> {
                    if (ee.getSource() != null) {
                        try {
                            Image img = Image.createImage((String) ee.getSource()).fill(circleMaskImage.getWidth(), circleMaskImage.getHeight());
                            avatar.setIcon(img.applyMask(circleMask));
                        } catch (IOException err) {
                            ToastBar.showErrorMessage("An error occured while loading the image: " + err);
                            Log.e(err);
                        }
                    }
                }, GALLERY_IMAGE);
            }
        });

        Container actualContent = LayeredLayout.encloseIn(conten,
                FlowLayout.encloseCenter(avatar));

        Container input;
        if (!isTablet()) {
            Label placeholder = new Label(" ");

            Component.setSameHeight(actualContent, placeholder);
            Component.setSameWidth(actualContent, placeholder);

            input = BorderLayout.center(placeholder);

            parent.addShowListener(e -> {
                if (placeholder.getParent() != null) {
                    input.replace(placeholder, actualContent, CommonTransitions.createFade(1500));
                }
            });
        } else {
            input = BorderLayout.center(actualContent);
        }
        input.setUIID("InputContainerBackground");

        return input;
    }

   
    
}
