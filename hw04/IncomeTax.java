//////////////////////////////////////////
//Greg Jacobs
//Homework 4, part 1 - CSE 002
//IncomeTax
//September 21, 2014
//
// A program that computes the amount of tax for a given income.

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class IncomeTax{
    public static void main(String[] args){
        //Scanner and user inputs
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner( System.in ); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.print("Enter an int giving the number of thousands of dollars of income: ");
        int income;
        
        
        if(myScanner.hasNextInt()){ //Check if user inputed an int
            income = myScanner.nextInt(); //Accept user input if an int
                if(income >=0){ //Check if int is positive
                
                    /*double tax;
                    int dollars, dimes, pennies; //for storing digits to the right of the decimal point
                    tax = income*1000*(1+taxRate); //get the whole cost, dropping the decimal fraction
                    dollars=(int)tax;
                    dimes=(int)(tax*10)%10; //get dimes amount , e.g., (int)(6.73*10)%10 -> 67%10 -> 7
                                 //where the % (mod) operator returns the remainder
                    pennies=(int)(tax*100)%10; //after the division: 583%100 -> 83, 27%5 -> 2*/
                
                
                    if(income<20){ //For income less than 20000
                        System.out.println("The tax rate on $"+income*1000+" is 5.0%, and the tax is $"+(int)(income*1000*.05*100)/100);
                    }//Make income an integer and multiply and divid by 100 to not have a messy output
                    else if(income>=20 && income<40){ //For income between 20k and 40k
                        System.out.println("The tax rate on $"+income*1000+" is 7.0%, and the tax is $"+(int)(income*1000*.07*100)/100);
                    }
                    else if(income>=40 && income<78){ //For income between 40k and 78k
                        System.out.println("The tax rate on $"+income*1000+" is 12.0%, and the tax is $"+(int)(income*1000*.12*100)/100);
                    }
                    else{ //For incomes more than 78k
                        System.out.println("The tax rate on $"+income*1000+" is 14.0%, and the tax is $"+(int)(income*1000*.14*100)/100);
                    }
                        
                }
                else{ //If not positive, send error message and exit program
                    System.out.println("You did not enter a positive int");
                    return;
                }
        }
        else{ //If not an int, send error message and exit program
            System.out.println("You did not enter an int");
            return;
        }
    }
}