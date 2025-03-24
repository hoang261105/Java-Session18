package Bai5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> productHashMap = new HashMap<>();

        productHashMap.put("Laptop", 1500);
        productHashMap.put("Smartphone", 1200);
        productHashMap.put("Tablet", 800);
        productHashMap.put("Headphones", 500);
        productHashMap.put("Smartwatch", 700);
        productHashMap.put("Monitor", 1300);
        productHashMap.put("Keyboard", 400);
        productHashMap.put("Mouse", 300);
        productHashMap.put("Speaker", 600);
        productHashMap.put("Printer", 1700);

        System.out.println("Danh sách ban đầu:");
        for(String value:productHashMap.keySet()){
            System.out.println(value + " : " + productHashMap.get(value));
        }

        System.out.println("--------------------------------");
        boolean isFound = false;

        List<Map.Entry<String, Integer>> filteredProduct = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : productHashMap.entrySet()){
            if (entry.getValue() >= 500 && entry.getValue() <= 1500){
                filteredProduct.add(entry);
                isFound = true;
            }
        }

        Collections.sort(filteredProduct, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        System.out.println("Danh sách sp đã lọc sau khi sắp xếp");
        for(Map.Entry<String, Integer> entry : filteredProduct){
            System.out.println(entry.getKey() + " - Giá: " + entry.getValue());
        }

        if(!isFound){
            System.err.println("Không có sản phẩm nằm trong khoảng giá trên");
        }
    }
}
