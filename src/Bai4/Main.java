package Bai4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> employeeTreeMap = new TreeMap<>();

        employeeTreeMap.put("NV001", 200000);
        employeeTreeMap.put("NV002", 250000);
        employeeTreeMap.put("NV005", 300000);
        employeeTreeMap.put("NV004", 400000);
        employeeTreeMap.put("NV003", 500000);

        List<Map.Entry<String, Integer>> sortedEmployeeList = new ArrayList<>();

        Collections.sort(sortedEmployeeList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        System.out.println("Danh sách ban đầu đã sắp xếp");
        for(String value:employeeTreeMap.keySet()){
            System.out.println(value + " : " + employeeTreeMap.get(value));
        }

        String id = "NV001";
        employeeTreeMap.put(id, 100000);

        System.out.println("Danh sách sau khi cập nhật");
        for(String value:employeeTreeMap.keySet()){
            System.out.println(value + " : " + employeeTreeMap.get(value));
        }

        employeeTreeMap.remove("NV001");
        System.out.println("Danh sách sau khi xóa");
        for(String value:employeeTreeMap.keySet()){
            System.out.println(value + " : " + employeeTreeMap.get(value));
        }
    }
}
