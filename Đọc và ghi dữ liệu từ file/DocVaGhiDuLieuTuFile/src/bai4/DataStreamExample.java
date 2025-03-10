package bai4;

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        String filePath = "numbers.dat";

        // Ghi danh sách số nguyên vào file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(10);
            dos.writeInt(20);
            dos.writeInt(30);
            System.out.println("Ghi số nguyên vào file thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Đọc lại danh sách số nguyên từ file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            while (dis.available() > 0) {
                System.out.println("Số nguyên: " + dis.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
