// 4. Write a program to find the most frequent character in a given string.

public class Task4 {
    public static void main(String[] args) {
        String str = "successes";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char maxChar = str.charAt(0);
        int maxCount = freq[maxChar];

        for (int i = 1; i < str.length(); i++) {
            if (freq[str.charAt(i)] > maxCount) {
                maxCount = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Input: " + str);
        System.out.println("Most frequent character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
    }
}
