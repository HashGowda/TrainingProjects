import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SentenceRearrange {
    public static void main(String[] args) {

                String inputStr = "is2 sentence4 This1 a3";
                String[] words = inputStr.split(" ");


                HashMap<Integer, String> wordMap = new HashMap<>();
                for (String word : words) {
                    for (int i = 0; i < word.length(); i++) {
                        if (Character.isDigit(word.charAt(i))) {
                            int num = Integer.parseInt(word.substring(i));
                            wordMap.put(num, word.substring(0, i));
                            break;
                        }
                    }
                }


                List<String> outputList = new ArrayList<>();
                for (int i = 1; i <= wordMap.size(); i++) {
                    outputList.add(i + " " + wordMap.get(i));
                }


                String outputStr = String.join(" ", outputList);
                System.out.println(outputStr);
            }
        }

