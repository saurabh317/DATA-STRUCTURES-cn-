
//    Write a program to print multiplication table of n
import java.util.*;
public class Multiple {

    public static void main(String[] args) {
         System.out.print("enter the no.");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            int b=(a*i);
            System.out.println(b);
        }

    }
}