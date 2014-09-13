////////////////////////////////////
// Greg Jacobs
// CSE 002
// Homework 3 part 2 - Root
// September 13, 2014
//
// A program that takes a user input (double) and prints out a crude estimate
// of the cube root of the number and the value of this crude guess when cubed.
//
import java.util.Scanner; //Import Scanner class before writing anything in the program

public class Root{
    public static void main (String [] args){
        //Scanner
        Scanner myScanner; //Declare an instance of Scanner object in order to accept user input
        myScanner = new Scanner( System.in);//Call the Scanner constructor, which tells Scanner
                                            //that I am creating an instance that will take input from STDIN
        //User input
        System.out.print("Enter a double:");//Tell user what they need to input
        double userNumber = myScanner.nextDouble();//Accept user input and store in userNumber
        
        //Calculation
        double guess;
        guess = userNumber/3; //Initial inaccurate guess of cube root
        
        //Improve guess 5 times, each time replacing guess
        guess = (2*guess*guess*guess + userNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess + userNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess + userNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess + userNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess + userNumber)/(3*guess*guess);
        
        //Output
        System.out.println("The cube root is approxiametly: "+guess);
        
    }
}