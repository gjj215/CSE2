//////////////////////////////////////////
//Greg Jacobs
//Homework 4, part 2 - CSE 002
//Month
//September 22, 2014
//
// A program that displays the number of days for a inputed month.

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class Month{
    public static void main(String[] args){
        //Scanner and user inputs
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner( System.in ); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.print("Enter an int giving the number of the month: ");
        int month;
        
        if(myScanner.hasNextInt()){ //Check if user inputed an int
            month = myScanner.nextInt(); //Accept user input if an int
                if(month>=1 && month<=12){ //Check if input is in range
                    if(month==9||month==4||month==6||month==11) //Month is Sep, April, June, or Nov
                        System.out.println("The month has 30 days");
                    else if(month==2){//If month is February ask for the year
                        System.out.println("Enter an int giving the year: ");
                        Scanner myScanner2;
                        myScanner2 = new Scanner(System.in);
                        int year;
                        if(myScanner2.hasNextInt()){ //Check if user inputed an int
                            year = myScanner2.nextInt(); //Accept user input if an int
                            
                            //A leap year has 3 citeria: must be divisible by 4, divisible by 100, and divisible by 400.
                            //Using the % operator, it divides the left int by the right int and shows the remainder.
                            //If any remainder comes out not 0, then the year entered is not a leap year and therefore
                            //will have 28 days.
                                if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
                                    System.out.println("The month has 29 days");
                                else //Not leap year
                                    System.out.println("The month has 28 days");
                        }
                        else{ //Print error message and exit program if not an int
                            System.out.println("You did not enter an int");
                            return;
                        }
                    }
                    else //All remaining months (Jan, March, May, July, August, Oct, Dec)
                        System.out.println("The month has 31 days");
                }
                else{ //Exit program if int not in range
                    System.out.println("You did not enter an int between 1 and 12");
                    return;
                }
        }
        else{ //Print error message and exit program if not an int
            System.out.println("You did not enter an int");
            return;
        }
        
        
    }
}