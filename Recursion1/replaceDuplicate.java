package Recursion1;

public class replaceDuplicate {
    public static String replace(String str,char a, char b){
        if(str.length() == 0){
            return str;
        }
        if(str.charAt(0) == a){
            return b + replace(str.substring(1),a,b);

        }
        return str.charAt(0) + replace(str.substring(1),a,b);

    }
    public static void main(String[] args) {
        String str = "abbbabaa";

        System.out.println(replace(str,'a','b'));

    }
}
