package function;

public class passByValue2 {
    public static int fun2(int a,int b){
        int c=a+b;
        return c;

    }
    public static void main(String args[]){
//        int d=1;
        int d=fun2(4,6);
        System.out.print(d);

    }
}
