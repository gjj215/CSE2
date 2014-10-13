///////////////////////////////
//Greg Jacobs
//LAB 06 - CSE 2
//Engima0.e
//October 7, 2014
//
// A fix to the given program on coursesite.

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

/*
Buggy program:


import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      int n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8,n;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

Error report:

Enigma0.java:35: error: variable n might not have been initialized
        System.out.println("To repeat, you entered "+n);
                                                     ^
1 error

 *   n is given a value inside an if/else block and then the program is told to print
    "To repeat, you entered "+n outside of that block, therefore n is never initialized for that statement.
    
 *  To fix the error I would first off make the program shorter, as there is a lot of unused lines in it. Then
    I would put the print statements inside the block:
 */
 //My program:
 
import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);//Declare instance of the scanner class
    if(scan.hasNextInt()){//Check if the user entered an int
      int n=scan.nextInt();//Declare n as the unser input
      System.out.println("You entered "+n);
      System.out.println("sum is 25");
      System.out.println("To repeat, you entered "+n);
    }
    else{//If user did not enter an int
      System.out.println("You entered 4");
      System.out.println("sum is 25");
      System.out.println("To repeat, you entered 4");
    }
  }
}

