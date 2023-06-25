package Interview;

import java.util.Arrays;

public class Interview1 {

    public static void main(String[] args) {
        String in = "12345";
        char[]out = in.toCharArray();

        Arrays.sort(out);

        String output = new String(out);

        System.out.println("Input = "+in);
        System.out.println("Output = "+output);


                int number = 12345;
                String numberString = Integer.toString(number);
                StringBuilder sortedNumberString = new StringBuilder();

                char[] digits = numberString.toCharArray();
                Arrays.sort(digits);

                for (char digit : digits) {
                    sortedNumberString.append(digit);
                }

                int sortedNumber = Integer.parseInt(sortedNumberString.toString());
                System.out.println(sortedNumber);
            }
        }



