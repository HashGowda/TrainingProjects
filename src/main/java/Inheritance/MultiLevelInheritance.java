package Inheritance;

public class MultiLevelInheritance {
    void addition(int a, int b){
        int sum=a+b;
        System.out.println("Addition: "+sum);
    }
}

class Subtraction extends MultiLevelInheritance{
    void subtraction(int a, int b){
        int sub=a-b;
        System.out.println("Subtraction: "+sub);
    }
}

class Multiplication extends Subtraction{
    void multiplication(int a, int b){
        int mul=a*b;
        System.out.println("Multiplication: "+mul);
    }
}

class Multilevel{
    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        m.multiplication(20,10);
        m.subtraction(20,10);
        m.addition(10,10);
    }
}