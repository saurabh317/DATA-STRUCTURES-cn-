package string;
import java .util.*;

public class noOfWords {
    public static void words(String str){

        if(str.length()==0){
            return ;
        }
        int spaces = 0;
        for( int i = 0; i < str.length(); i++){
            if(str.charAt(i)==' '){
                spaces++;
            }
        }
        System.out.println(spaces+1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();
        words(str);
    }
}
