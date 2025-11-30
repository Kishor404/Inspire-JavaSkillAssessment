// Write a Java program that reads a file using FileInputStream and encrypts its content using XOR encryption. Save the encrypted data to a new file using FileOutputStream. Implement a method that decrypts the encrypted data.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q9 {

    public static void xorFile(String inputFile, String outputFile, byte key) {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data ^ key);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        byte key = 123;
        xorFile("input.txt", "encrypted.bin", key);
        xorFile("encrypted.bin", "decrypted.txt", key);
        System.out.println("Done.");
    }
}