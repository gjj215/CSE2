//////////////////////////////////////////
//Greg Jacobs
//Lab 11 - CSE 002
//November 17, 2014
// Arrays
//
// In this lab we write elemetary array operations.
//

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class Arrays{
    public static void main(String[] args){
        int [] myArray = new int[10];//Create an array that holds 10 ints
        System.out.println("Enter 10 ints: ");//Ask user to enter an int
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        int input;//Variable to hold user input
        for(int i=0; i<myArray.length; i++){
            myScanner = new Scanner(System.in); //Call the Scanner constructor
            input = myScanner.nextInt();//Store int in the name "input"
            myArray[i]=input;
        }
        
        //Find highest and lowest values
        int max = 0;//Set the max variable as 0
        int min = 99;//Set the min variable as 99
        int sum = 0;//Variable for the sum
        for(int i=0; i<myArray.length; i++){//Check every value in the array
            if(myArray[i] > max){// If the current value is greater than the current max value
                max = myArray[i];// Then replace the max value with the new max value
            }
            if(myArray[i] < min){// If the current value is less than the current min value
                min = myArray[i];// Then replace the min value with the new min value
            }
            sum = sum + myArray[i];//Sum the ints in the array
        }
        System.out.println("The lowest entry is: "+min);
        System.out.println("The highest entry is: "+max);
        System.out.println("The sum is: "+sum);
        
        int [] array2 =new int[myArray.length];//Copy the length of myArray into another array
        for (int i=0; i<myArray.length; i++){//Copy every value of myArray into array 2
            array2[i]=myArray[i];
        }
        flip(array2);//Call method to flip values in array2
        printList(myArray, array2);
    }
    
    //Print arrays method
    public static void printList(int[] list, int[]list2){
        for(int i=0; i<list.length; i++){//Only need 1 for loop because it will still count all the values in each array
            if(list[i]<10 && list[i] >= 0)//If statement for proper spacing
                System.out.print(" "+list[i]);//Print a space before the list value
            else
                System.out.print(list[i]);//Print without a space
            System.out.println("  "+list2[i]);//Print a space before the list value
            //Normal way to print the lists side by side without spacings
            //System.out.print(list[i]+" "+list2[i]);
        }
    }
    
    //Flip array method
    public static void flip(int[] list){
        for (int i=0; i<list.length/2; i++){//For the first half of array2
            int temp = list[i];//Store each value of the first half of array 2
            list[i] = list[list.length - 1 - i];//Flip the value
            list[list.length - 1 - i] = temp;//Restore that value
        }
    }
}