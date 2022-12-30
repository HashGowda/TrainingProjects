package String;

public class SubString {
    public static void main(String[] args) {
        String s="JavaProgramming";
        System.out.println("Original string is "+s);
        System.out.println("substring starting from index 4: "+s.substring(4));
        System.out.println("substring starting from 0 to 4 :"+s.substring(0,4));
        System.out.println(s.substring(7,11));

        String n="JavaSeleniumAppiumManual";
        String se=n.substring(4,12);
        System.out.println(se);
        System.out.println(s.substring(12,18));
        System.out.println(s.substring(18));
    }
}
