import java.util.HashMap;
import java.util.Map;

public class CountChar {

    public static void main(String[] args) {
        String sentence = "This is the string";
        sentence = sentence.toLowerCase();
        sentence = sentence.toUpperCase();
        char[] word = sentence.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : word){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println();

        String inputString = "thisisthestring";

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else{
                charCountMap.put(c, 1);
            }
        }

        System.out.println("Duplicate characters in the string: ");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }

        System.out.println();

        String str = "geeksforgeeks";

        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch:str.toCharArray()){
            if (charCount.containsKey(ch)){
                charCount.put(ch, charCount.get(ch)+1);
            } else {
                charCount.put(ch, 1);
            }
        }
        System.out.println("Character occurrence in the string:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }
}
