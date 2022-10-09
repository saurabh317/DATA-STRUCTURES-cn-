
//    Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately
//package PATTERN;
import java.util.*;
public class SumOddEven {

 public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String word = sc.nextLine();
        int count = 0;
        int a = 0;
        char[] w = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 1; j < word.length(); j++) {
                //System.out.println(i);
                //System.out.println(j);
                if (i != j)
                    if (w[i] == w[j]) {
                        count++;
                        a = count;
                    }
            }

            if (a == 0)
                System.out.println("the non repeating characters are " + w[i]);
            else if (a > 0)
                continue;

        }
    }
}

