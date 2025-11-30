// 2) Write a program that reads a text file and counts the number of occurrences of each word in the file. The program should display the results in alphabetical order.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Q2{
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();

        try {
            BufferedReader br=new BufferedReader(new FileReader("input.txt"));
            String line;
            while((line=br.readLine())!=null){
                String[] words=line.trim().toLowerCase().split(" ");
                for(String i:words){
                    map.put(i, map.getOrDefault(i, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        for(HashMap.Entry<String,Integer> ent:map.entrySet()){
            System.out.println(ent.getKey()+" : "+ent.getValue());
        }
    }
}