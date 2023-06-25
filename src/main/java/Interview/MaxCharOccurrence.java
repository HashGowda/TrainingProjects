package Interview;

import java.util.HashMap;
import java.util.Map;


public class MaxCharOccurrence {

        public static void main(String[] args) {
            String input = "harish";

            // Create a HashMap to store character frequencies
            Map<Character, Integer> frequencyMap = new HashMap<>();

            // Iterate over each character in the string
            for (char c : input.toCharArray()) {
                // Increment the count for the current character
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }

            // Find the maximum occurrence
            int maxOccurrence = 0;
            char maxCharacter = '\0';

            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                if (entry.getValue() > maxOccurrence) {
                    maxOccurrence = entry.getValue();
                    maxCharacter = entry.getKey();
                }
            }

            // Print the maximum occurrence and the character
            System.out.println("Maximum occurrence: " + maxOccurrence);
            System.out.println("Character: " + maxCharacter);
        }
    }

