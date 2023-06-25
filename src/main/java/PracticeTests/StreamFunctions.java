package PracticeTests;

import java.util.Arrays;
import java.util.List;

public class StreamFunctions {
    public static void main(String[] args) {

        //To print the numbers starting with 1 using stream function

        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList.stream()
                .map(s->s+"")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);

    }
}
