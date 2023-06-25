package Inheritance;

class Add{
        void addition(int a, int b){
        int sum=a+b;
        System.out.println("Addition: "+sum);
        }
        }

class Subt extends Add{
    void subtraction(int a, int b){
        int sub=a-b;
        System.out.println("Subtraction: "+sub);
    }
}
class Mult extends Subt{
    void multiplication(int a, int b){
        int mul=a*b;
        System.out.println("Multiplication: "+mul);
    }
}
class Div extends Add{
    void division(int a, int b){
        int div=a/b;
        System.out.println("Division: "+div);
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Div d = new Div();
        d.division(20,10);
        d.addition(10,10);

        Mult m= new Mult();
        m.multiplication(20,10);
        m.subtraction(20,10);
        m.addition(10,10);
    }
}