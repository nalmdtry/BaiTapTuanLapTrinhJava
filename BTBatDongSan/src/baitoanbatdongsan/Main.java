package baitoanbatdongsan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final String[] URLS = {
            "https://alonhadat.com.vn/"
    };

    private static final String OUTPUT_FILE = "batdongsan.csv";

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(URLS.length);
        List<BatDongSan> batDongSanList = new ArrayList<>();
        Crawler crawler = new Crawler();
        DataWriter dataWriter = new DataWriter();

        for (String url : URLS) {
            executor.submit(() -> {
                try {
                    List<BatDongSan> results = crawler.crawl(url);
                    synchronized (batDongSanList) {
                        batDongSanList.addAll(results);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dataWriter.writeToFile(batDongSanList, OUTPUT_FILE);
        System.out.println("Đã crawl được " + batDongSanList.size() + " bất động sản.");
    }
}
