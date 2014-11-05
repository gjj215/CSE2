public class code1{
    public static void main(String[] args){
        
        for( int i=0; i<10; i++){
            for(int j=0; j<i+1; j++){
            //for(int j=0; j<i; j++)
                if(j<=i && i<5)
                    System.out.print(i);
                if(j<10-i && i>=5)
                    System.out.print(i);
            }
            System.out.println();
        }
        
/////////Or you can do it this way:
        for(int i=0; i<5; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=5; i<10; i++){
            for(int j=0; j<10-i; j++){
          //for(int j=10-i; j>0; j--)
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
