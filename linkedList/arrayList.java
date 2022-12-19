package linkedList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> arr =  new ArrayList<>();//this will create a dynamic array we need not to specify the size,
        arr.add(10);
        arr.add(20);
        arr.add(2,30);
        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println(arr.get(1));
        //we can also replace an element using set method i.e set('index' , element)

    }
}
