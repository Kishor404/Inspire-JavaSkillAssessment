//  9. Find the longest increasing sub-array in array. [Note - If there are multiple possibilities, print the first possibility.]

//             Input : {1, 5, 3, 7}

//             Output: {1, 5}

//             Input : {10, 22, 33, 25, 32, 54, 64, 1}

//             Output: {25, 32, 54, 64}



public class Exercise9 {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 7};
        int[] arr2 = {10, 22, 33, 25, 32, 54, 64, 1};

        System.out.print("Input : {1, 5, 3, 7}\nOutput: ");
        printLongestIncreasingSubarray(arr1);

        System.out.print("\n\nInput : {10, 22, 33, 25, 32, 54, 64, 1}\nOutput: ");
        printLongestIncreasingSubarray(arr2);
    }

    public static void printLongestIncreasingSubarray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("{}");
            return;
        }

        int maxLen = 1, start = 0, end = 0;
        int currStart = 0, currLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currLen++;
            } else {
                if (currLen > maxLen) {
                    maxLen = currLen;
                    start = currStart;
                    end = i - 1;
                }
                currStart = i;
                currLen = 1;
            }
        }

        if (currLen > maxLen) {
            maxLen = currLen;
            start = currStart;
            end = arr.length - 1;
        }


        System.out.print("{");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) System.out.print(", ");
        }
        System.out.println("}");
        System.out.println(maxLen);
    }
}
