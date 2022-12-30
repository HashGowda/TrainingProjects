package Intro;

//Method Overloading

/*
public class MethodOverloading {
    public void add() {
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);
    }
     public void add(int a, int b){
         int result=a+b;
         System.out.println(result);
    }

    public int add(int a){
        int b=200;
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.add();
        m.add(25,45);
        m.add(60);
        System.out.println(m.add(85));
    }
}

 */

//Changing the no. of arguments

/*

class MethodOverloading {
        static int add(int a, int b){
            return a+b;
        }

        static int add(int a, int b, int c){
            return a+b+c;
        }
    }

    class Test1{
        public static void main(String[] args) {
            System.out.println(MethodOverloading.add(10,20));
            System.out.println(MethodOverloading.add(5,45,60));
        }
    }

 */

/*

public class MethodOverloading {
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        System.out.println(m.add(12,22));
        System.out.println(m.add(10,20, 30));
    }
}

 */

//Changing the data type of arguments

/*

class Adder{
    static int add(int a, int b){
        return a+b;
    }

    static double add(double a, double b){
        return a+b;
    }

    static float add(float a, float b){
        return a+b;
    }
}

class Test2{
    public static void main(String[] args) {
        System.out.println(Adder.add(10,20));
        System.out.println(Adder.add(12.2, 7.8));
        System.out.println(Adder.add(22.2f, 7.8f));
    }
}

 */

public class MethodOverloading {
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    float add(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        System.out.println(m.add(12,8));
        System.out.println(m.add(12.2,7.8));
        System.out.println(m.add(4.4f, 5.6f));
    }
}




