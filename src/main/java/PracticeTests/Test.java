package PracticeTests;

import java.sql.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class Test {
    //    Sort the Array list and size
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("dog");
        list1.add("ball");
        list1.add("apple");
        list1.add("cat");

        System.out.println("Before sort: " + list1);
        Collections.sort(list1);
        System.out.println("After sort: " + list1);
        for (String s : list1) {
            System.out.println(s);
        }
        System.out.println("Size of the list1: " + list1.size());
        System.out.println("***************");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(0);
        list2.add(2);
        list2.add(0);
        list2.add(3);
        list2.add(0);

        System.out.println("Before sort: " + list2);
        Collections.sort(list2);
        System.out.println("After sort: " + list2);

        for (int s : list2) {
            System.out.println(s);
        }
        System.out.println("Size of the list2: " + list2.size());
    }
}

