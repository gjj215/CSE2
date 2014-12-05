public class codes{
    public static void main (String [] args){
        int A [] = {4, 9, 25, -7, 13, 23, -16};
        int B [] = {2, 3, 4};
        System.out.println(addArrays(A,B));
    }    
    public static int[] addArrays(int [] x, int [] y){
        int sumArray[]={};
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