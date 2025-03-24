package map;

import java.util.*;

public class Mapdemo {
    public static void main(String[] args) {
        // Hashmap: Lưu trữ dữ liệu không co thứ tự
        Map<Integer, String> studentHashMap = new HashMap<>();
        studentHashMap.put(1, "Huyen");
        studentHashMap.put(1, "Trang");
        studentHashMap.put(3, "Phanh");
        studentHashMap.put(4, "Lan Anh");

        System.out.println("Thông tin hash map: " + studentHashMap);

        // LinkedHashmap: Lưu trữ dữ liêu theo thứ tự truyền vào
        Map<Integer, String> studentLinkedHashMap = new LinkedHashMap<>();
        studentLinkedHashMap.put(1, "Huyen");
        studentLinkedHashMap.put(3, "Trang");
        studentLinkedHashMap.put(2, "Phanh");

        System.out.println("Thông tin linked hash map: " + studentLinkedHashMap);

        // TreeMap: Lưu trữ dữ liệu theo thứ tự tự nhiên: Sắp xếp key tăng dần
        Map<Integer, String> studentTreeMap = new TreeMap<>();
        studentTreeMap.put(1, "Huyen");
        studentTreeMap.put(3, "Trang");
        studentTreeMap.put(2, "Phanh");

        // 2. Value get(Object key): Lấy giá trị value theo key
        System.out.println("Value của key = 2 là " + studentHashMap.get(3));

        // 3. Xóa phần tử theo key
        studentHashMap.remove(3);
        System.out.println("Hashmap sau khi xóa key = 3 là: " + studentHashMap);

        // 4. Boolean containsKey(Object key): Kiểm tra trong map có tồn tại key hay k
        System.out.println("Kiểm tra trong hashMap có tồn tại key = 1: " + studentHashMap.containsKey(1));

        // 5. Set<Key> keySet(): Trả về 1 Set gồm các key trong Map
        Set<Integer> setKey = studentHashMap.keySet();
        System.out.println(setKey);

        // 6. Collections value(): Tra về 1 collections chứa các value trong map
        Collection<String> listValues = studentHashMap.values();
        System.out.println(listValues);

        // 7. Duyệt Map và in ra các thông tin
        for(Map.Entry<Integer, String> entry:studentHashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 8. Duyệt Map với keySet
        System.out.println("Duyệt Map với keySet");
        for(Integer key:studentHashMap.keySet()){
            System.out.println(key + " : " + studentHashMap.get(key));
        }

        // 9. Duyệt Map với values
        System.out.println("Duyệt Map với values");
        for (String value:studentHashMap.values()){
            System.out.println(value);
        }
    }
}
