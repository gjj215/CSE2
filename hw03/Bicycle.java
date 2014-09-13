////////////////////////////////////
// Greg Jacobs
// CSE 002
// Homework 3 part 1 - Bicycle
// September 13, 2014
//
// A program that takes 2 user inputs to calculate distance traveled
// and miles per hour on a bicycle.
//
import java.util.Scanner; //Import Scanner class before writing anything in the program

public class Bicycle{
    public static void main (String[] args){
        //Scanner
        Scanner myScanner; //Declare an instance of Scanner object in order to accept user input
        myScanner = new Scanner( System.in);//Call the Scanner constructor, which tells Scanner
                                             //that I am creating an instance that will take input from STDIN
        //User inputs
        System.out.print("Please enter the number of counts on the cyclometer (an integer >0):");//Tell user what they need to input
        int nCount = myScanner.nextInt();//Accept user input and store in nCount
        System.out.print("Please enter the number of seconds during which the counts occured (in the form of xx.xx):");
        double nSeconds = myScanner.nextDouble(); //Accept the other user input and store in nSeconds
        
        //Constants
        double wheelDiameter=27.0, //Diameter of bike wheel (in inches)
        secondsPerHour=3600, //Number of seconds in an hour
        inchesPerMile=63360, //Inches per mile (12 inches in a foot times 5280 feet in a mile)
        pi=3.14159,
        secondsPerMinute=60; //Number of seconds in a minute
        
        //Declare names for calculations
        double miles, hours, minutes;
        
        //Calculations
        miles=nCount*wheelDiameter*pi/inchesPerMile; //Total distance in miles
        hours=nSeconds*nCount/secondsPerHour; //Total time in hours
        minutes=nSeconds*nCount/secondsPerMinute; //Total time in minutes
        
        //Output (constrict outputs to 2 deicmal places by making them integers, multiplying by 100
        // and then dividing by 100.0) This is so the output is not messy
        System.out.println("Distance traveled = "+(int)(miles*100)/100.0+" miles");//Print out total distance
        System.out.println("Total number of minutes = "+(int)(minutes*100)/100.0+" minutes");//Print out total number of minutes
        System.out.println("Average miles per hour = "+(int)((miles/hours)*100)/100.0+"mph");//Print out average miles per hour
        
        //Note to self, make sure PARENTHESIS are correctly placed when constricting decimal places!
    }
}