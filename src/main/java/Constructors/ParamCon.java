package Constructors;

class ParamCon {

    int id;
    String name;

    ParamCon(int i, String n){
        id=i;
        name=n;
    }
    void display() {
        System.out.println("Parameterized constructor is called");
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        ParamCon par = new ParamCon(12,"Benz");
        par.display();
    }
}
