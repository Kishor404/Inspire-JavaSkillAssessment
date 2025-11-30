public class Ex1{
    public static double calculateAverage(int[] arr){
        int sum=0;
        int len=arr.length;
        for(int i=0; i<len; i++){
            sum+=arr[i];
        }
        double avg=sum/len;
        return(avg);
    }
    public static void main(String[] args){
        int[] arr={1,3,2,4,7,5,10};
        double avg=calculateAverage(arr);
        System.out.println("Average : "+avg);
    }
}