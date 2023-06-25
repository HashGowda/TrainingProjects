package Inheritance;

interface Event {
    void start();
}

interface Sports {
    void play();
}

class Hockey implements Event, Sports {
    public void start(){
        System.out.println("Event start");
    }
    public void play(){
        System.out.println("Play sports");
    }
}

class MPInheritance {
    public static void main(String[] args) {
        Hockey h = new Hockey();
        h.start();
        h.play();
    }
}