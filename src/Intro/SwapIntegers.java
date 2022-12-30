package Intro;

public class SwapIntegers {
    public static void main(String[] args) {
        int x=20;
        int y=10;
        System.out.println("Before swap x= "+x);
        System.out.println("Before swap y= "+y);
        x=x+y; //x=10+20=30
        y=x-y; //y=30-10=20
        x=x-y;
        System.out.println("After swap x= "+x);
        System.out.println("After swap y= "+y);
    }
}
