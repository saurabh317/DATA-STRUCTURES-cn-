package Recursion;
import java .util.*;

public class power {
    public static int ResultPower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        } else if (n % 2 == 0) {
            return ResultPower(x, n / 2) * ResultPower(x, n / 2);


        } else {
            return x * ResultPower(x, n / 2) * ResultPower(x, n / 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int p = ResultPower(x,n);
        System.out.println(p);

    }
}
