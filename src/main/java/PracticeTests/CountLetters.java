package PracticeTests;

public class CountLetters {
    public static void main(String[] args) {
        String input = "i am harish";
        String[] substrings = input.split("\\W+");
        int count=0;
        for (String word:substrings) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c == 'h' || c == 'a' || c == 'r' || c == 'i' || c == 's') {
                    count++;
                }
            }
        }
        System.out.println("Number of letters in 'harish' = " + count);

    }
}
