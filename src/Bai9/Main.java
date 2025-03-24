package Bai9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Integer, Product> products = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("----------------------MENU----------------------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiên thị thông tin sản phẩm");
            System.out.println("3. Cập nhật số lượng hoặc giá sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tính tổng giá trị sản phẩm trong kho");
            System.out.println("6. Thoát");
            System.out.printf("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addProduct(sc);
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    updateProduct(sc);
                    break;
                case 4:
                    deleteProduct(sc);
                    break;
                case 5:
                    totalProducts();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn lại từ 1 - 6");
            }
        } while (true);
    }

    public static void addProduct(Scanner sc) {
        System.out.println("Nhập số sản phẩm cần thêm:");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.println("Nhập thông tin sp thứ " + (i + 1) + ":");
            Product product = new Product();
            product.inputData(sc);
            products.put(i, product);
            System.out.println("Thêm sản phẩm thành công");
        }
    }

    public static void displayProducts() {
        if (products.isEmpty()) {
            System.err.println("Danh sách trống");
            return;
        }

        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            entry.getValue().displayData();
            System.out.println("------------------------------");
        }
    }

    public static void updateProduct(Scanner sc) {
        System.out.println("Nhập id cần cập nhật:");
        int id = Integer.parseInt(sc.nextLine());

        int indexUpdate = findProductById(id);

        if (indexUpdate == -1) {
            System.err.println("Không tìm thấy sản phẩm");
            return;
        }

        do {
            System.out.println("Cập nhật theo");
            System.out.println("1. Số lượng");
            System.out.println("2. Giá");
            System.out.println("3. Trở ve menu chính");

            int choice = Product.validateInputInt(sc, "Lựa chọn của bạn");

            switch (choice) {
                case 1:
                    int quantity = Product.validateInputInt(sc, "Nhập số lượng:");
                    products.get(indexUpdate).setQuantity(quantity);
                    System.out.println("Cập nhật số lượng thành công");
                    break;
                case 2:
                    int price = Product.validateInputInt(sc, "Nhập giá mới:");
                    products.get(indexUpdate).setPrice(price);
                    System.out.println("Cập nhật giá thành công");
                    break;
                case 3:
                    return;
                default:
                    System.err.println("Vui lòng chọn từ 1 - 3");
            }
        } while (true);
    }

    public static void deleteProduct(Scanner sc) {
        System.out.println("Nhập id cần xóa:");
        int id = Integer.parseInt(sc.nextLine());

        int indexUpdate = findProductById(id);

        if (indexUpdate == -1) {
            System.err.println("Không tìm thấy sản phẩm");
            return;
        }

        Iterator<Map.Entry<Integer, Product>> iterator = products.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Product> entry = iterator.next();
            Product product = entry.getValue();
            if (product.equals(products.get(indexUpdate))) {
                iterator.remove();
            }
        }
        System.out.println("Xóa sản phẩm thành công");
    }

    public static void totalProducts(){
        int sum = 0;
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            int price = entry.getValue().getPrice();
            int quantity = entry.getValue().getQuantity();

            sum += (price * quantity);
        }
        System.out.println("Tổng tất cả các giá trị của các sản phẩm trong kho là: " + sum);
    }

    public static int findProductById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
