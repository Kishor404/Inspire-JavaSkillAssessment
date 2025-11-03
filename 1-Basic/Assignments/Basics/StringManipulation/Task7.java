// 7. Write a program to capitalize the first letter of each word in a given string.

public class Task7 {
    public static void main(String[] args) {
        String str = "java is a popular programming language";
        String result = "";
        boolean capitalizeNext = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (capitalizeNext && ch != ' ') {
                result += Character.toUpperCase(ch);
                capitalizeNext = false;
            } else {
                result += ch;
            }

            if (ch == ' ') {
                capitalizeNext = true;
            }
        }

        System.out.println("Original: " + str);
        System.out.println("Capitalized: " + result);
    }
}
