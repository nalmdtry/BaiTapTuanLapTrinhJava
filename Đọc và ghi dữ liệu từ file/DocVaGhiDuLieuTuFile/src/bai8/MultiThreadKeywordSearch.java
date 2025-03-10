package bai8;
import java.io.*;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadKeywordSearch {
    public static void main(String[] args) {
        String keyword = "java";
        String[] files = {"file1.txt", "file2.txt"};

        ExecutorService executor = Executors.newFixedThreadPool(files.length);
        for (String file : files) {
            executor.execute(() -> searchKeyword(file, keyword));
        }
        executor.shutdown();
    }

    private static void searchKeyword(String filePath, String keyword) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(keyword)) {
                    count++;
                }
            }
            System.out.println("Từ '" + keyword + "' xuất hiện " + count + " lần trong " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

