package ra.run;

import ra.service.LaptopService;
import ra.service.LaptopTypeService;

import java.util.Scanner;
//validate chưa được chặt chẻ nên còn rất nhiều chổ vô lí.
//phần tính tổng số học sinh thì chưa hiểu rõ nên đọc code mãi mà hong làm theo được.
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String Yellow = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    static LaptopService laptopService = new LaptopService();
    static LaptopTypeService laptopTypeService = new LaptopTypeService();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mainMenu();
            if (sc.hasNextLine()) {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        laptopTypeManagement();
                        break;
                    case 2:
                        laptopManagement();
                        break;
                    case 3:
                        System.err.println("Chào Thân Ái Và Quyết Thắng , Hẹn Hặp Lại🧏‍♂️");
                        System.exit(0);
                        break;
                    default:
                        System.err.println("❌ Lựa chọn không đúng ❌  vui lòng nhập lại!!!");
                        break;
                }
            }
        }
    }

    public static void laptopTypeManagement() {
        while (true) {
            laptopTypeMenu();
            if (sc.hasNextLine()) {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        LaptopTypeService.displayLaptopTypes();
                        break;
                    case 2:
                        LaptopTypeService.addLaptopType();
                        break;
                    case 3:
                        LaptopTypeService.updateLaptopType();
                        break;
                    case 4:
                        LaptopTypeService.deleteLaptopType();
                        break;
                    case 5:
                        return;
                    default:
                        System.err.println("❌ Lựa chọn không đúng ❌  vui lòng nhập lại!!!!");
                        break;
                }
            }
        }
    }

    public static void laptopManagement() {
        while (true) {
            laptopMenu();
            if (sc.hasNextLine()) {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        LaptopService.displayLaptop();
                        break;
                    case 2:
                        LaptopService.addLaptop();
                        break;
                    case 3:
                        LaptopService.updateLaptop();
                        break;
                    case 4:
                        LaptopService.deleteLaptop();
                        break;
                    case 5:
                        break;
                    case 6:
                        return;
                    default:
                        System.err.println("❌ Lựa chọn không đúng ❌  vui lòng nhập lại!!!");
                        break;
                }
            }
        }
    }
    private static void mainMenu() {
        System.out.println(ANSI_PURPLE + "╔════════════════════════════╗" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "║ Welcome to Hi-chan Shop    ║" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "╠════════════════════════════╣" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "  1. Quản lý loại laptop " + ANSI_RESET + ANSI_PURPLE + "   ║" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "  2. Quản lý laptop " + ANSI_RESET + ANSI_PURPLE + "        ║" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "║" + ANSI_RESET + ANSI_CYAN + "  3. Thoát" + ANSI_RESET + ANSI_PURPLE + "                  ║" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "╚ " + ANSI_RESET + RED + "  Nhập lựa chọn ⭣ ⭣ ⭣" + ANSI_RESET + ANSI_PURPLE + "     ═╝" + ANSI_RESET);
    }
    private static void laptopTypeMenu() {
        System.out.println(Yellow + "╔══════════════════════════════════════════════════╗" + ANSI_RESET);
        System.out.println(Yellow + "║              Welcome to Hi-chan Shop             ║" + ANSI_RESET);
        System.out.println(Yellow + "╠══════════════════════════════════════════════════╣" + ANSI_RESET);
        System.out.println(Yellow + "║" + ANSI_RESET + GREEN + "    1. Hiển thị danh sách các loại laptop " + ANSI_RESET + Yellow + "        ║" + ANSI_RESET);
        System.out.println(Yellow + "║" + ANSI_RESET + GREEN + "    2. Thêm mới loại laptop " + ANSI_RESET + Yellow + "                      ║" + ANSI_RESET);
        System.out.println(Yellow + "║" + ANSI_RESET + GREEN + "    3. Cập nhật thông tin loại laptop " + ANSI_RESET + Yellow + "            ║" + ANSI_RESET);
        System.out.println(Yellow + "║" + ANSI_RESET + GREEN + "    4. Xóa loại Laptop " + ANSI_RESET + Yellow + "                           ║" + ANSI_RESET);
        System.out.println(Yellow + "║" + ANSI_RESET + GREEN + "    5. Quay Lại" + ANSI_RESET + Yellow + "                                   ║" + ANSI_RESET);
        System.out.println(Yellow + "╚ " + ANSI_RESET + RED + "  Nhập lựa chọn ⭣ ⭣ ⭣" + ANSI_RESET + Yellow + "                           ═╝" + ANSI_RESET);
    }
    private static void laptopMenu() {
        System.out.println(GREEN + "╔══════════════════════════════════════════════════╗" + ANSI_RESET);
        System.out.println(GREEN + "║              Welcome to Hi-chan Shop             ║" + ANSI_RESET);
        System.out.println(GREEN + "╠══════════════════════════════════════════════════╣" + ANSI_RESET);
        System.out.println(GREEN + "║" + ANSI_RESET + Yellow + "    1. Danh sách Laptop " + ANSI_RESET + GREEN + "                          ║" + ANSI_RESET);
        System.out.println(GREEN + "║" + ANSI_RESET + Yellow + "    2. Thêm mới Laptop " + ANSI_RESET + GREEN + "                           ║" + ANSI_RESET);
        System.out.println(GREEN + "║" + ANSI_RESET + Yellow + "    3. Cập nhật thông tin Laptop " + ANSI_RESET + GREEN + "                 ║" + ANSI_RESET);
        System.out.println(GREEN + "║" + ANSI_RESET + Yellow + "    4. Xóa Laptop " + ANSI_RESET + GREEN + "                                ║" + ANSI_RESET);
        System.out.println(GREEN + "║" + ANSI_RESET + Yellow + "    5. Thống kê số lượng laptop theo từng loại " + ANSI_RESET + GREEN + "   ║" + ANSI_RESET);
        System.out.println(GREEN + "║" + ANSI_RESET + Yellow + "    6. Quay Lại" + ANSI_RESET + GREEN + "                                   ║" + ANSI_RESET);
        System.out.println(GREEN + "╚ " + ANSI_RESET + RED + "  Nhập lựa chọn ⭣ ⭣ ⭣" + ANSI_RESET + GREEN + "                           ═╝" + ANSI_RESET);
    }
}
