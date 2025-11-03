// 3. Write a program to count the number of words in a given string.

public class Task3 {
    public static void main(String[] args) {
        String str = "Java is fun to learn";
        int count = 0;

        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (str.charAt(i) == ' ') {
                inWord = false;
            }
        }

        System.out.println("Input: " + str);
        System.out.println("Word count: " + count);
    }
}
