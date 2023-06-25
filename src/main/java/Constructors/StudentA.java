package Constructors;

public class StudentA {

    //to invoke the current class method
    void add() {
        int a = 10;
        int b = 20;
        int addt = a+b;
        System.out.println(addt);
    }

    void mul(){
        int a=2;
        int b=4;
        int mult=a*b;
        System.out.println(mult);
        add();
    }

    public static void main(String[] args) {
        StudentA st = new StudentA();
        st.mul();
    }
}
