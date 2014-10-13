import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 
 Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Enigma2.main(Enigma2.java:9)
        
    An exception is thrown when there is a runtime error in the program. When an ArithmeticException is thrown, the
    programmer knows that the runtime error is caused by an arithmetic error. The error tells the programmer which
    method it is in, in this case "main", and it tells the programmer what the error is, in this case
    "/ by zero". So the runtime error is on line 9 when 40 is divided by 0.
        
 * 
 * 
 * 
 * 
 * 
 */

