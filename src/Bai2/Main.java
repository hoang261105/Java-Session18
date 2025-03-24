package Bai2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> productHashMap = new HashMap<>();

        productHashMap.put("Laptop", 12000);
        productHashMap.put("Samsung Galaxy", 1000);
        productHashMap.put("Iphone 15", 500);
        productHashMap.put("Redmi 13C", 600);

        String product = "Laptop";
        boolean isFound = false;
        for (String value:productHashMap.keySet()){
            if(value.equals(product)){
                System.out.println(value + " : " + productHashMap.get(value));
                isFound = true;
                break;
            }
        }

        for(String value:productHashMap.keySet()){
            if(productHashMap.get(value) == 1000){
                System.out.println(value + " : " + productHashMap.get(value));
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.err.println("Không tìm thấy sản phẩm");
        }
    }
}
