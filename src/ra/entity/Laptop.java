package ra.entity;

import java.util.Date;
import java.util.Scanner;

public class Laptop {
    static LaptopType laptopType = new LaptopType();
    Laptop[] laptops;
    private static int count = 0;
    private String laptopId, description, laptopName;
    private int ram, typeId;
    private double weight, laptopPrice;
    private Date createAt;
    private boolean isDeleted;

    public Laptop() {
        this.laptopId = String.format("D%04d", ++count);
    }

    public Laptop(String laptopId, String laptopName, String description, int ram, double weight, Date createAt, double laptopPrice, int typeId, boolean isDeleted) {
        this.laptopName = laptopName;
        this.laptopId = laptopId;
        this.description = description;
        this.ram = ram;
        this.weight = weight;
        this.createAt = createAt;
        this.laptopPrice = laptopPrice;
        this.typeId = typeId;
        this.isDeleted = isDeleted;
    }

    public String getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(String laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public double getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(double laptopPrice) {
        this.laptopPrice = laptopPrice;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    Scanner scanner = new Scanner(System.in);

    public Laptop inputData() {
        System.out.println("Nhập tên Laptop : ");
        laptopName = scanner.next();
        while (laptopName.isEmpty()) {
            System.err.println("tên không được để trống!! vui lòng nhập lại");
            laptopName = scanner.next();
        }
        System.out.println("Nhập mô tả Laptop : ");
        description = scanner.next();
        while (description.isEmpty()) {
            System.err.println("Mô tả không được để trống!! vui lòng nhập lại.");
            description = scanner.next();
        }
        System.out.println("Nhập Ram : ");
        ram = Integer.parseInt(scanner.nextLine());
        while (ram <= 0) {
            System.err.println("Ram không được bé hơn 0");
            ram = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập trọng lượng : ");
        weight = Double.parseDouble(scanner.nextLine());
        while (weight <= 0) {
            System.err.println("Trọng lượng không được bé hơn 0");
            weight = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Nhập giá : ");
        laptopPrice = Double.parseDouble(scanner.nextLine());
        while (laptopPrice <= 0) {
            System.err.println("giá không được bé hơn 0");
            laptopPrice = Double.parseDouble(scanner.nextLine());
        }
        for (int i = 0; i < LaptopType.laptopTypes.length; i++) {
//            System.out.println("|LaptopTypeId : %-5d|\n",LaptopType.laptopTypes[i].getTypeId());
        }
        return new Laptop() ;
    }
}
