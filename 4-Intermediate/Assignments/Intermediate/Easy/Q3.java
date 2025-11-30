// Create a method called "isPalindrome" that takes a string as an argument and returns true if the string is a palindrome (reads the same backward as forward) and false otherwise.

public class Q3 {

    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        int i = 0, j = cleaned.length() - 1;
        while (i < j) {
            if (cleaned.charAt(i) != cleaned.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Hello"));
        System.out.println(isPalindrome("nurses run"));
    }
}