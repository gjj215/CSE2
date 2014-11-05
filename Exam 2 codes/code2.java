public class code2{
    public static void main(String[] args){
        
        //Makes the last big triangle
        for( int i=0; i<5; i++){//i changes size of triangle
            for(int j=0; j<i; j++){
                System.out.print("b");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for(int k=2; k<5; k++){
            for( int i=1; i<=k; i++){//i changes size of triangle
                for(int j=0; j<i; j++){
                    System.out.print("b");
                }
                System.out.println();
            }
        }
        
        
        
    }
}