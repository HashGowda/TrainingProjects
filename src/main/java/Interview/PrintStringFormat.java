package Interview;

import java.util.*;

public class PrintStringFormat {

    public static void main(String[] args) {

        String input = "Ind12ia45";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                output.append("my");
            } else {
                output.append(c);
            }
        }
        System.out.println(output.toString());


        //Convert HashMap to Array

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("orange", 2);

        String[] keysArray = map.keySet().toArray(new String[0]);
        Integer[] valuesArray = map.values().toArray(new Integer[0]);

        System.out.println("Keys array: " + Arrays.toString(keysArray));
        System.out.println("Values array: " + Arrays.toString(valuesArray));
    }
}





