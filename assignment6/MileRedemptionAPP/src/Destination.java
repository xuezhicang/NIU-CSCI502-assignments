/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 4        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:  Destination                                *
 *                                                          *
 *  Programmer:  Xuezhi Cang Z1747635                       *
 *                                                          *
 *                                                          *
 *                                                          *
 *                                                          *
 *  Purpose:  store the basic mile info to the Destination; *
 *            set and get thhe basic info;                  * 
 *                                                          *
 *                                                          *
 ************************************************************/

import java.io.*;


public class Destination
{
    private String destCity; //deitination city's name 
    private int normalMile; //mileage for normal season
    private int offSeasonMile; //mileage for offseason season
    private int upgradeMile; //mileage for upgrading
    private int startMonth; //start month for offseason
    private int endMonth; //end month for offseason




   /************************************************************
   *                                                          *
   *  Method Name:  Destination                               *
   *                                                          *
   *  Purpose:  dafault construction for Destination          *
   *            the illeage number is set                     *
   *                                                          *
   ************************************************************/     
    public Destination() 
    {
        this.destCity = "";
        this.normalMile = -1;
        this.offSeasonMile = -1;
        this.upgradeMile = -1;
        this.startMonth = -1;
        this.endMonth = -1;
    }


   /************************************************************
   *                                                          *
   *  Method Name:  Destination                               *
   *                                                          *
   *  Purpose:  construction for Destination                  *
   *            the variables are from a string               *
   *                                                          *
   ************************************************************/  
    public Destination(String inputStr) 
    {      
        String[] allInfo = inputStr.split(";");   //seperate the string by ";"    
        this.destCity = allInfo[0]; //1st item is city's name  
        this.normalMile = Integer.parseInt(allInfo[1]); //2nd item is mileage for normal season  
        this.offSeasonMile = Integer.parseInt(allInfo[2]); //3rd item is mileage for offseason  
        this.upgradeMile = Integer.parseInt(allInfo[3]); //4th item is mileage for upgrading  
        String[] monthIfno = allInfo[4].split("-");
        this.startMonth = Integer.parseInt(monthIfno[0]); //5th item is starting month for offseason
        this.endMonth = Integer.parseInt(monthIfno[1]); //6th item is ending month for offseason 
    }



    /************************************************************
    *                                                           *
    *  Method Name:  setDestinationName                        *
    *                                                          *
    *  Purpose:  method to set                                 *
    *            desitination city's name in the objec         *
    *                                                          *
    ************************************************************/     
    public void setDestinationName(String cityName) 
    {
        destCity = cityName;
    }
 
    /************************************************************
    *                                                          *
    *  Method Name:  setNormalMile                             *
    *                                                          *
    *  Purpose:  method to set                                 *
    *            mileage for normal season in the object       *
    *                                                          *
    ************************************************************/      
    public void setNormalMile(int normalMileInt) 
    {
        normalMile = normalMileInt;
    }

    /************************************************************
    *                                                          *
    *  Method Name:  setOffSeasonMile                          *
    *                                                          *
    *  Purpose:  method to set                                 *
    *            mileage for normal season in the object       *
    *                                                          *
    ************************************************************/     
    public void setOffSeasonMile(int offseasonMileInt) 
    {
        offSeasonMile = offseasonMileInt;
    }

    /************************************************************
    *                                                          *
    *  Method Name:  setFirstClassUpgrade                       *
    *                                                          *
    *  Purpose:  method to set                                 *
    *            mileage for upgrading in the object           *
    *                                                          *
    ************************************************************/       
    public void setFirstClassUpgrade(int upgradingMileInt) 
    {
        upgradeMile = upgradingMileInt;
    }

    /************************************************************
    *                                                          *
    *  Method Name:  setStartMonth                             *
    *                                                          *
    *  Purpose:  method to set                                 *
    *            starting month for offseason in the object    *
    *                                                          *
    ************************************************************/    
    public void setStartMonth(int startMon) 
    {
        startMonth = startMon;
    }

    /************************************************************
    *                                                          *
    *  Method Name:  setEndMonth                               *
    *                                                          *
    *  Purpose:  method to set                                 *
    *            end month for offseason in the object         *
    *                                                          *
    ************************************************************/    
    public void setEndMonth(int endMon) 
    {
        endMonth = endMon;
    }   

    /************************************************************
    *                                                          *
    *  Method Name:  getDestCity                               *
    *                                                          *
    *  Purpose:  method to retrieve                            *
    *            desitination city's name from the object      *
    *                                                          *
    ************************************************************/  
    public String getDestCity() 
    {
      return destCity;
    }

    /************************************************************
    *                                                          *
    *  Method Name:  getNormalMile                             *
    *                                                          *
    *  Purpose:  method to retrieve                            *
    *            mileage for normal season from the object     *
    *                                                          *
    ************************************************************/      
    public int getNormalMile() 
    {
      return normalMile;
    }

    /************************************************************
    *                                                          *
    *  Method Name:  getOffSeasonMile                          *
    *                                                          *
    *  Purpose:  method to retrieve                            *
    *            mileage for offseason from the object         *
    *                                                          *
    ************************************************************/    
    public int getOffSeasonMile() 
    {
      return offSeasonMile;
    }

    /************************************************************
    *                                                          *
    *  Method Name:  getUpgradeMile                            *
    *                                                          *
    *  Purpose:  method to retrieve                            *
    *            mileage for upgrading from the object         *
    *                                                          *
    ************************************************************/    
    public int getUpgradeMile() 
    {
      return upgradeMile;
    }

    /************************************************************
    *                                                          *
    *  Method Name:  getStartMonth                             *
    *                                                          *
    *  Purpose:  method to retrieve                            *
    *            starting month for offseason from the object  *
    *                                                          *
    ************************************************************/     
    public int getStartMonth() 
    {
      return startMonth;
    }
    
    /************************************************************
    *                                                          *
    *  Method Name:  getStartMonth                             *
    *                                                          *
    *  Purpose:  method to retrieve                            *
    *            end month for offseason from the object       *
    *                                                          *
    ************************************************************/     
    public int getEndMonth() 
    {
      return endMonth;
    }
 








}
    