package Interface;

interface print{
    void prints();
}
interface shows extends print{
    void show();
}

class Test implements shows{
    public void prints(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Test t = new Test();
        t.prints();
        t.show();
    }
}
