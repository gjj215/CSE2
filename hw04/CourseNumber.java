//////////////////////////////////////////
//Greg Jacobs
//Homework 4, part 3 - CSE 002
//CourseNumber
//September 22, 2014
//
// A program that reads the input course number and prints out when the course is available.

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class CourseNumber{
    public static void main(String[] args){
        //Scanner and user inputs
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner( System.in ); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.print("Enter a six digit number for the desired course: ");
        int course;
        
        if(myScanner.hasNextInt()){ //Check if user inputed an int
            course = myScanner.nextInt(); //Accept user input if an int
                if(course>=186510 && course<=201440){//Test if input is in range
                
                int num1, num2;//Ints that read the last 2 digits before the decimal place
                num1=(int)(course%10);//Reads the tens digit
                num2=(int)(course%100/10);//Reads the hundreds digit(divides by 10 so computation works)
                
                        if(num1*10+num2*10==10)//If input ends in 10
                            System.out.println("The course was offered in the Spring semester of "+(course/100)); //Print out semester and year
                        else if(num1*10+num2*10==20)//If input ends in 20
                            System.out.println("The course was offered in the Summer 1 semester of "+(course/100)); //Print out semester and year
                        else if(num1*10+num2*10==30)//If input ends in 30
                            System.out.println("The course was offered in the Summer 2 semester of "+(course/100)); //Print out semester and year
                        else if(num1*10+num2*10==40)//If input ends in 40
                            System.out.println("The course was offered in the Fall semester of "+(course/100)); //Print out semester and year
                        else{//Not a real semester
                            System.out.println(num1*10+num2+" is not enter a legitimate semester");
                            return;
                        }
                }
                else{//Input outside range
                    System.out.println("The number was outside the range [186510,201440]");
                    return;
                }
        }
        else{ //Input not an integer
            System.out.println("You did not enter an int");
            return;
        }
        
    }
}