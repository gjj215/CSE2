///////////////////////////////////
//Greg Jacobs
//Lab 03 - CSE 002
//BigMac
//September 12, 2014
//
// A program that computes the cost of buying Big Macs with user inputs.

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class BigMac{
    public static void main(String[] args){
        //Scanner and user inputs
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner( System.in ); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.print("Enter the number of Big Macs (an integer >0):"); //Tell user what thing they are inputing
        int nBigMacs = myScanner.nextInt(); //Accept user input
        System.out.print("Enter the cost per Big Mac as"+" a double (in the from xx.xx): " );
        double bigMac$ = myScanner.nextDouble(); //Accept another user input
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble(); //Accept another user input
        taxRate/=100; //User enters percent of tax, this converts it to a proportion
        
        //Print out outputs in a nice format
        double cost$;
        int dollars, //whole dolalr amount of cost
            dimes, pennies; //for storing digits to the right of the decimal point
        cost$ = nBigMacs*bigMac$*(1+taxRate); //get the whole cost, dropping the decimal fraction
        dollars=(int)cost$;
        dimes=(int)(cost$*10)%10; //get dimes amount , e.g., (int)(6.73*10)%10 -> 67%10 -> 7
                                 //where the % (mod) operator returns the remainder
        pennies=(int)(cost$*100)%10; //after the division: 583%100 -> 83, 27%5 -> 2
        System.out.println("The total cost of " +nBigMacs +" BigMacs, at $"+bigMac$+ //print out output
        " per bigMac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
    }
}