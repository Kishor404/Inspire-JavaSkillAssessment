// 10. Find the smallest increasing sub-array in array. [Note - If there are multiple possibilities, print the first possibility.]

//             Input : {1, 5, 3, 7}

//             Output: {1, 5}

//             Input : {10, 22, 33, 25, 32, 54, 64, 1}

//             Output: {10, 22, 33}

public class Exercise10 {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 7};
        int[] arr2 = {10, 22, 33, 25, 32, 54, 64, 1};

        System.out.print("Input : {1, 5, 3, 7}\nOutput: ");
        printSmallestIncreasingSubarray(arr1);

        System.out.print("\n\nInput : {10, 22, 33, 25, 32, 54, 64, 1}\nOutput: ");
        printSmallestIncreasingSubarray(arr2);
    }

    public static void printSmallestIncreasingSubarray(int[] arr) {
        if (arr.length < 2) {
            System.out.println("{}");
            return;
        }

        int minLen = Integer.MAX_VALUE;
        int start = -1, end = -1;

        int currStart = 0, currLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currLen++;
            } else {
                if (currLen >= 2 && currLen < minLen) {
                    minLen = currLen;
                    start = currStart;
                    end = i - 1;
                }
                currStart = i;
                currLen = 1;
            }
        }

        if (currLen >= 2 && currLen < minLen) {
            minLen = currLen;
            start = currStart;
            end = arr.length - 1;
        }

        if (start == -1) {
            System.out.println("{}");
            return;
        }


        System.out.print("{");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) System.out.print(", ");
        }
        System.out.println("}");
        System.out.println(minLen);
    }
}
