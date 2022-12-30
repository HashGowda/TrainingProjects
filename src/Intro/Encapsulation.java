package Intro;

/*

public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setName("Messi");
        e.setAge(12);
        System.out.println("Name is "+e.getName());
        System.out.println("Age is "+e.getAge());
    }
}

 */

public class Encapsulation {
    private float number;
    private String name;
    private String email;
    private int amount;

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

class Simple {
    public static void main(String[] args) {
        Encapsulation n = new Encapsulation();
        n.setNumber(24685971356f);
        n.setName("Messi");
        n.setEmail("messi@gmail.com");
        n.setAmount(245676);
        System.out.println("Number is "+n.getNumber());
        System.out.println("Name is "+n.getName());
        System.out.println("Email is "+n.getEmail());
        System.out.println("The amount is "+n.getNumber());
    }
}



