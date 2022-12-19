package Recursion;
import java.util.*;

public class NoOfDigits {
    public static int digits(int n) {
        if (n / 10 == 0) {
            return 1;
        }
        //updating the value of n
        n  = n/10;
        System.out.println("value is"+n);

        return 1 + digits(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = digits(n);
        System.out.println(result);

    }
}
