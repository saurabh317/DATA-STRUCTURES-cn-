package string;
import java .util.*;

public class AllSubstrings {
    public static void substring(String str){
        for( int i = 0; i < str.length();i++){
            for( int j = (i+1); j <= str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        substring(str);

    }
}
