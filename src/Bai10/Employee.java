package Bai10;

import java.util.Scanner;

public class Employee {
    public static int count = 0;
    private int id;
    private String name;
    private double salary;

    public Employee(int id) {
        this.id = ++count;
    }

    public Employee(int id, String name, double salary) {
        this.id = ++count;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void inputData(Scanner sc) {
        System.out.println("Nhập tên nhân viên");
        this.name = sc.nextLine();

        System.out.println("Nhập lương cơ bản:");
        this.salary = Double.parseDouble(sc.nextLine());
    }

    public void outputData() {
        System.out.printf("Id: %d\nName: %s\nSalary: %.2f\n", id, name, salary);
    }
}
