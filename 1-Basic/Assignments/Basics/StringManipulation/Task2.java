// 2. Write a program to find the length of the longest substring without repeating characters in a given string.

public class Task2 {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int maxLen = 0;
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            boolean[] seen = new boolean[256];
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                if (seen[str.charAt(j)]) break;
                seen[str.charAt(j)] = true;
                temp += str.charAt(j);
            }
            if (temp.length() > maxLen) {
                maxLen = temp.length();
                longest = temp;
            }
        }

        System.out.println("Input: " + str);
        System.out.println("Longest substring without repeating: " + longest);
        System.out.println("Length: " + maxLen);
    }
}
