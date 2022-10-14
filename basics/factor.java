//    Write a program to print all the factors of a number other than 1 and the number itself.
import java.util.*;
public class factor {

    public static void main(String[] args){
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }

        }

    }
}