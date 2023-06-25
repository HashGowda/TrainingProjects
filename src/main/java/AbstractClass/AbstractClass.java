package AbstractClass;

abstract class shape {
    abstract void draw();
}

class Rect extends shape {
    void draw() {
        System.out.println("Rectangle is drawing");
    }
}

class Circle extends shape {
    void draw() {
        System.out.println("Circle is drawing");
    }

    public static void main(String[] args) {
        shape s = new Circle();
        s.draw();
        shape p = new Rect();
        p.draw();
    }
}
