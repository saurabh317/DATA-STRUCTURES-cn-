package Array;
import java.util.*;

public class BinarySearch {
    public static int[] TakeInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the element of the array at " + i + " position");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int binarySearch(int[] arr){
        Scanner s=new Scanner(System.in);
        int key=s.nextInt();
        int low=0;
        int high=arr.length;
        int mid=((low+ high)/2);
        while (low<=high){
            mid=(low+high)/2;
            if(key==arr[mid]){
                System.out.print("element found at the position :");
                break;
            }
            else if(key>arr[mid]){
                low=(mid+1);
            }
            else{
                high=(mid-1);
            }
        }
        return mid;
    }
    public static void main(String[] args){
        int[] z= TakeInput();
        int p=binarySearch(z);
        System.out.println(p);


    }


}
