package Interface;

interface printable{
    void print();
}

class B implements printable{
    public void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        B a = new B();
        a.print();
    }
}