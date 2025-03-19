package baitoanbatdongsan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataWriter {

    public void writeToFile(List<BatDongSan> batDongSanList, String outputFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Tiêu đề,Giá,Địa chỉ,Diện tích,Mô tả ngắn\n");
            for (BatDongSan batDongSan : batDongSanList) {
                writer.write(String.format("%s,%s,%s,%s,%s\n",
                        batDongSan.getTitle(), batDongSan.getPrice(), batDongSan.getAddress(),
                        batDongSan.getArea(), batDongSan.getDescription()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}