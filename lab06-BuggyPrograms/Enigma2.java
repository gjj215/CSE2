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
        
 * 
 * 
 * 
 * 
 * 
 */

