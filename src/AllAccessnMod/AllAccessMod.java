package AllAccessnMod;

class Depart{
    void display(){
        Branch b=new Branch();
        b.sub();
        b.display();
        b.show();
    }
}

class Branch{
    private String name="Messi";

    public static void main(String[] args) {
        Branch b=new Branch();
        b.add();
        b.sub();
        b.display();
        b.show();
    }

    private void add(){
        System.out.println("Private method "+name);
    }

    void sub(){
        System.out.println("Default method "+name);
    }

    protected void display(){
        System.out.println("Protected method "+name);
    }

    public void show(){
        System.out.println("Public method "+name);
    }
}