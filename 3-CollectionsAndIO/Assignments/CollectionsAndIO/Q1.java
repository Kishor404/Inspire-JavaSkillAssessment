// 1) Write a program to find the no of words and lines in a text file.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q1{
    public static void main(String[] args){
        int lcount=0;
        int wcount=0;

        try {
            BufferedReader br=new BufferedReader(new FileReader("input.txt"));
            String line;
            lcount++;
            while((line=br.readLine())!=null){
                String[] words=line.trim().split(" ");
                if(line.trim()!=null){
                    wcount+=words.length;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Number Of Lines : "+lcount);
        System.out.println("Number Of Words : "+wcount);
    }
}
