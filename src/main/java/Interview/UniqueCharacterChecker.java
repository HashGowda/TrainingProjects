package Interview;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterChecker {

    public static boolean uniqueCharacter(String str){
        Set<Character> set = new HashSet<>();
        for (char c: str.toCharArray()){
            if (set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "abcdef";

        System.out.println("Input: "+input1);
        System.out.println("Unique characters: "+uniqueCharacter(input1));

        System.out.println("Input: "+input2);
        System.out.println("Unique characters: "+uniqueCharacter(input2));

    }
}
