//////////////////////////////////////////
//Greg Jacobs
//Lab7 - CSE 002
//Loop the Loop
//October 12, 2014
//A program that uses while loops and break statements

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class LoopTheLoop{
    public static void main(String[] args){
        boolean runAgain = true;//Declare runAgain as true so the program runs once, at the end it will ask the user if
                                //they want to run the program again
        while(true){//User wants to run the program again
            Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
            myScanner = new Scanner(System.in); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
            System.out.println("Please enter an int between 1 and 15: ");//Ask user to enter an int
            int input;//Declare input
            if(myScanner.hasNextInt()){//Check if user input was an int
                input = myScanner.nextInt();//Store int in the name "input"
                if(input>1 && input<15){//Check if input is in range
                    int nStars=0;//The number of stars to be printed
                    int row = 1;//The number of rows of stars
                
                    //First print out a line of stars equal to the int the user inputed
                    while(nStars<input){
                        System.out.print("*");//Print out a line of stars
                        nStars++;//Increment nStars
                    }
                    //Then print out a right triangle of stars from 1 star to the number of the user int in order
                    while (row<=input+1){//Want number of rows to equal user input (plus 1)
                        nStars = 2;//Initialize nStars in the while loop (needs to be 2 because of the syntax of my while statement,
                                    //which I used "<=" in)
                        while (nStars<=row){//While nStars is less than or equal to the row number, print out that many stars
                            // for example if row number is 8, print out star 1,2,3,4,5,6,7,8
                            System.out.print("*");//Print out a line of stars
                            nStars++;//Increment nStars
                        }  
                        System.out.println();//Bring curser to next line
                        row++;//Increment row
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
        
        //Now ask if the user wants to run the program again
        Scanner myScanner2;//Declare a new instance of the scanner
        myScanner2 = new Scanner(System.in);//Call the scanner constructor
        System.out.println("Enter Y or y to go again");//Ask user if they want to go again
        String input2 = myScanner.next(); //Have scanner read the input string up to the first space or return key input
        int inputLength = input2.length();// item.length() measures the string length of item input
        if (inputLength == 1){//Check if input string is length 1
            switch(input2){
                case "Y":case"y"://User wants to run the program again
                    runAgain = true;
                break;
                case "N":case "n"://User does not want to keep going
                    System.out.println("Goodbye");
                    runAgain = false;
                    return;
                default://User did not enter an expected character
                    System.out.println("You did not enter a 'Y', 'y', 'N', or 'n'");
                    return;//End program
            }//End of switch
        }//End of character length if
        else{//The user did not input a single character
            System.out.println("A single character expected");
            return;//End program
        }//End of else
        }//End of while runAgain loop
        
    }//End of method
}//End of class