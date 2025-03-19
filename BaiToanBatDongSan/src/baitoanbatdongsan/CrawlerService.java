package baitoanbatdongsan;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CrawlerService {
	private static final String BASE_URL = "https://alonhadat.com.vn/";


    public List<String> getPropertyLinks() {
        List<String> links = new ArrayList<>();
        try {
            Document doc = Jsoup.connect(BASE_URL)
            	    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
            	    .timeout(10 * 1000)
            	    .get();

            	// In HTML ra console để kiểm tra
            	System.out.println(doc.html().substring(0, 500));

            	Elements elements = doc.select("a.product-item");
            for (Element element : elements) {
                String link = "https://alonhadat.com.vn" + element.attr("href");
                System.out.println("Tìm thấy link: " + link);
                links.add(link);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return links;
    }


    public RealEstate getPropertyDetails(String url) {
        try {
            Document doc = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
                .get();

            String title = doc.select("h1").text();
            String price = doc.select(".price").text();
            String address = doc.select(".address").text();
            String area = doc.select(".square").text();
            String description = doc.select(".description").text();

            if (title.isEmpty() || price.isEmpty()) {
                System.out.println("Không lấy được dữ liệu từ: " + url);
                return null;
            }

            System.out.println("Crawled: " + title);
            return new RealEstate(title, price, address, area, description);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
