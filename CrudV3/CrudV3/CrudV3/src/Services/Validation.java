/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import javafx.scene.control.*;

import javafx.scene.image.ImageView;
import javafx.util.Callback;

import java.time.LocalDate;


public class Validation {
    public static boolean textEmpty(TextArea ta, String error){

        boolean b=true;
        if (ta.getText().length()==0 || ta.getText().isEmpty()){
            b=false;
            ta.setPromptText(error);

        }
        return b;

    }
    public static boolean imageEmpty(ImageView iv,Label labelerrorimage, String error){

        boolean b=true;
        if ( iv.getImage()==null){
            b=false;
            labelerrorimage.setVisible(true);
            labelerrorimage.setText(error);

        }
        return b;

    }
    public static boolean textEmpty(TextField tf,String error){
    
    boolean b=true;
    if (tf.getText().length()==0 || tf.getText().isEmpty()){
        b=false;
        tf.setPromptText(error);

    }
    return b;
    
    }

    public static boolean textalphabet(TextField tf ,String errorMessage)
    {
    boolean isAlphabet =true;
    
    String validationString=null;
    if(!tf.getText().matches("[a-z A-Z]+")){
    isAlphabet=false;
        tf.setPromptText(errorMessage);
    }

        return isAlphabet;
    
}
    
    
        public static boolean texNum(TextField tf ,String errorMessage)
    {
    boolean isNum =true;

    if(!tf.getText().matches("[0-9]+")){
    isNum=false;
        tf.setPromptText(errorMessage);
    }

        return isNum;
    
}
    //[a-z0-9]
    
      public static boolean texAlphNum(TextField tf ,Label lb,String errorMessage)
    {
    boolean isAlphNum =true;
    
    String validationString=null;
    if(!tf.getText().matches("[a-z0-9]+")){
    isAlphNum=false;
    
    }
    lb.setText(errorMessage);
        System.out.println(tf.getText().matches("[a-z0-9]+"));
        return isAlphNum;
    
}
      
            public static boolean texMail(TextField tf ,Label lb,String errorMessage)
    {
    boolean isMail =true;
    
    String validationString=null;
    if(!tf.getText().matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$")){
    isMail=false;
    
    }
    lb.setText(errorMessage);
        System.out.println(tf.getText().matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$"));
        return isMail;
    
}
    public static Callback<DatePicker, DateCell> selectdatemin(DatePicker dp)
    {
        final Callback<DatePicker, DateCell> dayCellFactory =
                new Callback<DatePicker, DateCell>() {
                    @Override
                    public DateCell call(final DatePicker datePicker) {
                        return new DateCell() {
                            @Override
                            public void updateItem(LocalDate item, boolean empty) {
                                super.updateItem(item, empty);

                                if (item.isBefore(
                                        dp.getValue().plusDays(1))
                                ) {
                                    setDisable(true);
                                    setStyle("-fx-background-color: #ffc0cb;");
                                }
                            }
                        };
                    }


                };
        return dayCellFactory;
    }


    public static Callback<DatePicker, DateCell> selectdatemax(DatePicker dp)
    {
        final Callback<DatePicker, DateCell> dayCellFactory =
                new Callback<DatePicker, DateCell>() {
                    @Override
                    public DateCell call(final DatePicker datePicker) {
                        return new DateCell() {
                            @Override
                            public void updateItem(LocalDate item, boolean empty) {
                                super.updateItem(item, empty);

                                if (item.isAfter(
                                        dp.getValue().minusDays(1))
                                ) {
                                    setDisable(true);
                                    setStyle("-fx-background-color: #ffc0cb;");
                                }

                            }
                        };
                    }


                };
        return dayCellFactory;
    }
    public static Callback<DatePicker, DateCell> selectdatebetween(DatePicker dp1,DatePicker dp2)
    {
        final Callback<DatePicker, DateCell> dayCellFactory =
                new Callback<DatePicker, DateCell>() {
                    @Override
                    public DateCell call(final DatePicker datePicker) {
                        return new DateCell() {
                            @Override
                            public void updateItem(LocalDate item, boolean empty) {
                                super.updateItem(item, empty);

                                if (item.isAfter(
                                        dp1.getValue().minusDays(1))
                                ) {
                                    setDisable(true);
                                    setStyle("-fx-background-color: #ffc0cb;");
                                }
                                if (item.isBefore(
                                        dp2.getValue().plusDays(1))
                                ) {
                                    setDisable(true);
                                    setStyle("-fx-background-color: #ffc0cb;");
                                }

                            }
                        };
                    }


                };
        return dayCellFactory;
    }
}
