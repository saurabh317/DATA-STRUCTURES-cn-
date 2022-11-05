package string;
import java .util.*;

public class palindrome {
    public  static boolean check(String str){
        boolean b = true;
        for ( int i =0; i< str.length()/2; i++){
            int p = str.length()-1;
            if(str.charAt(i)==str.charAt(p)){
                return b;

            }
            b = false;
        }
        return b;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        boolean x = check(str);
        System.out.println(x);

    }
}
