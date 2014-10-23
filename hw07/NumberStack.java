//////////////////////////////////////////
//Greg Jacobs
//Homework 7 - CSE 002
//Number Stack
//October 18, 2014
// A program that creates a stack from a user input in 3 ways: using for loops,
// using while loops, and using do-while loops.

import java.util.Scanner; //Import Scanner class before writing anything in the program
public class NumberStack{
    public static void main(String[] args){
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner(System.in); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.println("Enter a number between 1 and 9: ");//Ask user to enter an int
        int input;//Declare input
        if(myScanner.hasNextInt()){//Check if user input was an int
                input = myScanner.nextInt();//Store int in the name "input"
                if(input>=1 && input<=9){//Check if input is in range
                    int row = 1;//Initialize number of rows per stack
                    int number = 1;//Initialize counter as the lowest number in the stack
                    int count = (2*number)-1;//Number of ints to print out in a single row
                    int countBar = (2*number)-1;//Number of bars to print out between stacks
                    int space = 1;//Initialize number of spaces before prints
                    
                    //I declared the variables outside the for loops instead of inside them so I can use them
                    // with the While and Do-While loops
                
                    System.out.println("Using for loops:");
                    for(number = 1; number<=input; number++){//Keep looping until the highest number (input) is reached.
                        for(row = 1; row<=number; row++){//Loop for number of nows per stack (equals to the int being printed)
                            for(space = 0; space<=(input - number); space++){//Calculation for number of spaces infront of each number row
                                System.out.print(" ");//Print out a space    
                            }
                            for(count = (2*number)-1; count>0; count--){//Loop until there are (2*number)-1 ints in a single row
                            System.out.print(number);//Print out number a certain amount of times
                            }
                            System.out.println();//Next line
                        }
                        ////// Loops for printing bars
                        for(space = 0; space<=(input - number); space++){//Calculation for number of spaces infront of each number row
                            System.out.print(" ");//Print out a space
                        }
                        for(countBar = (2*number)-1; countBar>0; countBar--){//Same as above to print out desired number of bars
                            System.out.print("-");//Print out bar
                        }
                        //////
                        System.out.println();//Add a line after bars print
                    }
                    System.out.println("Using While Loops:");
                    
                    //Reset all variables
                    row = 1;//Initialize number of rows per stack
                    number = 1;//Initialize counter as the lowest number in the stack
                    count = (2*number)-1;//Number of ints to print out in a single row
                    countBar = (2*number)-1;//Number of bars to print out between stacks
                    space = 1;//Initialize number of spaces before prints
                    
                    while(number<=input){//Keep looping until the highest number (input) is reached.
                        while(row<=number){//Loop for number of nows per stack (equals to the int being printed)
                            space = 0;//Set/reset spaces to 0
                            while(space<=(input - number)){//Calculation for number of spaces infront of each number row
                                System.out.print(" ");//Print out a space
                                space++;//Increment space
                            }
                            while(count>0){//Loop until there are (2*number)-1 ints in a single row
                                System.out.print(number);//Print out number a certain amount of times
                                count--;//End loop with count is less than zero
                            }
                            System.out.println();//Next line
                            row++;//Increment row
                            count = (2*number)-1;//Reset count
                        }
                        ////// Loops for printing bars
                        space = 0;//Set/reset space count
                        while(space<=(input - number)){//Calculation for number of spaces infront of each number row
                            System.out.print(" ");//Print out a space
                            space++;//Increment space
                        }
                        countBar = (2*number)-1;//Same as above to print out desired number of bars
                        while(countBar>0){//Loop for printing out bars
                            System.out.print("-");//Print out bar
                            countBar--;//Decrement countBar
                        }
                        //////
                        System.out.println();//Add a line after bars print
                        row = 1;//Reset row
                        number++;//Increment number
                        count = (2*number)-1;//Reset count
                    }
////////////////////////////
                    System.out.println("Using Do-While Loops:");
                    
                    //Reset all variables
                    row = 1;//Initialize number of rows per stack
                    number = 1;//Initialize counter as the lowest number in the stack
                    count = (2*number)-1;//Number of ints to print out in a single row
                    countBar = (2*number)-1;//Number of bars to print out between stacks
                    space = 1;//Initialize number of spaces before prints
                    do{//Keep looping until the highest number (input) is reached.
                        do{//Loop for number of nows per stack (equals to the int being printed)
                            space = 0;//Set/reset spaces to 0
                            do{//Calculation for number of spaces infront of each number row
                                System.out.print(" ");//Print out a space
                                space++;//Increment space
                            }while(space<=(input - number));
                            do{//Loop until there are (2*number)-1 ints in a single row
                                System.out.print(number);//Print out number a certain amount of times
                                count--;//End loop with count is less than zero
                            }while(count>0);
                            System.out.println();//Next line
                            row++;//Increment row
                            count = (2*number)-1;//Reset count
                        }while(row<=number);
                        ////// Loops for printing bars
                        space = 0;//Set/reset space count
                        do{//Calculation for number of spaces infront of each number row
                            System.out.print(" ");//Print out a space
                            space++;//Increment space
                        }while(space<=(input - number));
                        countBar = (2*number)-1;//Same as above to print out desired number of bars
                        do{//Loop for printing out bars
                            System.out.print("-");//Print out bar
                            countBar--;//Decrement countBar
                        }while(countBar>0);
                        //////
                        System.out.println();//Add a line after bars print
                        row = 1;//Reset row
                        number++;//Increment number
                        count = (2*number)-1;//Reset count
                    }while(number<=input);
                    
                    
                    
                    
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
            