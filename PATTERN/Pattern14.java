//   1
//  232
// 34543





package PATTERN;


import java.util.Scanner;

public class Pattern14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int P = i;
            for (int spaces = 1; spaces <= (N - i); spaces++) {
                System.out.print(" ");
            }
            int num;
            for (num = 1; num <= i; num++) {
                System.out.print(P);
                P++;


            }
            int p = num;
            for (int dec = 1; dec <= (i - 1); dec++) {

                System.out.print(p);
                p--;

            }
            System.out.println();
        }

        }
    }

