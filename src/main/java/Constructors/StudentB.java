package Constructors;

public class StudentB {

    //to invoke the current class constructor
    //calling parameterized constructor from default constructor

    StudentB(){
        this("Mysuru");
        int age=21;
        String name="Stokes";
        System.out.println(age+" "+name);
    }
    StudentB(String city){
        System.out.println("City:"+city);
    }

    public static void main(String[] args) {
        StudentB sb = new StudentB();
    }
}
