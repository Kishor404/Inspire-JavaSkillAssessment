// 11. Create a program that generates a random number between 1 and 100 and asks the user to guess the number. Provide feedback to the user if their guess is too high or too low, and keep track of how many guesses it takes them to get the correct answer.


import java.util.Random;
import java.util.Scanner;

public class Task11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        
        int num=rd.nextInt(100)+1;
        int count=0;

        while (true){
            System.out.print("Guess The Number : ");
            int guess=sc.nextInt();
            count++;
            if(guess<num){
                System.out.println("Too Low!");
            }else if(guess>num){
                System.out.println("Too High!");
            }else{
                System.out.println("You Got It...");
                break;
            }
            System.out.println();
        }

        System.out.println("Number of Guess : "+count);
    }
}