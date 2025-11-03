// 5. Write a program to check if two given strings are anagrams or not.

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("Input: " + s1 + " , " + s2);

        if (isAnagram(s1, s2))
            System.out.println("They are anagrams.");
        else
            System.out.println("They are not anagrams.");
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
