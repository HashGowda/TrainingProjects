package Inheritance;

class add{
    void addition(int a,int b){
        int res=a+b;
        System.out.println("Addition: "+res);
    }
}
class sub extends add  {
    void subtraction(int a, int b) {
        int res = a - b;
        System.out.println("subtraction: " + res);
    }
}
public class SingleInheritance {
    public static void main(String[] args){
        sub obj= new sub();
        obj.subtraction(20,10);
        obj.addition(10,10);
    }
}


