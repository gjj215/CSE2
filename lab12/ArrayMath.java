//////////////////////////////////////////
//Greg Jacobs
//Lab 12 - CSE 002
//November 17, 2014
// Arrays
//
// In this lab we write elemetary array operations and passing arrays to and from methods.
//

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class ArrayMath{
    public static void main(String[] args){
        double x[]={2.3, 3, 4, -2.1, 82, 23},
        y[]={2.3, 3, 4, -2.1, 82, 23},
        z[]={2.3, 13, 14},
        w[]={2.3, 13, 14, 12}, 
        v[],
        u[]={2.3, 12, 14};
        v=addArrays(x,y);
        System.out.println(display(x)+" \n + "+display(y)+"\n ="+display(v));
        System.out.println(display(x)+" \n + "+display(z)+"\n ="+display(addArrays(x,z)));
        System.out.println("It is "+equals(x,y)+" that "+display(x)+" == "+display(y));
        System.out.println("It is "+equals(z,w)+" that "+display(z)+" == "+display(w));
        System.out.println("It is "+equals(u,z)+" that "+display(u)+" == "+display(z));
    }
    
    //Display all values of the array in double form
    public static String display(double[] x){
        String out="{";//Print brackets around string of values
        for(int j=0; j<x.length; j++){
            if(j>0){//Pring commas after each value
                out+=",";
            }
            out+=x[j];//Print out values in double form
        }
        return out+"}";//Print brackets around string of values
    }
    
    public static Boolean equals(double [] x, double [] y){
        if(x.length == y.length){//If the two array lengths are equal, proceed
            int flag = 0;//Counter to determine if all the values of each array are the same
            for(int i=0; i<x.length; i++){//for every value of both arrays
                if(x[i] != y[i]){//If the two arrays hold the smae value in the same spot
                    flag = flag + 1;
                }
            }
            if(flag == 0){//If the lists are identical
                return true;
            }
            else{//If the lists are not identical
                return false;
            }
        }
        else{//If the two array lengths are not equal, return false
            return false;
        }
    }
    
    public static double[] addArrays(double [] x, double [] y){
        double sumArray[]={};
        if(x.length>=y.length){//If x length is greater or equal to y length, then use x length in for loop
            for(int i=0; i<x.length; i++){
            sumArray[i]=x[i]+y[i];
            }
        }
        else{//If y length is greater than x length, use y length in for loop
            for(int i=0; i<y.length; i++){
            sumArray[i]=x[i]+y[i];
            }
        }
        return sumArray;
    }
}