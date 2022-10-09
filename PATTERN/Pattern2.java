//        1111
//        2222
//        3333
//        4444



package PATTERN;
import java.util.*;

public class Pattern2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no\n");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(i);
                j++;
            }
            System.out.println("");

            i++;
        }
    }
}
