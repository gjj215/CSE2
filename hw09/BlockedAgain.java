//////////////////////////////////////////
//Greg Jacobs
//Homework 9 - CSE 002
//November 3, 2014
//Blocked Again
//
// This homework uses a nested sequence of method calls that allows us to
// break down large problems into smaller problems.
//

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();//Call method that requests input from user
        allBlocks(m);//Call allBlocks method
    }
    
    
//// Method getInt
    public static int getInt(){
        Scanner myScanner = new Scanner(System.in);//Declare scanner
        System.out.print("Enter an int between 1 and 9, inclusive: ");//Ask user to enter an int
        int c;//Int for checkInt
        int d = 0; //int for checkRange
        c = checkInt(myScanner);//Call method to check int
        d = checkRange(c);//Check if user int (now held as c) is in range
        while(d == 0) {//Input is not in range
            c = checkInt(myScanner);//Call method to check int
            d = checkRange(c);//Check range
        }
        return c;//Return the verified input
    }//End of getInt method
    
            ///// Method checkInt
                public static int checkInt(Scanner n){//Check if user entered an int
                    while(!n.hasNextInt()){//If the intput is not an int
                            n.next();//Get rid of the junk entered by user
                            System.out.print("You did not enter an int; try again: ");// Error message
                        }
                        return n.nextInt();//Set user input as "n" if user entered an int
                }//End of checkInt method
    
            ///// Method checkRange
                public static int checkRange(int a){//Check if int is in range
                    if(a<1 || a>9){//Check if int is not between 1 and 9 inclusive
                        System.out.print("You did not enter an int in [1,9], try again: ");//Error message
                        return 0;//Return 0, which tells getInt that the int was not in range
                    }
                    else{//If int is in range
                        return a;
                    }
                }//End of checkRange method
    
///// Method allBlocks
    public static void allBlocks(int x){//(Void because it does not return anything)
        for(int i =1; i<=x; i++){//Call the method block as many times as the input value
            block(i, x);//Starts with block(1,x) then goes to block(2,x), etc....
        }
    }//End of allBlocks method
    
    public static void block(int number, int x){//Method for setting up the blocks and printing dashes
        int space = (x-number); //Appropriate number of spaces
        int dash = (number *2) - 1; //Appropriate number of dashes
        for(int i=0; i<number; i++){//Call line method as many times as the current number
            line(space, number);
        }
        
        ///Dashes code
        for(int i = 0; i<space; i++){//Print appropriate number of spaces
            System.out.print(" ");
        }
        for(int i = 0; i<dash; i++){//Print appropriate number of dashes
            System.out.print("-");
        }
        System.out.println();//Go to next line when done printing dashes

    }//End of block method
    
    public static void line(int space, int number){//Method for printing the blocks
        int count = (number * 2) - 1;//Count is the width of each block
        for(int i = 0; i<space; i++){//Print appropriate number of spaces
            System.out.print(" ");
        }
        for(int i = 0; i<count; i++){//Print appropriate number
            System.out.print(number);
        }
        System.out.println();//Go to next line when done printing block
    }//End of line method
        
}//End of class