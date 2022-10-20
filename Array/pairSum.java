package Array;
import java.util.*;

public class pairSum {

    public static int[] Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total no. of  elements of the array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the elements of the array");
        for(int i = 0; i < n; i++ ){
            a[i]=sc.nextInt();
        }
        return a;
    }
    public static int[] CheckSum(int sum,int[] a) {
        int[] arr = new int[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = (i + 1); j < a.length; j++){
                if ((a[i] + a[j]) == sum) {
//                    System.out.println("these are the pairsum of "+sum+" are: "+a[i]+","+a[j]);
                     arr = new int[]{i, j};
                }
            }
        }
        return arr;


    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of sum");
        int x=s.nextInt();
        int[] z=Input();
        int[] p=CheckSum(x,z);
        for( int b = 0; b < p.length; b++){
            System.out.println(p[b]);

        }



    }
}
