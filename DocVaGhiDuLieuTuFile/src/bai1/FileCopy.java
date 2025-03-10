package bai1;
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destFile = "output.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Copy file thành công!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
