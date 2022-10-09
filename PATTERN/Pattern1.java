//        ****
//        ****
//        ****
//        ****



package PATTERN;
import java.util.*;

public class Pattern1 {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. for pattern print\n");
       int a=sc.nextInt();
       for(int i=1;i<=a;i++){
           for(int j=1;j<=a;j++){
               System.out.print("*");
           }
           System.out.println(" ");
       }

    }
}
