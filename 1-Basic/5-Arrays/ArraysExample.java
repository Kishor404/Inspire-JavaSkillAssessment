public class ArraysExample{
    public static void main(String[] args){


        int[] myArray;
        myArray = new int[] {1,2,3,4};
        System.out.println(myArray[2]);

        int[] nums = new int[3];
        nums[0]=1;
        System.out.println(nums[2]);
        System.out.println(nums[0]);

        int[] numbers={1,3,2,4};
        int len=numbers.length;
        System.out.println(len);

        numbers[3]=10;

        for(int i : numbers){
            System.out.print(i+" ");
        }
    }
}