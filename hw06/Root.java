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
        System.out.println("Enter a double greater than 0: ");
        double x;
        double difference = 99999;
        if(myScanner.hasNextInt()){
            x = myScanner.nextInt();
            double low = 0;
            double high = 1+x;
            double middle = (low+high)/2;
            while(difference>(.0000001*(1+x))){
                if((middle*middle)>x){
                    high = middle;
                    difference = low - middle;
                    System.out.println("middle= "+middle);
                    System.out.println("low= "+low);
                    System.out.println("high= "+high);
                }
                else{
                    low = middle;
                    difference = high - middle;
                    System.out.println("middle= "+middle);
                    System.out.println("low= "+low);
                    System.out.println("high= "+high);
                }
            }//End of while
            System.out.println("The square root of "+x+" is "+middle);
        }//End of check int if
        else{
            System.out.println("You did not enter a positive double.");
            return;
        }
    }//End of main method
}//End of class