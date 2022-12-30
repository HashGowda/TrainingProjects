package Intro;

public class StaticComponents {
    int age=21;
    static String name="Java";

    static void displayName(){
        name="Python";
        System.out.println(name);
    }

    void displayAge(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        StaticComponents s=new StaticComponents();
        s.displayAge();
        displayName();
        //StaticComponents.displayName();    //To access static method
        System.out.println("Name is from main "+name);
    }
    static {
       // StaticComponents.displayName();
        String city="Mysore";
        System.out.println(city);
        System.out.println("Name is from static "+name);
    }
}
