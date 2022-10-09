package function;

import java.util.Scanner;

public class ncrFun {
    public static int factorial(int p) {
        int nFact = 1;

        for (int i = p; i > 0; i--) {

            nFact = nFact * i;

        }
        return nFact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nr = (n - r);
        int valueN = factorial(n);
        int valueR = factorial(r);
        int valueNR = factorial(nr);
        int total = ((valueN) / (valueR) * (valueNR));
        System.out.println(total);


    }
}
