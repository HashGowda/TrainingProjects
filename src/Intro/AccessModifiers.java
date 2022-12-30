package Intro;

//Private access modifier

/*

    class A{
        private int data=12;
        private void display(){
            System.out.println(data);
        }
    }

     class simple{
        public static void main(String[] args) {
            A a=new A();
            System.out.println(a.data);  //Compile time error
            a.display();  ////Compile time error
        }
    }

 */

/*

class Data{
        private String name;
}

class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.name = "Java";
    }
}

 */

//If we need to access private access modifiers, we can use getter and setter method

/*


class Data{
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }
}

class Main{
    public static void main(String[] args) {
        Data d=new Data();
        d.setName("Messi");
        System.out.println(d.getName());
    }
}

 */

//Default access modifier

/*

class A {
    void display() {
        System.out.println("Hello Java");
    }
}

class Main{
    public static void main(String[]args){
        A a=new A();
        a.display();
    }
}

 */

/*

class depart{
    void display(){
        Branch obj= new Branch();
        obj.sub();
        obj.display();
        obj.show();
    }
}

class Branch {
    private String name="Kiran";
    public static void main(String[] args){
        Branch obj= new Branch();
        obj.add();
        obj.sub();
        obj.display();
        obj.show();
    }
    private void add(){
        System.out.println("name from private method :" +name);
    }
    void sub(){
        System.out.println("name from default method :" +name);
    }
    protected void display(){
        System.out.println("name from protected method :" +name);
    }

    public void show(){
        System.out.println("name from public method :" +name);
    }
}

 */







