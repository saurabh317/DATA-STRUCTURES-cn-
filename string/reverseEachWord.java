package string;
import java .util.*;

public class reverseEachWord {
    public static String eachWord(String str){
        int currentWordStart= 0;
        String ans = "";
        for( int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                int currentWordEnd = (i-1);
                String reversedWord = "";
                for( int j = currentWordStart; j <= currentWordEnd; j++){
                    reversedWord = str.charAt(j)+reversedWord;
//                    System.out.println(reversedWord);

                }
              ans += reversedWord+" ";
                currentWordStart = (i+1);


            }
        }
      return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 =eachWord(str);
        System.out.println(str1);

    }
}
