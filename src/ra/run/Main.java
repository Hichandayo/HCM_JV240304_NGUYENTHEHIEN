package ra.run;

import ra.entity.Laptop;
import ra.entity.LaptopType;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    static Scanner scanner = new Scanner(System.in);
    static Laptop laptop = new Laptop();
    static LaptopType laptopType = new LaptopType();
    public static void main(String[] args) {
        while (true) {
            System.out.println(ANSI_PURPLE + "╔════════════════════════════╗" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║ Welcome to Hi-chan Shop    ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "╠════════════════════════════╣" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    1. Quản lý loại laptop " + ANSI_RESET + ANSI_PURPLE + "           ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    2. Quản lý laptop " + ANSI_RESET + ANSI_PURPLE + "              ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    3. Thoát" + ANSI_RESET + ANSI_PURPLE + "                ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "╚ " + ANSI_RESET + ANSI_CYAN + "  Nhập lựa chọn ⭣ ⭣ ⭣" + ANSI_RESET + ANSI_PURPLE + "     ═╝" + ANSI_RESET);
            byte choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    laptopTypeMenu();
                    break;
                case 2:
                    laptopMenu();
                    break;
                case 3:
                    // thoát
                    System.out.println("Tạm biệt");
                    break;
                default:
                    System.err.println("ko đúng lựa chọn");
            }

            if (choice == 3) {
                break;
            }
        }
    }

    public static void laptopTypeMenu() {
        while (true) {
            System.out.println(ANSI_PURPLE + "╔════════════════════════════╗" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║ Welcome to Hi-chan Shop    ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "╠════════════════════════════╣" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    1. Hiển thị danh sách các loại laptop " + ANSI_RESET + ANSI_PURPLE + "           ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    2. Thêm mới loại laptop " + ANSI_RESET + ANSI_PURPLE + "           ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    3. Cập nhật thông tin loại laptop " + ANSI_RESET + ANSI_PURPLE + "           ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    4. Xóa loại Laptop " + ANSI_RESET + ANSI_PURPLE + "              ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    5. Thoát" + ANSI_RESET + ANSI_PURPLE + "                ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "╚ " + ANSI_RESET + ANSI_CYAN + "  Nhập lựa chọn ⭣ ⭣ ⭣" + ANSI_RESET + ANSI_PURPLE + "     ═╝" + ANSI_RESET);
            byte choice1 = scanner.nextByte();
            switch (choice1) {
                case 1:
                    laptopType.displayLaptopType();
                    break;
                case 2:
                    laptopType.addLaptopType();
                    break;
                case 3:
                    laptopType.updateLaptopType();
                    break;
                case 4:
                    laptopType.deleteLaptopType();
                    break;
                case 5:
                    // thoát
                    System.out.println("Tạm biệt");
                    break;
                default:
                    System.err.println("ko đúng lựa chọn");
            }
            if (choice1 == 5) {
                break;
            }
        }
    }

    public static void laptopMenu() {
        while (true) {
            System.out.println(ANSI_PURPLE + "╔════════════════════════════╗" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║ Welcome to Hi-chan Shop    ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "╠════════════════════════════╣" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    1. Danh sách Laptop " + ANSI_RESET + ANSI_PURPLE + "           ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    2. Thêm mới Laptop " + ANSI_RESET + ANSI_PURPLE + "           ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    3. Cập nhật thông tin Laptop " + ANSI_RESET + ANSI_PURPLE + "           ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    4. Xóa Laptop " + ANSI_RESET + ANSI_PURPLE + "              ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    5. Thống kê số lượng laptop theo từng loại " + ANSI_RESET + ANSI_PURPLE + "              ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "    6. Thoát" + ANSI_RESET + ANSI_PURPLE + "                ║" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "╚ " + ANSI_RESET + ANSI_CYAN + "  Nhập lựa chọn ⭣ ⭣ ⭣" + ANSI_RESET + ANSI_PURPLE + "     ═╝" + ANSI_RESET);
            byte choice2 = scanner.nextByte();
            switch (choice2) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    // thoát
                    System.out.println("Tạm biệt");
                    break;
                default:
                    System.err.println("ko đúng lựa chọn");
            }

            if (choice2 == 6) {
                break;
            }
        }
    }
}

