package function;
import java.util.*;

public class passByValue {
    public static void fun1(int a,int b){
        int c=(a+b);

    }
    public static void main(String args[]){
        int c=1;
       fun1(2,4);
       System.out.print(c);
    }
}
