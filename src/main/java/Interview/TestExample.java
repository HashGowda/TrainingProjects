public class TestExample {

    public static String removeVowels(String sentence) {
        return sentence.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        String sentence = "Selenium Automation Tester";
        String result = removeVowels(sentence);
        System.out.println(result);
    }
}
