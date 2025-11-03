// Pyramid pattern of numbers:

//     1
//    121
//   12321
//  1234321
// 123454321

public class PyramidPatternOfNumbers{
    public static void main(String[] args){
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print(j+1);
            }
            for(int j=0; j<i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}