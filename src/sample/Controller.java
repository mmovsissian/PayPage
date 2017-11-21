package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class Controller {


    @FXML
    Button regcard;
    @FXML
    ImageView mailcheck;
    @FXML
    TextField email;
    @FXML
    ChoiceBox country;


    Image acc= new Image("sample/images/Accept-icon 2.png");
    Image dec= new Image("sample/images/empty 2.png");

    boolean t=false;

    public boolean isT() {
        return t;
    }

    public void  initialize() {


            regcard.setOnAction(event -> {


                Parent root;
                try {
                    root = FXMLLoader.load(getClass().getResource("fxmlfiles/secondpage.fxml"));
                    Stage stage = new Stage();
                    stage.setTitle("Other");
                    stage.setScene(new Scene(root, 500, 300));
                    stage.show();
                    regcard.setText("Reset Card");
//                     Hide this current window (if this is what you want)
//                    ((Node) (event.getSource())).getScene().getWindow().hide();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        country.setItems(FXCollections.observableArrayList(
                "Armenia", "Russia", "Usa"));

        email.setOnKeyTyped(event -> {
            if (email.getText().contains("@")) {
                mailcheck.setImage(acc);
            } else {
                mailcheck.setImage(dec);
            }
        });

//        addcard.setOnAction(event -> {
//
//
//                });


//
//        day.setItems(FXCollections.observableArrayList(
//                '1','2','3','4','5','6','7','8','9',"10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"));
//
//        month.setItems(FXCollections.observableArrayList(
//                '1','2','3','4','5','6','7','8','9',"10","11","12"));
//


//        for (int i = 0; i < 31; i++){
//            days[i]=i+1;i++;
//        }
//
//
//
//        for (int i = 0; i < 12; i++){
//            months[i]=i+1;i++;
//        }







        }



}




