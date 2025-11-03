// 4. Write a program to print the elements of an array of strings in reverse order.

public class Task4 {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "C", "C++", "JavaScript"};

        System.out.println("Array in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
