//        1234
//        1234
//        1234
//        1234




package PATTERN;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no\n");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(j);
                j++;
            }
            System.out.println("");
            i++;
        }

    }
}
