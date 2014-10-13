///////////////////////////////
//Greg Jacobs
//LAB 06 - CSE 2
//Engima1
//October 12, 2014
//
// A fix to the given program on coursesite.

/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */
/*
Buggy Program:

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   if(1-x/100==0.93)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if(1-x/100==0.59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(1-x/100==0.86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(1-x/100==0.67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(1-x/100==0.4)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
   }
}


System output:
Enter a value for the percent (0, 1,...99)- 7
You entered 7.0%

Error report: 
    Not only does the program not work for all values between 0 and 99, but it doesn't even work for the
    5 values it is written for. The whole way this program was written is wrong, I would not write it
    for "sepcial cases", I would write a program that works the same way for every input between 0 and 99. Also
    the double percent is not even being used.
    Here is my fix to the program:
 */
 
 import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
    myScanner = new Scanner( System.in ); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    if (myScanner.hasNextDouble()){//Check if user entered a double
      double x= myScanner.nextDouble();//Declare x as the user input
      if(x>=0 && x<=99){//If user input is in range, continue
        double remProportion = (1-(x/100));//The user input as a proportion, subtracted by 1 to get remaining proportion.
        System.out.println("The proportion remaining is "+remProportion);//Print out remaining proportion
      }//End of range if
      else{//User value not in range
        System.out.println("You did not enter a value within the range");
        return;//Stop program
      }//End of range else
    }//End of first if
    else//User did not enter a double
      System.out.println("You did not enter a double");
   }
}

