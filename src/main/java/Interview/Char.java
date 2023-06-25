import java.util.HashMap;

public class Char {
        public static void main(String[] args) {

            String in = "Helllooowwworlddd";
            HashMap<Character, Integer> hMap = new HashMap<>();
            for(int i=in.length()-1; i>=0; i--){
                if(hMap.containsKey(in.charAt(i))){
                    int count = hMap.get(in.charAt(i));
                    hMap.put(in.charAt(i), ++count);
                } else{
                    hMap.put(in.charAt(i),1);
                }
            }
            System.out.println(hMap);

        }
    }

