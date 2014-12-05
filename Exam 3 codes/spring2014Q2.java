public class spring2014Q2{
    public static void main (String [] args){
        String q [] = {"one","two","to","fifteen","three"};
        range(q);
    }
    
    public static void range (String x []){
        String longg = "";
        String shortt = "";
        String a = " ";
        for(int i=0; i<x.length; i++){
            a = x[i];
            if(i==0){
                shortt = a;
            }
            if(a.length() <= shortt.length()){
                shortt = a;
            }
            if(a.length() >= longg.length()){
                longg = a;
            }
        }
        System.out.println("{"+shortt+","+longg+"}");
    }
}