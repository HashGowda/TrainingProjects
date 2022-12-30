package Intro;

//Super keyword is used to refer immediate parent class instance variable

/*

class SuperKeyword {
    String color="White";
}

class Dog extends SuperKeyword {
    String color="Black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

class Test10{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.printColor();
    }
}

 */

//Super keyword is used to invoke parent class method

/*

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Eating bread");
    }
    void bark(){
        System.out.println("Barking");
    }
    void work(){
        super.eat();
        bark();
    }
}

class Sample{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.work();
    }
}

 */

/*

class collegeName{
    String collegeName="BMS";
    void displayCol(){
        System.out.println(collegeName);
    }
}

class student1 extends collegeName{
    String collegeName="SJCIT";
    void displayCol(){
        System.out.println(collegeName);
    }

    void displayName(){
        String name="Messi";
        System.out.println(name);
    }

    void displayAge(){
        int age=24;
        System.out.println(age);
        displayName();
        super.displayCol();  //to call method present in parent class
    }
}
class Sa {
    public static void main(String[] args) {
        student1 s=new student1();
        s.displayAge();
        s.displayCol();  //to call method in sub class
    }
}

 */

//Super keyword is used to invoke parent class constructor

/*

class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog is created");
    }
}

class Test12{
    public static void main(String[] args) {
        Dog d= new Dog();
    }
}

 */

class collname{
    collname(){
        String col="BMS";
        System.out.println(col);
    }
}

class student2 extends collname {
    student2() {
        super();
        String name = "Messi";
        System.out.println(name);
    }

    public static void main(String[] args) {
        student2 s = new student2();
    }
}