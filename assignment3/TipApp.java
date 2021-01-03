/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 3        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:  InvoiceTest                                *
 *                                                          *
 *  Programmer:  Xuezhi Cang Z1747635                       *
 *                                                          *
 *                                                          *
 *                                                          *
 *                                                          *
 *  Purpose:  I/O interface of TipCalculator class          *
 *                                                          *
 *                                                          *
 ************************************************************/

import java.util.Scanner;


public class TipApp
{
    public static void main(String[] args) 
    {
        TipCalculator tip1 = new TipCalculator(); //initiallze the TipCalculator
        calculateTips(tip1); //call the function to obtain the bill information and calculate the total bill


    }     // end main


   /************************************************************
   *                                                          *
   *  Method Name:  isValidBillAmount                         *
   *                                                          *
   *  Purpose:  check whether a string is                     *
   *            a valid bill amount                           *
   *                                                          *
   ************************************************************/

    public static boolean isValidBillAmount(String strNum) 
    {
        double numTemp = -1; //initiallize the bill amount with an invalid number
        if (strNum == null)  //if the input is null, it is invalid
        {
            return false;
        }
        try 
        {
            numTemp = Double.parseDouble(strNum);
        } 
        catch (NumberFormatException nfe)  //if the input cannot be converted to int, it is invalid
        {
            return false;
        }

        if (numTemp>=0) //if the input is valid if it is greater than or equal to 0
            return true;
        else
            return false;
    }

   /************************************************************
   *                                                          *
   *  Method Name:  getValidBillAmount                        *
   *                                                          *
   *  Purpose:  obtain bill amount from input             *
   *                                                          *
   *                                                          *
   ************************************************************/
    public static double getValidBillAmount()
    {
        String recStr; // store the input string
        double validBillAmount; //store the tip precentage
        Scanner sc = new Scanner(System.in);
        int countTime = 1;
        do
        {
            if (countTime == 1) //get the input string first time 
            {
                System.out.printf("\nEnter the bill amount: ");
                recStr = sc.next();              
            }
            else //get the input string if the first time failed 
            {
                System.out.printf("Please enter a valid bill amount\n\n");
                System.out.printf("Enter the bill amount: ");
                recStr = sc.next();
            }
            countTime = countTime + 1;
        }while( isValidBillAmount(recStr) == false); //check whether the number is valid
        return Double.parseDouble(recStr);  //return the bill amount

    } 

   /************************************************************
   *                                                          *
   *  Method Name:  isValidTipPrecentage                      *
   *                                                          *
   *  Purpose:  check whether a string is                     *
   *            a valid tip precentage                        *
   *                                                          *
   ************************************************************/
    public static boolean isValidTipPrecentage(String strNum) 
    {
        int numTemp = -1; //initiallize the tip precentage with an invalid number
        if (strNum == null)  //if the input is null, it is invalid
        {
            return false;
        }
        try 
        {
            numTemp = Integer.parseInt(strNum);
        } 
        catch (NumberFormatException nfe) //if the input cannot be converted to int, it is invalid
        {
            return false;
        }

        if (numTemp>=0) //if the input is valid if it is greater than or equal to 0
            return true;
        else
            return false;
    }   
   /************************************************************
   *                                                          *
   *  Method Name:  getValidTipPrecentage                     *
   *                                                          *
   *  Purpose:  obtain tip precentage= from input             *
   *                                                          *
   *                                                          *
   ************************************************************/
    public static int getValidTipPrecentage()
    {
        String recStr; // store the input string
        int validTipPrecentage; //store the tip precentage
        Scanner sc1 = new Scanner(System.in);
        int countTime = 1;
        do
        {
            if (countTime == 1) //get the input string first time 
            {
                System.out.printf("Enter your desired tip precentage (20 equals 20%%): ");
                recStr = sc1.next();              
            }
            else //get the input string if the first time failed 
            {
                System.out.printf("Please enter a valid tip precentage\n\n");
                System.out.printf("Enter your desired tip precentage (20 equals 20%%): ");
                recStr = sc1.next();
            }
            countTime = countTime + 1;
        }while(isValidTipPrecentage(recStr) == false); //check whether the number is valid
        return Integer.parseInt(recStr);  //return the tip precentage

    }  
   /************************************************************
   *                                                          *
   *  Method Name:  isValidPartySize                          *
   *                                                          *
   *  Purpose:  check whether a string is a valid party size  *
   *                                                          *
   *                                                          *
   ************************************************************/
    public static boolean isValidPartySize(String strNum) 
    {
        int numTemp = -1; //initiallize the party size with an invalid number
        if (strNum == null)  //if the input is null, it is invalid
        {
            return false;
        }
        try 
        {
            numTemp = Integer.parseInt(strNum);
        } 
        catch (NumberFormatException nfe) //if the input cannot be converted to int, it is invalid
        {
            return false;
        }

        if ((numTemp>0) ) //if the input is valid if it is greater than 0
            return true;
        else
            return false;
    }   

   /************************************************************
   *                                                          *
   *  Method Name:  getValidPartySize                         *
   *                                                          *
   *  Purpose:  obtain valid party size from input            *
   *                                                          *
   *                                                          *
   ************************************************************/
    public static int getValidPartySize()
    {
        String recStr;
        int validPartySize; 
        Scanner sc1 = new Scanner(System.in);
        int countTime = 1;
        do
        {
            if (countTime == 1) //get the input string first time 
            {
                System.out.printf("Enter the size of your party: ");
                recStr = sc1.next();              
            }
            else //get the input string 
            {
                System.out.printf("Please enter a valid party size\n\n");
                System.out.printf("Enter the size of your party: ");
                recStr = sc1.next();
            }
            countTime = countTime + 1;
        }while( isValidPartySize(recStr) == false); //chck whether the number is valid
        return Integer.parseInt(recStr);  //retuen the party size

    }  



   /************************************************************
   *                                                          *
   *  Method Name:  isAnotherBill                             *
   *                                                          *
   *  Purpose:  check whether we have another bill            *
   *                                                          *
   *                                                          *
   ************************************************************/  
    public static boolean isAnotherBill(String recStr) 
    {
        String ynStr = recStr.toLowerCase(); //convert the input string to lowrcase

        int countTime = 1; //count time of getting input
        Scanner sc = new Scanner(System.in);

        

        do
        {
            if(countTime == 1) //if it is the first time
            {
                if (ynStr.equals("y")) //if we get "y",which means we have another bill
                {
                    return true;
                }
                if (ynStr.equals("n")) //if we get "n",which means we donot have another bill
                {
                    return false;
                }
            }
            else //if it is the first time, which means that the first time input is illegal 
            {
                System.out.printf("\nplease input valid notation.\n"); 
                System.out.printf("Another bill? (y/n): ");
                recStr = sc.next();
                ynStr = recStr.toLowerCase(); 
                if (ynStr.equals("y")) //if we get "y",which means we have another bill
                {
                    return true;
                }
                if (ynStr.equals("n")) //if we get "n",which means we donot have another bill
                {
                    return false;
                }               
            }
            countTime = countTime + 1;

        }while(true);// run the loop until we get "y" or "n"

    }


   /************************************************************
   *                                                          *
   *  Method Name:  calculateTips                             *
   *                                                          *
   *  Purpose:  interface for getting the bill information    *
   *            and show the total amount and sndividual share*
   *                                                          *
   ************************************************************/  
    public static void calculateTips(TipCalculator tip)
    {
        double billAmountInput; //store the bill amount from imput
        int tipPrecentageINput; //store the tip precentage from imput
        int partySizeInput; //store the party size from imput
        String recStr; //store the input string 
        Scanner sc = new Scanner(System.in);

        System.out.printf("*** Tip Calculator ***\n");


        do
        {
            billAmountInput = getValidBillAmount(); //obtain the bill amount
            tipPrecentageINput = getValidTipPrecentage(); //obtain the tip precentage
            partySizeInput = getValidPartySize(); //obtain the party size
    
            System.out.printf("\n*** Your Bill ***\n\n");
    
            tip.setBillAmount(billAmountInput); //set the bill amount to til class
            tip.setTipPercentage(tipPrecentageINput); //set the tip precentage to til class
            tip.setPartySize(partySizeInput); //set the party size to til class
    
    
            System.out.printf("Bill Amount: $%.2f \n",tip.getBillAmount()); //print the bill amount 
            System.out.printf("Tip Percentage: %d \n",tip.getTipPercentage());  //print the tip precentage
            System.out.printf("Party Size: %d \n\n",tip.getPartySize());  //print theparty size
            System.out.printf("Total Bill (with Tip): $%.2f\n",tip.getTotalBill());  //print the total bill amount
            System.out.printf("Share for Each Individual: $%.2f\n",tip.getIndividualShare());  //print the Individual share

            System.out.printf("\nAnother bill? (y/n): "); 
            recStr = sc.next(); //get string for checking whether we have another bill             

        }
        while(isAnotherBill(recStr)); //is we have another bill do the loop again   











       System.out.printf("\nGoodbye!\n");



   }
}