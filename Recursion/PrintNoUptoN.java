package Recursion;
import java .util.*;

public class PrintNoUptoN{
    public static void pRint(int n){
        if(n==0){
            return ;
        }
        pRint(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pRint(n);
    }
}
