////////////////////////////////////
// Greg Jacobs
// CSE 002
// Homework 3 part 3 - Four Digits
// September 13, 2014
//
// A program that prompts the user to enter a double and then prints out
// the first four digits to the right of the decimal point.
//
import java.util.Scanner; //Import Scanner class before writing anything in the program

public class FourDigits{
    public static void main (String [] args){
        //Scanner
        Scanner myScanner; //Declare an instance of Scanner object in order to accept user input
        myScanner = new Scanner( System.in);//Call the Scanner constructor, which tells Scanner
                                             //that I am creating an instance that will take input from STDIN
        //User input
        System.out.print("Enter a double and I display the four digits to the right of the decimal point:");//Tell user what they need to input
        double userNumber = myScanner.nextDouble();//Accept user input and store in userNumber
        
        //Calculations
        int tenth, hundreth, thousanth, tenthousanth; //Declare integers for the four decimal place
        tenth=(int)(userNumber*10)%10; //Cast the input to an integer and get the tenth place value
                                       //e.g. (int)(6.7345*10)%10 -> 67%10 -> 7
                                       //where the % (mod) operator returns the remainder
        hundreth=(int)(userNumber*100)%10;//Find value for hundreth place
        thousanth=(int)(userNumber*1000)%10;//Find value for thousanth place
        tenthousanth=(int)(userNumber*10000)%10;//Find value for tenthousanth place
        
        //Output
        System.out.println("The four digits are: "+tenth+ +hundreth+ +thousanth+ +tenthousanth); //Print put the four digits
    }
}