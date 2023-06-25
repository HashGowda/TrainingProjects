public class String_Reverse {

        public static void main(String[] args) {
            String input = "Bala how are you?";
            String[] words = input.split(" ");

            StringBuilder output = new StringBuilder();
            output.append(words[0]).append(" ");
            for (int i=1;i< words.length;i++) {
                StringBuilder reversedWord = new StringBuilder(words[i]).reverse();
                output.append(reversedWord).append(" ");
            }

            String reversedString = output.toString().trim();
            System.out.println(reversedString);
        }
    }


