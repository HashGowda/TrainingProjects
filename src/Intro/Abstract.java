package Intro;

//Abstract class

/*
    abstract class Bike{
        abstract void run();
    }

    class Honda extends Bike{
        void run(){
            System.out.println("running safely");
        }

        public static void main(String[] args) {
            Bike b= new Honda();
            b.run();
        }
    }

 */

/*
abstract class campus {
    abstract void displayCollegeName(String name);
    abstract void displayCityName(String city);

    void staff() {
        int teachingStaff = 5;
        int nonteachingStaff = 25;
        int total = teachingStaff + nonteachingStaff;
        System.out.println("Total staff is " + total);
    }
}
class department extends campus{
        void displayBranch(){
            String branch="Mechanical";
            System.out.println("Branch is "+branch);
        }
        void displayCollegeName(String name){
            System.out.println("College name is "+name);
        }


    void displayCityName(String city){
            System.out.println("City is "+city);
        }
    }
class College{
    public static void main(String[] args) {
        department d= new department();
        d.displayBranch();
        d.displayCityName("CKBP");
        d.displayCollegeName("SJCIT");

        campus c=new department();
        c.displayCityName("Bengaluru");
        c.staff();
        c.displayCollegeName("SJBIT");
        }
    }

 */

/*

abstract class Shape{
    abstract void draw();
}

class Rect extends Shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}

class Test{
    public static void main(String[] args) {
        Shape s= new Circle();
        s.draw();
    }
}

 */

/*

abstract class Bank{
    abstract int getRateOfInterest();
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}

class PNB extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}

class Test2{
    public static void main(String[] args) {
        Bank b;
        b=new PNB();
        System.out.println("ROI is "+b.getRateOfInterest()+"%");

        b=new SBI();
        System.out.println("ROI is "+b.getRateOfInterest()+"%");
    }
}

 */

//Example of an abstract class that has Abstract and non-abstract methods



abstract class Bike{
    Bike(){
        System.out.println("Bike is created");
    }
    abstract void run();
        void ChangeGear(){
        System.out.println("Gear changed");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("Running safely");
    }
}

class Test{
    public static void main(String[] args) {
        Bike b=new Honda();
        b.run();
        b.ChangeGear();
    }
}




