import java.util.HashMap;
import java.util.Map;

public class Ex {
    public static void main(String[] args) {

        String in ="hello, world!";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = in.length() - 1; i >= 0; i--) {
            if (map.containsKey(in.charAt(i))) {
                int count = map.get(in.charAt(i));
                map.put(in.charAt(i), ++count);
            } else {
                map.put(in.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
