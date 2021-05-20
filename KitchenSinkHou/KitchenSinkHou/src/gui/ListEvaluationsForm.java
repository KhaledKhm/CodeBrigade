/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import com.codename1.components.FloatingActionButton;
import com.codename1.components.MultiButton;
import com.codename1.components.SpanLabel;
import com.codename1.components.ToastBar;
import com.codename1.ui.Button;
import static com.codename1.ui.CN.SOUTH;
import com.codename1.ui.Command;
import com.codename1.ui.Component;
import static com.codename1.ui.Component.CENTER;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.Font;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.SwipeableContainer;
import com.codename1.ui.TextField;
import com.codename1.ui.animations.CommonTransitions;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.events.ScrollListener;
import com.codename1.ui.geom.Dimension;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.table.TableLayout;
import com.codename1.ui.util.Resources;
import entities.Evaluation  ;
import services.ServiceEvaluation;
import static com.codename1.ui.Component.CENTER;

import java.util.ArrayList;
/**
 *
 * @author IBM
 */
public class ListEvaluationsForm extends Demo {
  private long lastScroll;
    private ArrayList<Evaluation> list;
    
   
    private Resources res;
    private boolean messageShown;
 
     public ListEvaluationsForm() {
        res = UIManager.initFirstTheme("/theme"); } 
     
          @Override
    public Container createDemo(Form parentForm) {

        list = new ArrayList<>();
        Container c = new Container(BoxLayout.y());
        parentForm.addPointerDraggedListener(e -> lastScroll = System.currentTimeMillis());
       
        
        parentForm.setScrollableY(true);
        c.setScrollableY(true);
        c.getStyle().setBorder(Border.createLineBorder(2));
       
        list.addAll(ServiceEvaluation.getInstance().getAllEvaluations());
        for (Evaluation t : list) {

            MultiButton mb = new MultiButton(t.getLibelle());
            mb.setTextLine2(t.getDateevaluation());
            String f = String.valueOf(t.getIdEntreprise()) ; 
            mb.setTextLine3(f);
            mb.setTextLine4(t.getDescription());
            

            Image defaultAvatar = FontImage.createMaterial(FontImage.MATERIAL_PANORAMA, "InputAvatarImage", 8);
            Image defaultAvatar4 = FontImage.createMaterial(FontImage.MATERIAL_CANCEL_PRESENTATION, "InputAvatarImage", 5);

            Image defaultAvatar2 = FontImage.createMaterial(FontImage.MATERIAL_SWIPE, "InputAvatarImage", 5);
            Image defaultAvatar3 = FontImage.createMaterial(FontImage.MATERIAL_UPDATE, "InputAvatarImage", 8);

            mb.setEmblem(defaultAvatar2);
            mb.setIcon(defaultAvatar);

            mb.addLongPressListener((evt) -> {
                         
          //     new ComplaintForm(parentForm, t.getId()).show()  ; 
                  Form f2 = new Form(t.getLibelle(), BoxLayout.y());
                  
                  
                  MultiButton mbc = new MultiButton(t.getLibelle()) ; 
                  mbc.setTextLine2(t.getDescription()) ; 
                 
                
                  mbc.setEmblem(defaultAvatar3);
                  f2.add(mbc) ; 
                   
           
                f2.getToolbar().addCommandToLeftBar("Back", null, ev -> {
                    parentForm.show();
                });
                mbc.addActionListener(e -> {

                TextField Libelle = new TextField("", "New Libelle");
                TextField Dateevaluation = new TextField("", "New Date Evaluation");
                TextField Description = new TextField("", "New Description");
                TextField IdEntreprise = new TextField("", "New Evaluation Id");
                Dialog abcd = new Dialog("Update Evaluation");
                BoxLayout bo = new BoxLayout(CENTER);
                abcd.setLayout(bo);
                Button oki = new Button("Update");
                abcd.add(Libelle).add(Description).add(Dateevaluation).add(IdEntreprise).add(oki);//add text field to dialog

                abcd.setDisposeWhenPointerOutOfBounds(true);
                abcd.setBackCommand(new Command(""));

                oki.addActionListener(evtt -> {
                    if ((Libelle.getText().length() == 0)||(Dateevaluation.getText().length() == 0)) {
                        Dialog.show("Alert", "Empty Field ", new Command("OK"));
                    } else {
                        
                        Evaluation j2 = new Evaluation(Integer.parseInt(IdEntreprise.getText()),Libelle.getText(), Dateevaluation.getText(), Description.getText()); 
                        String s = String.valueOf(t.getId()) ; 
                        if (ServiceEvaluation.getInstance().updateEvaluation( j2 , s)) {
                            abcd.dispose();
                            ToastBar.showMessage("Updating evaluation...", FontImage.MATERIAL_INFO, 3000);
                          
                        }

                       // sc.remove();
                        mbc.setTextLine1(Libelle.getText());
                       // mbc.setTextLine2(content.getText());
           
                        new KitchenSink().showMainUI();

                    }
                });
                abcd.show();

                });   
                f2.show();
            });

//            Button info = new Button();
//            info.setUIID("SwipeableContainerInfoButton");
//            FontImage.setMaterialIcon(info, FontImage.MATERIAL_PEOPLE_OUTLINE, 8);
//
            Button up = new Button();
            up.setUIID("SwipeableContainerInfoButton");
            FontImage.setMaterialIcon(up, FontImage.MATERIAL_UPDATE, 8);
//
//            Button msg = new Button();
//            msg.setUIID("SwipeableContainerInfoButton");
//            FontImage.setMaterialIcon(msg, FontImage.MATERIAL_MAIL, 8);
//            Container options = GridLayout.encloseIn(3, up, msg, info);

            Button delete = new Button();
            delete.setUIID("SwipeableContainerButton");
            FontImage.setMaterialIcon(delete, FontImage.MATERIAL_DELETE_FOREVER, 8);
            SwipeableContainer sc = new SwipeableContainer(
                    GridLayout.encloseIn(1, delete),
                    mb);
            c.add(sc);

            sc.addSwipeOpenListener(e -> {
                // auto fold the swipe when we go back to scrolling
                c.addScrollListener(new ScrollListener() {
                    int initial = -1;

                    @Override
                    public void scrollChanged(int scrollX, int scrollY, int oldscrollX, int oldscrollY) {
                        // scrolling is very sensitive on devices...
                        if (initial < 0) {
                            initial = scrollY;
                        }
                        lastScroll = System.currentTimeMillis();
                        if (Math.abs(scrollY - initial) > mb.getHeight() / 2) {
                            if (sc.getParent() != null) {
                                sc.close();
                            }
                            c.removeScrollListener(this);
                        }
                    }
                });
            });
//             up.addActionListener(e -> {
//
//                TextField subject = new TextField("", "New Subject");
//                TextField concerned = new TextField("", "New concerned people");
//                Dialog abcd = new Dialog("Update Meeting");
//                BoxLayout bo = new BoxLayout(CENTER);
//                abcd.setLayout(bo);
//                Button oki = new Button("Update");
//                abcd.add(subject).add(concerned).add(oki);//add text field to dialog
//
//                abcd.setDisposeWhenPointerOutOfBounds(true);
//                abcd.setBackCommand(new Command(""));
//
//                oki.addActionListener(evt -> {
//                    if ((subject.getText().length() == 0)||(concerned.getText().length() == 0)) {
//                        Dialog.show("Alert", "Empty Field ", new Command("OK"));
//                    } else {
//
//                        Schoolmeeting j2 = new Schoolmeeting(subject.getText(),concerned.getText());
//                        if (ServiceSchoolmeetings.getInstance().updateSchool(j2, t.getId())) {
//                            abcd.dispose();
//                            ToastBar.showMessage("Updating meeting...", FontImage.MATERIAL_INFO, 3000);
//                            sc.close();
//                        }
//
//                       // sc.remove();
//                        mb.setTextLine1(subject.getText());
//                        mb.setTextLine2(concerned.getText());
//                        c.animateLayout(800);
//
//                    }
//                });
//                abcd.show();
//
//                });   
//            
//            info.addActionListener(e -> {
//                Form f2 = new Form("Members", BoxLayout.y());
//               listusers = new ArrayList<>();
//                Container c3 = new Container(BoxLayout.yLast());
//                c3.setScrollableY(true);
//                c3.getStyle().setBorder(Border.createLineBorder(2));
//                listusers.addAll(UtilisateurService.getInstance().getUsersConv(t.getId()));
//                for (UserTalent uc : listusers) {
//
//                    MultiButton mbt = new MultiButton(uc.getUsername());
//                    mbt.setEmblem(defaultAvatar4);
//                    mbt.setIcon(defaultAvatar3);
//                    c3.add(mbt);
//                    if (owner.getUsername().equals(uc.getUsername())) {
//
//                        mbt.setTextLine1("Vous");
//                    } else {
//                        mbt.setTextLine1(uc.getUsername());
//                    }
//                    mbt.addActionListener((evt) -> {
//
//                        if (owner.getUsername().equals(uc.getUsername())) {
//                            if (Dialog.show("Leave", "Are you sure?\nyou want to leave this Conversation!", "leave", "Cancel")) {
//
//                                if (ServiceConversation.getInstance().retirerUserfromConv(t.getId(), uc.getId())) {
//                                    ToastBar.showMessage("Leaving...", FontImage.MATERIAL_DELETE);
//                                }
//                                mbt.remove();
//                                c3.animateLayout(800);
//                                new LoginForm().showMainUI();
//                            }
//                        } else if (Dialog.show("Remove", "Are you sure?\nThis will Report and remove talent from this Conversation!", "Remove", "Cancel")) {
//                            ToastBar.showMessage("Reporting...", FontImage.MATERIAL_DETAILS);
//                            Dialog.show("Report's Result", "This contact will be removed from this Conversation after admin check!", new Command("ok"));
//                            if (ServiceConversation.getInstance().retirerUserfromConv(t.getId(), uc.getId())) {
//                                ToastBar.showMessage("Removing...", FontImage.MATERIAL_DELETE);
//                            }
//                            mbt.remove();
//                            //ToastBar.showMessage("Reporting...", FontImage.MATERIAL_DETAILS);
//
//                            c3.animateLayout(800);
//                        }
//
//                    });
//                }
//                f2.add(c3);
//                f2.getToolbar().addCommandToLeftBar("Back", null, ev -> {
//                    parentForm.showBack();
//                });
//                f2.show();
//            });
           
         
            delete.addActionListener(e -> {
                if (Dialog.show("Delete", "Are you sure?\n", "Delete", "Cancel")) {
                    String s= String.valueOf(t.getId()) ; 
                    if (ServiceEvaluation.getInstance().deleteEvaluation(s)) {
                        ToastBar.showMessage("Deleting...", FontImage.MATERIAL_INFO);
                    }
                    sc.remove();
                    c.animateLayout(800);
                }
            });
        }

//        
        Style s = UIManager.getInstance().getComponentStyle("Libelle");
        TextField searchField = new TextField("", "Search..."); // <1>
        searchField.getHintLabel().setUIID("Libelle");
        searchField.setUIID("Libelle");
        searchField.getAllStyles().setAlignment(Component.LEFT);
        parentForm.getToolbar().setTitleComponent(searchField);
        FontImage searchIcon = FontImage.createMaterial(FontImage.MATERIAL_SEARCH, s);
        searchField.addDataChangeListener((type, index) -> {
            String text = searchField.getText().toLowerCase();
            if (text.length() > 0) {
                Dimension hidden = new Dimension(0, 0);
                // iterates over the components, if a component matches its set to visible and its size is kept as default
                // otherwise the component is hidden and set to occupy no space.
                for (Component cmp : c) {
                    if (cmp instanceof MultiButton) {
                        String l1 = ((MultiButton) cmp).getTextLine1();
                        if (l1.toLowerCase().indexOf(text) > -1) {
                            cmp.setPreferredSize(null);
                            cmp.setVisible(true);
                        } else {
                            cmp.setPreferredSize(hidden);
                            cmp.setVisible(false);
                        }
                    }
                }
            } else {
                // no search string, show all the components by resetting the preferred size to default (thru null) and making them visible
                for (Component cmp : c) {
                    cmp.setPreferredSize(null);
                    cmp.setVisible(true);
                }
            }

            // update the UI with an animation effect
            parentForm.getContentPane().animateLayout(200);
        });

        parentForm.getToolbar().addCommandToRightBar("", searchIcon, (e) -> {
            searchField.startEditingAsync(); // <4>
        });

        return c;

    }

    @Override
    protected Resources getResources() {
        return super.getResources(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    boolean onBack() {
        return super.onBack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDisplayName() {
        return "Evaluations";

    }

    @Override
    public Image getDemoIcon() {
        return getResources().getImage("input.png");
    }
  private Button createSearchButton(Form parent, Label title, Container titleArea, Container titleRegion) {
        // we want the search feature to be based on the title style so it will "fit" but we need it to use the font defined 
        // by the icon font UIID so we merge both
        Style s = new Style(title.getUnselectedStyle());
        Style iconFontStyle = UIManager.getInstance().getComponentStyle("IconFont");
        s.setFont(iconFontStyle.getFont().derive(s.getFont().getHeight(), Font.STYLE_PLAIN));
        FontImage searchIcon = FontImage.create(" \ue806 ", s);
        FontImage cancelIcon = FontImage.create(" \ue81e ", s);

        // this is the actual search button, but we don't want it to have a border...
        Button search = new Button(searchIcon);
        search.setUIID("Label");

        // the search box will be placed in the title area so we can type right into it. We make it look like a title but
        // explicitly align it to the left for cases such as iOS where the title is centered by default
        TextField searchBox = new TextField();
        searchBox.setUIID("Title");
        searchBox.getUnselectedStyle().setAlignment(Component.LEFT);
        searchBox.getSelectedStyle().setAlignment(Component.LEFT);

        // the data change listener allows us to animate the data on every key press into the field
        searchBox.addDataChangeListener((type, index) -> {
            String text = searchBox.getText().toLowerCase();
            if (text.length() > 0) {
                Dimension hidden = new Dimension(0, 0);
                // iterates over the components, if a component matches its set to visible and its size is kept as default
                // otherwise the component is hidden and set to occupy no space.
                for (Component cmp : parent.getContentPane()) {
                    if (cmp instanceof MultiButton) {
                        String l1 = ((MultiButton) cmp).getTextLine1();
                        if (l1.toLowerCase().indexOf(text) > -1) {
                            cmp.setPreferredSize(null);
                            cmp.setVisible(true);
                        } else {
                            cmp.setPreferredSize(hidden);
                            cmp.setVisible(false);
                        }
                    }
                }
            } else {
                // no search string, show all the components by resetting the preferred size to default (thru null) and making them visible
                for (Component cmp : parent.getContentPane()) {
                    cmp.setPreferredSize(null);
                    cmp.setVisible(true);
                }
            }

            // update the UI with an animation effect
            parent.getContentPane().animateLayout(200);
        });

        // the action event is invoked when the button is pressed, this can have 2 separate states: during search/before search
        search.addActionListener((e) -> {
            if (search.getIcon() == searchIcon) {
                // Starts the search operation by replacing the title with a text field and launching the native editing
                search.setIcon(cancelIcon);
                titleArea.replaceAndWait(title, searchBox, CommonTransitions.createCover(CommonTransitions.SLIDE_VERTICAL, true, 400));
                titleRegion.revalidate();
                Display.getInstance().editString(searchBox, searchBox.getMaxSize(), searchBox.getConstraint(), "");
            } else {
                // if we are currently searching then cancel the search, return all items to visible and restore everything
                search.setIcon(searchIcon);
                for (Component cmp : parent.getContentPane()) {
                    cmp.setPreferredSize(null);
                    cmp.setVisible(true);
                }
                parent.getContentPane().animateLayoutAndWait(200);
                search.setEnabled(true);
                search.setVisible(true);
                titleArea.replaceAndWait(searchBox, title, CommonTransitions.createCover(CommonTransitions.SLIDE_VERTICAL, true, 400));
            }
        });
        return search;
    }


}
