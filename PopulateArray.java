package Array;
import java.util.*;

public class PopulateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i=0;
        int j=(n-1);
        for(int c=1;c<=n;c++){
            if(c % 2!=0){
                arr[i]=c;
                i++;
            }
            else{
                arr[j]=c;
                j--;
            }
        }
        for(int z=0;z<n;z++){
            System.out.println(arr[z]);
        }



    }
    }

