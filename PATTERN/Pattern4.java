//        4321
//        4321
//        4321
//        4321



package PATTERN;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no\n");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=4;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            System.out.println("");
            i++;
        }
    }
}
