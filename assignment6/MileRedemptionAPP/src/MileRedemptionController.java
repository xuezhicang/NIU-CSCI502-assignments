/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 6        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:  MileRedemptionController                   *
 *                                                          *
 *  Programmer:  Xuezhi Cang Z1747635                       *
 *                                                          *
 *                                                          *
 *                                                          *
 *                                                          *
 *  Purpose:  run the functions for each button             *
 *                                                          *
 *                                                          *
 *                                                          *
 ************************************************************/

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.time.Month;
import java.util.Scanner;

public class MileRedemptionController {
    MileRedeemer mileRedeemer =new MileRedeemer();
    Scanner scanner;

    @FXML
    private ListView listview_1;

    @FXML
    private ComboBox comboBox_1;

    @FXML
    private Label normalMileLabel;

    @FXML
    private TextField normalMileTextfield;

    @FXML
    private TextField superSaverTextfield;

    @FXML
    private TextField upGradeTextfield;

    @FXML
    private TextField supersaverDateTextfield;

    @FXML
    private TextField inputMiles;

    @FXML
    private Button buttonRedeem;

    @FXML
    private TextField remainingMilesTextfield;

    @FXML
    private ListView listview_2;

    //add flight's info to the text field
    @FXML
    public void SelectCity()
    {
        //search the selected city in the array in the  mileRedeemer
        String selectedCity=listview_1.getSelectionModel().getSelectedItem().toString();
        Destination currentCity=mileRedeemer.SelectDestinationInfomationByitsName(selectedCity);


        //output the selected cities' info
        normalMileTextfield.setText(String.valueOf(currentCity.getNormalMile()));
        superSaverTextfield.setText(String.valueOf(currentCity.getOffSeasonMile()));
        upGradeTextfield.setText(String.valueOf(currentCity.getUpgradeMile()));

        String startingMonth= Month.of(currentCity.getStartMonth()).name();
        String endingMonth= Month.of(currentCity.getEndMonth()).name();
        supersaverDateTextfield.setText(startingMonth +" - " + endingMonth);
    }

    //return the redeemed flight
    @FXML
    void RedeemButtonClick()
    {
        if (inputMiles.getText().isEmpty()||Integer.valueOf(inputMiles.getText())<0) // if the input is illegal
        {
            listview_2.getItems().add("your input is not illegal!");

        }
        else
        {
            //get input from text field and combo box
            int inputMilesData = Integer.valueOf(inputMiles.getText());
            int inputMonth = Integer.valueOf(Month.valueOf(comboBox_1.getValue().toString().toUpperCase()).getValue());

            listview_2.getItems().clear();
            String [] avaliableTickets=mileRedeemer.redeemMiles(inputMilesData, inputMonth);
            if (avaliableTickets.length==0){ //show that no ticket is avaiable

                listview_2.getItems().add("*** Your client has not accumulated enough Frequent Flyer Miles ***\n");
            }
            else{ //add all avaliable flight to the list view
                listview_2.getItems().addAll(avaliableTickets);
            }
            //add remianing mile to the textfield
            remainingMilesTextfield.setText(String.valueOf(mileRedeemer.gteRemainingMiles()));
        }

    }


    //initialize the window
    //    add month
    //    read file and add them to the listview
    @FXML
    public void initialize()
    {
        comboBox_1.getItems().addAll("January", "February", "March", "April", "May", "June",
                "July",  "August", "September", "October", "November", "December");
        comboBox_1.getSelectionModel().select(0);

        Stage fStage = null;
        FileChooser f = new FileChooser();
        f.setTitle("Choose  your File");
        File selectedFile = f.showOpenDialog(fStage);
        String path = selectedFile.getPath();

        File file = new File(path);
        try
        {
            scanner = new Scanner(file); //create a scanner object from the file
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File is not found!");
        }
        // read file
        mileRedeemer.readDestinations(scanner);
        scanner.close(); // close the scanner

        //add cities to the listview
        String[] cities=mileRedeemer.getCityNames(); //get all the cities' names
        for(String city:cities){
            listview_1.getItems().add(city); //add each city's name to the list view
        }

    }

}