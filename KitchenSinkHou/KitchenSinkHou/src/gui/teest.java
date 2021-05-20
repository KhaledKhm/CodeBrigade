/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.codename1.capture.Capture;
import com.codename1.components.ToastBar;
import com.codename1.io.Log;
import com.codename1.messaging.Message;
import com.codename1.ui.Button;
import static com.codename1.ui.CN.SOUTH;
import static com.codename1.ui.CN.isTablet;
import static com.codename1.ui.CN.openGallery;
import static com.codename1.ui.CN1Constants.GALLERY_IMAGE;
import com.codename1.ui.Command;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextComponent;
import com.codename1.ui.animations.CommonTransitions;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.LayeredLayout;
import com.codename1.ui.layouts.TextModeLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.ui.validation.LengthConstraint;
import com.codename1.ui.validation.Validator;
import entities.Entretien;
import java.io.IOException;
import services.ServiceEntretien;

/**
 *
 * @author OneEffect007
 */
public class teest extends Demo{
    
    private Resources res;

    @Override
    public String getDisplayName() {
        return "test";
    }

    @Override
    public Image getDemoIcon() {
        return getResources().getImage("input.png");
    }
    
    @Override
    public Container createDemo(Form parent) {
        res = UIManager.initFirstTheme("/theme");
        
        TextComponent idParticipant = new TextComponent().labelAndHint("Id  Participant"); 
        FontImage.setMaterialIcon(idParticipant.getField().getHintLabel(), FontImage.MATERIAL_PERSON);
        
        TextComponent Idevaluation = new TextComponent().labelAndHint("Id Evaluation"); 
        FontImage.setMaterialIcon(Idevaluation.getField().getHintLabel(), FontImage.MATERIAL_EVENT);

        Validator val = new Validator();
        val.setValidationFailureHighlightMode(Validator.HighlightMode.UIID);
        

        TextModeLayout tl = new TextModeLayout(5 , 1);
        Container comps = new Container(tl);
        

        
        comps.add(tl.createConstraint().widthPercentage(70), Idevaluation);
        comps.add(tl.createConstraint().widthPercentage(70), idParticipant);
        comps.setScrollableY(true);
        comps.setUIID("PaddedContainer");

        Container conten = BorderLayout.center(comps);

        Button save = new Button("Add");
        save.setUIID("InputAvatarImage");
        conten.add(SOUTH, save);

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
