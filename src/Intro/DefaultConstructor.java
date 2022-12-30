package Intro;

/*
public class DefaultConstructor {
    DefaultConstructor(){
        System.out.println("Constructor is created");
    }
    public static void main(String[] args) {
        DefaultConstructor d= new DefaultConstructor();
    }
}

 */

/*
public class DefaultConstructor{
    int id;
    String name;

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        DefaultConstructor d1= new DefaultConstructor();
        DefaultConstructor d2=new DefaultConstructor();
        d1.display();
        d2.display();
    }
}

 */


/*
public class DefaultConstructor {
    int id;
    String name;

    DefaultConstructor(int i, String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        DefaultConstructor d1=new DefaultConstructor(12,"Batter");
        DefaultConstructor d2=new DefaultConstructor(32,"Bowler");
        d1.display();
        d2.display();
    }
}

 */

public class DefaultConstructor {

    DefaultConstructor(){
        String name="Kohli";
        String city="Delhi";
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
    }

    DefaultConstructor(String name, String city, int age){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("Age: "+age);
    }

    DefaultConstructor(String Format){
        System.out.println("Format: "+Format);
    }

    void dispaly(){
        int age=22;
        System.out.println("Age: "+age);
    }

    void addition(int a, int b){
        int sum=a+b;
        System.out.println("Sum= "+sum);
    }

    void login(String username, String password){
        System.out.println("Login credentials: "+username+","+" "+password);
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        DefaultConstructor d1=new DefaultConstructor();
        DefaultConstructor d2=new DefaultConstructor("Kohli", "Delhi", 33);
        DefaultConstructor d3=new DefaultConstructor("ODI");
        d1.dispaly();
        d1.addition(22, 55);
        d1.login("Virat Kohli", "IamVirat");
    }
}
