package PublicAccessMod;

public class Animal{
    public int legs;

    public void display(){
        System.out.println("I am an animal");
        System.out.println("I have "+legs+" legs");
    }
}

class Main{
    public static void main(String[] args) {
        Animal a= new Animal();
        a.legs=4;
        a.display();
    }
}
