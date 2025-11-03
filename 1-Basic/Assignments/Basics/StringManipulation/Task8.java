// 8. Write a program to find the first non-repeated character in a given string.

public class Task8 {
    public static void main(String[] args) {
        String str = "aabbccdeeff";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char result = '\0';
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                result = str.charAt(i);
                break;
            }
        }

        System.out.println("Input: " + str);
        if (result != '\0')
            System.out.println("First non-repeated character: " + result);
        else
            System.out.println("No non-repeated character found.");
    }
}
