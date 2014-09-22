//////////////////////////////////////////
//Greg Jacobs
//Homework 4, part 4 - CSE 002
//TimePadding
//September 22, 2014
//
// A program that takes user input seconds passed during the day and displays the time
// in conventional form.

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class TimePadding{
    public static void main(String[] args){
        //Scanner and user inputs
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner( System.in ); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.print("Enter the time in seconds: ");
        int secs;
        
        if(myScanner.hasNextInt()){ //Check if user inputed an int
            secs = myScanner.nextInt(); //Accept user input if an int
                if(secs>=0){//Check if positive
                        int hour = secs/3600; //Number of seconds in an hour
                        int remainder = secs - hour*3600; //Total secs - secs used for the hour
                        int min = remainder/60; //The secs not used in hour divided by 60
                        int secs2 = remainder - min*60; //The secs not used in minutes
                        if (hour>=10 && min>=10 && secs2>=10) //No padding needed
                        System.out.println("The time is "+hour+":"+min+":"+secs2);
                        else if (hour>=10 && min>=10 && secs2<10) //Seconds need padding
                            System.out.println("The time is "+hour+":"+min+":0"+secs2);
                        else if (hour>=10 && min<10 && secs2>=10) //Minutes need padding
                            System.out.println("The time is "+hour+":0"+min+":"+secs2);
                        else if (hour<10 && min>=10 && secs2>=10) //Hours need padding
                            System.out.println("The time is 0"+hour+":"+min+":"+secs2);
                        else if (hour>=10 && min<10 && secs2<10) //Seconds and minutes need padding
                        System.out.println("The time is "+hour+":0"+min+":0"+secs2);
                        else if (hour<10 && min>=10 && secs2<10) //Seconds and hours need padding
                            System.out.println("The time is 0"+hour+":"+min+":0"+secs2);
                        else if (hour<10 && min<10 && secs2>=10) //Minutes and hours need padding
                            System.out.println("The time is 0"+hour+":0"+min+":"+secs2);
                        else//All 3 need padding
                        System.out.println("The time is 0"+hour+":0"+min+":0"+secs2);
                        
                }
                else{//Int not positive
                    System.out.println("You did not enter a positive int");
                    return;
                }
        }
        else{//Input not an integer
            System.out.println("You did not enter an integer");
            return;
        }
        
    }
}