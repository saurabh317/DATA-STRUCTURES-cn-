package Array;
import java.util.*;

public class rotateArray{

    public static int[] takeInput(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void rotate(int[] arr,int p){
        int [] temp = new int[arr.length];

        //  for copying the elements from p to n

        int k = 0;
        for( int i = p; i < arr.length; i++ ){
            temp[k] = arr[i];
            k ++;
        }

        // for copying the elements from starting to p

        for(int j = 0; j < p; j++){
            temp[k] = arr[j];
            k++;
        }

        // for copying the temp arr to the original array

        for( int z = 0; z < arr.length; z++){
            arr[z] = temp[z];
        }

        // for printing thr result

        for( int  t = 0; t < arr.length; t++){
            System.out.println(arr[t]);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of the p");
        int p = s.nextInt();
        int[] h = takeInput();
        rotate(h,p);
    }

}
