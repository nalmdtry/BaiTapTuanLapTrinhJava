package baitoanbatdongsan;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileService {
    private static final String FILE_NAME = "real_estate_data.csv";

    public void saveToCSV(List<RealEstate> dataList) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write("Tiêu đề,Giá,Địa chỉ,Diện tích,Mô tả\n");
            for (RealEstate data : dataList) {
                writer.write(data.toCSV() + "\n");
            }
            System.out.println("Dữ liệu đã được lưu vào file: " + FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
