package Interface;

interface shape{
    void draw();
}

class Rectangle implements shape{
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
class Circle implements shape{
    public void draw(){
        System.out.println("Drawing a circle");
    }

    public static void main(String[] args) {
        shape sh = new Circle();
        sh.draw();
        shape sp = new Rectangle();
        sp.draw();
    }
}
