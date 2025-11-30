// 16) Write a Java program that reads a file using FileInputStream and encrypts its content using XOR encryption. Save the encrypted data to a new file using FileOutputStream. Implement a method that decrypts the encrypted data.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q16 {
    private static final byte KEY = 0x5A;

    public static void encrypt(String inputFile, String outputFile) {
        process(inputFile, outputFile);
    }

    public static void decrypt(String inputFile, String outputFile) {
        process(inputFile, outputFile);
    }

    private static void process(String inputFile, String outputFile) {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                int encrypted = data ^ KEY;
                fos.write(encrypted);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        encrypt("plain.txt", "encrypted.bin");
        decrypt("encrypted.bin", "decrypted.txt");
        System.out.println("Done");
    }
}
