// 6. Write a program to remove all the white spaces from a given string.

public class Task6 {
    public static void main(String[] args) {
        String str = "Java   is   powerful";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Without spaces: " + result);
    }
}
