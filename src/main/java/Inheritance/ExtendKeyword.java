package Inheritance;

class Base{
    public void M1(){
        System.out.println("Base class method");
    }
}

class Derived extends Base{
    public void M2(){
        System.out.println("Derived class method");
    }
}

public class ExtendKeyword {
    public static void main(String[] args) {
        Derived d =new Derived();
        d.M1();
        d.M2();
    }
}