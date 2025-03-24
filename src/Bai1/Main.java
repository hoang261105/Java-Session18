package Bai1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> studentHashMap = new HashMap<>();

        studentHashMap.put("Nguyễn Văn A", 9.2);
        studentHashMap.put("Nguyễn Văn B", 8.5);
        studentHashMap.put("Nguyên Văn C", 7.6);
        studentHashMap.put("Nguyễn Văn D", 6.2);
        studentHashMap.put("Nguyễn Văn E", 5.5);

        for(String value:studentHashMap.keySet()){
            System.out.println(value + " : " + studentHashMap.get(value));
        }

        String name = "Nguyễn Văn F";

        boolean isFound = false;
        for (String value:studentHashMap.keySet()){
            if(value.equals(name)){
                System.out.println(value + " : " + studentHashMap.get(value));
                isFound = true;
            }
        }

        if(!isFound){
            System.err.println("Không tìm thấy");
        }
    }
}
