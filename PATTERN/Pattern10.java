//        ABCD
//        BCDE
//        CDEF
//        DEFG



package PATTERN;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            char p=(char)('A'+i-1);
            for(int j=1;j<=N;j++){
                System.out.print(p);
                p=(char)(p+1);
            }
            System.out.println();
        }
    }
}
