package Inheritance;

class HCInheritance {
    void addition(int a, int b){
        int sum=a+b;
        System.out.println("Addition: "+sum);
    }
}
class Subtractn extends HCInheritance{
    void subtraction(int a, int b){
        int sub=a-b;
        System.out.println("Subtraction: "+sub);
    }
}
class Mul extends Subtractn{
    void mul(int a, int b){
        int multi=a*b;
        System.out.println("Multiplication: "+multi);
    }
}
class hierarchicalInheritance{
    public static void main(String[] args) {
        Mul m = new Mul();
        m.mul(10,20);
        m.subtraction(30,10);

        Mul n =new Mul();
        n.addition(10,10);
        n.subtraction(30,20);
    }
}

