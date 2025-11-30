// 11) Write a Java program to create a new directory and copy all the files from an existing directory to the new directory.

import java.io.*;

public class Q11 {
    public static void main(String[] args) {
        File sourceDir = new File("source");
        File targetDir = new File("backup");

        if (!targetDir.exists()) {
            targetDir.mkdir();
        }

        File[] files = sourceDir.listFiles();
        if (files == null) {
            System.out.println("No files found or directory missing.");
            return;
        }

        for (File f : files) {
            if (f.isFile()) {
                copyFile(f, new File(targetDir, f.getName()));
            }
        }

        System.out.println("Copy completed.");
    }

    private static void copyFile(File source, File dest) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
