package Recursion1;

public class Palindrome {
    public static boolean Check(String str,int startIndex, int lastIndex){

        if(str.length() == 0){
            return true;
        }
            if (str.charAt(startIndex) != str.charAt(lastIndex -1)) {
                return false;

            }
            if(startIndex < lastIndex/2 && lastIndex > 0) {
                int p = lastIndex-1;
                return Check(str, startIndex +1, p-1);

            }
            return true;

    }
    public static void main(String[] args) {
        String str ="cabbac";
        int lastIndex = str.length();

        System.out.println(Check(str,0,lastIndex ));

    }
}
