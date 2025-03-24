package Bai7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng");
        int n = Integer.parseInt(sc.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // getOrDefault: Lấy value tương ứng với khóa trong HashMap
            // Neu có 1 giá trị liên kết với khóa thì giá tri sẽ trả về, nếu không sẽ gán defaultValue được truyền
            counter.put(numbers[i], counter.getOrDefault(numbers[i], 0) + 1);
        }

        for(Integer key : counter.keySet()){
            System.out.println(key + " : " + counter.get(key));
        }
    }
}
