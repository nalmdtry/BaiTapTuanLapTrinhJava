package baitoanbatdongsan;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int THREAD_COUNT = 5;

    public static void main(String[] args) {
        CrawlerService crawler = new CrawlerService();
        FileService fileService = new FileService();
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        
        List<String> links = crawler.getPropertyLinks();
        List<RealEstate> dataList = new ArrayList<>();

        for (String link : links) {
            executor.execute(() -> {
                RealEstate data = crawler.getPropertyDetails(link);
                synchronized (dataList) {
                    if (data != null) dataList.add(data);
                }
            });
        }
        
        System.out.println("Số lượng link lấy được: " + links.size());
        for (String link : links) {
            System.out.println("Link: " + link);
        }

        executor.shutdown();
        while (!executor.isTerminated()) {}

        fileService.saveToCSV(dataList);
        System.out.println("Crawl hoàn tất! Tổng số bất động sản: " + dataList.size());
    }
}
