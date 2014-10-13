///////////////////////////////
//Greg Jacobs
//LAB 06 - CSE 2
//Engima1
//October 12, 2014
//
// A fix to the given program on coursesite.

/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
      System.out.println("first switch: "+n+" "+k);//Inserted print statments to identify when n or k becomes 0, which ulitmately crashes the program
         break;
      default: out+=40;
          n/=3;
          k-=7;
      System.out.println("first switch default: "+n+" "+k);//Inserted print statments to identify when n or k becomes 0, which ulitmately crashes the program
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
      System.out.println("first if: "+n+" "+k);//Inserted print statments to identify when n or k becomes 0, which ulitmately crashes the program
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      System.out.println("first if: "+n+" "+k);//Inserted print statments to identify when n or k becomes 0, which ulitmately crashes the program
    }
    else {
      n=45;
      out+=n+k;
      System.out.println("first else: "+n+" "+k);//Inserted print statments to identify when n or k becomes 0, which ulitmately crashes the program
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
      System.out.println("2nd switch, case 114: "+n+" "+k);//Inserted print statments to identify when n or k becomes 0, which ulitmately crashes the program
        break;
      case 97:
        n-=14;
        k-=2;
      System.out.println("2nd switch, case 97: "+n+" "+k);//Inserted print statments to identify when n or k becomes 0, which ulitmately crashes the program
        break;
      case 98:
        n/=5;
        k/=9;
      System.out.println("2nd switch, case 98: "+n+" "+k);//Inserted print statments to identify when n or k becomes 0, which ulitmately crashes the program
      default:
        n-=3;
        k-=5;
      System.out.println("2nd switch, default: "+n+" "+k);//Inserted print statments to identify when n or k becomes 0, which ulitmately crashes the program
    }
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Initial Error report:
 
        Exception in thread "main" java.lang.ArithmeticException: / by zero
            at Enigma3.main(Enigma3.java:48)
        
  After adding print statements in the program:
  
    first switch default: 13 53
    first if: -7 53
    first else: 45 53
    2nd switch, case 98: 9 5
    2nd switch, default: 6 0
    Exception in thread "main" java.lang.ArithmeticException: / by zero at Enigma3.main(Enigma3.java:65)
    
  This tells me that the default case of the second switch (on line 60) subtracts k by 5, making k = 0, and
  therefore giving a runtime error after the next line because it divides k by 0.
 */

