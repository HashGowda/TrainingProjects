public class ReversedString {

        public static void main(String[] args) {

            String input = "Bala how are you?";

            String output = reverseString(input);

            System.out.println(output);

        }

        private static String reverseString(String input) {

            String[] words = input.split(" ");

            String reversedString = "";

            for (int i = words.length - 1; i >= 0; i--) {

                reversedString += words[i] + " ";

            }

            return reversedString.trim();

        }

    }
