package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("fxmlfiles/sample.fxml"));
        primaryStage.setTitle("Register");
        primaryStage.setScene(new Scene(root1, 600, 400));
        primaryStage.show();


    }





    public static void main(String[] args) {
        launch(args);
    }




}
