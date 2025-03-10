package bai7;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadLargeFileRead {
    private static final int CHUNK_SIZE = 1024 * 1024; // 1MB

    public static void main(String[] args) {
        String filePath = "largefile.txt";
        ExecutorService executor = Executors.newFixedThreadPool(4);

        try (RandomAccessFile raf = new RandomAccessFile(filePath, "r")) {
            long fileSize = raf.length();
            int chunks = (int) Math.ceil((double) fileSize / CHUNK_SIZE);

            for (int i = 0; i < chunks; i++) {
                long start = i * CHUNK_SIZE;
                executor.execute(() -> readChunk(filePath, start));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }

    private static void readChunk(String filePath, long start) {
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "r")) {
            raf.seek(start);
            byte[] buffer = new byte[CHUNK_SIZE];
            int bytesRead = raf.read(buffer);
            if (bytesRead > 0) {
                System.out.println(Thread.currentThread().getName() + " đọc từ " + start);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
