public class ArrayCode1{
    public static void main (String [] args){
        int[] myArray = new int[4];
        for(int i=0; i<4; i++){
            myArray[i] = 1;
        }
        int myInt=-4;
        modifyArray(myArray, myInt);
        System.out.println("---");
        printList(myArray);
        System.out.println("second: "+myInt);
    }
    public static void modifyArray(int[] list, int second){
        for(int i=0; i<list.length; i++){
            list[i] = -1;
            System.out.println(list[i]);
        }
        second = -2;
        System.out.println("second: "+second);
    }
    public static void printList(int[] list){
        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
    }
}