public class ReverseWordsAndPrintOTP {

    public static void main(String[] args) {
        String input = "This is interview";

        // Split the input string into words
        String[] words = input.split(" ");

        // Reverse the order of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        System.out.println(reversed.toString());


        //Reverse a words using for loop
        String in = "This is interview";

        String[] word = in.split(" ");
        String reversedStr = "";
        for (int i = word.length - 1; i >= 0; i--) {
            reversedStr += word[i];
            if (i != 0) {
                reversedStr += " ";
            }
        }
        System.out.println(reversedStr);


        //To print OTP

        String str = "Your OTP is 76746 Please don't share with anyone";

        StringBuilder otpBuilder = new StringBuilder();
        for (char c:str.toCharArray()){
            if (Character.isDigit(c)){
                otpBuilder.append(c);
            }
        }
        System.out.println("OTP: "+otpBuilder.toString());

        String OTP = "";
        for (char digit :str.toCharArray()){
            if (Character.isDigit(digit)){
                OTP+=digit;
            }
        }
        System.out.println("OTP: "+OTP);
    }

}
