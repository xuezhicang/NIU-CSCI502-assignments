/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 3        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:  TipCalculator                              *
 *                                                          *
 *  Programmer:  Xuezhi Cang Z1747635                       *
 *                                                          *
 *                                                          *
 *                                                          *
 *                                                          *
 *  Purpose:  store the bill inofrmation;                   *
 *            calculate the total bill amount;              * 
 *            calculate the sharemount.                      *
 *                                                          *
 ************************************************************/
public class TipCalculator
{
    private double billAmount = 0; //bill amount 
    private int tipPercentage = 20;// tip percentage 20 = 20%
    private int partySize = 1; //party size


    public TipCalculator(){}


    public TipCalculator(double billAmount, int tipPercentage,int partySize) 
    {
       this.billAmount = billAmount; // assign bill amount to instance variable name
       this.tipPercentage = tipPercentage; // assign tip percentage to instance variable name
       this.partySize = partySize; // assign party size to instance variable name       
    }   
    


   /************************************************************
   *                                                          *
   *  Method Name:  setBillAmount                             *
   *                                                          *
   *  Purpose:  method to set the bill Amount in the object   *
   *                                                          *
   *                                                          *
   ************************************************************/          
   public void setBillAmount(double billAmount)      
   {                                             
      this.billAmount = billAmount; // store the bill amount
   }   

   /************************************************************
   *                                                          *
   *  Method Name:  setTipPercentage                          *
   *                                                          *
   *  Purpose:  method to set                                 *
   *            the tip Percentage in the object              *
   *                                                          *
   ************************************************************/      
   public void setTipPercentage(int tipPercentage)      
   {                                             
      this.tipPercentage = tipPercentage; // store the tip percentage
   }  

   /************************************************************
   *                                                          *
   *  Method Name:  setPartySize                              *
   *                                                          *
   *  Purpose:  method to set                                 *
   *            partySize  in the object                      *
   *                                                          *
   ************************************************************/    
   public void setPartySize(int partySize)      
   {                                             
      this.partySize = partySize; // store the party size
   }     




   /************************************************************
   *                                                          *
   *  Method Name: getBillAmount                              *
   *                                                          *
   *  Purpose:method to retrieve                              *
   *          the bill amount from the object                 *
   *                                                          *
   ************************************************************/  
   public double getBillAmount()         
   {                                    
      return billAmount; // return bill amount to caller        
   } 
   
   /************************************************************
   *                                                          *
   *  Method Name: getTipPercentage                           *
   *                                                          *
   *  Purpose:method to retrieve                              *
   *          the tip percentage from the object              *
   *                                                          *
   ************************************************************/    
   public int getTipPercentage()        
   {                                    
      return tipPercentage; // return tip percentage to caller        
   }  
   
   /************************************************************
   *                                                          *
   *  Method Name: getPartySize                               *
   *                                                          *
   *  Purpose:method to retrieve                              *
   *          the party size from the object                  *
   *                                                          *
   ************************************************************/      
   public int getPartySize()        
   {                                    
      return partySize; // return party size to caller         
   }          

   /************************************************************
   *                                                          *
   *  Method Name: getTotalBill                               *
   *                                                          *
   *  Purpose:method to calcualte                             *
   *          the total bill amount(bill+tip )                *
   *                                                          *
   ************************************************************/ 
  public double getTotalBill()
  {
    double tipPercentagePrecentage = (new Double(tipPercentage))/100;
    double totalAmount = 0.0;
    totalAmount = billAmount + billAmount* tipPercentagePrecentage;
    return totalAmount; 
  }

   /************************************************************
   *                                                          *
   *  Method Name: getIndividualShare                         *
   *                                                          *
   *  Purpose:method to calcualte                             *
   *          Individual Share                                *
   *                                                          *
   ************************************************************/
  public double getIndividualShare()
  {
    double tipPercentagePrecentage = (new Double(tipPercentage))/100;
    double totalAmount = 0.0;
    double shareAmount = 0.0;
    totalAmount = billAmount + billAmount* tipPercentagePrecentage;
    shareAmount = totalAmount/partySize;
    return shareAmount;
  }


}
