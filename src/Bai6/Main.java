package Bai6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> studentScores = new LinkedHashMap<>();

        studentScores.put("Nguyễn Văn A", 8.2);
        studentScores.put("Trần Thị B", 9.0);
        studentScores.put("Lê Văn C", 4.2);
        studentScores.put("Hoàng Thị D", 9.5);
        studentScores.put("Phạm Văn E", 8.8);
        studentScores.put("Đặng Thị F", 7.6);
        studentScores.put("Vũ Văn G", 8.1);
        studentScores.put("Bùi Thị H", 4.5);
        studentScores.put("Đỗ Văn I", 2.2);
        studentScores.put("Lý Thị K", 5.6);

        System.out.println("Danh sách sinh viên");
        for(String value : studentScores.keySet()){
            System.out.println(value + " : " + studentScores.get(value));
        }

        double sum = 0;

        for(String value : studentScores.keySet()){
            sum += studentScores.get(value);
        }

        double average = sum / studentScores.size();
        System.out.printf("Điểm trung bình của 10 sinh viên là: %.2f\n", average);

        Iterator<Map.Entry<String, Double>> iterator = studentScores.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Double> entry = iterator.next();
            if(entry.getValue() < 5){
                iterator.remove();
            }
        }

        System.out.println("Danh sách sinh viên sau khi xóa");
        for(String value : studentScores.keySet()){
            System.out.println(value + " : " + studentScores.get(value));
        }
    }
}
