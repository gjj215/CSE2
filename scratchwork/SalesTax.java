////////////////
//on pg.58 of textbook
//
import java.util.Scanner;
public class SalesTax{
    public static void main (String [] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.print("Enter purchase amount: ");
        double purchaseAmount=myScanner.nextDouble();
        
        double tax = purchaseAmount*0.06;
        System.out.println("Sales tax is $" +(int)(tax*100)/100.0);
    }
}