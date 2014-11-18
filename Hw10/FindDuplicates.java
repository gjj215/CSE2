//////////////////////////////////////////
//Greg Jacobs
//Homework 10 - CSE 002
//November 17, 2014
// Playing Poker (FindDuplicates)
//
// This homework gives you practice in manipulating arrays and in writing
// methods that have array parameters.
//

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class FindDuplicates{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int num [] = new int[10];
        String answer = "";
        do{
            System.out.print("Enter 10 ints: ");
            for(int j=0; j<10; j++){
                num[j]=scan.nextInt();
            }
            String out = "The array ";
            out += listArray(num); //Return a string of the form "(2, 3, -9,)"
            if(hasDups(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            out +="duplicates.";
            System.out.println(out);
            out="The array ";
            out+=listArray(num);
            if(exactlyOneDup(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            out+="exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y'. anything else to quit: ");
            answer = scan.next();
        }while(answer.equals("Y") || answer.equals("y"));
    }//End of main method
    
    public static String listArray(int num[]){
        String out="{";
        for(int j=0; j<num.length; j++){
            if(j>0){
                out+=", ";
            }
            out+=num[j];
        }
        out+="} ";
        return out;
    }//End of listArray method
    
    
    public static Boolean hasDups(int [] x){//Check if there is at least one duplicate
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x.length; j++){//Compare testValue for each value in the array
                if(x[i]==x[j]){//If i = j, then there is a duplicate
                    return true;
                }
            }
        }
        return false;
        
    }//End of hasDups method
    
    public static Boolean exactlyOneDup(int [] x){//Check if there is at least one duplicate
        int count = 0;//Counts how many duplicates there are
        for(int i=0; i<x.length; i++){
            for(int j=1; j<x.length; j++){//Compare testValue for each value in the array
                if(x[i]==x[j]){//If i = j, then there is a duplicate
                    count = count + 1;//Add one to count for each duplicate
                }
            }
        }
        if(count == 2){//If count only has one duplicate, return true (Count = 2 here because
        // my program compares every value in the array with every other value in the array,
        // so for one duplicate, the count will actually count 2)
            return true;
        }
        else{//Anything else, return false
            return false;
        }
        
    }//End of hasDups method
}//End of class