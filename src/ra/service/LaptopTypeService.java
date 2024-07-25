package ra.service;

import ra.entity.LaptopType;

import java.util.Scanner;

public class LaptopTypeService {
    private static final Scanner sc = new Scanner(System.in);
    private static int size = 0;
    public static LaptopType[] laptopTypes = new LaptopType[0];

    // ******************* Hiển Thị **************
    public static void displayLaptopTypes() {
        if (size == 0) {
            System.out.println("🙅 Danh loại sách rỗng 🙅‍");
            return;
        }
        System.out.println(" ⬇⬇⬇ Danh sách loại Laptop ⬇⬇⬇ ");
        for (int i = 0; i < size; i++) {
            System.out.println(laptopTypes[i]);
        }
    }
    // ******************* Thêm **************
//xét xem nếu mảng rỗng thì mở rộng thêm 1
    public static void addLaptopType() {
        if (size >= laptopTypes.length) {
            LaptopType[] newLaptopTypes = new LaptopType[laptopTypes.length + 1];
            System.arraycopy(laptopTypes, 0, newLaptopTypes, 0, laptopTypes.length);
            laptopTypes = newLaptopTypes;
        }
        LaptopType laptopType = new LaptopType();
        laptopType.inputData();
        laptopTypes[size++] = laptopType;
        System.out.println(" 🤘🤘🤘 Thêm thể loại thành công 🤘🤘🤘");
    }
    // ******************* Sửa **************
    public static void updateLaptopType() {
        System.out.print("Nhập ID của thể loại laptop cần cập nhật: ");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {
            if (laptopTypes[i].getTypeId() == id) {
                System.out.println("thông tin hiện tại : " + laptopTypes[i]);
                laptopTypes[i].inputData();
                System.out.println(" 🤘🤘🤘 Cập nhật thể loại laptop thành công 🤘🤘🤘");
                return;
            }
        }
        System.out.println("Không tìm thấy thể loại laptop với ID : " + id + "😢😢");
    }

// ******************* Xóa **************

    public static void deleteLaptopType() {
        System.out.print("Nhập ID của thể loại laptop cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {
            if (laptopTypes[i].getTypeId() == id) {
                for (int j = i; j < size - 1; j++) {
                    laptopTypes[j] = laptopTypes[j + 1];
                }
                laptopTypes[size - 1] = null;
                size--;
                System.out.println(" 🤘🤘🤘 Xóa thể loại laptop thành công 🤘🤘🤘");
                return;
            }
        }
        System.out.println("Không tìm thấy thể loại laptop với ID " + id + "😢😢");

    }

}
