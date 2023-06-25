package Interview;

import java.util.HashMap;
import java.util.Map;

public class DigitCount {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 3, 5};

        Map<Integer, Integer> map = new HashMap<>();

        //for counting individual digits
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        //printing the digit count
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

