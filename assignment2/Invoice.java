/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 2        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:  Invoice.                                   *
 *                                                          *
 *  Programmer:  Xuezhi Cang Z1747635                       *
 *                                                          *
 *                                                          *
 *                                                          *
 *                                                          *
 *  Purpose:  basic information of Invoice class           *
 *                                                          *
 *                                                          *
 ************************************************************/
public class Invoice
{
   private String partNumber; // part number
   private String partDiscription; // part description
   private int partQuantity; // quantity of the item being purchased
   private double partPrice; // price per item


  /************************************************************
  *                                                          *
  *  Method Name:  Invoice.                               *
  *                                                          *
  *  Purpose:  This method is a constructor.                 *
  *            It constructs class with no parameter         *
  *                                                          *
  ************************************************************/   
   public Invoice(){}


  /************************************************************
  *                                                          *
  *  Method Name:  Invoice                                   *
  *                                                          *
  *  Purpose:  This method is a constructor.                 *
  *            It constructs class using four parameters     *
  *                                                          *
  ************************************************************/      
   public Invoice(String partNumber, String partDiscription,int partQuantity, double partPrice) 
   {
      this.partNumber = partNumber; // assign partNumber to instance variable name
      this.partDiscription = partDiscription; // assign partDiscription to instance variable name
      this.partQuantity = partQuantity; // assign partQuantity to instance variable name
      this.partPrice = partPrice; // assign partPrice to instance variable name
   }   


  /************************************************************
  *                                                          *
  *  Method Name:  getInvoiceAmount                          *
  *                                                          *
  *  Purpose:  This method can calculate the total amount    *
  *                                                          *
  *                                                          *
  ************************************************************/     
   public double getInvoiceAmount() 
   {      
      double amount = new Double(partQuantity); //convert data type of partQuantity to double
      double unitPrice = partPrice;
      double totalAmount = 0.0;
      if ((amount > 0) &&  (unitPrice > 0))
      {
          totalAmount = amount*unitPrice;
         return amount*unitPrice; // return the total amount
      }
      else
        return totalAmount; // return 0
   }




   /************************************************************
   *                                                          *
   *  Method Name:  setPartNumber                             *
   *                                                          *
   *  Purpose:  method to set the part number in the object   *
   *                                                          *
   *                                                          *
   ************************************************************/          
   public void setPartNumber(String partNumber)      
   {                                             
      this.partNumber = partNumber; // store the part number
   }   

   /************************************************************
   *                                                          *
   *  Method Name:  setPartDiscription                        *
   *                                                          *
   *  Purpose:  method to set                                 *
   *            the part description in the object            *
   *                                                          *
   ************************************************************/      
   public void setPartDiscription(String partDiscription)      
   {                                             
      this.partDiscription = partDiscription; // store the part description
   }  

   /************************************************************
   *                                                          *
   *  Method Name:  setPartQuantity                           *
   *                                                          *
   *  Purpose:  method to set                                 *
   *            the quantity of the item being purchased      *
   *            in the object                                 *
   ************************************************************/    
   public void setPartQuantity(int partQuantity)      
   {                                             
      this.partQuantity = partQuantity; // store the quantity of the item being purchased
   }     

   /************************************************************
   *                                                          *
   *  Method Name: setPartPrice                               *
   *                                                          *
   *  Purpose:method to set the price per item in the object  *
   *                                                          *
   *                                                          *
   ************************************************************/      
   public void setPartPrice(double partPrice)      
   {                                             
      this.partPrice = partPrice; // store the price per item
   }    


   /************************************************************
   *                                                          *
   *  Method Name: getPartNumber                              *
   *                                                          *
   *  Purpose:method to retrieve                              *
   *          the part number from the object                 *
   *                                                          *
   ************************************************************/  
   public String getPartNumber()        
   {                                    
      return partNumber; // return part number to caller        
   } 
   
   /************************************************************
   *                                                          *
   *  Method Name: getPartDiscription                         *
   *                                                          *
   *  Purpose:method to retrieve                              *
   *          the part description from the object            *
   *                                                          *
   ************************************************************/    
   public String getPartDiscription()        
   {                                    
      return partDiscription; // return part description to caller        
   }  
   
   /************************************************************
   *                                                          *
   *  Method Name: getPartQuantity                            *
   *                                                          *
   *  Purpose:method to retrieve                              *
   *          the quantity of the item being purchased        *
   *          from the object                                 *
   ************************************************************/      
   public int getPartQuantity()        
   {                                    
      return partQuantity; // return quantity of the item being purchased to caller        
   }          

   /************************************************************
   *                                                          *
   *  Method Name: getPartPrice                               *
   *                                                          *
   *  Purpose:method to retrieve                              *
   *          the price per item from the object              *
   *                                                          *
   ************************************************************/  
   public double getPartPrice()        
   {                                    
      return partPrice; // return price per item to caller        
   }       


}