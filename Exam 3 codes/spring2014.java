public class spring2014{
    public static void main (String [] args){
        int q [] = {3, 12, 15, 6, 0, 0, 0, 0, 0};
        print(q);
    }
    
    public static void print (int x []){
        int [] a = new int [x[0]];
        String out = "{";
        for(int i=1; i<=a.length; i++){
            a[i - 1] = x[i];
            out += a[i - 1];
            if(i!=a.length){
                out += ",";
            }
        }
        out +="}";
        System.out.println(out);
    }
}