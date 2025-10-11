import java.util.*;

public class Problem1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] age=new int[n];
        for(int i=0; i<n; i++){
            int x=sc.nextInt();
            age[i]=x;
        }
        for(int j=0; j<n; j++){
            System.out.println("User "+j+" age is "+age[j]);
        }
    }
}