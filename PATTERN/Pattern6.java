//        1
//        23
//        456
//        78910


package PATTERN;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no\n");
        int n = sc.nextInt();
        int p=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(p);
                p++;

            }
            System.out.println("");
        }
    }
}
