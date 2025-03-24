package Bai3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> productHashMap = new LinkedHashMap<>();

        productHashMap.put("Laptop", 12000);
        productHashMap.put("Samsung Galaxy", 1000);
        productHashMap.put("Iphone 15", 500);
        productHashMap.put("Redmi 13C", 600);
        productHashMap.put("Oppo 15 plus", 800);

        System.out.println("Danh sách ban đầu");
        for(String value:productHashMap.keySet()){
            System.out.println(value + " : " + productHashMap.get(value));
        }

        for(String value:productHashMap.keySet()){
            if(value.equals("Laptop")){
                productHashMap.replace(value, 15000);
            }
        }

        System.out.println("Danh sách sau khi cập nhật");
        for(String value:productHashMap.keySet()){
            System.out.println(value + " : " + productHashMap.get(value));
        }

        productHashMap.remove("Laptop");
        System.out.println("Danh sách sau khi xóa");
        for(String value:productHashMap.keySet()){
            System.out.println(value + " : " + productHashMap.get(value));
        }
    }
}
