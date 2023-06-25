package PracticeTests;

public class ReverseWords {
    public static void main(String[] args) {
        String in ="This is a string, which needs to be reverse the order of the words";
        String words[]=in.split(" ");
        StringBuilder out = new StringBuilder();
        for (int i=words.length-1;i>=0;i--){
            out.append(words[i]);
            out.append(" ");
        }
        System.out.println("Reversed string:"+out.toString().trim());
    }
}
