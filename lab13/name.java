//////////////////////////////////////////
//Greg Jacobs
//Lab 13
//CSE 002
//December 3, 2014
// Arrays that run you ragged
//
// In this lab we use ragged arrays and sorting.
//

import java.util.Random;
public class name{
    public static void main(String [] arg){
        Random rand = new Random(); //Declare the method for the random class
        int [] [] ragged = new int [4][];//Create a ragged array with 5 members
        String out="";//Variable for printing out the arrays
        System.out.println("The array before sorting");
        for(int j=0; j<ragged.length; j++){//For each member of the 2D array
            ragged[j] = new int [(j*3)+5];//Make each member array have certain lengths
            
            for(int i=0; i<ragged[j].length; i++){//Fill each array with random numbers between 0 and 39 inclusive
                ragged [j][i]=(int)(Math.random()*(39 - i))+0; //Math.random()*max)+min
                out+=ragged[j][i];//For printing out the array
                out+=" ";
            }//End of for i
            System.out.println(out);
            out="";//Reset print variable
        }//End of for j
        System.out.println();
        System.out.println("The array after sorting");
        
        
        /////Using Selection Sort
        for(int k=0; k<ragged.length; k++){//For each member of the 2D array
            for(int i=0; i<ragged[k].length; i++){//For each element i
                for(int j= i + 1; j<ragged[k].length; j++){// Compare i to element j
                    if(ragged[k][j]<ragged[k][i]){//If j > i, swap them
                        int temp = ragged[k][j];
                        ragged[k][j]=ragged[k][i];
                        ragged[k][i]=temp;
                    }
                }
                System.out.print(ragged[k][i]+" ");//Print out the sorted array
            }
            System.out.println();//Line print after each member
        }
    }
}