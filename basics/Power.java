//    Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer
import java.util.*;
public class Power{

    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=1;
        for(int i=1;i<=b;i++){
            c=c*a;
        }
        System.out.print(c);
    }
}
