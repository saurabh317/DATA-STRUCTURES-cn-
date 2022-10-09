package function;

public class overLoading1 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
       int x= sum(10,5);
       int y= sum(10,4,2);
       System.out.println(x+" "+y);
    }

}
