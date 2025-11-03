// 7. Write a program to print the distinct numbers from an integer array.

//             Input : {1, 4, 5, 3, 1, 5}

//             Output: {4, 3}

//             Input : {1, 4, 5, 3}

//             Output: {1, 4, 5, 3}

//             Input : {1, 1}

//             Output: {}

import java.util.Scanner;

public class Exercise7{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a List Of Number Separated by Space : ");
        String str=sc.nextLine();
        String[] strs=str.split(" ");
        int[] arr=new int[strs.length];
        for(int i=0; i<strs.length; i++){
            arr[i]=Integer.parseInt(strs[i]);
        }

        System.out.print("Output: {");
        boolean first = true;

        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                if (!first) System.out.print(", ");
                System.out.print(arr[i]);
                first = false;
            }
        }

        System.out.println("}");
        System.out.println();

        
        
        
    }
}