package Intro;

//Final variable - If you make any variable as final, you cannot change
// the value of final variable(It will be constant).

/*

class Final {
    final int speed=400; //Final variable
    void run(){
        speed=200;
    }

    public static void main(String[] args) {
        Final f= new Final();
        f.run();
    }
}

 */

//Final method - If you make any method as final, you cannot override it.

/*

class Bike1{
    final void run1(){
        System.out.println("running");
    }
}

class Honda1 extends Bike1 {
    void run1() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        Honda1 h = new Honda1();
        h.run1();
    }
}

 */

//Final class - If you make any class as final, you cannot extend it.

/*

final class Bike2{}
    class Honda2 extends Bike2{
        void run(){
            System.out.println("running");
        }

        public static void main(String[] args) {
            Honda2 h=new Honda2();
            h.run();
        }
    }

 */

//Final method can be inherited but you cannot override it

/*

class Bike3{
    final void run(){
        System.out.println("running");
    }
}
class Honda3 extends Bike3{
    public static void main(String[] args) {
        new Honda3().run();
    }
}

 */

class College{
    final int age=12;
    void add(){
        int a=10;
        int b=10;
        System.out.println((a+b));
    }
}
class campus2 extends College{

    void add(){
        final String name="Messi";
        int a=20;
        int b=20;
        System.out.println((a+b));
        System.out.println(name);
    }
}
class Student {

    public static void main(String[] args) {
        campus2 obj = new campus2();
        obj.add();
        System.out.println();
    }
}

//final variable cannot be change
//final method cannot be overridden
//final class cannot be inherited
