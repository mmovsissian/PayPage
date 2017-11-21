package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.awt.*;

public class Controller2{



    @FXML
    ChoiceBox day;
    @FXML
    ChoiceBox month;
    @FXML
    Button addcard;

//    boolean t=false;

    public  void initialize() throws Exception{
        addcard.setOnAction(event -> {

            ((Node) (event.getSource())).getScene().getWindow().hide();



        day.setItems(FXCollections.observableArrayList(
                '1','2','3','4','5','6','7','8','9',"10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"));

        month.setItems(FXCollections.observableArrayList(
                '1','2','3','4','5','6','7','8','9',"10","11","12"));





        });

    }


//    @Override
//    public boolean cardinfo() {
//        if (addcard.isPressed()){
//        return true;}
//        else {return false;}
//    }
}
