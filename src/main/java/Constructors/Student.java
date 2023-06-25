package Constructors;

public class Student {
    int age;
    String name, city, college;

    Student(String name, int age, String city, String coll){
        this.age=age;
        this.city=city;
        this.name=name;
        college=coll;
        System.out.println("Age: "+this.age);
        System.out.println("College name: "+college);
    }
    void display(){
        System.out.println("Name: "+name+", city: "+city);
    }

    public static void main(String[] args) {
        Student st = new Student("VK", 34, "Delhi","SJCIT");
        st.display();
        Student s = new Student("LM",35,"AG","SJBIT");
        s.display();

    }
}
