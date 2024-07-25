package ra.entity;

import java.util.Scanner;

public class LaptopType {
    private static int autoId = 1;
    private int typeId;
    private   String   description;
    private String typeName;
    private boolean isDeleted;



    public LaptopType() {
        this.typeId = autoId++;
    }

    public LaptopType(int typeId, String typeName, String description, boolean isDeleted) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.description = description;
        this.isDeleted = isDeleted;

    }



    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        LaptopType.autoId = autoId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = Integer.parseInt(typeId);
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

    Scanner sc = new Scanner(System.in);

    public void inputData() {
        while (true) {
            System.out.print("Tên loại Laptop : ");
            String typeName = sc.nextLine();
            if (!typeName.isEmpty()) {
                this.typeName = typeName;
                break;
            } else {
                System.out.println("Tên loại Laptop không được để trống.");
            }
        }

        while (true) {
            System.out.print("Mô tả loại Laptop : ");
            String description = sc.nextLine();
            if (!description.isEmpty()) {
                this.description = description;
                break;
            } else {
                System.out.println("Mô tả loại Laptop không được để trống.");
            }
        }
    }



    @Override
    public String toString() {
        return
                "Id : " + typeId +
                        "  | Name : " + typeName +
                        "  | Description : " + description +
                        "  | Delete : " + isDeleted
                ;
    }
}
