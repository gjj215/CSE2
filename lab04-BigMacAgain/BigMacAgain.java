///////////////////////////////////
//Greg Jacobs
//Lab 04 - CSE 002
//BigMacAgain
//September 19, 2014
//
// A program that computes the cost of buying Big Macs with user inputs.
// Asks if user wants to add fries. Adds error message elements.
// Program uses selection statments to run codes conditionally.

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class BigMacAgain{
    public static void main(String[] args){
        //Scanner declaration
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner( System.in ); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        
        System.out.print("Enter the number of Big Macs: "); //Tell user what thing they are inputing
        int nBigMacs;//Declare name for user input
        
        //Check if user inputed an int
        if(myScanner.hasNextInt()){
            nBigMacs = myScanner.nextInt(); //If true, store integer in name
            
            //Check if int is greater than 0
            if (nBigMacs >= 1){
                
                        //Constants (are put in this if statement because if put outside the main part of the code, the user input does not work)
                        double costMacs = 2.22,
                        costFries = 2.15;
                        double cost$;
                        double costAndFries$;
                        
                        //Code to make sure the output decimal places print out only to cents
                        int dollars, dimes, pennies; //for storing digits to the right of the decimal point
                        cost$ = nBigMacs*costMacs; //get the whole cost, dropping the decimal fraction
                        dollars=(int)cost$;
                        dimes=(int)(cost$*10)%10; //get dimes amount , e.g., (int)(6.73*10)%10 -> 67%10 -> 7
                                                //where the % (mod) operator returns the remainder
                        pennies=(int)(cost$*100)%10; //after the division: 583%100 -> 83, 27%5 -> 2
                        
                        //Same code for output of added fries
                        int dollars2, dimes2, pennies2;
                        costAndFries$ = nBigMacs*costMacs+costFries;
                        dollars2=(int)costAndFries$;
                        dimes2=(int)(costAndFries$*10)%10;
                        pennies2=(int)(costAndFries$*100)%10;
                        
                System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs+" x $"+costMacs+" = $"+dollars+'.'+dimes+pennies);//print out total cost of big macs
            
                //Now ask if they want fries with their order
                System.out.println("Do you want an order of fries (Y/y/N/n)?");
                Scanner myScanner2; //Declare a new instance of the scanner to get a new input
                myScanner2 = new Scanner(System.in);
                String response = myScanner2.next(); //Have scanner read the input string up to the first space or return key input
                    if(response=="Y"||response=="y"){ //Check if input was yes (|| is the "or" function)
                        System.out.println("You ordered fries at a cost of $"+costFries);//Print out fries cost
                        System.out.println("The total cost of the meal is $"+dollars2+'.'+dimes2+pennies2);//Print out total cost of meal
                    } //Need curly brackets after if/else statements if more than 1 line of code is after it
                    else if(response=="N"||response=="n")//Check if input was no
                        System.out.println("The total cost of the meal is $"+dollars+'.'+dimes+pennies);//Print out total cost of meal
                    else{
                    System.out.println("You did not enter one of 'Y', 'y', 'N', 'n'"); //If input was not right, print error message and end program
                    return;
                    }
            }
            else{
                System.out.println("You did not enter an int > 0"); //Print error and exit program if integer is less than 1
                return;
            }
        }     
        else{
            System.out.println("You did not enter an int"); //If user input was not an int, print an error message and exit program.
            return; //Exit program
        }//Need curly brackets after if/else statements if more than 1 line of code is after it



      }
}