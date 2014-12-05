public class spring2014Q4{
    public static void main (String [] args){
        int q [] = {1, 10, 3, 7};
        int w [] = {2, 3, 4, 5, 10, 6};
        overlap(q,w);

    }
    
    public static void overlap (int x [], int y []){
        int c [];
        if(x.length <= y.length){
            c = new int [y.length];
        }
        else{
            c = new int [x.length];
        }
        String out = "{";
        int count = 0;
        for(int i=0; i<x.length; i++){
            for(int j=0; j<y.length; j++){
                if(x[i]==y[j]){
                    c[i] = y[j];
                    count +=1;
                }
            }
        }
        c[0]=count;
        for(int i=0; i<c.length; i++){
            out += c[i];
            if(i!=c.length-1){
                out+=",";
            }
        }
        out+="}";
        System.out.println(out);
    }
}