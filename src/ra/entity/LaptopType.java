package ra.entity;

import java.util.Scanner;

public class LaptopType {
    static LaptopType[] laptopTypes;
    private static int count = 0;
    int typeId = 1;
    String typeName, bookId, description;
    boolean isDeleted;
    Scanner scan = new Scanner(System.in);

    public LaptopType() {
        this.typeId = ++count;
        this.isDeleted = false;
        laptopTypes = (LaptopType[]) new Object[0];
    }


    public LaptopType(int typeId, String typeName, String description, boolean isDeleted) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.description = description;
        this.isDeleted = isDeleted;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public void print() {
        System.out.printf("|Id : %-5s|Name : %-10s|Description : %-15s|isDelete : %-10s|\n", typeId, typeName, description);
    }


    public LaptopType inputData() {
        System.out.println("Nhập tên loại Laptop");
        typeName = scan.next();
        while (typeName.isEmpty()) {
            System.out.println("Tên không được để trống");
            typeName = scan.next();
        }
        System.out.println("Nhập mô tả loại Laptop");
        description = scan.next();
        while (description.isEmpty()) {
            System.out.println("Mô tả không được để trống");
            description = scan.next();
        }
        System.out.println("them moi thanh cong");
        return new LaptopType(typeId, typeName, description, isDeleted);
    }

    //*****thêm****
    public void addLaptopType() {
        //mở rộng mảng ra +1 vì ban đầu mảng là 0
        LaptopType[] newArray = (LaptopType[]) new Object[laptopTypes.length + 1];
        System.arraycopy(laptopTypes, 0, newArray, 0, laptopTypes.length);
        laptopTypes = newArray;

        System.out.println("lap so luong loai laptop muon them");
        int number = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("nhap thong tin cho loai Laptop thu" + (i + 1));
            laptopTypes[i] = inputData();
        }
    }

    //*****Hiển Thị****
    public void displayLaptopType() {
        if (laptopTypes.length == 0) {
            System.err.println("khong co trong danh sach de hien thi");
        } else {
            for (LaptopType laptopType : laptopTypes) {
                System.out.println(laptopType);
            }
        }
    }

    //*****sửa****
    public void updateLaptopType() {
        System.out.println("nhap ID ban muon sua");
        int idUpdate = Integer.parseInt(scan.nextLine());
        boolean isCheck = false;
        for (int i = 0; i < laptopTypes.length; i++) {
            if (laptopTypes[i].getTypeId() == idUpdate) {
                laptopTypes[i] = inputData();
                isCheck = true;
                break;
            }
        }
        if (isCheck) System.out.println("sua thanh cong");
        else System.err.println("khong co ID ban muon sua");
    }

    //*****xóa****
    public void deleteLaptopType() {
        System.out.println("nhap ID ban muon xoa : ");
        int idDelete = Integer.parseInt(scan.nextLine());
        boolean isCheck = false;
        for (int i = 0; i < laptopTypes.length; i++) {
            if (laptopTypes[i].getTypeId() == idDelete) {
                laptopTypes[i] = null;
                isCheck = true;
                break;
            }
        }
        if (isCheck) System.out.println("xoa thanh cong");
        else System.err.println("khong co ID ban muon xoa");
    }


}
