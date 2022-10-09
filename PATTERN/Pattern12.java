//        E
//        DE
//        CDE
//        BCDE
//        ABCDE




package PATTERN;
import java.util.*;

public class Pattern12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        for(int i=1;i<=N;i++){
            char z= (char)('A'+N-1);
            char p=(char)(z+1-i);
            for(int j=1;j<=i;j++){
                System.out.print(p);
                p=(char)(p+1);

            }
            System.out.println();
        }

    }
}

