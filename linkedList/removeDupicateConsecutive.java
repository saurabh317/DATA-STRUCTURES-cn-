package linkedList;

import java.util.ArrayList;

public class removeDupicateConsecutive {
    public static ArrayList<Integer> remove(int [] arr){
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println(arr[0]);
        for( int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]) {
                result.add(arr[i]);
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int [] arr = {10,10,10,20,30,30,40};
        ArrayList<Integer> result = remove(arr);
       for(int i = 0 ;i < result.size(); i++){
           System.out.println(result.get(i));
       }
    }
}
