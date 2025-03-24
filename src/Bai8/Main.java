package Bai8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập 1 số");

        int number = Integer.parseInt(sc.nextLine());

        Map<Integer,String> romanNumbers = new HashMap<>();
        romanNumbers.put(1000, "M");
        romanNumbers.put(900,"CM");
        romanNumbers.put(500, "D");
        romanNumbers.put(400, "CD");
        romanNumbers.put(100, "C");
        romanNumbers.put(90,"XC");
        romanNumbers.put(50, "L");
        romanNumbers.put(40,"XL");
        romanNumbers.put(10, "X");
        romanNumbers.put(9,"IX");
        romanNumbers.put(5, "V");
        romanNumbers.put(4, "IV");
        romanNumbers.put(1, "I");

        StringBuilder result = new StringBuilder();
        List<Integer> keys = new ArrayList<>(romanNumbers.keySet());
        Collections.sort(keys, Collections.reverseOrder());

        for (Integer key : keys) {
            String romanNumber = romanNumbers.get(key);
            while(number >= key){
                result.append(romanNumber);
                number -= key;
            }
        }

        System.out.println(result);
    }
}
