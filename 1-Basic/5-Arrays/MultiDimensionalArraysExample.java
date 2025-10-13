public class MultiDimensionalArraysExample{
    public static void main(String[] args) {
        
        int[][] myArray=new int[2][2];
        myArray[0][0]=24;
        myArray[0][1]=34;
        myArray[1][0]=44;
        myArray[1][1]=54;

        // 24 34
        // 44 54

        myArray[1][0]=64;

        // 24 34
        // 64 54

        System.out.println(myArray[0][1]); //34

        for(int[] i : myArray){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}