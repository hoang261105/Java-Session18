package Bai9;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private int price;
    private int quantity;

    public Product() {
    }

    public Product(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void inputData(Scanner sc) {
        this.id = validateInputInt(sc, "Nhâp id");

        System.out.println("Nhập tên sản phẩm:");
        this.name = sc.nextLine();

        this.price = validateInputInt(sc, "Nhập giá:");

        this.quantity = validateInputInt(sc, "Nhập số lượng");
    }

    public static int validateInputInt(Scanner sc, String message) {
        System.out.println(message);

        do {
            int input = Integer.parseInt(sc.nextLine());

            if(input > 0){
                return input;
            }

            System.err.println("Dữ liệu phải lớn hơn 0. Vui lòng nhập lại");
        }while (true);
    }

    public void displayData(){
        System.out.printf("Id: %d\nName: %s\nPrice: %d\nQuantity: %d\n", id, name, price, quantity);
    }
}
