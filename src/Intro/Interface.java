package Intro;

/*

interface printable{
    void print();
}

class A implements printable{
    public void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A a=new A();
        a.print();
    }
}

 */

/*

interface Shape{
    void draw();
}

class Rect implements Shape{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing circle");
    }

    public static void main(String[] args) {
        Shape s=new Circle();
        s.draw();
    }
}

 */

/*

interface Bank{
    float RateOfInterest();
}

class SBI implements Bank{
    public float RateOfInterest(){
        return 8f;
    }
}

class PNB implements Bank{
    public float RateOfInterest(){
        return 7f;
    }

    public static void main(String[] args) {
        Bank b=new PNB();
        Bank b1=new SBI();
        System.out.println("ROI is "+b.RateOfInterest()+"%");
        System.out.println("ROI is "+b1.RateOfInterest()+"%");
    }
}

 */

//Multiple inheritance in Java by Interface

/*

interface printable{
    void print();
}

interface showable{
    void show();
}

class A implements printable, showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }


    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.show();
    }
}

 */

/*

interface add{
    void add();
}

interface sub{
    void sub();
}

interface mult extends add, sub{
    void mult();
    }

    class Addition implements mult{
    public void add(){
        System.out.println("Addition");
    }
    public void sub(){
        System.out.println("Subtraction");
    }
    public void mult(){
        System.out.println("Multiplication");
    }

        public static void main(String[] args) {
        Addition a=new Addition();
        a.add();
        a.sub();
        a.mult();

        mult m=new Addition();
        m.mult();
        m.sub();
        m.add();
        }
    }

 */

interface student{
    void displayName(String name);
}

interface library{
    void displayNoOfBooks(int books);
}

class campus implements student,library {
    public void displayName(String name) {
        System.out.println("Name is " + name);
    }

    public void displayNoOfBooks(int books) {
        System.out.println("No of books are " + books);
    }

    public static void main(String[] args) {
        campus c = new campus();
        c.displayName("Neymer");
        c.displayNoOfBooks(15);
    }
}

/*

interface campus{
    void displayName(String name);
    abstract void displayCity(String city);
    }

    class department implements campus{
    public void displayName(String name){
        System.out.println("Name is "+name);
    }

    public void displayCity(String city){
        System.out.println("City is "+city);
    }

    void displayBranch(String branch){
        System.out.println("Branch is "+branch);
    }
        public static void main(String[] args) {
            department d=new department();
            d.displayName("Ronaldo");
            d.displayCity("Europe");
            d.displayBranch("Football");

            campus c=new department();
            c.displayName("Messi");
            c.displayCity("Argentina");
        }
    }

 */


/*

interface printable{
    void print();
}

interface showable extends printable{
    void show();
}

class A implements showable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        A a=new A();
        a.show();
        a.print();
    }
}

 */

//Default method in Interface

/*

interface Drawable{
    void draw();
    default void msg(){
        System.out.println("default method");
    }
}

class Rect implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }

    public static void main(String[] args) {
        Rect r=new Rect();
        r.draw();
        r.msg();
    }
}

 */

//Static method in Interface

/*

interface Drawable{
    void draw();
    static int cube(int x){
        return(x*x*x);
    }
}

class Rect implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }

    public static void main(String[] args) {
        Rect r=new Rect();
        r.draw();
        System.out.println(Drawable.cube(4));
    }
}

 */
