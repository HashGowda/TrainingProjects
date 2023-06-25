package PracticeTests;

public class ReverseCharacters {
    public static void main(String[] args) {
        String in = "This is a string which needs to reversed";
        StringBuilder out = new StringBuilder();
        for (int i=in.length()-1;i>=0;i--){
            out.append(in.charAt(i));
        }
        System.out.println("Reversed string:"+out.toString());
    }
}
