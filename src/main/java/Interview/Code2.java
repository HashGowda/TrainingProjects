import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code2 {
    public static void main(String[] args) {


                String inputStr = "is2 sentence4 This1 a3";
                String[] words = inputStr.split(" ");


                Word[] wordArr = new Word[words.length];
                for (int i = 0; i < words.length; i++) {
                    int num = Integer.parseInt(words[i].replaceAll("[^\\d]", ""));
                    String word = words[i].replaceAll("[^\\p{L}\\p{Nd}]+", "");
                    wordArr[i] = new Word(num, word);
                }

                Arrays.sort(wordArr);


                List<String> outputList = new ArrayList<>();
                for (int i = 0; i < wordArr.length; i++) {
                    outputList.add((i+1) + " " + wordArr[i].word);
                }


                String outputStr = String.join(" ", outputList);
                System.out.println(outputStr);
            }
        }

        class Word implements Comparable<Word> {
            int num;
            String word;

            public Word(int num, String word) {
                this.num = num;
                this.word = word;
            }

            public int compareTo(Word other) {
                return Integer.compare(this.num, other.num);
            }
        }


