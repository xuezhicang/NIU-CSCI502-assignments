/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1       Assignment 5        Summer 2020  *
 *                                                          *
 *                                                          *
 *  Class Name:  Employee                                   *
 *                                                          *
 *  Programmer:  Xuezhi Cang Z1747635                       *
 *                                                          *
 *                                                          *
 *                                                          *
 *                                                          *
 *  Purpose:   store info and methods of Employee;          *
 *                                                          * 
 *                                                          *
 *                                                          *
 ************************************************************/
// Fig. 10.4: Employee.java
// Employee abstract superclass.

public abstract class Employee 
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   
   private Date birthDate; //added variable by student
   
   //added method by student
   //return the birthDate;
   public Date getbirthDate()
   {
      return birthDate;
   } 

   // constructor
   public Employee(String firstName, String lastName, 
      String socialSecurityNumber,int month,int day,int year)
   {
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;  
      this.birthDate = new Date(month,day,year);       
   } 

   // return first name
   public String getFirstName()
   {
      return firstName;
   } 

   // return last name
   public String getLastName()
   {
      return lastName;
   } 

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } 

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format("%s %s%nsocial security number: %s%nbirth date: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber(),birthDate.toString());
   } 

   // abstract method must be overridden by concrete subclasses
   public abstract double earnings(); // no implementation here
   public double bonus()
   {
      return 100;
   }
} // end abstract class Employee


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
