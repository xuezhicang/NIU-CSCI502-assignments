/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 4        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:  MileRedeemer                               *
 *                                                          *
 *  Programmer:  Xuezhi Cang Z1747635                       *
 *                                                          *
 *                                                          *
 *                                                          *
 *                                                          *
 *  Purpose:  store millage info for each city;             *
 *            search the distination city using input mile  * 
 *                                                          *
 *                                                          *
 ************************************************************/


import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MileRedeemer
{
    private Destination[] destinationArray; //store the destnation cities' info from txt file
    private int mileRemining; //remaining mileage

    /************************************************************
    *                                                          *
    *  Method Name:  readDestinations                          *
    *                                                          *
    *  Purpose:  read txt to get the milage info               *
    *                                                          *
    *                                                          *
    ************************************************************/  
    public void readDestinations(Scanner fileScanner) 
    {
        String inputLineDestInfo = ""; //input line from txt file
        ArrayList<Destination> destList = new ArrayList<Destination>();//destination cities and their info

        while (fileScanner.hasNextLine()) //until all the lines in the txt file are read
        {
            inputLineDestInfo = fileScanner.nextLine(); 
            Destination tempDest = new Destination(inputLineDestInfo);  //initialize a temp Destiantion class
            destList.add(tempDest); //add the temp class to the list
        }
        destinationArray = (Destination[]) destList.toArray(new Destination[destList.size()]);//convert arrayto list
        Arrays.sort(destinationArray,new MileComparator()); //sort the array based on their normal mileage
    }
 
    /************************************************************
    *                                                          *
    *  Method Name:  getCityNames                              *
    *                                                          *
    *  Purpose:  get the city name from the Destination list   *
    *                                                          *
    *                                                          *
    ************************************************************/     
    public String[] getCityNames() 
    {
        String[] avaliableCities = new String[destinationArray.length]; //store the avaliable cities' name
        int counter = 0;
        for (Destination tempDest : destinationArray) {
          avaliableCities[counter] = tempDest.getDestCity();
          counter = counter + 1;
        }
        Arrays.sort(avaliableCities); //sort them based on the alphabet 
        return avaliableCities;
    }


    /************************************************************
    *                                                          *
    *  Method Name:  redeemMiles                               *
    *                                                          *
    *  Purpose:  search the reachable destination city;        *
    *            search the upgrabable flight                  *
    *            return the string to show the results         *
    ************************************************************/    
    public String[] redeemMiles(int miles, int month)
    {
        String[] resultString; // output string
        mileRemining = miles; //user's mileage
        boolean isOffSeason = false; //whether the offseason mileage can be used

        ArrayList<String> selectedDestCity = new ArrayList<String>(); //cities which milage is enough
        int[] upgrdMile = new int[destinationArray.length]; //strore the upgrading mileage of reachable city
        int counterForSelected = 0; //count the number of reachabe city



        for (Destination tempDestCity : destinationArray) //loop the destination info
        {
            isOffSeason = (tempDestCity.getStartMonth() <= month && tempDestCity.getEndMonth() >= month);//whether we are looking for the mileage in hte offseason

            if (isOffSeason)
            {
                if (tempDestCity.getOffSeasonMile() <= mileRemining) //whetehr the current remaaining is enough
                {
                    selectedDestCity.add(tempDestCity.getDestCity());// add this city's name to the destnation city array  
                    upgrdMile[counterForSelected] = tempDestCity.getUpgradeMile(); // add the mileage for upgrading  to list
                    counterForSelected = counterForSelected +1;
                    mileRemining = mileRemining - tempDestCity.getOffSeasonMile(); //update the remaining mileage
                    
                }
            }
            else  //mornal mileage
            {
                if (tempDestCity.getNormalMile() <= mileRemining)  //whetehr the current remaaining is enough
                {
                    selectedDestCity.add(tempDestCity.getDestCity()); // add this city's name to the destnation city array  
                    upgrdMile[counterForSelected] = tempDestCity.getUpgradeMile(); // add the mileage for upgrading  to list
                    counterForSelected = counterForSelected +1;
                    mileRemining = mileRemining - tempDestCity.getNormalMile(); //update remaining mileage
                  }
            }            
        }
        resultString = selectedDestCity.toArray(new String[selectedDestCity.size()]); 


        for (int iCounterUpgrade = 0; iCounterUpgrade < counterForSelected; iCounterUpgrade++) 
        {
            if (upgrdMile[iCounterUpgrade] <= mileRemining) //if the remaining mileage canbe used upgrade the class
            {
                mileRemining = mileRemining - upgrdMile[iCounterUpgrade];
                resultString[iCounterUpgrade] = "* A trip to " + resultString[iCounterUpgrade] + " in First Class";
            } 
            else 
            {
                resultString[iCounterUpgrade] = "* A trip to " + resultString[iCounterUpgrade] + " in Economy Class";
            }
          }

        return resultString;       

    }
    /************************************************************
    *                                                          *
    *  Method Name:  gteRemainingMiles                         *
    *                                                          *
    *  Purpose:  return the remaining user's mile              *
    *                                                          *
    *                                                          *
    ************************************************************/      
    public int gteRemainingMiles()
    {
        return mileRemining;
    }



    /************************************************************
     *                                                          *
     *  Method Name:  SelectDestinationInfomationByitsName      *
     *                                                          *
     *  Purpose:  Method that get Destination objects by name   *
     *                                                          *
     *                                                          *
     ************************************************************/
    public Destination SelectDestinationInfomationByitsName(String name){
        Destination currentDestination= new Destination();
        for (int i = 0; i <destinationArray.length; i++){
            String cityName=destinationArray[i].getDestCity(); // select all the cities' name to the array
            if (cityName.equals(name)){
                currentDestination= destinationArray[i];
            }
        }
        return currentDestination;
    }



}