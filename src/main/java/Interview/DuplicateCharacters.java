package Interview;

import java.util.HashSet;

public class DuplicateCharacters {

        public static void main(String[] args) {
            String str = "harish";
            HashSet<Character> uniqueChars = new HashSet<>();
            HashSet<Character> duplicateChars = new HashSet<>();

            for (char c:str.toCharArray()){
                if (!uniqueChars.add(c)){
                    duplicateChars.add(c);
                }
            }
            System.out.println("Duplicate Characters in the string: "+duplicateChars);
            System.out.println("Unique Characters in the string: "+uniqueChars);
        }


    }


