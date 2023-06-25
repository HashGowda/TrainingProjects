package PracticeTests;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("one",1);
        ht.put("two",2);
        ht.put("three",3);

        //accessing the value associated with the key "two"
        System.out.println("Value associated with key 'two': "+ht.get("two"));

        // Removing the key-value pair associated with the key "three"
        ht.remove("three");

        //printing the hashtable
        System.out.println("HashTable: "+ht);
    }
}
