//////////////////////////////////////////
//Greg Jacobs
//Homework 10 - part 1
//CSE 002
//November 17, 2014
//FindDuplicates
//
// This homework gives you practice in manipulating arrays and in writing
// methods that have array parameters.
//

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class FindDuplicates{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int num [] = new int[10];//Declare a new array for the user input
        String answer = "";//Initialize input string
        do{
            System.out.print("Enter 10 ints: ");
            for(int j=0; j<10; j++){//Put the user ints into an array
                num[j]=scan.nextInt();
            }
            String out = "The array ";
            out += listArray(num); //Return a string of the form "(2, 3, -9,)"
            if(hasDups(num)){//If there is at least one duplicate
                out+="has ";
            }
            else{//if there is no duplicates
                out+="does not have ";
            }
            out +="duplicates.";
            System.out.println(out);//Print out a statement
            out="The array ";
            out+=listArray(num);
            if(exactlyOneDup(num)){//If there is exactly one duplicate
                out+="has ";
            }
            else{//if there is not exactly one duplicate
                out+="does not have ";
            }
            out+="exactly one duplicate.";
            System.out.println(out);//Print out statement
            System.out.print("Go again? Enter 'y' or 'Y'. anything else to quit: ");//Ask user if they want to go again
            answer = scan.next();//Look for next user input
        }while(answer.equals("Y") || answer.equals("y"));//Repeate code if user enters a Y or y
    }//End of main method
    
    //Method that formats array outputs
    public static String listArray(int num[]){
        String out="{";//Start with a bracket
        for(int j=0; j<num.length; j++){
            if(j>0){
                out+=", ";//Put commas between values in the array
            }
            out+=num[j];//Print out the next number
        }
        out+="} ";//Close the printed array with brackets
        return out;//Return the formated array
    }//End of listArray method
    
    
    public static Boolean hasDups(int [] x){//Check if there is at least one duplicate
        boolean a = false;
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x.length; j++){//Compare testValue for each value in the array
                if(x[i]==x[j] && i!=j){//If i = j, then there is a duplicate
                    a = true;
                    return a;
                }
            }
        }
        return a;
    }//End of hasDups method
    
    public static Boolean exactlyOneDup(int [] x){//Check if there is at least one duplicate
        boolean a = false;
        int count = 0;//Counts how many duplicates there are
        for(int i=0; i<x.length; i++){
            for(int j=1; j<x.length; j++){//Compare testValue for each value in the array
                if(x[i]==x[j] && i!=j){//If i = j, then there is a duplicate
                    count = count + 1;//Add one to count for each duplicate
                }
            }
        }
        if(count == 2){//If count only has one duplicate, return true (Count = 2 here because
        // my program compares every value in the array with every other value in the array,
        // so for one duplicate, the count will actually count 2)
            a = true;
        }
        return a;
        
    }//End of hasDups method
}//End of class