package PracticeTests;

public class SwapStrings {
    public static void main(String[] args) {
        String a="Java";
        String b="Python";
        System.out.println("Before swap: a="+a+", b="+b);
        a=a+b;

        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("After swap: a="+a+", b="+b);
    }
}
