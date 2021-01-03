/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 6        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:  MileRedemptionApp                          *
 *                                                          *
 *  Programmer:  Xuezhi Cang Z1747635                       *
 *                                                          *
 *                                                          *
 *                                                          *
 *                                                          *
 *  Purpose:  call the interface and function               *
 *                                                          *
 *                                                          *
 *                                                          *
 ************************************************************/
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class MileRedemptionApp extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("AppInterface.fxml"));
        stage.setTitle("APP");
        stage.setScene(new Scene(root, 800, 600));
        stage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
