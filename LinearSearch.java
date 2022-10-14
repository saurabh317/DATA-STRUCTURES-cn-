package Array;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be search");
        int key=sc.nextInt();
        int c = 0;
        int flag=0;
        for(int i=0;i<n;i++){
            if(key==arr[i]){
               flag=1;
               c=i;
               break;
            }
        }
        if(flag==1){
            System.out.println("element found at " +(c+1)+ " position" );
        }
        else {
            System.out.println("element not found");
        }




    }
}
