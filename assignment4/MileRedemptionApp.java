
/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 4        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:  MileRedemptionApp                          *
 *                                                          *
 *  Programmer:  Xuezhi Cang Z1747635                       *
 *                                                          *
 *                                                          *
 *                                                          *
 *                                                          *
 *  Purpose:  include main function to get input            *
 *                  and print output;                       * 
 *                                                          *
 *                                                          *
 ************************************************************/
import java.io.*;
import java.util.Scanner;

public class MileRedemptionApp
{
    /************************************************************
    *                                                          *
    *  Method Name:  main                                      *
    *                                                          *
    *  Purpose:  main function for all the program             *
    *                                                          *
    *                                                          *
    ************************************************************/  
    public static void main(String[] args) throws IOException
    {
        MileRedeemer mileRedeemeList = new MileRedeemer();//innitialize this class for selecting destination
        String[] destCityNames; //all the city
        int accumulatedMiles; //user's mile 
        int restMiles; //remaining mileage
        int departMonth; //user's depart month
        String[] resultString; //output string for destination
        String strForEnd;
        boolean isEnd = false;


        Scanner scan = new Scanner(System.in);
        String fileName;


        System.out.print("Please enter the name of the file: ");//get the name of the txt file 
        fileName = scan.next();
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        mileRedeemeList.readDestinations(fileScanner);

        destCityNames = mileRedeemeList.getCityNames(); //get all the cities's name
        System.out.print("\n--------------------------------------------------------------\n");
        System.out.print("WELCOME TO THE JAVA AIRLINES FREQUENT FLYER MILES REDEMPTION APP\n");
        System.out.print("----------------------------------------------------------------\n");
        System.out.print("List of destination cities your client can travel to:\n\n");          
        for (String tempCityName : destCityNames) //print all cities' name
            System.out.println(tempCityName);
        


        do
        {
            System.out.print("Please enter your client's accumulated Frequent Flyer Miles:  ");//get user's mileage
            accumulatedMiles = scan.nextInt();
            System.out.print("\nPlease enter your client's month of departure (1-12):  "); //get user'sdepart month
            departMonth = scan.nextInt();
        
            resultString = mileRedeemeList.redeemMiles(accumulatedMiles, departMonth);  //get possiable dissertation cities
    
            if (resultString.length != 0) //if some city in the list
            {
                System.out.print("\nYour client's Frequent Flyer Miles can be used to redeem the following tickets:\n\n");
                for (String eachResultSentence: resultString) 
                  System.out.print(eachResultSentence + "\n");
              
            } 
            else  //if no city is selected
            {
                System.out.print("\n*** Your client has not accumulated enough Frequent Flyer Mile ***\n");
            }
    
    
            restMiles = mileRedeemeList.gteRemainingMiles(); //print remaining mileage
            System.out.print("\nYour client's remaining Frequent Flyer Miles: " + restMiles + "\n");        
            System.out.print("\n----------------------------------------------------------------\n\n");

            System.out.print("Do you want to continue? (y/n): ");
            strForEnd = scan.next().toLowerCase();    
            isEnd = (strForEnd.equals("y"));
    

        }while(isEnd == true);
        System.out.print("\n----------------------------------------------------------------\n");
        System.out.print("THANK YOU FOR USING THE JAVA AIRLINES FREQUENT FLYER MILES REDEMPTION APP\n");
        System.out.print("----------------------------------------------------------------\n");

        
    }
    







    
}