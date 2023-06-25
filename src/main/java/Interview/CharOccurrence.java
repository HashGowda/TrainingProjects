package Interview;

import java.util.HashMap;

public class CharOccurrence {
    public static void main(String[] args) {
        String in = "heeelllloowwwoorrlld";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=in.length()-1;i>=0;i--){
            if (map.containsKey(in.charAt(i))){
                int count = map.get(in.charAt(i));
                map.put(in.charAt(i),++count);
            }
            else {
                map.put(in.charAt(i),1);
            }
        }
        System.out.println(map);
    }
}


