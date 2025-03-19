package baitoanbatdongsan;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Crawler {

    public List<BatDongSan> crawl(String url) throws IOException {
        List<BatDongSan> results = new ArrayList<>();
        Document doc = Jsoup.connect(url).get();
        Elements items = doc.select(".item"); // Cần điều chỉnh selector

        for (Element item : items) {
            String title = item.select(".title").text(); // Cần điều chỉnh selector
            String price = item.select(".price").text(); // Cần điều chỉnh selector
            String address = item.select(".address").text(); // Cần điều chỉnh selector
            String area = item.select(".area").text(); // Cần điều chỉnh selector
            String description = item.select(".description").text(); // Cần điều chỉnh selector

            results.add(new BatDongSan(title, price, address, area, description));
        }

        return results;
    }
}