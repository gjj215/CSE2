//////////////////////////////////////////
//Greg Jacobs
//Homework 6 part 2 - CSE 002
//Root
//October 14, 2014
//
// Using the bisection method to compute a square root.

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class Root{
    public static void main(String[] args){
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner(System.in); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.println("Enter a double greater than 0: ");//Ask the user to enter a double
        double x;// A place to store the user input
        double difference = 99999;//Initialize the difference as a high number to start the while loop 
        if(myScanner.hasNextDouble()){//Check if user entered a double
            x = myScanner.nextDouble();//Place input in double x
            if(x>0){
            double low = 0;//Initialize low
            double high = 1+x;//Initialize high
            double middle = (low+high)/2;
            while(difference>(.0000001*(1+x))){//Keep repeating steps as long as the difference is bigger than .0000001 error
                if((middle*middle)>x){//If middle squared is greater than x
                    high = middle;//Set high to middle
                    difference = high - low;//Record the difference
                }
                else{//If middle squared is not greater than x
                    low = middle;//Set low to middle
                    difference = high - low;//Record the difference
                }
                middle = (low+high)/2;//Reset middle for each loop
            }//End of while
            System.out.println("The square root of "+x+" is "+middle);//Print out square root
            }//End of positive if
            else{//User did not enter a positive double
                System.out.println("You did not enter a positive double.");
                return;//Exit program
            }
        }//End of check int if
        else{//If user did not enter a double
            System.out.println("You did not enter a double.");
            return;//Exit program
        }
    }//End of main method
}//End of class