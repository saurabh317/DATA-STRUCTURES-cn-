package Recursion;
import java .util.*;

public class Factorial {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = factorial(n);
        System.out.println(p);

    }
}
