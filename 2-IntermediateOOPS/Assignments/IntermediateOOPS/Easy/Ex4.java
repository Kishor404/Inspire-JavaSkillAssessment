public class Ex3{
    public static int findMax(int[] arr){
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={78,34,56,98,23,478,234,450};
        int mx=findMax(arr);
        System.out.println("Max : "+mx);
    }
}