package function;
import java.util.*;

public class primeOrNot {
    public static void fun(int n){
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n % i==0) {
                flag =1;
            }

        }
        if(flag==0){
            System.out.print("no. is prime");
        }else{
            System.out.print("no. is not prime");

        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int a=sc.nextInt();
        fun(a);




    }
}
