public class answersVideo{
    public static void main (String [] args){
        for(int i=0; i<4; i++){
            System.out.println("i: "+i);
        }
        
        System.out.println();
        
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                System.out.println("("+i+","+j+")");
            }
            int j=0;
        }
        System.out.println();
        
        for(int i =1; i<9; i++){
            if(i % 2 == 0){
                System.out.println("looping");
            }
            else{
                System.out.println("i: "+i);
            }
        }
        
        System.out.println();
        
        int a = 1;
        for(int b=0; b<6; b++){
            int c = a + b;
            System.out.println("i: "+c);
            a=c;
        }
      /*a b   c
        1+0 = 1
        1+1 = 2
        2+2 = 4
        4+3 = 7
        7+4 = 11
        11+5 = 16*/
        
        System.out.println();
        
        for(int i=9; i>0; i-=2){
            System.out.println("i: "+i);
        }
        
        System.out.println();
        
        for(int i=6; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        for(int i=2; i<9; i+=2){
            System.out.print("i: ");
            for(int spaces=1; spaces<(i/2); spaces++){
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}