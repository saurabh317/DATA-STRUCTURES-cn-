//        A
//        BB
//        CCC


package PATTERN;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                char jthTerm=(char)('A'+i-1);
                System.out.print(jthTerm);
            }
            System.out.println();
        }
    }
}
