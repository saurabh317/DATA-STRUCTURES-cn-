package Recursion1;

public class removeallX {
    public static String removeX(String s, char a){
    if(s.length() == 0){
        return s;
    }
    if(s.charAt(0) == a){
        s = s.substring(1);
        return removeX(s,a);
    }
    return s.charAt(0) + removeX(s.substring(1) , a);

    }
    public static void main(String[] args) {
        String s = "abxyxczh";
        System.out.println(removeX(s,'x'));

    }
}
