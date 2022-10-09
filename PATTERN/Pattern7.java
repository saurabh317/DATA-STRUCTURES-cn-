//        1
//        23
//        345
//        4567


package PATTERN;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no\n");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int p=i;
            for(int j=1;j<=i;j++){
                System.out.print(p);
                p++;

            }
            System.out.println("");
        }
    }
}
