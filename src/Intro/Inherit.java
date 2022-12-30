package Intro;

//Single inheritance

/*

class Inherit{
    float salary=20000;
}

class Programmer extends Inherit{
    int bonus=10000;

    public static void main(String[] args) {
        Programmer p=new Programmer();
        System.out.println("Salary = "+p.salary);
        System.out.println("Programmer = "+p.bonus);
    }
}

*/

/*

 class Inherit {
    void addition(int a, int b) {
        int res = a + b;
        System.out.println(res);
    }
}

    class sub extends Inherit{
        void subtraction(int a, int b){
            int diff=a-b;
            System.out.println(diff);
        }
    }

  class TestSample{
        public static void main(String[] args) {
            sub s=new sub();
            s.subtraction(20,10);
            s.addition(5,7);
        }
}

 */

//Multilevel Inheritance

/*

class Inherit{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Inherit{
    void bark(){
        System.out.println("barking...");
    }
}

class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping...");
    }
}

class Test1{
    public static void main(String[] args) {
        BabyDog d=new BabyDog();
        d.weep();
        d.eat();
        d.bark();
    }
}

 */

/*

class MathAdd{
    void add(int a, int b){
        int add=a+b;
        System.out.println("Addition = "+add);
    }
}

class MathSub extends MathAdd{
    void sub(int a, int b){
        int diff =a-b;
        System.out.println("Subtraction = "+diff);
    }
}

class MathMul extends MathSub{
    void mul(int a, int b){
        int mul=a*b;
        System.out.println("Multiplication = "+mul);
    }
}

class Test1{
    public static void main(String[] args) {
        MathMul m=new MathMul();
        m.add(12, 6);
        m.sub(45,5);
        m.mul(5,5);
    }
}

 */


//Multiple inheritance

/*
class Inherit{
    void msg(){
        System.out.println("Message");
    }
}

interface Branch{

    //interface abstract methods cannot have body

}

class Dept extends Inherit implements Branch{
    void dis(){
        System.out.println("Department");
    }
}

class Test1{
    public static void main(String[] args) {
        Dept d=new Dept();
        d.dis();
        d.msg();
    }
}

 */


//Hierarchical Inheritance

/*

class Inherit{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Inherit{
    void bark(){
        System.out.println("barking...");
    }
}

class Babydog extends Inherit{
    void weep(){
        System.out.println("weeping...");
    }
}

class Test1{
    public static void main(String[] args) {
        Babydog d= new Babydog();
        d.weep();
        d.eat();
    }
}

 */

/*
class MathAdd{
    void add(int a, int b){
        int res=a+b;
        System.out.println("Addition = "+res);
    }
}

class MathSub extends MathAdd{
    void sub(int a, int b){
        int diff=a-b;
        System.out.println("Subtraction = "+diff);
    }
}

class MathMul extends MathAdd{
    void mult(int a, int b){
        int mul=a*b;
        System.out.println("Multiplication = "+mul);
    }
}

class Test1{
    public static void main(String[] args) {
        MathMul m = new MathMul();
        m.add(10,20);
        m.mult(5, 10);

        MathSub n=new MathSub();
        n.sub(50, 20);
        m.add(45,5);
    }
}

 */

//Hybrid Inheritance

class MathAdd{
    void add(int a, int b){
        int add=a+b;
        System.out.println("Addition = "+add);
    }
}

class MathSub extends MathAdd{
    void sub(int a, int b){
        int diff=a-b;
        System.out.println("Subtraction = "+diff);
    }
}

class MathMul extends MathSub{
    void mult(int a, int b){
        int mul=a*b;
        System.out.println("Multiplication = "+mul);
    }
}

class MathDiv extends MathAdd{
    void divi(int a, int b){
        int div=a/b;
        System.out.println("Division = "+div);
    }
}

class Test1{
    public static void main(String[] args) {
        MathDiv m= new MathDiv();
        m.divi(10,2);
        m.add(45,5);

        MathMul n=new MathMul();
        n.sub(45,5);
        n.add(12,8);
        n.mult(5,8);
    }
}