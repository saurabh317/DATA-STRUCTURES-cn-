//        1
//        21
//        321
//        4321



package PATTERN;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no. to generate pattern");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            int p=i;
            for(int j=1;j<=i;j++){
                System.out.print(p);
                p--;
            }
            System.out.println("");
        }
    }
}
