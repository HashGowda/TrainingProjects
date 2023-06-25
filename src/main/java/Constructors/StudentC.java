package Constructors;

public class StudentC {

    //to invoke the current class constructor
    //calling default constructor from parameterized constructor

    StudentC(){
        int age=21;
        String name="Root";
        System.out.println(age+" "+name);
    }
    StudentC(String city){
        this();
        System.out.println("City:"+city);
    }

    public static void main(String[] args) {
        StudentC sc = new StudentC("Mysuru");
    }
}
