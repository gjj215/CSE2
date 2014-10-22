//////////////////////////////////////////
//Greg Jacobs
//Lab 8 - CSE 002
//September 28, 2014
//More Loops
//
// In this lab we rewrite for loops as while and while-do loops
//

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class MoreLoops{
    public static void main(String[] args){
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner( System.in ); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.println("Enter an int: ");//Ask user to enter an int
        int n;//Declare variable for user input
///////////////////
// 1
        while(!myScanner.hasNextInt()){//If the intput is not an int
            myScanner.next();//Get rid of the junk entered by user
            System.out.println("You did not enter an int; try again: ");
        }
            n=myScanner.nextInt();//Set user input as "n"
            
//////////////////
// 2
        /*for(int j=0; j<n && j<40;j++){
            for(int k=0;k<j+1;k++){
                System.out.print('*');
            }
            System.out.println();//Bring curser to next line
        }*/
        
        int j=0;//Initialize j, the number of stars per row
        int k =1;//Initialize k, the row number
        while(k<n+1){//While k is less than input plus one
            j=1;//First row will have one star
            while(j<=k && j<40){//While the stars are less than or equal to the rows
                System.out.print('*');//Print a star
                j++;//Increment j
            }//End of j while loop
            System.out.println();//Bring curser to next line
            k++;//Increment k
        }//End of k while loop
        k = 4;//Re-declare k

//////////////////
// 3
        /*do{
            System.out.println("k="+k);
            k++;
        }
        while(k<4);*/
        
        while(k<=4){//Keep looping for k<=4
            System.out.println("k="+k);//Print out k
            k++;//Increment k
        }//End of while loop
        
//////////////////
// 4
        /*int count=0;
        while(true){
            switch(n){
                default:System.out.println(n+ " is > 5 or <1");
                    break;
                case 1:
                case 2:System.out.print("Case 2");
                    continue;
                case 3: break;
                case 4: System.out.println("Case 4");
                case 5: System.out.println("Case 5");
                    break;
            }
            count++;
            if(count>10)
                break;
        }*/
        
        for(int count=0; count<11; count++){//Loop if count is less than 11, increment count each loop
            if(n>0 && n<=5){//Check if n is in range
                if(n==1 || n==2){//If n = 1 or 2
                    System.out.print("Case 2");//Print out "Case 2" forever
                    count=0;//Reset count so it loops forever
                    continue;//Keep looping
                }
                if(n==4){//If n = 4
                   System.out.println("Case 4");//Print out both of these statements (22 times total)
                   System.out.println("Case 5");//because loop stops at count = 11 (x2)
                }
                if(n==5)//If n = 5
                   System.out.println("Case 5");//Print out statement 11 times (because of loop)
            }
            else{//n is outside of range
                System.out.println(n+ " is > 5 or <1");
                return;//Exit program
            }
            
        }

    }//End of main method
}//End of class