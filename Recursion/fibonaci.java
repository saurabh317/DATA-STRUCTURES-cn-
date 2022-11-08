package Recursion;
import java.util.*;
public class fibonaci {
    public static int printFibo(int n){
        if(n==0 || n==1){
            return 1;
        }
        int store = printFibo(n-1);
        int store1 = printFibo(n-2);
        return store+ store1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for( int i = 0; i < n; i++){
            System.out.println(printFibo(i));
        }
    }
}
