package Recursion;
import java.util.*;

public class SumOfNatural {
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        return n + Sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number upto which u have to find the sum:");
        int n = sc.nextInt();
        int result = Sum(n);
        System.out.println(result);

    }
}
