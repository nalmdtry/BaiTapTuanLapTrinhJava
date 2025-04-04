package view;

import java.util.Scanner;

public class MainView {
    private static Scanner scanner = new Scanner(System.in);

    public static int showMenu() {
        System.out.println("\n==== Quản lý đơn hàng ====");
        System.out.println("1. Thêm đơn hàng mới");
        System.out.println("2. Xem lịch sử đơn hàng của khách hàng");
        System.out.println("3. Tính tổng tiền đơn hàng");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
        return scanner.nextInt();
    }

    public static int getInput(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
}
