package bai6;
import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadFileRead {
    public static void main(String[] args) {
        String[] files = {"input1.txt", "input2.txt"};
        ExecutorService executor = Executors.newFixedThreadPool(files.length);

        for (String file : files) {
            executor.execute(() -> readFile(file));
        }

        executor.shutdown();
    }

    private static void readFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + " đọc: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
