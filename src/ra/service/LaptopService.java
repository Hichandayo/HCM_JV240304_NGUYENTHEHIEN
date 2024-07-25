package ra.service;

import ra.entity.Laptop;
import ra.entity.LaptopType;

import static ra.service.LaptopTypeService.laptopTypes;

import java.util.Scanner;
public class LaptopService {

    static Scanner sc = new Scanner(System.in);
    private static int size = 0;
    private static Laptop[] laptops = new Laptop[0];

    // ******************* Hiển Thị **************
    public static void displayLaptop() {
        if (size == 0) {
            System.err.println("🙅 Danh sách rỗng 🙅‍♂️");
            return;
        }
        System.out.println(" ⬇⬇⬇ Danh sách Laptop ⬇⬇⬇ ");
        for (int i = 0; i < size; i++) {
            System.out.println(laptops[i]);
        }
    }
    // ******************* Thêm **************
    //xét xem nếu chưa mảng rỗng thì thêm 1
    public static void addLaptop() {
        if (size >= laptops.length) {
            Laptop[] newLaptops = new Laptop[size + 1];
            System.arraycopy(laptops, 0, newLaptops, 0, laptops.length);
            laptops = newLaptops;
        }
        Laptop laptop = new Laptop();
        laptop.inputData();
        laptops[size++] = laptop;
        System.out.println("🤘🤘🤘 Thêm mới thành công 🤘🤘🤘");
    }
    // ******************* Sửa **************
    public static void updateLaptop() {
        System.out.print("Nhập ID cần chỉnh sửa : ");
        String id = sc.nextLine();

        for (int i = 0; i < size; i++) {
            if (laptops[i].getLaptopId().equals(id)) {
                System.out.println(" Thông tin hiện tại : " + laptops[i]);
                laptops[i].inputData();
                System.out.println("🤘🤘🤘 Chỉnh sửa thành công 🤘🤘🤘");
                return;
            }
        }
        System.out.println("Laptop có ID " + id + " không được tìm thấy 😢😢");
    }
    // ******************* Xóa **************
    public static void deleteLaptop() {
        System.out.print("Nhập ID cần xoá : ");
        String id = sc.nextLine();
        for (int i = 0; i < size; i++) {
            if (laptops[i].getLaptopId().equals(id)) {
                for (int j = i; j < size - 1; j++) {
                    laptops[j] = laptops[j + 1];
                }
                laptops[size - 1] = null;
                size--;
                System.out.println("🤘🤘🤘 Xoá thành công 🤘🤘🤘");
                return;
            }
        }
        System.out.println("Laptop có ID " + id + " không được tìm thấy 😢😢");
    }



}
