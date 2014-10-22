//////////////////////////////////////////
//Greg Jacobs
//Homework 7 - CSE 002
//Number Slack
//October 18, 2014
// A program that creates a stack from a user input in 3 ways: using for loops,
// using while loops, and using do-while loops.

import java.util.Scanner; //Import Scanner class before writing anything in the program
public class NumberSlack{
    public static void main(String[] args){
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner(System.in); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.println("Enter a number between 1 and 9: ");//Ask user to enter an int
        int input;//Declare input
        if(myScanner.hasNextInt()){//Check if user input was an int
                input = myScanner.nextInt();//Store int in the name "input"
                if(input>=1 && input<=9){//Check if input is in range
                System.out.println("Using While Loops:");
                    int row = input;
                    int count = (2*input)-1;
                    //String spaces = "";
                    while(input>0){
                        while(row>0){
                            while(count>0){
                                System.out.print(input);//Print out number a certain amount of times
                                count--;//End loop with count is less than zero
                            }
                            System.out.println();//Next line
                            count = (2*input)-1;//Reset count
                            row--;//Decrement row
                        }
                        input--;//Decrement input
                        row = input;//Reset row to input
                        count = (2*input)-1;//Reset count
                    }
////////////////////////////
             /* I can't get the for loop to compile
                    
                System.out.println("Using for loops");
                for(int in = myScanner.nextInt(); in>0; in--){
                    for(int r = in; r>0; r--){
                        for(int c = (2*in)-1; c>0; c--){
                            System.out.print(in);//Print out number a certain amount of times
                            c--;//End loop with count is less than zero
                        }
                        System.out.println();//Next line
                        c = (2*in)-1;//Reset count
                        r--;//Decrement row
                    }
                    in--;//Decrement input
                    r = in;//Reset row to input
                    c = (2*in)-1;//Reset count
                }
                */
                    System.out.println("Using Do-While Loops:");
                    row = input;
                    count = (2*input)-1;
                   do{
                        while(row>0){
                            while(count>0){
                                System.out.print(input);//Print out number a certain amount of times
                                count--;//End loop with count is less than zero
                            }
                            System.out.println();//Next line
                            count = (2*input)-1;//Reset count
                            row--;//Decrement row
                        }
                        input--;//Decrement input
                        row = input;//Reset row to input
                        count = (2*input)-1;//Reset count
                    }
                    while(input>0);
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
            