package Intro;

//Constructor Overloading

/*
public class ConstOver {

        int id;
        String name;
        int age;

    ConstOver(int i, String n){
        id=i;
        name=n;
    }

    ConstOver(int i, String n, int a){
        id=i;
        name=n;
        age=a;
    }

    void display(){
        System.out.println(id+" " + name+" " +age+" ");
    }

    public static void main(String[] args) {
        ConstOver c1=new ConstOver(12, "Kohli", 18);
        ConstOver c2=new ConstOver(71, "Virat", 33);
        c1.display();
        c2.display();
    }
}

 */

/*
public class ConstOver {
    ConstOver(int age, String name){
        System.out.println(age+""+name+"");
    }

    ConstOver(String city, int pincode){
        System.out.println(city+""+pincode+"");
    }

    ConstOver(int id){
        System.out.println(id+"");
    }

    public static void main(String[] args) {
        ConstOver c1=new ConstOver(12,"");
        ConstOver c2=new ConstOver("",22);
        ConstOver c3=new ConstOver(32);
    }
}

 */

//Copy Constructor

/*
public class ConstOver {
    int id;
    String name;

    ConstOver(int i, String n){
        id=i;
        name=n;
    }

    ConstOver(ConstOver c){
        id=c.id;
        name=c.name;
    }

    void display(){
        System.out.println(id+""+","+name+"");
    }

    public static void main(String[] args) {
        ConstOver c1=new ConstOver(122, "Kohli");
        ConstOver c2=new ConstOver(c1);
        c1.display();
        c2.display();
    }
}

 */

//Copying values without constructor

/*
public class ConstOver {
    int id;
    String name;

    ConstOver(int i, String n){
        id=i;
        name=n;
    }

    ConstOver(){}

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        ConstOver c1=new ConstOver(122,"Kohli");
        ConstOver c2=new ConstOver();
        c2.id= c1.id;
        c2.name= c1.name;
        c1.display();
        c2.display();
    }
}

 */

//Static variable in Constructor

/*
public class ConstOver {
    int roll;
    String name;
    static String college="Football";

    ConstOver(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name + " " + college +" ");}
    }

    class Main{
        public static void main(String[] args) {
            ConstOver c1=new ConstOver(7,"Ronaldo");
            ConstOver c2=new ConstOver(10,"Messi");
            c1.display();
            c2.display();
        }
    }

 */

//without this keyword

/*
public class ConstOver {
    int id;
    String name;
    float fee;

    ConstOver(int id, String name, float fee){
        id=id;
        name=name;
        fee=fee;
    }
    void display(){
        System.out.println(id+" "+name+" "+fee+" ");}
    }

    class Test1{
        public static void main(String[] args) {
            ConstOver c1=new ConstOver(12, "Merry", 12000f);
            ConstOver c2=new ConstOver(45, "Henry", 41020f);
            c1.display();
            c2.display();
        }
    }

 */

//with this keyword

/*
public class ConstOver {
    int roll;
    String name;
    float fee;

    ConstOver(int roll, String name, float fee){
        this.roll=roll;
        this.name=name;
        this.fee=fee;
    }

    void display(){
        System.out.println(roll+" "+name+" "+fee+" ");}
    }
    class Test1{
        public static void main(String[] args) {
            ConstOver c1=new ConstOver(122,"Jack",12768f);
            ConstOver c2=new ConstOver(132,"Rome",12345f);
            c1.display();
            c2.display();
        }
}

 */

//Program where this keyword is not required

/*
public class ConstOver {
    int roll;
    String name;
    float fee;

    ConstOver(int r, String n, float f){
        roll=r;
        name=n;
        fee=f;
    }

    void display(){
        System.out.println(roll+" "+name+" "+fee+" ");}
    }

    class Test1{
        public static void main(String[] args) {
            ConstOver c1=new ConstOver(122, "Messi", 12567f);
            ConstOver c2=new ConstOver(142,"Ronaldo",16782f);
            c1.display();
            c2.display();
        }
}

 */

//To invoke current class method

/*
public class ConstOver {
    void m(){
        System.out.println("Hello m");
    }
    void n(){
        System.out.println("Hello n");
        this.m();}
    }

    class Test2{
        public static void main(String[] args) {
            ConstOver c=new ConstOver();
            c.n();
        }
}

 */

//To invoke the current class constructor


public class ConstOver {
    ConstOver(){
        System.out.println("Hello");
    }
    ConstOver(int x){
        this();
        System.out.println(x);
    }


//class Test3{
    public static void main(String[] args) {
        ConstOver c=new ConstOver(10);
    }
}



//Calling parameterized constructor from default constructor

/*
public class ConstOver {
    ConstOver(){
        this(4);
        System.out.println("Hello");
    }
    ConstOver(int x){
        System.out.println(x);}
    }

    class Test1{
        public static void main(String[] args) {
            ConstOver c=new ConstOver();
        }
}

 */

//Real usage of this constructor

/*
public class ConstOver {
        int rollno;
        String name, course;
        float fee;
        ConstOver(int rollno, String name, String course){
            this.rollno=rollno;
            this.name=name;
            this.course=course;
        }
        ConstOver(int rollno, String name, String course,float fee){
            this(rollno, name, course);
            this.fee=fee;
        }
        void display(){
            System.out.println(rollno+" "+name+" "+course+" "+fee+" ");}
        }

        class Test4{
            public static void main(String[] args) {
                ConstOver c1=new ConstOver(122,"Google","Mech", 1256f);
                ConstOver c2=new ConstOver(134,"Chrome","Comp",45786f);
                c1.display();
                c2.display();
            }
}

 */

//MethodEX

/*
public class ConstOver {
    public void add(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("Sum = "+sum);
    }

    public int addition(){
        int a=20;
        int b=30;
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        ConstOver c=new ConstOver();
        c.add();
        int result=c.addition();
        System.out.println("result = "+result);
        System.out.println(c.addition());
    }
}

 */


