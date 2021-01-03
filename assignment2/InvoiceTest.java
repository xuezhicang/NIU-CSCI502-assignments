/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 2        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:  InvoiceTest                                *
 *                                                          *
 *  Programmer:  Xuezhi Cang Z1747635                       *
 *                                                          *
 *                                                          *
 *                                                          *
 *                                                          *
 *  Purpose:  Test the Invoice class                        *
 *                                                          *
 *                                                          *
 ************************************************************/
// Inputting and outputting floating-point numbers with Account objects.
import java.text.DecimalFormat;


public class InvoiceTest
{
   public static void main(String[] args) 
   {
      Invoice invoice1 = new Invoice("AB-23-4312", "Cordless Drill", 10,189.00); //initialize invoice1

      Invoice invoice2 = new Invoice(); //initialize invoice2 without parameters
      invoice2.setPartNumber("AB-23-4311"); //set PartNumber
      invoice2.setPartDiscription("Phillips Head Screwdriver"); //set PartDiscription
      invoice2.setPartQuantity(2); //set PartQuantity
      invoice2.setPartPrice(4.02); //set PartPrice
      

      Invoice invoice3 = new Invoice("AB-23-4313", "Light Switch",-3,-3.03); //initialize invoice3 with abnormal data (negtive values)

      Invoice invoice4 = new Invoice("AB-23-4314", "Hammer",-4,2.04); //initialize invoice4 with abnormal data (negtive value)

      Invoice invoice5 = new Invoice("AB-23-4315", "Carpenter's Square",5,-1.05); //initialize invoice5 with abnormal data (negtive value)

      DecimalFormat aFormat = new DecimalFormat("$##,###,###,##0.00");

      
      //print the information of invoice1
      System.out.println("Invoice #1\n"); 
      System.out.printf("%20s%-3s%-15s\n\n","Part No.",":",invoice1.getPartNumber());
      System.out.printf("%20s%-3s%-15s\n\n","Item Desc.",":",invoice1.getPartDiscription());
      System.out.printf("%20s%-3s%-15s\n\n","Quantity",":",invoice1.getPartQuantity());
      System.out.printf("%20s%-3s%-15.2f\n\n","Item Price",":",invoice1.getPartPrice());
      System.out.printf("%20s%-3s%15s\n\n","Invoice Subtotal",":",aFormat.format(invoice1.getInvoiceAmount()));
      System.out.println("**************************************");
      System.out.printf("\n");

      //print the information of invoice2
      System.out.println("Invoice #2\n");
      System.out.printf("%20s%-3s%-15s\n\n","Part No.",":",invoice2.getPartNumber());
      System.out.printf("%20s%-3s%-15s\n\n","Item Desc.",":",invoice2.getPartDiscription());
      System.out.printf("%20s%-3s%-15s\n\n","Quantity",":",invoice2.getPartQuantity());
      System.out.printf("%20s%-3s%-15.2f\n\n","Item Price",":",invoice2.getPartPrice());
      System.out.printf("%20s%-3s%15s\n\n","Invoice Subtotal",":",aFormat.format(invoice2.getInvoiceAmount()));
      System.out.println("**************************************");
      System.out.printf("\n");

      //print the information of invoice3
      System.out.println("Invoice #3\n");
      System.out.printf("%20s%-3s%-15s\n\n","Part No.",":",invoice3.getPartNumber());
      System.out.printf("%20s%-3s%-15s\n\n","Item Desc.",":",invoice3.getPartDiscription());
      System.out.printf("%20s%-3s%-15s\n\n","Quantity",":",invoice3.getPartQuantity());
      System.out.printf("%20s%-3s%-15.2f\n\n","Item Price",":",invoice3.getPartPrice());
      System.out.printf("%20s%-3s%15s\n\n","Invoice Subtotal",":",aFormat.format(invoice3.getInvoiceAmount()));
      System.out.println("**************************************");
      System.out.printf("\n");

      //print the information of invoice4
      System.out.println("Invoice #4\n");
      System.out.printf("%20s%-3s%-15s\n\n","Part No.",":",invoice4.getPartNumber());
      System.out.printf("%20s%-3s%-15s\n\n","Item Desc.",":",invoice4.getPartDiscription());
      System.out.printf("%20s%-3s%-15s\n\n","Quantity",":",invoice4.getPartQuantity());
      System.out.printf("%20s%-3s%-15.2f\n\n","Item Price",":",invoice4.getPartPrice());
      System.out.printf("%20s%-3s%15s\n\n","Invoice Subtotal",":",aFormat.format(invoice4.getInvoiceAmount()));
      System.out.println("**************************************");
      System.out.printf("\n");

      //print the information of invoice5
      System.out.println("Invoice #5\n");
      System.out.printf("%20s%-3s%-15s\n\n","Part No.",":",invoice5.getPartNumber());
      System.out.printf("%20s%-3s%-15s\n\n","Item Desc.",":",invoice5.getPartDiscription());
      System.out.printf("%20s%-3s%-15s\n\n","Quantity",":",invoice5.getPartQuantity());
      System.out.printf("%20s%-3s%-15.2f\n\n","Item Price",":",invoice5.getPartPrice());
      System.out.printf("%20s%-3s%15s\n\n","Invoice Subtotal",":",aFormat.format(invoice5.getInvoiceAmount()));
      System.out.println("**************************************");

   } // end main
}
