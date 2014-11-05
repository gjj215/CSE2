//////////////////////////////////////////
//Greg Jacobs
//Lab 10 - CSE 002
//October 21, 2014
// MethodCalls
//
// In this lab we write methods that call methods
//

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class MethodCalls{
    public static void main(String[] args){
        int a=784, b=22, c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }//End of main method
    
    public static int addDigit(int x, int y){
        int z;
        if(y<0 || y>9){//If y is not between 0 and 9
            return x;//Return the number
        }
        else{//If y is in range
            z=(y*1000)+x;//Z is the digit followed by the number
            return z;//Return the value of z
        }
    }//End of addDigit method
    
    public static int join(int x, int y){
        int z;
        z=addDigit(x,y);
        return z;
    }
    
    
    
}//End of Class