package Constructors;

public class ConOverLoad {
    int id, age; String name;

    ConOverLoad(int i, String n){
        id=i;
        name=n;
    }
    ConOverLoad(int a, int i, String n){
        age=a;
        id=i;
        name=n;
    }

    void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        ConOverLoad con = new ConOverLoad(34,10,"LM");
        ConOverLoad cn = new ConOverLoad(07, "CR");
        con.display();
        cn.display();
    }
}
