package string;

public class reversingString {
    public static String Reverse(String str){
        String reversed = " ";
        for ( int i = str.length() -1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        String str = "abcde";
        String reversed = Reverse(str);
        System.out.println(reversed);
    }
}
