package Array;
import java.util.*;

public class LargestElement {
    public static void main(String[] args){
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        System.out.println("enter the elements of the array");
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for(i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest no: "+max);

    }
}
