package PracticeTests;

import org.bouncycastle.crypto.agreement.srp.SRP6Client;

    //super keyword can be used to refer immediate parent class instance variables
//    class coll{
//        String city="Mysore";
//    }
//    class student extends coll{
//        String city="Bengaluru";
//
//        void display(){
//            System.out.println("City from sub class: "+city);
//            System.out.println("City from super class: "+super.city);
//        }
//    }
//
//
//public class SuperKeyword {
//        public static void main(String[] args) {
//            student obj = new student();
//            obj.display();
//        }
//    }


class superKeyword{
    int n=120;
    public void display(){
        System.out.println("Superclass method");
    }
}

class subClass extends superKeyword{
    int n=100;
    public void display(){
        System.out.println("Subclass method");
    }
    public void myMethod(){
        subClass sub = new subClass();
        sub.display();
        super.display();
        System.out.println("Subclass: "+sub.n);
        System.out.println("Superclass: "+super.n);
    }

    public static void main(String[] args) {
        subClass ob = new subClass();
        ob.myMethod();
    }
}
