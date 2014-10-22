//////////////////////////////////////////
//Greg Jacobs
//Homework 7 - CSE 002
//Number Slack
//October 18, 2014
// A program that creates a stack from a user input in 3 ways: using for loops,
// using while loops, and using do-while loops.

import java.util.Scanner; //Import Scanner class before writing anything in the program
public class NumberSlack2{
    public static void main(String[] args){
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner(System.in); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.println("Enter a number between 1 and 9: ");//Ask user to enter an int
        int input;//Declare input
        if(myScanner.hasNextInt()){//Check if user input was an int
                input = myScanner.nextInt();//Store int in the name "input"
                if(input>=1 && input<=9){//Check if input is in range
                    int row = input;
                    int count = (2*input)-1;
                    //String spaces = "";
                    int maxVal = input;
                    int holdValue = row;
                    while(maxVal<=4){
                        row = input - holdValue + 1;//Change row to next value
                        holdValue = row;//Hold current value of row
                        System.out.println("Input = "+input);
                        System.out.println("row = "+row);
                        System.out.println("Count = "+count);
                        while(row>0){
                            count = (2*row)-1;
                            while(count>0){
                            System.out.print(row);//Print out number a certain amount of times
                            count--;//End loop with count is less than zero
                            }
                            System.out.println();//Next line
                            row--;//Decrement row
                        }
                        //row = holdValue;//Reset row to previous value
                        input++;//Increment input
                        maxVal++;
                    }
                }//End of range if
                else{//User did not enter an int within the range
                    System.out.println("You did not enter an int within the range");
                    return;//End program
                }//End of else
        }//End of check int if
        else{//User did not enter an int
            System.out.println("You did not enter an int");
            return;//End program
        }//End of else
    }//End of main method
}//End of class
            