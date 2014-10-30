//////////////////////////////////////////
//Greg Jacobs
//Lab 9 - CSE 002
//October 24, 2014
//Methods
//
// In this lab we will practice writing methods
//
import java.util.Scanner; //Import Scanner class before writing anything in the program

public class Methods{
    
    public static void main(String[] args){
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner( System.in ); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.println("Enter three ints");//Ask user to enter 3 ints
        int a,b,c;//Variables to store user inputs
        a=getInt(myScanner);
        b=getInt(myScanner);
        c=getInt(myScanner);
        
        /*System.out.println("a ="+a);
        System.out.println("b ="+b);
        System.out.println("c ="+c);*/
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
        System.out.println("The larger of "+a+", "+b+", and "+c+" is "+larger(a,larger(b,c)));
        System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+", and "+c+" are in ascending order");
        
    }//End of main method
    
        //////Method for retrieving int from user
        public static int getInt(Scanner n){
            while(!n.hasNextInt()){//If the intput is not an int
                n.next();//Get rid of the junk entered by user
                System.out.println("You did not enter an int; try again: ");
            }
            return n.nextInt();//Set user input as "n" if user entered an int
        }//End of getInt method
        
        
        //////Method 2
        public static int larger (int x, int y){
            if(x>y)
                return x;
            else
                return y;
        }
        
        //////Method 3
        public static boolean ascending(int q, int w, int e){
            if(q<w && w<e)
                return true;
            else
                return false;
        }

}//End of class