/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 4        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:  MileComparator                               *
 *                                                          *
 *  Programmer:  Xuezhi Cang Z1747635                       *
 *                                                          *
 *                                                          *
 *                                                          *
 *                                                          *
 *  Purpose:  compare to two destination class              *
 *                                   by normal mileage;     * 
 *                                                          *
 *                                                          *
 ************************************************************/



import java.util.Comparator;

public class MileComparator implements Comparator<Destination>
{
    @Override
    public int compare(Destination d1, Destination d2)
    {
        return (d2.getNormalMile() - d1.getNormalMile());
    }







    
}