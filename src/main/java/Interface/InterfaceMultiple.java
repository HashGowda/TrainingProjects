package Interface;

interface Printable{
    void printable();
}
interface Showable{
    void show();
}
class A implements Printable, Showable{
    public void printable(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }
}
public class InterfaceMultiple {
    public static void main(String[] args) {
        A a = new A();
        a.printable();
        a.show();
    }
}
