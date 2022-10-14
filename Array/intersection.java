package Array;
import java.util.*;


public class intersection {
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
    public static void result(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]+" ");

        }
    }
    public  static void Intersection(int[] a,int[] b){
        for(int i = 0; i < a.length; i++){

            for(int j = 0; j < b.length; j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+",");

                }

            }
        }

    }
    public static void main(String[] args){
        int[] z=Input();
        result(z);
        int[] x=Input();
        result(x);
        System.out.println(" The common elements in both the array are");
        Intersection(z,x);

    }
}
