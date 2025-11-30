// Create a method called "reverseString" that takes a string as an argument and returns the reverse of the string.

public class Q2 {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + reverseString(s));
    }
}