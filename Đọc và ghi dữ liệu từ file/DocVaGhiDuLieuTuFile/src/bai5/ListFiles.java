package bai5;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File folder = new File(".");
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Thư mục không hợp lệ!");
        }
    }
}

