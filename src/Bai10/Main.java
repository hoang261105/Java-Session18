package Bai10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Integer, Employee> employees = new HashMap<>();
    public static double sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("-----------------MENU----------------");
            System.out.println("1. Thêm mới các nhân viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tính tổng lương của tất cả nhân viên");
            System.out.println("4. Tính lương trung bình");
            System.out.println("5. Tìm nhân viên có lương cao nhất");
            System.out.println("6. Tìm nhân viên có lương thấp nhất");
            System.out.println("7. Thoát");
            System.out.printf("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    totalSalary();
                    break;
                case 4:
                    averageSalary();
                    break;
                case 5:
                    searchEmployee("max");
                    break;
                case 6:
                    searchEmployee("min");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn lại từ 1 - 7");
            }
        } while (true);
    }

    public static void addEmployee(Scanner sc) {
        System.out.println("Nhập số nhân viên cần thêm:");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            Employee employee = new Employee(i + 1);
            employee.inputData(sc);
            employees.put(employee.getId(), employee);
            System.out.println("Thêm nhân viên thành công");
        }
    }

    public static void displayEmployees() {
        if (employees.isEmpty()) {
            System.err.println("Danh sách trống");
            return;
        }

        for (Employee employee : employees.values()) {
            employee.outputData();
            System.out.println("--------------------------");
        }
    }

    public static void totalSalary(){
        for (Employee employee : employees.values()) {
            sum += employee.getSalary();
        }
        System.out.println("Tổng lương của tất cả nhân viên là: " + sum);
    }

    public static void averageSalary(){
        for (Employee employee : employees.values()) {
            sum += employee.getSalary();
        }
        double average = sum / employees.size();
        System.out.println("Lương trung bình của các nhân viên là: " + average);
    }

    public static void searchEmployee(String type){
        if (employees.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
            return;
        }

        Employee employee = null;

        for (Employee emp : employees.values()) {
            if (employee == null
                    || (type.equals("max") && employee.getSalary() < emp.getSalary())
                    || (type.equals("min") && employee.getSalary() > emp.getSalary())) {
                employee = emp;
            }
        }

        if(employee != null){
            System.out.println("Nhân viên có lương " + (type.equals("max") ? "cao nhất" : "thấp nhất") + " là:");
            employee.outputData();
        }else{
            System.err.println("Không tìm thấy nhân viên");
        }
    }
}
